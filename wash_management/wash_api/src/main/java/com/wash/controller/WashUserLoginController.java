package com.wash.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/WashUserLogin")
@RestController
public class WashUserLoginController {
   /* //获取seesionKey和OpenId,返回json
    public static JSONObject getSessionKeyOrOpenId(String code){
        //微信端登录code
        String wxCode = code;
        String requestUrl = "https://api.weixin.qq.com/sns/jscode2session";
        Map<String,String> requestUrlParam = new HashMap<String, String>(  );
        requestUrlParam.put( "appid","你的小程序appId" );//小程序appId
        requestUrlParam.put( "secret","你的小程序appSecret" );
        requestUrlParam.put( "js_code",wxCode );//小程序端返回的code
        requestUrlParam.put( "grant_type","authorization_code" );//默认参数

        //发送post请求读取调用微信接口获取openid用户唯一标识
        JSONObject jsonObject = JSON.parseObject( UrlUtils.sendPost( requestUrl,requestUrlParam ));
        return jsonObject;
    }
    //根据敏感信息,sessionKey,算法向量得到用户信息
    public static JSONObject getUserInfo(String encryptedData,String sessionKey,String iv){
        // 被加密的数据
        byte[] dataByte = Base64.getEncoder().encode(encryptedData.getBytes());
        // 加密秘钥
        byte[] keyByte = Base64.decode(sessionKey);
        // 偏移量
        byte[] ivByte = Base64.decode(iv);
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init( Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                return JSON.parseObject(result);
            }
        } catch (NoSuchAlgorithmException e) {
            log.error(e.getMessage(), e);
        } catch (NoSuchPaddingException e) {
            log.error(e.getMessage(), e);
        } catch (InvalidParameterSpecException e) {
            log.error(e.getMessage(), e);
        } catch (IllegalBlockSizeException e) {
            log.error(e.getMessage(), e);
        } catch (BadPaddingException e) {
            log.error(e.getMessage(), e);
        } catch (UnsupportedEncodingException e) {
            log.error(e.getMessage(), e);
        } catch (InvalidKeyException e) {
            log.error(e.getMessage(), e);
        } catch (InvalidAlgorithmParameterException e) {
            log.error(e.getMessage(), e);
        } catch (NoSuchProviderException e) {
            log.error(e.getMessage(), e);
        }
        return null;
    }
    @PostMapping(value = "login")
    public Map<String,Object> doLogin(
            @RequestParam(value = "code",required = false) String code,
            @RequestParam(value = "rawData",required = false) String rawData,
            @RequestParam(value = "signature",required = false) String signature,
            @RequestParam(value = "encrypteData",required = false) String encrypteData,
            @RequestParam(value = "iv",required = false) String iv){
        System.out.println( "Start get SessionKey" );
        Map<String,Object> map = new HashMap<String, Object>(  );
        System.out.println("用户非敏感信息"+rawData);

        JSONObject rawDataJson = JSON.parseObject( rawData );

        System.out.println("签名"+signature);
        JSONObject SessionKeyOpenId = getSessionKeyOrOpenId( code );
        System.out.println("post请求获取的SessionAndopenId="+SessionKeyOpenId);

        String openid = SessionKeyOpenId.getString("openid" );

        String sessionKey = SessionKeyOpenId.getString( "session_key" );

        System.out.println("openid="+openid+",session_key="+sessionKey);

        User user = userService.findByOpenid( openid );
        //uuid生成唯一key
        String skey = UUID.randomUUID().toString();
        if(user==null){
            //入库
            String nickName = rawDataJson.getString( "nickName" );
            String avatarUrl = rawDataJson.getString( "avatarUrl" );
            String gender  = rawDataJson.getString( "gender" );
            String city = rawDataJson.getString( "city" );
            String country = rawDataJson.getString( "country" );
            String province = rawDataJson.getString( "province" );


            user = new User();
            user.setUid( openid );
            user.setCreateTime( new Date(  ) );
            user.setSessionkey( sessionKey );
            user.setUbalance( 0 );
            user.setSkey( skey );
            user.setUaddress( country+" "+province+" "+city );
            user.setUavatar( avatarUrl );
            user.setUgender( Integer.parseInt( gender ) );
            user.setUname( nickName );
            user.setUpdateTime( new Date(  ) );

            userService.insert( user );
        }else {
            //已存在
            log.info( "用户openid已存在,不需要插入" );
        }
        //根据openid查询skey是否存在
        String skey_redis = (String) redisTemplate.opsForValue().get( openid );
        if(StringUtils.isNotBlank( skey_redis )){
            //存在 删除 skey 重新生成skey 将skey返回
            redisTemplate.delete( skey_redis );

        }
        //  缓存一份新的
        JSONObject sessionObj = new JSONObject(  );
        sessionObj.put( "openId",openid );
        sessionObj.put( "sessionKey",sessionKey );
        redisTemplate.opsForValue().set( skey,sessionObj.toJSONString() );
        redisTemplate.opsForValue().set( openid,skey );

        //把新的sessionKey和oppenid返回给小程序
        map.put( "skey",skey );



        map.put( "result","0" );



        JSONObject userInfo = getUserInfo( encrypteData, sessionKey, iv );
        System.out.println("根据解密算法获取的userInfo="+userInfo);
        userInfo.put( "balance",user.getUbalance() );
        map.put( "userInfo",userInfo );

        return map;*/
   // }
}

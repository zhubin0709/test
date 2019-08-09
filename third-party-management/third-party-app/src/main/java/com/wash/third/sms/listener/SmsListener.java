package com.wash.third.sms.listener;

import com.wash.third.sms.utils.SmsUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class SmsListener {
    @Autowired
    private SmsUtil smsUtils;


    @RabbitListener(bindings = @QueueBinding(value = @Queue(value = "wash.sms.queue",durable = "true"),exchange = @Exchange(value = "wash.sms.exchange",ignoreDeclarationExceptions = "true"), key = {"sms.verify.code"}))
    public void sendSms(Map<String,String> msg){
        if (msg == null || msg.size() <= 0){
            //不做处理
            return;
        }
        String phone = msg.get("phone");
        String code = msg.get("code");
        if (StringUtils.isNotBlank(phone) && StringUtils.isNotBlank(code)){

            try {
                //发送消息
                this.smsUtils.smsSend(phone, code);
            }catch (Exception e){
                return;
            }
        }else {
            //不做处理
            return;
        }
    }
}

package com.wash.third.upload.service;

import com.wash.third.upload.bo.UploadBo;

//上传图片的服务接口
public interface UploadService {

        String uploadImage(UploadBo uploadBo);
        Integer deleteImage(String imagePath);
}

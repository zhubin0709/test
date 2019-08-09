package com.wash.third.upload.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wash.third.upload.bo.UploadBo;
import com.wash.third.upload.service.UploadService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@RestController
@RequestMapping("image")
public class UploadController {
    @Reference
    private UploadService uploadService;


    /**
     * 图片的上传
     *
     * @param file
     * @return
     */
    @PostMapping("uploadImage")
    public ResponseEntity<String> uploadImage(UploadBo uploadBo, @RequestParam("file")MultipartFile file) throws IOException {
        uploadBo.setBytes(file.getBytes());
        uploadBo.setContentType(file.getContentType());
        uploadBo.setFileName(file.getOriginalFilename());
        return ResponseEntity.ok(uploadService.uploadImage(uploadBo));
    }
    /**
     * 删除图片   文件的全部路径 如：group1/M00/00/00/wKgRsVjtwpSAXGwkAAAweEAzRjw471.jpg
     *
     * @param path
     * @return
     */
    @GetMapping("delete")
    public ResponseEntity<String> delete(@RequestParam("path") String path) throws IOException {

        return ResponseEntity.ok(uploadService.deleteImage(path).toString());
    }
}

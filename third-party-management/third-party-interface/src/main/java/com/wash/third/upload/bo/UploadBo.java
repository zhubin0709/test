package com.wash.third.upload.bo;

import lombok.Data;

import java.io.Serializable;

@Data
public class UploadBo implements Serializable {

    private byte[] bytes;
    private String contentType;
    private String fileName;

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        this.bytes = bytes;
    }

    public String getContentType() {
        return contentType;
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}

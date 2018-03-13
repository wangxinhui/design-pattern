package com.prototypePattern.shallowClone;

/**
 * @Author: by Administrator on 2018/3/13.
 */
public class Attachment {
    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void download(){
        System.out.println("the download file is " + fileName);
    }
}

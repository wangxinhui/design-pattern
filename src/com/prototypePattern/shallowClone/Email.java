package com.prototypePattern.shallowClone;

import java.util.Date;

/**
 * @Author: by Administrator on 2018/3/13.
 */
public class Email implements Cloneable{
    private Attachment attachment;
    private String name;
    private Date sendDate;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Email clone(){
        Object obj = null;
        try {
            obj = super.clone();
            return (Email) obj;
        } catch (CloneNotSupportedException e) {
            System.out.println("不支持复制");
            return null;
        }

    }

}

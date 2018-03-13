package com.prototypePattern.deepClone;

import java.io.*;
import java.util.Date;

/**
 * @Author: by Administrator on 2018/3/13.
 */
public class Email implements Serializable{
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
        ByteArrayOutputStream bao = new ByteArrayOutputStream();
        try {
            ObjectOutputStream  oos = new ObjectOutputStream(bao);
            oos.writeObject(this);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bao.toByteArray());
            ObjectInputStream ois = new ObjectInputStream(byteArrayInputStream);
            return (Email) ois.readObject();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}

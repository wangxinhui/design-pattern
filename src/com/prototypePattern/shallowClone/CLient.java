package com.prototypePattern.shallowClone;

import java.util.Date;

/**
 * @Author: by Administrator on 2018/3/13.
 */
public class CLient {
    public static void main(String[] args) {
        Email email_previous,email_new;
        email_previous = new Email();
        Attachment attachment = new Attachment();
        attachment.setFileName("work plan.xlsx");
        email_previous.setName("wangxinhui");
        email_previous.setContent("your have a plan for next week");
        email_previous.setSendDate(new Date());
        email_previous.setAttachment(attachment);
        email_new = email_previous.clone();
        System.out.println("email is same one: " + (email_previous == email_new));
        System.out.println("email's attachment is the same one: " + (email_previous.getAttachment().getFileName() == email_new.getAttachment().getFileName()));
        System.out.println("email's date is the same one: " + (email_previous.getSendDate() == email_new.getSendDate()));

    }
}

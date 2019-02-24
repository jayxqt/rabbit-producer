package com.tlkg.entity;

import java.io.Serializable;

/**
 * Created by jay-xqt on 2019/2/24.
 */
public class Order implements Serializable{

    private static final long serialVersionUID = 1L;

    private String id;

    private String name;

    private String messageId;

    public Order(){

    }

    public Order(String id, String name, String messageId) {
        this.id = id;
        this.name = name;
        this.messageId = messageId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }
}

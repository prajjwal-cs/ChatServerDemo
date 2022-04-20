/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 20-04-2022
Time: 11:57 PM
File: Message.java */
package io.github.prajjwal.chatserverdemo.messages;

import java.io.Serializable;
import java.util.ArrayList;

public class Message implements Serializable {
    private String name;
    private String message;
    private MessageType type;
    private int count;
    private ArrayList<User> list;
    private ArrayList<User> users;
    private Status status;

    public Message(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageType getType() {
        return type;
    }

    public void setType(MessageType type) {
        this.type = type;
    }

    public int getOnlineCount() {
        return count;
    }

    public void setOnlineCount(int count) {
        this.count = count;
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void setList(ArrayList<User> list) {
        this.list = list;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
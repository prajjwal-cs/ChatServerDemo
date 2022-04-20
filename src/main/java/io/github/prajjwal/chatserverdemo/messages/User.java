/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 20-04-2022
Time: 11:54 PM
File: User.java */
package io.github.prajjwal.chatserverdemo.messages;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private String status;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
/* Created by IntelliJ IDEA.

Author: Prajjwal Pachauri(cypher)
Date: 20-04-2022
Time: 11:48 PM
File: DuplicateUsernameException.java */
package io.github.prajjwal.chatserverdemo.exception;

public class DuplicateUsernameException extends Exception {
    public DuplicateUsernameException(String message) {
        super(message);
    }
}
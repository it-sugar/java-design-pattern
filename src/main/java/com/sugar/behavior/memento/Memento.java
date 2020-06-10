package com.sugar.behavior.memento;

import lombok.Data;

/**
 * @author gshi
 * 功能描述 备忘录
 */
@Data
public class Memento {

    private String account;

    private String password;

    private String email;

    public Memento(String account, String password, String email) {
        this.account = account;
        this.password = password;
        this.email = email;
    }
}

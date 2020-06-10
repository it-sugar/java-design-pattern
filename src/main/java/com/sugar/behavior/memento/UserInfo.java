package com.sugar.behavior.memento;

import lombok.Data;

/**
 * @author gshi
 * 功能描述 用户信息
 */
@Data
public class UserInfo {

    private String account;

    private String password;

    private String email;

    public Memento saveMemento() {
        return new Memento(this.account, this.password, this.email);
    }

    public void restoreMemento(Memento memento) {
        this.account = memento.getAccount();
        this.password = memento.getPassword();
        this.email = memento.getEmail();
    }
}

package com.sugar.behavior.memento;

/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        UserInfo userInfo = new UserInfo();
        userInfo.setAccount("gshi");
        userInfo.setPassword("********");
        userInfo.setEmail("xx@qq.com");
        System.out.println(userInfo);
        final Memento memento = userInfo.saveMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);
        userInfo.setAccount("shige");
        userInfo.setPassword("****__****");
        userInfo.setEmail("xx@163.com");
        System.out.println(userInfo);
        System.out.println("准备恢复");
        userInfo.restoreMemento(caretaker.getMemento());
        System.out.println(userInfo);
    }
}

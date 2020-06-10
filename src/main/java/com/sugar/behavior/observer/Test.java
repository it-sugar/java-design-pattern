package com.sugar.behavior.observer;


/**
 * @author gshi
 * 功能描述 测试
 */
public class Test {

    public static void main(String[] args) {
        BaseSubject subject = new ConcreteSubject();
        Observer businessObserver = new BusinessObserver();
        Observer stormObserver = new StormObserver();
        Observer elasticSearchObserver = new ElasticSearchObserver();
        subject.addObserver(businessObserver);
        subject.addObserver(stormObserver);
        subject.addObserver(elasticSearchObserver);
        subject.notifyObservers("订单ID=1结算");
        System.out.println("-----------------");
        subject.removeObserver(stormObserver);
        subject.notifyObservers("订单ID=1撤销结算");
    }

}

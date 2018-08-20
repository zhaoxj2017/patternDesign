package com.structural.facede;

/**
 * 外观模式：
 *      为子系统中的一组接口提供一个一致的界面，此模式定义了一个高层接口，这一个接口使得这一子系统更加容易使用。
 *      封装系统内容的复杂性，向外界系统提供简单的接口。
 * 应用场景：
 *      设计初期，有意识的考虑分层结构，层次与层次之间建立外观模式；
 *      开发阶段，子系统中有较多的小类，为外界建立一个外观模式；
 *      维护阶段，旧系统比较繁杂，可为新系统建立外观模式；
 * 优点：
 *    1、减少系统之间的耦合性
 *    2、提高灵活性和安全性
 *
 */
public class Client {
    public static void main(String[] args) {
        Fund fund = new Fund();

        fund.buyA();
        fund.buyB();

        fund.sellA();
        fund.sellB();
    }
}

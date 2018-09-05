package com.behavioral.visitor.bill_example;

import com.behavioral.visitor.bill_example.data.AccountBook;
import com.behavioral.visitor.bill_example.data.IncomeBill;
import com.behavioral.visitor.bill_example.data.OutcomeBill;

/**
 * 访问者模式
 *      将数据结构和数据操作分离的一种设计模式
 * 使用场景：
 *    笔者在做异构数据库同步的时候，需要读取和写入数据，环境Context是不变的，而对数据的操作只有读取和写入两种操作，
 *    两个人访问者reader,writer
 *    context.open(reader) 这个过程就将数据读取到reader中，然后再对reader中的数据进行操作。
 * reference
 *    https://blog.csdn.net/u012124438/article/details/70537203
 */
public class Client {
    public static void main(String [] ars) {
        AccountBook accountBook = transact();
        Visitor boss = new Boss();
        accountBook.show(boss);

        System.out.println(((Boss) boss).getTotalIncome());
        System.out.println(((Boss) boss).getTotalOutcome());
    }

    public static AccountBook transact() {
        AccountBook accountBook = new AccountBook();
        accountBook.addTransaction(new OutcomeBill("Fare", 75));
        accountBook.addTransaction(new OutcomeBill("Meal", 300));

        accountBook.addTransaction(new IncomeBill("Work", 1000));
        accountBook.addTransaction(new IncomeBill("Kidneys", 6000));
        return accountBook;
    }
}

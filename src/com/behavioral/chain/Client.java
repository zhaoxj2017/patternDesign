package com.behavioral.chain;

/**
 * 责任链模式 (行为： 责任链接， 结构： 链表)
 *    将请求的任务创建一条职责链，职责从链首处理到链尾
 * 特征：
 *    1、链的数据结构
 *    2、链上的职责继承同一个抽象类
 *    3、调用模板方法
 * 优点：
 *    1、降低耦合，使得每个类独立担任一个职责
 *    2、增强了灵活性，可以按不同的顺序和指定职责
 *    3、拓展性，很容易新增职责
 * 缺点：
 *    1、涉及到链表指针，递归调用，设计复杂度较大
 *    2、不方便调试
 * 应用场景：
 *    1、一个请求需要经过多次不同的处理；
 *    2、需要动态制定一组职责处理请求；
 *    3、Java Web中应用较多
 */
public class Client {
    public static void main(String[] args) {
        AbstractLogger loggerChain = new ChainBuilder(new FileLogger(AbstractLogger.INFO))
                                    .addNextChain(new ErrorLogger(AbstractLogger.ERROR))
                                    .addNextChain(new ConsoleLogger(AbstractLogger.DEBUG))
                                    .headLogger;
        loggerChain.logMessage(AbstractLogger.WARN,"I am full");
    }
}

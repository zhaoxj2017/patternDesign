package com.behavioral.strategy.strategy_simply;

/**
 * 策略模式（行为，分类）
 *    将不同的算法通过不同的类进行处理，通过多态动态分配算法。
 * 特征：
 *    同一问题的多种解决方案。
 * 优点：
 *    1、算法只有切换
 *    2、拓展性好
 * 缺点：
 *    1、策略类多
 * 应用场景：
 *    1、动态的需要几种算法
 *    2、switch, if else 的地方
 *    3、类型，角色
 */
public class Client {
    public static void main(String[] args) {
        Player player = new Player();
        player.buy(10000D);
        System.out.println("折后消费：" + player.getPayment());
        System.out.println("总计消费：" + player.getTotalAmount());
    }
}

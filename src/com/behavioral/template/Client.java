package com.behavioral.template;

/**
 * 模板方法模式（行为：汲取共性）
 *    定义一个算法的固定步骤，将算法的具体实现通过子类去实现。在不改变算法结构的前提下去修改算法的核心内容。
 * 特征：
 *    1、抽象类中定义一个final的方法，为不变的模板
 * 意图：
 *    提炼子类中通用的部分，到抽象类中。
 * 优点：
 *    1、将不变性封装，可变性通过子类去拓展。
 *    2、提取公共代码，复用代码
 * 缺点：
 *    1、每一个实现，定义一个子类，炒100道菜，用100个子类，类的个数更加使得系统庞大。
 * 应用场景：
 *    1、有多个子类共用同逻辑的方法。
 *    2、重要的，复杂的方法，可以考虑模板方法。
 *    3、代码中只有核心算法不同的，其余相同部分可抽象到模板中去。
 * 注意事项：可结合策略模式。
 */
public class Client {
    public static void main(String[] args) {
        AbstractCook co = new AbstractCookFish();
        co.cook();

        System.out.println("------------");

        AbstractCook coo = new AbstractCookChicken();
        coo.cook();
    }
}

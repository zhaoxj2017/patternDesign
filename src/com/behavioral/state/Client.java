package com.behavioral.state;

/**
 * 状态模式（行为：设置对象状态，不同状态呈现不同的动作）
 *    当一个对象的内在状态改变时，允许改变其行为，这个对象看起来像是改变了其类。
 * 应用场景：
 *    1、当控制一个对象状态装换的条件表达式过于负责时，
 *       把状态的判断逻辑转移到表示不同状态的一系列类当中，可以把复杂的判断简单化。
 *    2、替换内部状态不同导致的if else if 或者 switch
 * 优点：
 *    1、将与特定状态相关的行为局部化，并且将不同状态的行为分割开来。
 *    2、易拓展，新增一个状态，只需要新增一个类，打破原来的圈，插入新的状态。
 * 缺点：
 *    1、创建State子类对象的次数增多
 *    2、有一点违背开闭原则
 * 注意事项：
 *    State 的子类，一定都要过到一个状态，而却每个状态都应该出现。
 *    满足这样一个过程：RunningState 中创建 ErrorState , ErrorState再创建 StopState
 *    使程序能够走完所有的分支。 根据程序执行的过程来看，其实也是if else if 的过程。
 *    状态模式只是将将if else if 改成了 if else {if else} 这种嵌套的条件分支。
 *    状态模式一程程度上，不如直接写if else if 的程序，因为不用反复创建state子类对象。
 *    参考《大话设计模式》，网上很多资料的作者写出来并没有领会状态模式的精髓。
 */
public class Client {
    public static void main(String [] args) {
        // 一开是初始化状态；
        Context context = new Context(new RunningState());

        context.setCommand("running");
        context.request();

        context.setCommand("stop");
        context.request();

        System.out.println(context.getState().toString());
    }
}

package com.structural.flyweight;

/**
 * 享元模式
 *    运用共享技术，有效支持大量细粒度的对象。
 *    享元模式可以避免大量非常相似类的开销。
 *
 *    在享元对象内部不会随环境改变而改变的共享部分，可以享元对象的内部状态；
 *    随环境改变而改变的不可共享部分，为享元对象的外部状态。
 *
 * 应用场景：
 *    1、如果发现很多实例除了几个参数不同之外，其它部分基本相同，如果能把参数移到实例外面，在方法调用时将它传递进来，
 *       就可以通过共享大幅度减少单个实例的数目
 *    2、系统中具有大量相似对象
 *    3、需要缓冲池的场景
 *    4、字符串
 * 优点：
 *    1、大大减少了对象了创建，减少了系统的消耗，提高了使用效率；
 */
public class Client {
    private static String[] colors = {"Red", "Orange", "Yellow", "Green", "Cyan", "Blue", "Purple"};

    public static void main(String[] args) {
        for (int i = 0; i < colors.length; i++) {
            Circle shape = (Circle) ShapeFactory.getShape(colors[i]);
            shape.setX(5);
            shape.setY(6);
            shape.setRadius(3);
            shape.draw();
        }

        System.out.println("------------对象已经创建，直接获取对象---------------");
        Shape shape = ShapeFactory.getShape(colors[0]);
        shape.draw();

        System.out.println("----------对象已经创建，获取对象,设置对象属性---------");
        Circle circle = (Circle) ShapeFactory.getShape(colors[0]);
        circle.setX(8);
        circle.setY(8);
        circle.setRadius(5);
        circle.draw();
    }
}

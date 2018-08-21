package com.behavioral.interpreter;

/**
 * 解释器模式
 *    给定一个语言，定义它的文法的表示，解释一个句子。
 *
 * 应用场景：
 *    1、可以将一个需要解释执行的语言中的句子表示为一个抽象语法树。
 *    2、一些重复出现的问题可以用一种简单的语言来进行表达。
 *    3、一个简单语法需要解释的场景。、
 *
 * 注意事项：可利用场景比较少，JAVA 中如果碰到可以用 expression4J 代替。
 */
public class Client {
    /**
     * Scale: O 1  low scale O 2 middle scale O 3 high scale
     * Note: C D E F G A B P   -->  Do Re Mi Fa So La Ti
     * Speed： T 500 --> <500 low, [500, 1000] middle, >1000, high
     */
    public static void main(String[] args) {
        PlayContext context = new PlayContext();
        context.setText("T 500 O 2 C 1 E 0.5 F 0.25 G 0.5 ");
        Expression expression;
        while (context.getText().length() != 0) {
            String str = context.getText().substring(0, 1);
            switch (str) {
                case "T":
                    expression = new Speed();
                    break;
                case "C":
                case "D":
                case "E":
                case "F":
                case "G":
                case "A":
                case "B":
                    expression = new Note();
                    break;
                case "O":
                    expression = new Scale();
                    break;
                default:
                    return;
            }
            expression.interpreter(context);
        }
    }
}

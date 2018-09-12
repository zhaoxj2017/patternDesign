package com.structural.bridge;

/**
 * @author 赵兴君_F
 */
public abstract class AbstractShape {
    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    /**
     * 此处把组合的变化提出来到抽象类的draw方法中，
     * 当新增一个维度的时候，变化只需在此处修改，而不用去每一个实现类中修改。
     * 缺点是无法控制维度的执行顺序
     */
    public void draw() {
        if (color != null) {
            color.print();
        }
    }
}

package com.freeloop.principle.ocp.improve;

/**
 * Ocp
 *
 * @author fj
 * @since 2023/4/5 11:56
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }

}

/**
 * 满足Ocp原则
 */
//Shape基类
abstract class Shape{
    int m_type;
    public abstract void draw();//抽象方法

}
class GraphicEditor{
    public void drawShape(Shape s){
        s.draw();
    }
}
//class Shape{
//    int m_type;
//}
class Rectangle extends Shape {
    Rectangle(){
        super.m_type=1;
    }

    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}
class Circle extends Shape {
    Circle(){
        super.m_type=2;
    }

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}
//新增画三角形
class Triangle extends Shape {
    Triangle(){
        super.m_type=3;
    }

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
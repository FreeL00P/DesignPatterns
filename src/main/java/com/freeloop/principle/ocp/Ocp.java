package com.freeloop.principle.ocp;


import java.awt.*;

/**
 * Ocp
 * 开闭原则
 * @author fj
 * @since 2023/4/5 11:41
 */
public class Ocp {
    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
        graphicEditor.drawShape(new Triangle());
    }
}
//这是一个用于绘图的类
//违反开闭原则的演示
class GraphicEditor{
    public void drawShape(Shape s){
        if(s.m_type==1){
            drawRectangle(s);
        }else if(s.m_type==2){
            drawCircle(s);
        }else if(s.m_type==3){
            drawTriangle(s);
        }
    }
    public void drawRectangle(Shape s){
        System.out.println("画矩形");
    }
    public void drawCircle(Shape s){
        System.out.println("画圆");
    }
    public void drawTriangle(Shape s){
        System.out.println("画三角形");
    }
}
class Shape{
    int m_type;
}
class Rectangle extends Shape {
    Rectangle(){
        super.m_type=1;
    }
}
class Circle extends Shape{
    Circle(){
        super.m_type=2;
    }
}
//新增画三角形
class Triangle extends Shape{
    Triangle(){
        super.m_type=3;
    }
}
package leo.designpattern.abstractfactorypattern;

import leo.designpattern.abstractfactorypattern.color.Color;
import leo.designpattern.abstractfactorypattern.factory.AbstractFactory;
import leo.designpattern.abstractfactorypattern.factory.FactoryProducer;
import leo.designpattern.abstractfactorypattern.shape.Shape;
import org.junit.Test;

/**
 * AbstractFactory类规定了工厂可以完成的动作
 * ColorFactory类、ShapeFactory类 继承了AbstractFactory类 类中方法实现根据需要完成 形状实例的创建 和 颜色实例的创建
 * FactoryProducer类 提供静态方法 根据需求完成对应工厂实例的创建
 *
 * 当需要添加新的颜色或者形状时,编写颜色和形状的实现
 */
public class TestAbstractFactoryPattern {

    //形状工厂
    //通过 FactoryProducer类 静态方法 getFactory()获取
    AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");

    //颜色工厂
    //通过 FactoryProducer类 静态方法 getFactory()获取
    AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");

    @Test
    public void testTestAbstractFactoryPattern(){

        
        //获取形状为 Circle 的对象
        Shape shape_circle = shapeFactory.produceShape("CIRCLE");

        //调用 Circle 的 draw 方法
        shape_circle.draw();

        //获取形状为 Rectangle 的对象
        Shape shape_rectangle = shapeFactory.produceShape("RECTANGLE");

        //调用 Rectangle 的 draw 方法
        shape_rectangle.draw();

        //获取形状为 Square 的对象
        Shape shape_square = shapeFactory.produceShape("SQUARE");

        //调用 Square 的 draw 方法
        shape_square.draw();

        //获取颜色工厂


        //获取颜色为 Red 的对象
        Color color_red = colorFactory.produceColor("RED");

        //调用 Red 的 fill 方法
        color_red.fill();

        //获取颜色为 Green 的对象
        Color color_green = colorFactory.produceColor("Green");

        //调用 Green 的 fill 方法
        color_green.fill();

        //获取颜色为 Blue 的对象
        Color color_blue = colorFactory.produceColor("BLUE");

        //调用 Blue 的 fill 方法
        color_blue.fill();
    }
}

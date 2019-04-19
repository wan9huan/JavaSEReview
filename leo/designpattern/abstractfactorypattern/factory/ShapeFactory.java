package leo.designpattern.abstractfactorypattern.factory;

import leo.designpattern.abstractfactorypattern.color.Color;
import leo.designpattern.abstractfactorypattern.shape.Shape;

import leo.designpattern.abstractfactorypattern.shape.Circle;
import leo.designpattern.abstractfactorypattern.shape.Rectangle;
import leo.designpattern.abstractfactorypattern.shape.Square;

public class ShapeFactory extends AbstractFactory {

    /**
     *
     * @param color
     * @return null
     *
     * @说明：在形状工厂内 生产颜色的方法不做任何操作
     */
    @Override
    public Color produceColor(String color) {
        return null;
    }

    /**
     *
     * @param shape
     * @return Shape(Circle or Rectangle ro Square or null)
     * @说明 根据调用方法传入的参数选择提供形状实现
     */
    @Override
    public Shape produceShape(String shape) {

        if(shape == null){
            return null;
        }
        if(shape.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        else if(shape.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shape.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}


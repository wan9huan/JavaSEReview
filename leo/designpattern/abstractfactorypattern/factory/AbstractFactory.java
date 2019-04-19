package leo.designpattern.abstractfactorypattern.factory;

import leo.designpattern.abstractfactorypattern.color.Color;
import leo.designpattern.abstractfactorypattern.shape.Shape;

//抽象工厂
public abstract  class AbstractFactory {

    public abstract Color produceColor(String color);
    public abstract Shape produceShape(String shape) ;

}

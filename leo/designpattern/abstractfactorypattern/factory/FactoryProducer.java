package leo.designpattern.abstractfactorypattern.factory;



public class FactoryProducer {


    /**
     *
     * @param factoryName
     * @return AbstractFactory( ShapFactory or ColorFactory or null)
     * @说明 根据调用方法时传入的形参选择提供对应的工厂
     *
     */

    public static AbstractFactory getFactory(String factoryName){


        if(factoryName.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        }
        else if(factoryName.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;

    }
}

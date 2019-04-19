package leo.designpattern.factorymethod.factory;

import leo.designpattern.factorymethod.sender.Sender;

/**
 *
 * 当需求新的工厂时 只需要创建实现Provider接口的工厂
 * 不需要修改原来的代码添加新的工厂即可生产出新需求的对象
 *
 */
public interface Provider {

        public Sender produce();

}

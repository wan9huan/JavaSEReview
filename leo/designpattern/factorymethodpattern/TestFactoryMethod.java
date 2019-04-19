package leo.designpattern.factorymethodpattern;

import leo.designpattern.factorymethodpattern.factory.Provider;
import leo.designpattern.factorymethodpattern.factory.SendMailFactory;
import leo.designpattern.factorymethodpattern.sender.Sender;
import org.junit.Test;

public class TestFactoryMethod {

    @Test
    public void test(){

        //邮件发送器工厂
        Provider provider = new SendMailFactory();

        //邮件工厂提供对象
        Sender sender = provider.produce();

        sender.Send();

    }
}

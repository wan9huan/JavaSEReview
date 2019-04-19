package leo.designpattern.factorymethod.factory;

import leo.designpattern.factorymethod.sender.MailSender;
import leo.designpattern.factorymethod.sender.Sender;


//具体某种对象的工厂 实现Provider接口
public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}

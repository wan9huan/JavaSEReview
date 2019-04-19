package leo.designpattern.factorymethod.factory;


import leo.designpattern.factorymethod.sender.Sender;
import leo.designpattern.factorymethod.sender.SmsSender;

public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

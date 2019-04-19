package leo.designpattern.factorymethodpattern.factory;


import leo.designpattern.factorymethodpattern.sender.Sender;
import leo.designpattern.factorymethodpattern.sender.SmsSender;

public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}

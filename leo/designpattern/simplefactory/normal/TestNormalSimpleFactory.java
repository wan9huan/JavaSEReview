package leo.designpattern.simplefactory.normal;

import org.junit.Test;

public class TestNormalSimpleFactory {

    SenderFactory senderFactory = new SenderFactory();

    @Test
    public void testNormalSimpleFactory(){

        Sender sender = senderFactory.produce("mail");

        sender.Send();

        sender = senderFactory.produce("sms");

        sender.Send();

    }

}

package leo.designpattern.simplefactory.multimethod;

import org.junit.Test;

public class TestMultiMethod {

    SenderFactory senderFactory = new SenderFactory();

    @Test
    public void testMutiMethodSimpleFactory(){

        Sender sender = senderFactory.produceMaillSender();

        sender.Send();

        sender = senderFactory.produceSMSSender();

        sender.Send();
    }
}

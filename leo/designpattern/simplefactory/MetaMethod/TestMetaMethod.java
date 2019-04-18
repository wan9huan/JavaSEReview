package leo.designpattern.simplefactory.MetaMethod;

import org.junit.Test;

public class TestMetaMethod {

    @Test
    public void testMetaMethodSimpleFactory(){

        Sender sender;

        sender = SenderFactory.produceMaillSender();

        sender.Send();

        sender = SenderFactory.produceSMSSender();

        sender.Send();
    }
}

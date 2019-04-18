package leo.designpattern.simplefactory.multimethod;

/**
 * 多方法的方式为每一个类型的发送器实现提供了单独的方法
 */
//工厂类
public class SenderFactory {

   public Sender produceMaillSender(){
       return new MailSender();
   }

    public Sender produceSMSSender(){
        return new SmsSender();
    }
}

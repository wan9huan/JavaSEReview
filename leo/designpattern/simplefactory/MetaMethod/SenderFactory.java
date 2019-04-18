package leo.designpattern.simplefactory.MetaMethod;

/**
 * 在多方法的基础上将每一个方法设置为静态方法
 * 在创建发送器时不需要再实例工厂对象
 * 直接调用工厂类的静态方法即可返回合适的发射器对象
 */

//工厂类
public class SenderFactory {

   public static Sender produceMaillSender(){
       return new MailSender();
   }

    public static Sender produceSMSSender(){
        return new SmsSender();
    }
}

package leo.designpattern.simplefactory.normal;

/**
 * 普通工厂通过一个工厂类提供一个生产方法
 * 根据调用方法时传入的参数判断
 * 返回一个合适发送器的实现
 */
//工厂类
public class SenderFactory {

    //produce 方法根据传入工厂的字符串选择创建对应的对象
    public Sender produce(String type){

        switch(type){

            case "mail" :
                return new MailSender();
            case "sms" :
                return new SmsSender();
            default:
                System.out.println("工厂无法提供此类型");
                return null;
        }
    }
}

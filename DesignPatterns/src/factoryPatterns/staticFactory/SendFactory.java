package factoryPatterns.staticFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class SendFactory {

    public static Sender makeSMSSender(){
        return new SMSSender();
    }

    public static Sender makeMailSender(){
        return new MailSender();
    }
}

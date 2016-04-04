package factoryPatterns.abstractFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("send a Email!!");
    }
}

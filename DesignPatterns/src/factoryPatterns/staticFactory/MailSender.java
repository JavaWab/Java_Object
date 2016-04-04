package factoryPatterns.staticFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is email sender");
    }
}

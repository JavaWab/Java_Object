package factoryPatterns.abstractFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class MailSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new MailSender();
    }
}

package factoryPatterns.abstractFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class FactoryTest {
    public static void main(String[] args) {
        Provider provider = new MailSenderFactory();
        provider.produce().send();
    }
}

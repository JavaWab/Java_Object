package factoryPatterns.staticFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class FactoryTest {
    public static void main(String[] args) {
        SendFactory.makeMailSender().send();
        SendFactory.makeSMSSender().send();
    }
}

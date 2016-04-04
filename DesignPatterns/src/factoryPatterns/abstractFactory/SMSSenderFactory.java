package factoryPatterns.abstractFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class SMSSenderFactory implements Provider {
    @Override
    public Sender produce() {
        return new SMSSender();
    }
}

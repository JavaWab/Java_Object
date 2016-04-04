package factoryPatterns.abstractFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class SMSSender implements Sender {
    @Override
    public void send() {
        System.out.println("send a SMS!!");
    }
}

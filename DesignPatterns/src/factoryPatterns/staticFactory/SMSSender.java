package factoryPatterns.staticFactory;

/**
 * Created by wanganbang on 16/4/4.
 */
public class SMSSender implements Sender{
    @Override
    public void send() {
        System.out.println("this is SMS sender");
    }
}

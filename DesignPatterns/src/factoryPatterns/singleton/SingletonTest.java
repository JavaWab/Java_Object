package factoryPatterns.singleton;

import java.util.Vector;

/**
 * Created by wanganbang on 16/4/4.
 * 补充：采用"影子实例"的办法为单例对象的属性同步更新
 */
public class SingletonTest {
    private static SingletonTest instance = null;
    private Vector properties = null;

    //私有化构造函数
    private SingletonTest(){

    }
    //私有化线程安全的创建并初始化实例
    private static synchronized void syncInit(){
        if(instance == null){
            instance = new SingletonTest();
        }
    }

    public Vector getProperties(){
        return properties;
    }

    public static SingletonTest getInstance(){
        if(instance == null){
            syncInit();
        }
        return instance;
    }
    //更新单例对象的属性
    public void updateProperties(/* 这里面可以有参数什么的 */){
        SingletonTest singletonTest = new SingletonTest();
        //这里可以对属性值进行改变等操作
        properties = singletonTest.properties;
    }
}

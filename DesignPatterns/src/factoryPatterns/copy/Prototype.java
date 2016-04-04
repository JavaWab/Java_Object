package factoryPatterns.copy;

import java.io.*;

/**
 * Created by wanganbang on 16/4/4.
 */
public class Prototype implements Cloneable, Serializable {
    private static final long serialVersionUID = 1l;

    /**
     * 浅层复制
     *
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        Prototype proto = (Prototype) super.clone();
        return proto;
    }

    /**
     * 深层复制
     * @return
     * @throws CloneNotSupportedException
     * @throws IOException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        //将当前对象写入二进制流中
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(bos);
        objectOutputStream.writeObject(this);

        //将写入的二进制流读出来生成新对象
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(bis);
        return objectInputStream.readObject();
    }
}

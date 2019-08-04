/**
 * @version V1.0
 * @description:
 * @author: zhangdeen
 * @date: 2019/7/25 20:34
 */
public class Main {
    public static void main(String[] args) {

        //如何把一个类加载到内存里呢？
        //在代码中有几种写法
        //2种：
        //Class.forName("");
        //ClassLoader.getSystemClassLoader();
        try {
            Class.forName("Hello");
            ClassLoader.getSystemClassLoader().loadClass("Hello");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

package signleton.lazy_pattern;

/**
 * Create by mr.wl on 2017/8/31
 *
 * 懒汉模式:当用户获取的时候才进行对象的实例化
 */
public class LazyPattern {
    //1.构造函数私有化
    private LazyPattern(){}
    //2.使用private static 修饰变量
    private static LazyPattern instance;
    //3.判断instance是否为空,为空直接实例化,不为空,直接返回   public static 修饰
    public static LazyPattern getInstance(){
        if(instance==null){
            instance = new LazyPattern();
        }
        return  instance;
    }
}

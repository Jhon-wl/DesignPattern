package signleton.hungry_pattern;

/**
 * Create by mr.wl on 2017/8/31
 * 单例模式:
 * 饿汉模式:使用静态方法,在类加载的时候,就已经创建对象
 *
 */
public class HungryPattern {
    //1.构造函数私有化,捕鱼必须外部直接创建对象
    private HungryPattern(){}
    //2.创建唯一的实例,使用private static 修饰
    private static HungryPattern instance = new HungryPattern();
    //3.提供一个用于获取实例的方法,用public static修饰
    public static HungryPattern getInstance(){
        return instance;
    }
}

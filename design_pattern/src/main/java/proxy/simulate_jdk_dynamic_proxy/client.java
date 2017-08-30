package proxy.simulate_jdk_dynamic_proxy;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

/**
 * Create by mr.wl on 2017/8/30
 *
 * 模拟jdk动态代理实现思路
 * 实现功能:通过Proxy类的newInstance返回代理对象
 * 1.声明一段源码(动态产生代理)
 * 2.编译源码(jdk compiler API),产生新的类(代理类)
 * 3.将这个类load到内存中去,产生一个新的对象(代理对象)
 * 4.return 代理对象
 */
public class client {
    public static void main(String[] args) throws IOException, ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        CarProxy car = new CarProxy();
        InvocationHandler handler = new TimeHandler(car);
        car car1 = (car) Proxy.newInstance(car.class,handler);
        car1.move();
    }
}

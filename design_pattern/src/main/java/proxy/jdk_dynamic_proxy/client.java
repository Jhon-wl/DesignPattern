package proxy.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Create by mr.wl on 2017/8/29
 */
public class client {
    public static void main(String[] args) {
        CarProxy carProxy = new CarProxy();
        InvocationHandler handler = new TimeHandler(carProxy);
        Class clazz = carProxy.getClass();

        // 第一个参数  类加载器   第二个参数 接口   第三个 InvocationHandler
        car car = (car) Proxy.newProxyInstance
                        (clazz.getClassLoader(),clazz.getInterfaces(),handler);
        car.move();
    }
}

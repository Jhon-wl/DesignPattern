package proxy.jdk_dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/29
 */
public class TimeHandler implements InvocationHandler{

    private Object target;

    public TimeHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");
        method.invoke(target);
        long endtime = System.currentTimeMillis();
        System.out.println("汽车行驶结束...,行驶了:"+(endtime-starttime)+"毫秒!");
        return null;
    }
}

package proxy.simulate_jdk_dynamic_proxy;


import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/30
 */
public class TimeHandler implements InvocationHandler {

    private Object target;

    public TimeHandler(Object target) {
        super();
        this.target = target;
    }

    @Override
    public void invoke(Object o, Method method) {
        try {
            long starttime = System.currentTimeMillis();
            System.out.println("汽车开始行驶......");
            method.invoke(target);
            long endtime = System.currentTimeMillis();
            System.out.println("汽车行驶结束...,行驶了:"+(endtime-starttime)+"毫秒!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package proxy.cglib_dynamic_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/30
 */
public class CGlibProxy implements MethodInterceptor{
    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class calzz){
        enhancer.setSuperclass(calzz);
        enhancer.setCallback(this);

        return enhancer.create();
    }

    /*
    * 拦截对所有方法的调用
    * o  目标类的实例
    * method 目标方法的反射对象
    * objects 目标方法的参数
    * methodProxy 代理类的实例
    * */
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

        System.out.println("日志开始了");
        //代理类调用父类方法
        methodProxy.invokeSuper(o,objects);
        System.out.println("日志结束了");
        return null;
    }
}

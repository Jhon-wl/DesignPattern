package proxy.simulate_jdk_dynamic_proxy;

import java.lang.reflect.Method;

/**
 * Create by mr.wl on 2017/8/30
 */
public interface InvocationHandler {
     void invoke(Object o, Method method);
}

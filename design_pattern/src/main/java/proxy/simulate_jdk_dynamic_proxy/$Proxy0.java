package proxy.simulate_jdk_dynamic_proxy;
import java.lang.reflect.Method;
import proxy.simulate_jdk_dynamic_proxy.InvocationHandler;
public class $Proxy0 implements proxy.simulate_jdk_dynamic_proxy.car {
private InvocationHandler h;
    public $Proxy0(InvocationHandler h) { 
       this.h = h; 
   } 
    @Override 
    public void move() { 
try{
Method md = proxy.simulate_jdk_dynamic_proxy.car.class.getMethod("move");
h.invoke(this,md);
}catch(Exception e){e.printStackTrace();}
    } 
 } 
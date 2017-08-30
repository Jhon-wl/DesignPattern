package proxy.cglib_dynamic_proxy;



/**
 * Create by mr.wl on 2017/8/30
 */
public class client {
    public static void main(String[] args) {
        CGlibProxy proxy = new CGlibProxy();
        Train train = (Train) proxy.getProxy(Train.class);
        train.move();

    }
}

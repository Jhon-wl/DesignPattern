package proxy.static_proxy;

/**
 * Create by mr.wl on 2017/8/29
 */
public class client {
    public static void main(String[] args) {
        CarProxy car = new CarProxy();

        TimeProxy tp = new TimeProxy(car);
        LogProxy lp = new LogProxy(tp);
        lp.move();
    }
}

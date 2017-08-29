package proxy.static_proxy;

/**
 * Create by mr.wl on 2017/8/29
 */
public class LogProxy implements car{
    private car car;

    public LogProxy(car car) {

        this.car = car;
    }

    @Override
    public void move() {
        System.out.println("日志开始");
        car.move();
        System.out.println("日志结束");
    }
}

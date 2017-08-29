package proxy.static_proxy;

/**
 * Create by mr.wl on 2017/8/29
 */
public class TimeProxy implements car{

    private car car;



    public TimeProxy(car car) {

        this.car = car;
    }

    @Override
    public void move() {

        long starttime = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");
        car.move();
        long endtime = System.currentTimeMillis();
        System.out.println("汽车行驶结束...,行驶了:"+(endtime-starttime)+"毫秒!");

    }
}

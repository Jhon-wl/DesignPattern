package proxy.simulate_jdk_dynamic_proxy;

import java.util.Random;

/**
 * Create by mr.wl on 2017/8/29
 */
public class CarProxy implements car {


    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中......");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

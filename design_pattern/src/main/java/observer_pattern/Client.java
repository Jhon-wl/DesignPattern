package observer_pattern;

/**
 * Create by mr.wl on 2017/8/27
 * 测试观察者模式
 */
public class Client {
    public static void main(String[] args) {
        //创建目标类
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();
        //创建观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        observer1.setObserverName("this");

        ConcreteObserver observer2 = new ConcreteObserver();
        observer2.setObserverName("老王");

        //注册观察者
        subject.addObserver(observer1);
        subject.addObserver(observer2);

        //更新天气情况
        subject.setContent("天气晴,气温28°");
    }
}

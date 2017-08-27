package weather_observer_pattern;

/**
 * Create by mr.wl on 2017/8/27
 * 测试天气观察者模式
 */
public class Client {
    public static void main(String[] args) {
        //定义观察目标
        ConcreteWeatherSubject subject = new ConcreteWeatherSubject();

        //定义观察者
        ConcreteObserver observer1 = new ConcreteObserver();
        ConcreteObserver observer2 = new ConcreteObserver();

        observer1.setObserverName("老一");
        observer1.setReminding("看直播");

        observer2.setObserverName("老二");
        observer2.setReminding("打游戏");

        //注册观察者
        subject.attach(observer1);
        subject.attach(observer2);

        //更新天气
        subject.setWeatherContent("下雪");//晴天,下雨,下雪
    }

}

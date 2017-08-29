package observer.weather_observer_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by mr.wl on 2017/8/27
 */
public abstract class WeatherSubject {

    //定义存储观察者的集合
    List<Observer> list = new ArrayList<Observer>();

    //添加观察者的方法
    public void attach(Observer observer){
        list.add(observer);
    }
    //删除观察者的方法
    public void detach(Observer observer){
        list.remove(observer);
    }
    //定义抽象的通知方法,具体的实现放在实现类中
     protected abstract void notifyObservers();
}

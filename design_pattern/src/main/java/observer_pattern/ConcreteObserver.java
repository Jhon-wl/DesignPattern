package observer_pattern;

import java.util.Observable;
import java.util.Observer;

/**
 * Create by mr.wl on 2017/8/27
 */
public class ConcreteObserver implements Observer {

    //观察者的名称
    private String observerName;

    public String getObserverName() {
        return observerName;
    }

    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }
    @Override
    public void update(Observable o, Object arg) {
        //推的方式
        System.out.println(observerName+"天气消息是:"+arg);
        //拉的方式
        System.out.println(observerName+"消息是:"+((ConcreteWeatherSubject)o).getContent());
    }
}

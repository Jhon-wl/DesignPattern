package observer.observer_pattern;

import java.util.Observable;

/**
 * Create by mr.wl on 2017/8/27
 * 这里以天气预报为例,实现观察者模式
 */
public class ConcreteWeatherSubject extends Observable{
    //定义天气信息
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;

        //天气情况更新的时候,就要通知观察者
        //注意在通知之前,在Java的Observe模式中,下面一句必须写
        this.setChanged();
        //通知观察者,使用推模式
        this.notifyObservers(content);

        //也可以使用拉模式
        //this.notifyObservers();
    }
}

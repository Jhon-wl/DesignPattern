package weather_observer_pattern;

/**
 * Create by mr.wl on 2017/8/27
 */
public interface Observer {

    //更新的接口
    public void update(WeatherSubject subject);

    //设置观察者的名称
    public void setObserverName(String observerName);

    //取得观察者的名称
    public String getObserverName();

}

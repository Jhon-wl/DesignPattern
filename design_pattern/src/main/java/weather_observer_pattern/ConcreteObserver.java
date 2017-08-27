package weather_observer_pattern;

/**
 * Create by mr.wl on 2017/8/27
 */
public class ConcreteObserver implements Observer {

    //设置观察者名称
    private String observerName;
    //天气的情况
    private String weatherContent;
    //提醒的内容
    private String reminding;
    @Override
    public void update(WeatherSubject subject) {
        weatherContent = ((ConcreteWeatherSubject)subject).getWeatherContent();
        System.out.println(observerName+"收到了天气信息:"+weatherContent+",所以去"+reminding);
    }

    @Override
    public void setObserverName(String observerName) {
        this.observerName = observerName;
    }


    @Override
    public String getObserverName() {
        return observerName;
    }


    public String getReminding() {
        return reminding;
    }

    public void setReminding(String reminding) {
        this.reminding = reminding;
    }
}

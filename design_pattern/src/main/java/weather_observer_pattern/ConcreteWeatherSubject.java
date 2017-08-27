package weather_observer_pattern;

/**
 * Create by mr.wl on 2017/8/27
 */
public class ConcreteWeatherSubject extends WeatherSubject {

    //存储天气状态      "晴天"."下雨"."下雪"
    private String weatherContent;

    @Override
    protected void notifyObservers() {
        //循环所有注册的观察者
        for(Observer observer:list){
            if("下雨".equals(this.weatherContent)){
                if("老一".equals(observer.getObserverName())){
                    observer.update(this);
                }
                if("老二".equals(observer.getObserverName())){
                    observer.update(this);
                }
            }

            if("下雪".equals(this.weatherContent)){
                if("老二".equals(observer.getObserverName())){
                    observer.update(this);
                }
            }
        }
    }

    public String getWeatherContent() {
        return weatherContent;
    }

    public void setWeatherContent(String weatherContent) {
        this.weatherContent = weatherContent;
        notifyObservers();
    }
}

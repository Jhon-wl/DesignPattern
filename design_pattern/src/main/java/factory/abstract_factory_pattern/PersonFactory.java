package factory.abstract_factory_pattern;

/**
 * Create by mr.wl on 2017/8/29
 */
public interface  PersonFactory {

    //获得男孩
    Boy getBoy();
    //获得女孩
    Girl getGirl();
}

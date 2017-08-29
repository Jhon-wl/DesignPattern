package factory.abstract_factory_pattern;

/**
 * Create by mr.wl on 2017/8/29
 */
public class HNFactory implements PersonFactory{
    @Override
    public Boy getBoy() {
        return new HNBoy();
    }

    @Override
    public Girl getGirl() {
        return new HNGirl();
    }
}

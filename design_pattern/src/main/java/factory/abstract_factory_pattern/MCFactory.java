package factory.abstract_factory_pattern;

/**
 * Create by mr.wl on 2017/8/29
 */
public class MCFactory implements PersonFactory{
    @Override
    public Boy getBoy() {
        return new MCBoy();
    }

    @Override
    public Girl getGirl() {
        return new MCGirl();
    }
}

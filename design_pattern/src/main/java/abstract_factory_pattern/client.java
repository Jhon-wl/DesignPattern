package abstract_factory_pattern;

/**
 * Create by mr.wl on 2017/8/29
 */
public class client {
    public static void main(String[] args) {

        //圣诞男孩
        PersonFactory factory = new MCFactory();
        Boy boy = factory.getBoy();
        boy.drawMan();

        //新年女孩
        PersonFactory factory1 = new HNFactory();
        Girl girl = factory1.getGirl();
        girl.drawWomen();
    }
}

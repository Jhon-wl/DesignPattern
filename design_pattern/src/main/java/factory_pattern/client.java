package factory_pattern;

/**
 * Create by mr.wl on 2017/8/29
 */
public class client {
    public static void main(String[] args) {
        //测试第一种逻辑判断生产
//        HairFactory factory = new HairFactory();
//        Hair hair = factory.getHair("左偏分");
//        hair.draw();

        //测试使用反射
        HairFactory factory = new HairFactory();
        Hair hair = factory.getHairByClass("factory_pattern.LeftHair");
        hair.draw();
    }
}

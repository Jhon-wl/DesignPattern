package factory.factory_pattern;

/**
 * Create by mr.wl on 2017/8/29
 */
public class HairFactory {

    public Hair getHair(String hair){
        //采用逻辑判断,创建发型,不利于代码的扩展
        if("左偏分".equals(hair)){
            return new LeftHair();
        }else if("右偏分".equals(hair)){
            return new RightHair();
        }

        return null;
    }

    public Hair getHairByClass(String classforname){
        try {
            Hair hair1 = (Hair) Class.forName(classforname).newInstance();
            return hair1;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
        return null;
    }
}

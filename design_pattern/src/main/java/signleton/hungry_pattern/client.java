package signleton.hungry_pattern;

/**
 * Create by mr.wl on 2017/8/31
 */
public class client {
    public static void main(String[] args) {
        HungryPattern pattern = HungryPattern.getInstance();
        HungryPattern pattern1 = HungryPattern.getInstance();
        if(pattern==pattern1){
            System.out.println("饿汉单例模式");
        }else{
            System.out.println("错误,设计失败");
        }
    }
}

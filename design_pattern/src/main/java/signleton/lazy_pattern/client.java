package signleton.lazy_pattern;

/**
 * Create by mr.wl on 2017/8/31
 */
public class client {
    public static void main(String[] args) {
        LazyPattern pattern = LazyPattern.getInstance();
        LazyPattern pattern1 = LazyPattern.getInstance();
        if(pattern==pattern1){
            System.out.println("懒汉模式");
        }else{
            System.out.println("错误,设计失败");
        }
    }
}

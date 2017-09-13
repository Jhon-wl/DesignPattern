package chain.responsibility_chain;

/**
 * Create by mr.wl on 2017/9/13
 */
public class sales extends PriceHandler {
    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.05){
            System.out.println(discount+"折扣批准,交易可以完成");
        }else{
            successor.processDiscount(discount);
        }
    }
}

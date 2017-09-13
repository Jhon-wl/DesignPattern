package chain.responsibility_chain;

/**
 * Create by mr.wl on 2017/9/13
 */
public class CEO extends PriceHandler{
    @Override
    public void processDiscount(float discount) {
        if(discount <=0.5){
            System.out.println("CEO:"+discount+"折扣批准,交易成功");
        }else {
            System.out.println("CEO:拒绝交易");
        }
    }
}

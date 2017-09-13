package chain.responsibility_chain;

/**
 * Create by mr.wl on 2017/9/13
 */
public class manager extends PriceHandler{
    @Override
    public void processDiscount(float discount) {
        if(discount <= 0.2){
            System.out.println("经理:"+discount+"折扣批准,交易完成");
        }else {
            successor.processDiscount(discount);
        }
    }
}

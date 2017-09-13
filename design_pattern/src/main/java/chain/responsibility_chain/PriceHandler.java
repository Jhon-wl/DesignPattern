package chain.responsibility_chain;

/**
 * Create by mr.wl on 2017/9/13
 */
public abstract class PriceHandler {

    //定义一个后继节点
    protected PriceHandler successor;

    public void setSuccessor(PriceHandler successor) {
        this.successor = successor;
    }

    public abstract void processDiscount(float discount);

    public static PriceHandler createPriceHandler(){
        PriceHandler sales = new sales();
        PriceHandler manager = new manager();
        PriceHandler CEO = new CEO();

        sales.setSuccessor(manager);
        manager.setSuccessor(CEO);
        return sales;

    }
}

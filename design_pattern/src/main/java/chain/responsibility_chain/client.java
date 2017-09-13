package chain.responsibility_chain;

/**
 * Create by mr.wl on 2017/9/13
 */
public class client {
    private PriceHandler handler;

    public void setHandler(PriceHandler handler) {
        this.handler = handler;
    }

    public void  requestDiscount(float discount){
        handler.processDiscount(discount);
    }

    public static void main(String[] args) {

        client c1 = new client();
        c1.setHandler(PriceHandler.createPriceHandler());

        c1.requestDiscount(0.24f);
    }
}

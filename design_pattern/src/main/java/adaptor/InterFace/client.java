package adaptor.InterFace;

/**
 * Create by mr.wl on 2017/9/11
 */
public class client {
    public static void main(String[] args) {
        TwoPlug plug = new TwoPlug();
        TwoTOThreeAdaptor adaptor = new TwoTOThreeAdaptor(plug);
        adaptor.useThreePlug();
    }
}

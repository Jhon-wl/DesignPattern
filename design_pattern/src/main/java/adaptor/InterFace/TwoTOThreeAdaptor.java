package adaptor.InterFace;

/**
 * Create by mr.wl on 2017/9/11
 */
public class TwoTOThreeAdaptor implements ThreePlugInterface{


    private TwoPlug plug;

    public TwoTOThreeAdaptor(TwoPlug plug){
        this.plug = plug;
    }
    @Override
    public void useThreePlug() {
        System.out.println("经转换,开始充电===>");
    }
}

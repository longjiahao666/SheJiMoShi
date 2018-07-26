package DanLiMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
public class DanLiMoShi3 {
    private DanLiMoShi3() {
    }
    private static final DanLiMoShi3 single = new DanLiMoShi3();
    public static DanLiMoShi3 getInstance() {   //静态工厂方法
        return single;
    }
    public void SayLove(){
        System.out.println("Love You Baby!");
    }
}

package DanLiMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
public class DanLiMoShi4 {
    private volatile static DanLiMoShi4 singleton;
    private DanLiMoShi4 (){}
    public static DanLiMoShi4 getInstance() {
        if (singleton == null) {
            synchronized (DanLiMoShi4.class) {
                if (singleton == null) {
                    singleton = new DanLiMoShi4();
                }
            }
        }
        return singleton;
    }
}


package DanLiMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
public class DanLiMoShi2 {
    private static DanLiMoShi2 instance;
    private DanLiMoShi2 (){}
    public static synchronized DanLiMoShi2 getInstance() {
        if (instance == null) {   //如果有了实例了，就不需要要创建了
            instance = new DanLiMoShi2();
        }
        return instance;
    }
    public void SayLove(){
        System.out.println("Love You Baby!");
    }
}

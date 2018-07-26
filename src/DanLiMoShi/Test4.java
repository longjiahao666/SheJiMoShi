package DanLiMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
public class Test4 {
    public static void main(String[] args) {
        DanLiMoShi4 danli1 = DanLiMoShi4.getInstance();
        DanLiMoShi4 danli2 = DanLiMoShi4.getInstance();
        if( danli1 == danli2 )
            System.out.println("我们是一样的");
    }
}

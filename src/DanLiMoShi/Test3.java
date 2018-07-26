package DanLiMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
public class Test3 {
    public static void main(String[] args) {
        DanLiMoShi3 danli1 = DanLiMoShi3.getInstance();
        DanLiMoShi3 danli2 = DanLiMoShi3.getInstance();
        if( danli1 == danli2 )
            System.out.println("我们是一样的");
        danli1.SayLove();
    }
}

package DanLiMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
public class Test1 {
    public static void main(String[] args){
        DanLiMoShi1 danli1 = DanLiMoShi1.getInstance();
        DanLiMoShi1 danli2 = DanLiMoShi1.getInstance();
        if( danli1 == danli2 )
            System.out.println("我们是一样的");
        danli1.SayLove();
    }
}

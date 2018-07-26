package DanLiMoShi;

public class DanLiMoShi1 {
    private static DanLiMoShi1 instance;
    private DanLiMoShi1 (){}
    public static DanLiMoShi1 getInstance() {
        if (instance == null) {   //如果有了实例了，就不需要要创建了
            instance = new DanLiMoShi1();
        }
        return instance;
    }
    public void SayLove(){
        System.out.println("Love You Baby!");
    }
}

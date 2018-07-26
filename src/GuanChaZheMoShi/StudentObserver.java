package GuanChaZheMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
//观察者
public class StudentObserver implements Observer {
    private String name;
    public StudentObserver(String name){
        this.name = name;
    }
    @Override
    public void update(String info) {
        System.out.println(name + "收到消息：" + info);
    }
}

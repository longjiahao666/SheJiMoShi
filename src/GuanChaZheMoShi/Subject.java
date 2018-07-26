package GuanChaZheMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
//被观察者的接口
public interface Subject {
    //注册观察者
    void registerObserver(Observer observer);
    //移除观察者
    void removeObserver(Observer observer);
    //通知观察者
    void notifyObservers(String msg);
}


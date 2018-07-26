package GuanChaZheMoShi;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by KPL on 2018/7/26.
 */
public class TeacherSubject implements Subject{
    //用来存放和记录观察者
    private List<Observer> observers=new ArrayList<Observer>();
    @Override
    public void registerObserver(Observer obj) {
        observers.add(obj);
    }
    @Override
    public void removeObserver(Observer obj) {
        int i = observers.indexOf(obj);
        if( i >= 0 )
            observers.remove(obj);
    }
    @Override
    public void notifyObservers(String msg) {
        for(Observer observer : observers) {
            observer.update(msg);
        }
    }
}



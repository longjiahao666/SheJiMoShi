package GuanChaZheMoShi;

/**
 * Created by KPL on 2018/7/26.
 */
public class Test {
    public static void main(String[] args){
        TeacherSubject teacher = new TeacherSubject();
        StudentObserver studentObserver1 = new StudentObserver("鸣人");
        StudentObserver studentObserver2 = new StudentObserver("佐助");
        teacher.registerObserver(studentObserver1);
        teacher.registerObserver(studentObserver2);
        teacher.notifyObservers("发作业啦");
    }
}

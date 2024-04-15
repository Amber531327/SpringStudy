package springioclife04;

public class Javabean {
    //周期方法要求： 方法命名随意，但是要求方法必须是 public void 无形参列表
    public void init(){
        System.out.println("Javabean");
    }

    public void destroy(){
        System.out.println("bye");
    }
}

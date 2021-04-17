package lesson1;

public class CreateThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {//任务描述可执行类：传入线程对象的构造方法
            @Override
            public void run() {//线程运行态时，执行

            }
        };
        Thread t = new Thread(r);
        t.start();

        //合并的代码
        new Thread(new Runnable() {
            @Override
            public void run() {

            }
        }).start();
    }
}

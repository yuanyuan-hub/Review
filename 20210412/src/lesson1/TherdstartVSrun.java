package lesson1;

public class TherdstartVSrun {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){

                }
            }
        }).run();
        /**
         * main 线程直接调用Thread对象的run方法，会直接在main线程
         * 运行Thread对象的run()-->传入的runnable方法
         */
    }
}

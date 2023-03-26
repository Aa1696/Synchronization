package Another_Package;
import static Another_Package.Thread_Color.*;
public class Main {
    public static void main(String[] args) {

        System.out.println(ANSI_CYAN+"Hello world!");
        Thread thd=new Another_Thread();
        thd.setName("==New_Name==");
        thd.start();
        new Thread(){
            @Override
            public void run() {
                System.out.println(ANSI_GREEN+"Another Instance of the thread in the main class");
            }
        }.start();
        Thread my_runnable_thread=new Thread(new My_Runnable(){
            @Override
            public void run() {
                System.out.println(ANSI_RED + "runnable thread using annonymous function");
                try{
                    thd.join();
                    System.out.println(ANSI_RED + "Another thread terminated and given thread is running");
                }
                catch(InterruptedException e){
                    System.out.println("I couldn't at all , because I was interrupted");
                }
            }
        });
        my_runnable_thread.start();
        //thd.interrupt();
        System.out.println(ANSI_CYAN+"New Instance of the  main thread of main class");
    }
}
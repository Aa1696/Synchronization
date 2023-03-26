package Another_Package;

import static Another_Package.Thread_Color.ANSI_BLUE;

public class Another_Thread extends Thread{
    @Override
    public void run() {
        System.out.println(ANSI_BLUE + "From"+currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(ANSI_BLUE + "another thread wake me up");
            return;
        }
        System.out.println(ANSI_BLUE+"After sleeping the thread");
    }
}

package Another_Package;

import static Another_Package.Thread_Color.ANSI_RED;
public class My_Runnable implements Runnable{
    @Override
    public void run() {
        System.out.println(ANSI_RED + "From runnable interface");
    }
}

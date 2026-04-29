import java.util.*;
class MyThread extends Thread{
    @Override
    public void run(){
        for(int i=0;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
        }
    }
}




class Thread_UsingThreadClass{
    public static void main(String Args[]) throws Exception{
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        MyThread t4=new MyThread();
        
        t1.setName("Thread A");
        t2.setName("Thread B");
        t3.setName("Thread C");
        t4.setName("Thread D");

        // setPriority(): if a thread having a heigh priority so there is more chance that thread will complete its
        // execution first.

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();

        // try{
        //     t1.join();
        // }catch(Exception e){
        //     System.out.println(e.getMessage());
        // }

        t2.start();

        //  join(): This method provide facilities to complete ine thread then after that
        t1.join();
        t2.join();

        System.out.println("    \n");


        //  yield(): It gives same priority to other threads as compare to current thread so they can execute their task parallely
        //            its not guaranteed.
        
        Thread.yield();
        t3.start();
        t4.start();
        
        
    }
}
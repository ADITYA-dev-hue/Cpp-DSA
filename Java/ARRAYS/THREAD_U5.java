
class MyThreads implements Runnable{
    private String ThreadName;

    MyThreads(String n){
        ThreadName=n;
    }


    @Override
    public void run(){
        for (int i = 0; i <= 15 ; i++) {
            System.out.println(ThreadName+" "+i);


            try{
            Thread.sleep(1000);         //1000 milli sec = 1 sec
            }catch(Exception e){
                System.out.print(e.getMessage());
            }

        }
    }
}
class YourThreads implements Runnable{
    private String ThreadName;

    YourThreads(String n){
        ThreadName=n;
    }


    @Override
    public void run(){
        for (int i = 0; i <= 15 ; i++) {
            System.out.println(ThreadName+" "+i+" Priority: "+Thread.currentThread().getPriority());
        }
    }
}
// 1. start() : thread start its execution
// 2. sleep(milli sec.) : waiting time for thread.
// 3. setPriority(int priority): priority to thread
//    i.e.: which one will execute first.
// 4. join():
public class THREAD_U5 {
    public static void main(String Args[]) throws Exception{
        MyThreads thread1=new MyThreads("Thread A");
        MyThreads thread2=new MyThreads("Thread B");
        // thread1.run();


        Thread t1 = new Thread(thread1);
        Thread t2=new Thread(thread2);
        t1.start();
        

        try{
            t1.join();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        System.out.println();
        t2.setPriority(10);
        t2.start();


        YourThreads thread3=new YourThreads("Thread C");
        YourThreads thread4=new YourThreads("Thread D");


        Thread t3=new Thread(thread3);
        Thread t4=new Thread(thread4);
        t3.setPriority(1);
        t4.setPriority(2);
        t3.start();
        t4.start();


    }
}

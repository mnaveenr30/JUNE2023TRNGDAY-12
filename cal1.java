class cal1 implements Runnable{
    public static void main(String args[]){
        cal obj=new cal();
        Thread Threadobj=new Thread(obj);
        Threadobj.start();
        System.out.println("Thread inside main are very much helpful in java");
    }
    public void run(){
        System.out.println("Threads from overridden run method are");
    }
}
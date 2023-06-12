class TestThread extends Thread{
    public static void main(String args[]){
        TestThread tob=new TestThread();
        tob.start();
        System.out.println("This is out side of the Thread");
    }
    public void run(){
        System.out.println("This is running in  The Thread");
    }
}
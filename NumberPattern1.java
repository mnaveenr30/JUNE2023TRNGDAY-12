import java.util.*;
class NumberPattern1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=1;
        if(n%2==0) n+=1;
        for (int i=0;i<n;i++){
            for (int j=(n-i);j<n;j++){
                if(n>=0&&n<10) System.out.print(count);
                else if(n>=10&&n<100&&count<10) System.out.print(count+" ");
                else if(n>=100&&n<1000&&count<100) System.out.print(count+"  ");
                else if(n>=1000&&n<10000&&count<1000) System.out.print(count+"   ");
                else System.out.print(count);
                count++;
            }
            System.out.println();
            count=1;
        }
    }
}
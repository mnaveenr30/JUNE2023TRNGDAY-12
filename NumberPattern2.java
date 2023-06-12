import java.util.*;
class NumberPattern2{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n%2==0) n+=1;
        int count=1;
        int h=(n/2);
        int x=h-1,a=h+1;
        for (int i=0;i<=h;i++){
            for (int j=0;j<=n;j++){
                if(x<j&&j<a){
                    System.out.print(count);
                    count++;
                }
                else System.out.print(" ");
            }
            System.out.println();
            x-=1;
            a+=1;
            count/=count;
        }
    }
}
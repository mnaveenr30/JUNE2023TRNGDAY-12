import java.util.*;
class NumberPattern{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int count=0;
        if(n%2==0) n+=1;
        for (int i=0;i<=(n/2);i++){
            for (int j=(n-i);j<n;j++){
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
    }
}
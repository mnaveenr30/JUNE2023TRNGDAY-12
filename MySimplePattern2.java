import java.util.*;
class MySimplePattern2{
    public void pattern(char ch1,int i,char ch2,int j){
        for(int a=0;a<i;a++) System.out.print(ch1);
        for(int b=0;b<j;b++) System.out.print(ch2);
        for(int c=0;c<i;c++) System.out.print(ch1);
        System.out.println();
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the outer charecter");
        char ch1=s.next().charAt(0);
        System.out.println("Enter inner charecter");
        char ch2=s.next().charAt(0);
        System.out.println("Enter the height of the diamond");
        int n=s.nextInt();
        if(n%2==0) n+=1;
        MySimplePattern2 P=new MySimplePattern2();
        for(int i=n/2,j=1;i>0&&j<=n;i--,j+=2){
            P.pattern(ch1,i,ch2,j);
        }
        for(int i=0,j=n;i<=n/2&&j>=0;i++,j-=2){
            P.pattern(ch1,i,ch2,j);
        }
    }
}
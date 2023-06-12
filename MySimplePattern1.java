import java.util.Scanner;
class MySimplePattern1{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the outer character");
        char ch1=s.next().charAt(0);
        System.out.println("Enter the inner character");
        char ch2=s.next().charAt(0);
        System.out.println("Enter the heigth of the triangle");
        int a=s.nextInt();
        if(a%2==0) a+=1;
        int h=(a/2)+1;
        int x=a/2,y=h+1;
        System.out.println(x+"\t"+y);
        for(int i=0;i<h;i++){
            for(int j=1;j<=a;j++){
                if(x<j && j<y) System.out.print(ch2);
                else System.out.print(ch1);
            }
            System.out.println();
            x-=1;
            y+=1;
        }
        x=1;
        y=a;
        for(int i=0;i<h-1;i++){
            for(int j=1;j<=a;j++){
                if(x<j && j<y) System.out.print(ch2);
                else System.out.print(ch1);
            }
            System.out.println();
            x+=1;
            y-=1;
        }
    }
}
import java.util.*;
class Fibanasis{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a=0,b=1,i=0;
        String str="",res="";
        System.out.print("0,");
        do{
            i=a+b;
            a=b;
            b=i;
            if(i>=n) break;
            str+=i+",";
        }while(i<=n);
        for (int j=0;j<str.length()-1;j++){
            res+=str.charAt(j);
        }
        System.out.println(res);
    }
}
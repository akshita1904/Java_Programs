import java.util.*;

class TwinPrime{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st number :");
        int a=sc.nextInt();
        System.out.println("Enter 2st number :");
        int b=sc.nextInt();
        int c=0;
        int x=0;
        int y=0;
        int c1=0;
        if(a-b!=2||b-a!=2){
            System.out.println("The numbers entered are not twin prime");
        }
        else{
            for(int i=2; i<=a/2; i++){
                if(a%i==0){
                    x=a;
                }
                else{
                    c+=1;
                }
            }
            
            for(int j=2; j<=a/2; j++){
                if(b%j==0){
                    y=b;
                }
                else{
                    c1+=1;
                }
            }
            
            if(c!=0 && c1!=0){
                System.out.println("Twin Prime");
            }
            else{
                System.out.println("Not Twin Prime");
            }
        }
    }
}
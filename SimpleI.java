import java.util.Scanner;

public class SimpleI {
 int p,t,r;
    public SimpleI(int p,int r,int t){
            this.p=p;
            this.t=t;
            this.r=r;
        }

        public double calculate(){
            double si=(p*t*r)/100;
            return si;
        }
        public double finalAmt(double si){
           double fa=si+p;
           return fa;
        }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter Principal:");
       int p=sc.nextInt();
       System.out.println("Enter time:");
       int t=sc.nextInt();
       System.out.println("Enter Rate:");
       int r=sc.nextInt();

     //Creating object
     SimpleI obj=new SimpleI(p,t,r); 
      
     double res=obj.calculate();
     double res2=obj.finalAmt(res);
     System.out.println("Simple Interest:"+res);
     System.out.println("Final Amount:"+res2);

    }
} 

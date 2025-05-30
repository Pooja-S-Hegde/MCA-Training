import java.util.Scanner;

public class volumeC {
    public void volume(double r){
    double vol=4/3*3.14*(r*r*r);
    System.out.println("Volume of sphere is="+vol);
}
 public void volume(float a){
    double vol=a*a*a;
    System.out.println("Volume of cube is="+vol);
}
 public void volume(double r,double h){
    double vol=3.14*r*r*h;
    System.out.println("Volume of cylinder is="+vol);
 }
 public static void main(String[] args) {
    volumeC obj=new volumeC();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the side of cube");
    float a=sc.nextFloat();
    System.out.println("Enter the radius of cylinder");
    double r=sc.nextDouble();
    System.out.println("Enter the height of sphere");
    double h=sc.nextInt();
    obj.volume(a);
    obj.volume(r,h);
    
 }
}
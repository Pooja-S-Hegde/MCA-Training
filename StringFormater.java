/*Write a program to enter a string for example "Mohandas Karmachand Gandhi" and 
generate a new String for example "M.K. Gandhi" using appropriate methods and constructor. */

import java.util.Scanner;

class NameFormater {
     String result;
     NameFormater(String fullname){
       String[] parts=fullname.split(" ");
       result=" ";
       for(int i=0;i<parts.length-1;i++){
          result+=parts[i].charAt(0)+".";
       }
       result+=" "+parts[parts.length-1];
     }
     void display(){
        System.out.println("Formatted name:"+result);
     }
    }
    public class StringFormater {
     public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a name:");
        String fullname=sc.nextLine();
        NameFormater obj=new NameFormater(fullname);
        obj.display();
        sc.close();
    }
        
    }
   


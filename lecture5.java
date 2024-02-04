import java.util.*;
public class Lecture4 {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1 to 20:");
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int rnum=r.nextInt(20);
        for(int i=0;i<6;i++){
        int num=sc.nextInt();
        
        if(num>rnum){
            System.out.println("Your guess is HIGH!");
        }else if(num<rnum){
            System.out.println("Your guess is LOW!");
        }else{
            System.out.println("You have guessed it right!");
            break;
        }

    }
}

import java.util.*;

class Lecture1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Number !");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("+ve");
        }else if(num==0){
            System.out.println("neutral");
        }else{
            System.out.println("-ve");
        }
    }
}

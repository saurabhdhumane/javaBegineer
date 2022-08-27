import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args){
     int mynum = (int)(Math.random()*100);
        Scanner sc = new Scanner(System.in);
        int usernum = 0;
     do{
         System.out.println("Guess my number: ");
         usernum = sc.nextInt();
         if (usernum == mynum){
             System.out.println("Congress You Guess The Right Number...!");
             break;
         } else if (usernum > mynum) {
             System.out.println("your guess number is to large");
         }
         else {
             System.out.println("your number is to small");
         }
     }while (usernum >=0);
        System.out.println("The Guess the game number is : "+ mynum);
    }
}

import java.util.Scanner;

public class userInput {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    int number = 0;
        do{
            System.out.print("Input a Number: ");
             number = sc.nextInt();
            System.out.println("here your choice of number: ");
            System.out.println(number);
        }while (number >=0);
        System.out.println("the end");



        // break and continue
        int i = 0;
        while (true){
            if (i ==3){
                i = i+1;
                continue;
            }
            System.out.println(i);
            i = i +1;
            if (i> 5){
                System.out.println("the val ue is greater then 5 now we exit code");
                break;
            }
        }
    }
}

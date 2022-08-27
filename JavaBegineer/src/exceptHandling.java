import java.util.Scanner;

public class exceptHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //try and catch

        int[] marks = {97, 65,77,88};

        try{
            System.out.println(marks[6]);
        } catch (Exception ex){
            // do something after catching
            System.out.println("please select right index in array");
        }
        System.out.println("the Student is Succefully pass");

    }
}

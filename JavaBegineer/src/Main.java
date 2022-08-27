import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        System.out.print("hello Worlds");
        // variable in java and datatypes

                String name = "Saurabh";
                String name1 = "dhumane";
                byte age = 22;
                long phone = 8888211972L;
                float pi = 3.14F;
                char letter = 'a';
                boolean iaAdult = true;

    //lenght()
        System.out.println(name.length());

    // concatination string

        String name2 = name + " " + name1;
        System.out.println(name2);



    //charAt()
        System.out.println(name.charAt(0));

    //replace

        String replace1 = "demo";
        String replace2 = replace1.replace('d', 'm');
        System.out.println(replace2);

    //substring

        String substring1 = "Saurabh Raje" ;
        System.out.println(name.substring(0,7));
    // Arrays


      int[] marks = new int[3];
      marks[0] = 97;
      marks[1] = 88;
      marks[2] = 54;
      System.out.println(marks[2]);
      System.out.println(marks.length);

      int[] total = {97, 88, 54};
        System.out.println(total[1]);

        // 2d array

        int[][] finalmark = {{54, 56,78,96},{54,66,76,98}};
        System.out.println(finalmark[0][1]);
        System.out.println(finalmark[1][1]);




        //sort

        Arrays.sort(marks);
        System.out.println(marks[0]);


        //casting

        double price = 100.00;
        double finalprice = price + 18;
        System.out.println(finalprice);  // this is implecite casting

        int p = 100;
        int fp = p + (int)18.0;
        System.out.println(fp); // explicite casting i n java


        //constant

        final int constant1 = 12;

        //operators
        // arthmathic
        int a = 10;
        int b = 3;
        int sum = a + b;
        int devision = a - b;
        int multiple = a * b;
        double div = a / b;
        double modulo = a % b;


        System.out.println(sum);
        System.out.println(devision);
        System.out.println(multiple);
        System.out.println(div);
        System.out.println(modulo);


        //assign operators

        int numb = 1;
        System.out.println(numb++); // 1
        System.out.println(numb); // 2
        System.out.println(++numb); //3

        System.out.println(numb--); // 3
        System.out.println(numb); // 2
        System.out.println(--numb); //1

        // maths
        // 5 7
        System.out.println(Math.max(5, 7));
        System.out.println(Math.min(5, 7));
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*100)); // explicite conversion

        // input
        Scanner sc  = new Scanner(System.in);
        System.out.println("Please Enter Your Age: ");
        int age1 = sc.nextInt();
        System.out.println("Please Enter Your Name: ");
        String iname1 = sc.next();
        System.out.println("Please Enter Your string: ");
        String input1 = sc.nextLine();

        System.out.println(iname1);
        System.out.println(age1);
       System.out.println(input1);


       // comparison operator
        // a==b
        //  a != b
        //  a < b
        // a > b
        // a <= b
        // a >= b

// conditonal statmemt

        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("night");

// other example
        if (age1 >= 18)
            System.out.println("Congress."+iname1 +"! You Can Eligible For Voting...");
        else
            System.out.println("Sorry, Currenlly Your Not Eligible For Voting..");



        // logical operators

        //&&
        int ab = 30;
        int bc = 40;
        if (ab<50 && bc< 50)
        {
            System.out.println("both less than 50");
        }
        else {
            System.out.println("both greeter then 50");
        }


        // ||

        if (a<50 || b < 50){
            System.out.println("atleast one is less than 50");
        } else {
            System.out.println("atleast one greater then 50");
        }

    //  !
        boolean isAdult = true;
        if(!isAdult) // == false
        {
            System.out.println("notadult");
        } else
        {
            System.out.println("isAdult");
        }

        //conditional statemet

        // pen 10, notebook = 40
        System.out.print("Please Enter Your Money: ");
        int cash = sc.nextInt();

        if (cash < 10){
            System.out.println("connot buy Anything");
            System.out.println("Please Collect more Money");
        } else if (cash > 10 && cash <50) {

            System.out.println("Can get 1 item only ");
        }
        else {
            System.out.println("can get both");
        }


        // Switch Statment

       int day = sc.nextInt();
         switch (day){
             case 1:
                 System.out.println("Today is Monday");
                 break;
             case 2:
                 System.out.println("Today is Tuesday");
                 break;

             case 3:
                 System.out.println("Today is Wensday");
                 break;

             case 4:
                 System.out.println("Today is Thasday");
                 break;

             case 5:
                 System.out.println("Today is Friday");
                 break;

             case 6:
                 System.out.println("Today is Saturday");
                 break;

             case 7:
                 System.out.println("Today is Sunday");
                 break;

             default:
                 System.out.println("plaase Enter Right value");
         }

         // Loop Statment
         //1-100

        for (int i = 0; i <=100; i++){
            System.out.println(i);
        }

        // 100 -1

        for (int i = 100; i>=1; i = --i)
        {
            System.out.println(i);
        }

        //while loop
        int j = 10;
        while (j>= 1){
            System.out.println(j);
            j = j-1;
        }

        // do while

        int k = 5;
        do {
            System.out.println(k);
            k = k - 1;
        }while (k>=1);
    }
}
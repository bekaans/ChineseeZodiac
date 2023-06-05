import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            double birthyear;
            double zodiac;

            System.out.print("Hello, Please Write Your Birthyear :"); birthyear=input.nextDouble();

            zodiac=birthyear%12;

            if (zodiac==0)
           {
               System.out.println("Monkey");
           }
           else if (zodiac==1)
        {
            System.out.println("Cockerel");
        }
            else if (zodiac==2)
            {
                System.out.println("Dog");
            }

            else if (zodiac==3)
            {
                System.out.println("Pig");
            }

            else if (zodiac==4)
            {
                System.out.println("Mouse");
            }

            else if (zodiac==5)
            {
                System.out.println("Ox");
            }

            else if (zodiac==6)
            {
                System.out.println("Tiger");
            }

            else if (zodiac==7)
            {
                System.out.println("Rabbit");
            }

            else if (zodiac==8)
            {
                System.out.println("Dragon");
            }

            else if (zodiac==9)
            {
                System.out.println("Snake");
            }

            else if (zodiac==10)
            {
                System.out.println("Horse");
            }

            else if (zodiac==11)
            {
                System.out.println("Monkey");
            }

            else if (zodiac==12)
            {
                System.out.println("Sheep");
            }

            else {
                System.out.println("Wronggg--Errorr---");
            }





    }
}
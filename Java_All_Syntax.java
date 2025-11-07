package Previous_Practise_Code;

public class Java_All_Syntax {
    public static void main(String[] args) {
        System.out.println("Datatypes");
       /* byte num =5;
        short num1 = 1000;
        int num2 = 1000000000;
        long num3 = 100000000000000000L;
        float num4 = 1.99F;
        double num5= 1111.888888;
        System.out.println(num4);
        char name = 'a';
        boolean bool = true;
        System.out.println(bool);*/

        System.out.println("Array");
        /*int num[] = {1,2,3,4};
        num[3]=100;

        char fruit[]={'a','b','z'};
        int value=fruit.length;
        char fruit2[]=fruit.clone();
        System.out.println(Arrays.toString(fruit2));

        long number[] = new long[10];
        number[1]=10000000000L;
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(num));

        int TwoDDimensionArrays[][]={{2,3},{4,5}};
        //System.out.println(Arrays.());*/

        System.out.println("String");
        /*String NameOfFriut="apple " + "orange";
        System.out.println(NameOfFriut.endsWith("ge"));*/

        System.out.println("operator");
        /*int num1=10;
        int num2=20;
        System.out.println(num1 *num2);
        System.out.println(num1 %num2);
        num1+=50;
        num2-=50;//num1=num1+50
        System.out.println(num2);

        System.out.println(num1!=num2);
//bodmas precedence
        //&& || !
        int age=15;
        boolean indianlicense = true;
        System.out.println(!indianlicense==false );

        //? : ternary operator
        int mark=35;
        String result = mark>=35 ? "passed" : "failed";
        System.out.println(result);

        //pre post inncrement derement
        int number=5;
        int number1=10;
        number=++number;
        System.out.println(number);
        System.out.println(--number1);

         */
        System.out.println("Math");
        /* int num1 = 100;
        float num2 = 200.63F;

        System.out.println(Math.min(num1,num2));
        System.out.println(Math.log(num2));*/

        System.out.println("Condition / Switch case");

        /*int age ;
        //sccanner
        System.out.println("enter the voters age :");
        Scanner input = new Scanner(System.in);
        age = input.nextInt();

        int VotersEligibility = 18;



        if(age >=  VotersEligibility && age < 60)
        {
            System.out.println("I am eligible");
        }
        else if (age >= 60 ) {
            System.out.println("over age");
        } else {
            System.out.println("i am note eligible");
        }
    */

       /* String color ;
        System.out.println("enter your fav color:");
        Scanner input = new Scanner(System.in);
        color=input.nextLine();
        switch (color)
        {
            case "red":
                System.out.println("my fav color is "+ color);
                break;
            case "black":
                System.out.println("my fav color is "+ color);
                break;

            case "blue":
                System.out.println("my fav color is "+ color);
                break;
            case "green":
                System.out.println("my fav color is "+ color);
                break;
            default:
                System.out.println("invalid");
                break;
        }


    int choice;
        Scanner input = new Scanner(System.in);
        System.out.println("your choice is:");
        choice=input.nextInt();
        switch (choice)
        {
            case 1:
                System.out.println("push" );
                break;
            case 2:
                System.out.println("pop " );
                break;

            case 3:
                System.out.println("peek");
                break;
            case 4:
                System.out.println("display ");
                break;
            default:
                System.out.println("invalid");
                break;
        }

        */
        System.out.println("LOOPS");
/*
        for(int i=10;i>0;i--)
        {
            System.out.println("Microsoft");
        }
        int i=0;
        while( i<10)
        {
            System.out.println("done my job");
            i++;
        }
        int j=0;
       do
        {
            System.out.println("world");
            j++;
        } while(j<10);

        String fruits[]={"apple","orange","mango"};

        for(int i= fruits.length-1;i>=0;i--)
        {
            System.out.println(fruits[i]);
        }
        for(String game : fruits)
        {
            System.out.println(game);
        }
*/
    }
}
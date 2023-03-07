import java.util.*;
public class Days {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter choice b/w 1 - 7");
        int choice=sc.nextInt();
        switch(choice)
        {
            case 1:
            System.out.println(choice + " : "+" Monday");
            break;

            case 2:
            System.out.println(choice + " : "+" Tuesday");
            break;

            case 3:
            System.out.println(choice + " : "+" Wednesday");
            break;

            case 4:
            System.out.println(choice + " : "+" Thrusday");
            break;

            case 5:
            System.out.println(choice + " : "+" Friday");
            break;

            case 6:
            System.out.println(choice + " : "+" Saturday");
            break;

            case 7:
            System.out.println(choice + " : "+" Sunday");
            break;

            default:System.out.println("Wrong Input");
        }
    }
}

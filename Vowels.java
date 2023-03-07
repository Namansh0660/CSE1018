import java.util.Scanner;
class Vowels {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter Character: ");
        char c = sc.next().charAt(0);
        char z = Character.toUpperCase(c);
        switch (z) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println(c + " is a Vowel.");
                break;

            default:
                System.out.println(c + " is a Non-Vowel Character.");
        }
    }
}

import java.util.Scanner;

public class Switch_Statements {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.print("Please input a number: ");
        number = Integer.valueOf(scanner.next());
        switch (number) {
            case 1: System.out.println("The number 1 in German is eins");
                break;
            case 2: System.out.println("The number 2 in German is zwei");
                break;
            case 3: System.out.println("The number 3 in German is drei");
                break;
            case 4: System.out.println("The number 4 in German is vier");
                break;
            case 5: System.out.println("The number 5 in German is funf");
                break;
            case 6: System.out.println("The number 6 in German is sechs");
                break;
            case 7: System.out.println("The number 7 in German is sieben");
                break;
            case 8: System.out.println("The number 8 in German is acht");
                break;
            case 9: System.out.println("The number 9 in German is neun");
                break;
            case 10: System.out.println("The number 10 in German is zehn");
                break;
            default: System.out.println("Invalid Entry");
        }
    }
}

import java.util.Scanner;


public class solution {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Shopping Cart Contents");
        String userInput = s.nextLine();
        System.out.println("Cart :" + userInput);

        int totalValue = 0;
        int ACount = 0;
        int BCount = 0;
        int x = 0;
        String values = "ABCD";

        while (x < userInput.length()) {
            if (userInput.charAt(x) == values.charAt(0)) {
                ACount++;
                totalValue += 50;
                if (ACount == 3) {
                    ACount = 0;
                    totalValue -= 20;
                }
            } else if (userInput.charAt(x) == values.charAt(1)) {
                BCount += 1;
                totalValue += 30;
                if (BCount == 2) {
                    BCount = 0;
                    totalValue -= 23;
                }
            } else if (userInput.charAt(x) == values.charAt(2)) {
                totalValue += 20;
            } else if (userInput.charAt(x) == values.charAt(3)) {
                totalValue += 10;
            }
            x++;
        }
        System.out.println(totalValue);

    }
}



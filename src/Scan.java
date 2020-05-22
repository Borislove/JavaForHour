import java.util.Scanner;

//ввод данных пользователя
public class Scan {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
       /* int i;
        i = num.nextInt();
        System.out.println("My variable is: " + i);
*/
        String symbols;
        symbols = num.nextLine();
        System.out.println(symbols);
    }
}

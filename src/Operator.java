//оператор if
public class Operator {
    public static void main(String[] args) {

        int i = 2, j = 46;
        if (i == 234 || j == 45) {
            System.out.println("i is not 234");
        } else if (i > 100) {
            System.out.println("i is bigger than 100");
        } else if (i < 100) {
            System.out.println("i is less than 100");
        } else {
            System.out.println("i is unknown");
        }
    }
}

//else - иначе
//else if - дополнительная проверка
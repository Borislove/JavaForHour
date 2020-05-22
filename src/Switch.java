public class Switch {
    public static void main(String[] args) {

        int num = 23;
        switch (num) {
            case 12:
                System.out.println("num is 12");
                break;
            case 545:
                System.out.println("num is 545");
                break;
            case 23:
                System.out.println("num is 23");
                if (num == 23)  //для примера!
                    System.out.println("All is ok!");
                break;

            default: //выполнится в любом случае
        }
    }
}

//когда в if 1 операция фигурные скобки необязательны

public class Function {

    public static void main(String[] args) {

        int temp = func3(4, 6);
        System.out.println("temp = " + temp);

        Function function = new Function();
        function.func(2, 3);

        func1(2, 3);

        func2(3, 5);
        System.out.println(func2(3, 5));

    }

    void func(int a, int b) {  //функция ничего не возвращает
        int res;
        res = a + b;
        System.out.println("Result is: " + res);
    }

    public static void func1(int a, int b) {  //
        int res;
        res = a + b;
        System.out.println("Result is: " + res);
    }

    public static int func2(int a, int b) {  //
        int res;
        res = a + b;
        return res;
    }


    public static int func3(int a, int b) {  //
        int res;
        res = a + b;
        return res;
    }
}

public class Main {

    public static void main(String[] args) {
    }
    /*1. Создать пустой проект и прописать метод main */

    public static void printMessage() {
        System.out.println("Привет Давид");
    }

    /*2. Создать переменные всех пройденных типов данных и инициализировать их значения.*/
    byte a = 1;
    short b = 2;
    int c = 3;
    long d = 5;
    float x = 6.5F;
    double y = 7.5;
    boolean isA = false;
    boolean isB = true;
    char g = '!'; // символ

    /*3. Написать метод, вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        где a, b, c, d – аргументы этого метода, имеющие тип float.*/

    public static float getSum(float a, float b, float c, float d) {

        return a * (b + (c / d));
    }

    /*4. Написать метод, принимающий на вход два целых числа и проверяющий,
    что их сумма лежит в пределах от 10 до 20 (включительно),
    если да – вернуть true, в противном случае – false.
     */
    public static boolean a(int a, int b) {
        boolean isFirst10 = a + b >= 10;
        boolean isLast20 = a + b <= 20;
        if (isFirst10 && isLast20) {
            return true;
        } else {
            return false;
        }
    }

    /*5. Написать метод, которому в качестве параметра передается целое число,
    метод должен напечатать в консоль, положительное ли число передали или отрицательное.
    Замечание: ноль считаем положительным числом.
     */
    public static void number(int a) {
        if (a < 0) {
            System.out.println("отрицательное число");
        } else {
            System.out.println(" положительное число");
        }

    }
    /*6. Написать метод, которому в качестве параметра передается целое число.
    Метод должен вернуть true, если число отрицательное, и вернуть false если положительное*/

    public static boolean sumMath(int digit) {
        return digit < 0;
    }

    /*7. Написать метод, которому в качестве параметра передается строка,
    обозначающая имя. Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
     */
    public static void sayMyName(String name) {
        System.out.println("Привет, " + name + "!");
    }
}

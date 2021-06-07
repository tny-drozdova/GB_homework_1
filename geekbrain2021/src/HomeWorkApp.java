public class HomeWorkApp {
    public static void main (String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();

    }

    public static void printThreeWords () {
        System.out.println("Orange \n" + "Banan \n" + "Apple ");
    }

    public static void checkSumSign () {
        int a = -25;
        int b = 175;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
    public static void printColor () {
        int value = 100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int aa = 1235;
        int bb = -257;
        if (aa >= bb) {
            System.out. println("a >= b");
        }
        else {
            System.out.println("a < b");
        }
    }

}





public class Main {
    public static void main(String[] args) {
        task1(); //variable Task 1 описание переменных
        task2(); //initializing variables Task 2 инициализация переменнных
        task3(); //three teachers Task 3 три учителя
    }
    public static void task1() {
        System.out.println(" Задача 1");
        byte a = 127; // variable limit -128 до 127
        System.out.println(" Переменная byte a = " +a);
        short b = 32767; // variable limit -32768 до 32767
        System.out.println(" Переменная short b = " +b);
        int c = 2147483647; // variable limit -2147483648 до 2147483647
        System.out.println(" Переменная int c = " +c);
        long d = 922337203685477580L; // variable limit - many до many
        System.out.println(" Переменная long d = " +d);
        Float i = 1.152674748373f; //variable fractional
        System.out.println(" Переменная Float i = " +i);
        double f = 1.152674748373;
        System.out.println(" Переменная double f = " +f);
    }
    public static void task2() {
        System.out.println("__________________________________________________________________");
        System.out.println(" Задача 2 инициализация переменных " + " 27.12, " + " 987 678 965 549, " + " 2.786, " + " 569, " + " -159, " + " 27897, " + " 67, ");
        byte a = 67; // variable limit -128 до 127
        System.out.println(" Переменная byte a = " +a);
        short b1 = 569; // variable limit -32768 до 32767
        System.out.println(" Переменная short b1 = " +b1);
        short b2 = -159; // variable limit -32768 до 32767
        System.out.println(" Переменная short b2 = " +b2);
        short b3 = 27897; // variable limit -32768 до 32767
        System.out.println(" Переменная short b3 = " +b3);
        long d = 987678965549L; // variable limit - many до many
        System.out.println(" Переменная long d = " +d);
        Float i1 = 27.12f; //variable fractional
        System.out.println(" Переменная Float i1 = " +i1);
        Float i2 = 2.786f; //variable fractional
        System.out.println(" Переменная Float i2 = " +i2);

    }
    public static void task3() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 3 три учителя");
        byte lyudmilaPavlovna = 23;
        System.out.println(" Людмила ПАвловна = " +lyudmilaPavlovna+ " учеников");
        byte annaSergeevna = 27;
        System.out.println(" Анна Сергеевна = " +annaSergeevna+ " учеников");
        byte ekaterinaAndreevna = 30;
        System.out.println(" Екатерина Андреевна = " +ekaterinaAndreevna+ " учеников");
        int totalStudents = lyudmilaPavlovna + annaSergeevna + ekaterinaAndreevna; // Почему INT значение 80 позволяет BYT??????
        System.out.println(" Всего учеников = " +totalStudents+ " учеников");
        short totalTaper = 480;
        System.out.println(" Купили бумаги = " +totalTaper+ " листов");
        int sheetsStudent = totalTaper / totalStudents ;
        System.out.println(" Количество бумаги на одного ученика = " +sheetsStudent+ " листов");


    }


}

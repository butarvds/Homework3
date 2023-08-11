public class Main {
    public static void main(String[] args) {
        task1(); //variable Task 1 описание переменных
        task2(); //initializing variables Task 2 инициализация переменнных
        task3(); //three teachers Task 3 три учителя
        task4(); //bottle cutting machine Task 4 станок для бутылок
        task5(); //paint for school Task 5 краска для школы
        task6(); //Breakfast of the champion Task 6 завтрак чемпиона
        task7(); //Diet Program Task 7 программа диеты
        task8(); //Staff motivation Task 8 мотивация персонама
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
    public static void task4() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 4 станок бутылок");
        byte machinePerformance = 16/2;
        System.out.println(" Производительность станка = " +machinePerformance+ " шт/мин");
        int machinePerformanceTwentyMinutes = machinePerformance*20;
        System.out.println(" За 20 минут станок произвел = " +machinePerformanceTwentyMinutes+ " шт");
        int machineProductivityOneDay = machinePerformance*60*24;
        System.out.println(" За сутки станок произвел = " +machineProductivityOneDay+ " шт");
        int machinePerformanceThreeDays = machineProductivityOneDay*3;
        System.out.println(" За три дня станок произвел = " +machinePerformanceThreeDays+ " шт");
        int machineProductivityPerMonth = machineProductivityOneDay*30;
        System.out.println( " За месяц станок произвел = " +machineProductivityPerMonth+ " шт");

    }
    public static void task5() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 5 краска для школы");
        byte totalPaint = 120;
        System.out.println(" Всего краски = " +totalPaint+ " банок");
        byte  paintsOneClass= 2+4;// Proportion 2 of white 4 to brown
        System.out.println(" Количество краски на один класс  = " +paintsOneClass+ " банок");
        int  numberСlasses= totalPaint/paintsOneClass;
        System.out.println(" Количество колическтво классов  = " +numberСlasses+ " аудиторий");
        int  amountWhitePaint= numberСlasses*2;
        System.out.println(" Общее количество белой краски  = " +amountWhitePaint+ " банок");
        int  amountBrownPaint= numberСlasses*4;
        System.out.println(" Общее количество белой краски  = " +amountBrownPaint+ " банок");
        System.out.println(" В школе,где " +numberСlasses+ " , классов нужно " +amountWhitePaint+ " банок белой краски и " +amountBrownPaint+ " банок коричневой краски.");

    }
    public static void task6() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 6 завтрак чемпиона");
        byte numberBananas = 5;
        System.out.println(" Количество бананов  " +numberBananas+ " штук");
        byte weightOneBanana = 80;
        System.out.println(" Масса одного банана  " +weightOneBanana+ " гр.");
        double totalWeightBanana = numberBananas*weightOneBanana;
        double totalWeightBananakg = numberBananas*weightOneBanana*0.001;
        System.out.println(" Масса бананов  " +totalWeightBanana+ " гр. " +totalWeightBananakg+ " кг." );
        int amountMilk = 200;
        System.out.println(" Количество молока  " +amountMilk+ " мл.");
        int oneHundredMlMilk = 105;
        System.out.println(" Масса 100 милилитров молока  " +oneHundredMlMilk+ " гр.");
        float totalMilkWeight = amountMilk*oneHundredMlMilk*0.01F;
        float totalMilkWeightkg = amountMilk*oneHundredMlMilk*0.00001F;
        System.out.println(" Масса молока  " +totalMilkWeight+ " гр. " +totalMilkWeightkg+ " кг." );
        int iceСreaSundae = 2;
        System.out.println(" Количество упаковок мороженного  " +iceСreaSundae+ " брикета.");
        int iceСreamWeight = 100;
        System.out.println(" Масса одной упаковки мороженного  " +iceСreamWeight+ " гр.");
        int totaliceСreamWeight = iceСreaSundae*iceСreamWeight;
        float totaliceСreamWeightkg = iceСreaSundae*iceСreamWeight*0.001F;
        System.out.println(" Масса мороженого  " +totaliceСreamWeight+ " гр. " +totaliceСreamWeightkg+ " кг." );
        byte numberEggs = 4;
        System.out.println(" Количество яиц  " +numberEggs+ " штуки");
        byte weightOneEggs = 70;
        System.out.println(" Масса одного яйца  " +weightOneEggs+ " гр.");
        double totalWeightEggs = numberEggs*weightOneEggs;
        double totalWeightEggskg = numberEggs*weightOneEggs*0.001;
        System.out.println(" Масса бананов  " +totalWeightEggs+ " гр. " +totalWeightEggskg+ " кг." );
        double totalBreakfast = totalWeightBanana+totalMilkWeight+totaliceСreamWeight+totalWeightEggs;
        double totalBreakfastkg = (totalWeightBanana+totalMilkWeight+totaliceСreamWeight+totalWeightEggs)*0.001;
        System.out.println(" общая масса завтрака  " +totalBreakfast+ " гр. " +totalBreakfastkg+ " кг." );

    }
    public static void task7() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 7 программа диеты");
        int excessMasskg = 7;
        int excessMass = 7*1000;
        System.out.println(" Исбыток массы спортсмена на  " +excessMasskg+ " кг." +excessMass+ " гр.");
        int dietReductionQuarter = 7000/250;
        System.out.println(" Количество дней при потере массы 250 гр/день  " +dietReductionQuarter+ " дней.");
        int dietReductionalf = 7000/500;
        System.out.println(" Количество дней при потере массы 500 гр/день  " +dietReductionalf+ " дней.");
        int dietAverageReduction = 7000/((500+250)/2);
        System.out.println(" Количество дней при средней вычесленной потере массы 750 гр/день  " +dietAverageReduction+ " дней.");

    }
    public static void task8() {
        System.out.println("___________________________________________________________________");
        System.out.println(" Задача 8 мотивация сотрудников");
        int paymentMarina = 67760;
        int paymentMarinaYear = 67760*11;
        System.out.println(" Оплата Марина в месяц = " +paymentMarina+ " руб/мес. Доход за год " +paymentMarinaYear+ " руб/год." );
        int paymentDenis = 83690;
        int paymentDenisYear = 83690*11;
        System.out.println(" Оплата Дениса в месяц = " +paymentDenis+ " руб/мес. Доход за год " +paymentDenisYear+ " руб/год.");
        int paymentKristina = 76230;
        int paymentKristinaYear = 76230*11;
        System.out.println(" Оплата Кристина в месяц = " +paymentKristina+ " руб/мес. Доход за год " +paymentKristinaYear+ " руб/год." );
        //Indexing employee pay
        float idexVariable= 1.1F;
        float paymentMarinaInd= paymentMarina*idexVariable;
        float paymentMarinaIndYear= paymentMarina*idexVariable*11;
        System.out.println(" Оплата после индексации Марина в месяц = " +paymentMarinaInd+ " руб/мес. Доход за год с учетом индексации " +paymentMarinaIndYear+" руб/год.");
        float paymentDenisInd= paymentDenis*idexVariable;
        float paymentDenisIndYear= paymentDenis*idexVariable*11;
        System.out.println(" Оплата после индексации Дениса в месяц = " +paymentDenisInd+ " руб/мес. Доход за год с учетом индексации " +paymentDenisIndYear+" руб/год.");
        float paymentKristinaInd= paymentKristina*idexVariable;
        float paymentKristinaIndYear= paymentKristina*idexVariable*11;
        System.out.println(" Оплата после индексации Кристина в месяц = " +paymentKristinaInd+ " руб/мес. Доход за год с учетом индексации " +paymentKristinaIndYear+" руб/год.");
        //The difference in annual income before and after indexing
        float diffMarinaMonth=paymentMarinaInd-paymentMarina;
        float diffMarinaYear=paymentMarinaIndYear-paymentMarinaYear;
        System.out.println(" Разница в оплате Марина в месяц = " +diffMarinaMonth+ " руб/мес. Разница в оплате за год " +diffMarinaYear+" руб/год.");
        float diffDenisMonth=paymentDenisInd-paymentDenis;
        float diffDenisYear=paymentDenisIndYear-paymentDenisYear;
        System.out.println(" Разница в оплате Дениса в месяц = " +diffDenisMonth+ " руб/мес. Разница в оплате за год " +diffDenisYear+" руб/год.");
        float diffKristinaMonth=paymentKristinaInd-paymentKristina;
        float diffKristinaYear=paymentKristinaIndYear-paymentKristinaYear;
        System.out.println(" Разница в оплате Кристина в месяц = " +diffKristinaMonth+ " руб/мес. Разница в оплате за год " +diffKristinaYear+" руб/год.");
    }
        }
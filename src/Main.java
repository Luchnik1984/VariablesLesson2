public class Main {
    public static void main(String[] args) {

    // Задача 1. Объявление (инициализация) переменных:
    int i = 1000;
    byte b = 99;
    short s = 2222;
    long l = 999999L;
    float f = 45.45f;
    double d = 3.14159265;
    // Вывод переменных с типом в консоль:
    System.out.println("Значение переменной i с типом int = "+i);
    System.out.println("Значение переменной b с типом bite = "+b);
    System.out.println("Значение переменной s с типом short = "+s);
    System.out.println("Значение переменной l с типом long = "+l);
    System.out.println("Значение переменной f с типом float = "+f);
    System.out.println("Значение переменной d с типом double = "+d);

    // Задача 2. Инициализация переменных под указанные в условии значения:
        f = 27.12f;
        l = 987678965549L;
        d = 2.786;
        s = 569;
        short s2 = -159;
        i = 27897;
        b = 67;
        System.out.println("Задача 2.\n"+ "Инициализация переменных под указанные в условии значения:");
        System.out.println("Значение переменной i с типом int = "+i);
        System.out.println("Значение переменной b с типом bite = "+b);
        System.out.println("Значение переменной s с типом short = "+s);
        System.out.println("Значение переменной s2 с типом short = "+s2);
        System.out.println("Значение переменной l с типом long = "+l);
        System.out.println("Значение переменной f с типом float = "+f);
        System.out.println("Значение переменной d с типом double = "+d);

    //  Задача 3.
        byte studentsLP = 23;
        byte studentsAS = 27;
        byte studentsEA = 30;
        short allSheetsPapers = 480;
        short sheetsForEachStudent = (short) (allSheetsPapers/(studentsLP+studentsAS+studentsEA));
        System.out.println("Задача 3.\n"+ "На каждого ученика рассчитано "+ sheetsForEachStudent+
                " листов бумаги");

    // Задача 4.
        byte bottlesPer2Minutes = 16;
        short bottlesPer20Minutes = (short)(bottlesPer2Minutes*10);
        short bottlesPer1Day = (short)(bottlesPer2Minutes*30*24);
        int bottlesPer3Days = bottlesPer1Day*3;
        int bottlesPer1Month = bottlesPer1Day*30;
        System.out.println("Задача 4.\n"+ "За 20 минут машина произвела "+ bottlesPer20Minutes+ " штук бутылок");
        System.out.println("За сутки машина произвела "+ bottlesPer1Day+ " штук бутылок");
        System.out.println("За три дня машина произвела "+ bottlesPer3Days+ " штук бутылок");
        System.out.println("За месяц машина произвела "+ bottlesPer1Month+ " штук бутылок");

    // Задача 5.
        byte totalCansOfPaints = 120;
        byte cansOfWhitePaintFor_1Class = 2;
        byte cansOfBrownPaintFor_1Class = 4;
        byte totalClassesInSchool = (byte) (totalCansOfPaints/(cansOfWhitePaintFor_1Class + cansOfBrownPaintFor_1Class));
        byte totalCansOfWhitePaint =(byte) (totalCansOfPaints/totalClassesInSchool * cansOfWhitePaintFor_1Class);
        byte totalCansOfBrownPaint =(byte) (totalCansOfPaints/totalClassesInSchool * cansOfBrownPaintFor_1Class);
        System.out.println("Задача 5.\n"+ "В школе, где " + totalClassesInSchool + " классов, нужно "
                + totalCansOfWhitePaint+" банок белой краски и " + totalCansOfBrownPaint + " банок коричневой краски.");

    // Задача 6.
        short weightAllBananas = (short) 5*80;
        short weightAllMilk = (short) 2*105;
        short weightAllIceCream = (short) 2*100;
        short weightAllRawEggs = (short) 4*70;
        short breakfastWeightInGrams = (short) (weightAllBananas+weightAllMilk
                +weightAllIceCream+weightAllRawEggs);
        float breakfastWeightInKilo = ((breakfastWeightInGrams/1000f));
        System.out.println("Задача 6.\n Масса спортзавтрака в граммах = "+ breakfastWeightInGrams +" грамм"
                +"\n Масса спортзавтрака в килограммах = " +breakfastWeightInKilo + " килограмм");

    // Задача 7.
        byte excessWeightInKilo = 7;
        short weightLossPerDay_1 = 250;
        short weightLossPerDay_2 = 500;
        short totalDaysToLoseWeight_1 = (short) (excessWeightInKilo*1000/weightLossPerDay_1);
        short totalDaysToLoseWeight_2 = (short) (excessWeightInKilo*1000/weightLossPerDay_2);
        // намеренно использую short т.к. понимаю что результатом вернётся целое число
        short averageDaysToLoseWeight = (short) ((totalDaysToLoseWeight_1+totalDaysToLoseWeight_2)/2);
        System.out.println("Задача 7.\n Если спортсмен теряет в весе "+ weightLossPerDay_1+
                " грамм в день, то понадобится "+totalDaysToLoseWeight_1+ " дней");
        System.out.println(" Если спортсмен теряет в весе "+ weightLossPerDay_2+
                " грамм в день, то понадобится "+totalDaysToLoseWeight_2+ " дней");
        System.out.println(" В среднем может понадобиться "+averageDaysToLoseWeight+
                " дней, что бы добиться результата похудения");

    // Задача8.
        int baseSalaryPerMonth_M = 67760;
        int baseSalaryPerMonth_D = 83690;
        int baseSalaryPerMonth_K = 76230;
        float salaryGrowthIndex = 1+ 10f/100;
        float indexedSalaryPerMonth = (baseSalaryPerMonth_M*salaryGrowthIndex);
        System.out.println("Задача 8.\n Маша теперь получает "+indexedSalaryPerMonth+ " рублей\n " +
                "Годовой доход вырос на "+((indexedSalaryPerMonth-baseSalaryPerMonth_M)*12)+" рублей");
        indexedSalaryPerMonth = (baseSalaryPerMonth_D*salaryGrowthIndex);
        System.out.println("\n Денис теперь получает "+indexedSalaryPerMonth+ " рублей\n " +
                " Годовой доход вырос на "+((indexedSalaryPerMonth-baseSalaryPerMonth_D)*12)+" рублей");
        indexedSalaryPerMonth = (baseSalaryPerMonth_K*salaryGrowthIndex);
        System.out.println("\n Кристина теперь получает "+indexedSalaryPerMonth+ " рублей\n " +
                " Годовой доход вырос на "+((indexedSalaryPerMonth-baseSalaryPerMonth_K)*12)+" рублей");
                 }
}
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int a = 2_000_000_000;
        byte b = 127;
        short c = 32_000;
        long d = 1_000_000_000_000_000_000L;
        float f = 1.1f;
        double gG = 2.22;
        System.out.println(" Значение переменной a с типом int равно " + a);
        System.out.println(" Значение переменной b с типом byte равно " + b);
        System.out.println(" Значение переменной c с типом short равно " + c);
        System.out.println(" Значение переменной d с типом long равно " + d);
        System.out.println(" Значение переменной f с типом float равно " + f);
        System.out.println(" Значение переменной gG с типом double равно " + gG);

    }

    public static void task2() {
        System.out.println("Задача 2");
        int aInt = 27_896;
        byte bByte = 67;
        short cShort = -159;
        long dLong = 987_678_965_549L;
        float fFloat = 27.12f;
        double gDouble = 2.786;
        short caShort = 569;
        System.out.println("aInt = " + aInt + " bByte = " + bByte + " cShort = " + cShort + " dLong = " + dLong + " fFloat = " + fFloat + " gDouble = " + gDouble + " caShort = " + caShort);
    }

    public static void task3() {
        System.out.println("Задача 3");
        byte lydmilaPavlovna = 23;
        byte annaSergevna = 27;
        byte ekaterinaAndrevna = 30;
        int yceniki = lydmilaPavlovna + annaSergevna + ekaterinaAndrevna;
        int bymaga = 480;
        int listovYceniky = bymaga / yceniki;
        System.out.println("На каждого ученика рассчитано " + listovYceniky + " листов бумаги.");
    }


    public static void task4() {
        System.out.println("Задача 4");
        byte proizvodsvoZaTwo = 16;
        int proizvodsvoZaOne = proizvodsvoZaTwo / 2;
        byte twentyMinet = 20;
        int proizvodsvoZaTwenty = proizvodsvoZaOne * twentyMinet;
        short minetDey = 1_440;
        int proizvodsvoZaDen = proizvodsvoZaOne * minetDey;
        short threeDaysMimet = 1_440 * 3;
        int proizvodsvoThreeDay = proizvodsvoZaOne * threeDaysMimet;
        int oneMonth = 44_640;
        int prinzvodsvoOneMonth = proizvodsvoZaOne * oneMonth;
        System.out.println(" За " + twentyMinet + " мин машина произвела " + proizvodsvoZaTwenty + " штук бутылок.");
        System.out.println(" За " + minetDey + " мин машина произвела " + proizvodsvoZaDen + " штук бутылок.");
        System.out.println(" За " + threeDaysMimet + " мин машина произвела " + proizvodsvoThreeDay + " штук бутылок.");
        System.out.println(" За " + oneMonth + " мин машина произвела " + prinzvodsvoOneMonth + " штук бутылок.");
    }


    public static void task5() {
        System.out.println("Задача 5");
        byte whitePaints = 2;
        byte brownPaints = 4;
        int oneClass = whitePaints + brownPaints;
        byte banocPaints = 120;
        int classov = banocPaints / oneClass;
        int banocWhite = classov * whitePaints;
        int banocBown = classov * brownPaints;
        System.out.println("В школе где " + classov + " классов, нужно " + banocWhite + " банок белой краски и " + banocBown + " банок коричневой краски.");
    }

    public static void task6() {
        System.out.println("Задача 6");
        byte bananaCount = 5;
        byte oneBanana = 80;
        int fiveBanana = oneBanana * bananaCount;
        byte miklCount = 2;
        byte milk = 105;
        int twoHundredMilk = milk * miklCount;
        byte iceCreamCount = 2;
        byte iseCream = 100;
        int twoIceCram = iseCream * iceCreamCount;
        byte eggCount = 4;
        byte egg = 70;
        int fourEgg = egg * eggCount;
        int grammZavtrak = fiveBanana + twoHundredMilk + twoIceCram + fourEgg;
        double grPerKg = 1000;
        double kgZavtrak = grammZavtrak / grPerKg;
        System.out.println("Из " + grammZavtrak + " грамм, состоит завтрак, а в киллограмах это " + kgZavtrak + " кг.");
    }

    public static void task7() {
        System.out.println("Задача 7");
        byte needToResetKg = 7;
        int needToResetGr = needToResetKg * 1000;
        short deyLowRest = 250;
        double nedDeyLowRest = (double) needToResetGr / deyLowRest;
        short deyHighRest = 500;
        double nedDeyHighRest =(double) needToResetGr / deyHighRest;
        double deyAverageRest = (deyHighRest + deyLowRest) / 2d;
        double nedDeyAverageRest = needToResetGr / deyAverageRest;
        System.out.println("Если спортсмен будет в день терять " + deyLowRest + " грамм, то ему потребуеца " + nedDeyLowRest + " дней чтобы похудеть.");
        System.out.println("Если спортсмен будет в день терять " + deyHighRest + " грамм, то ему потребуеца " + nedDeyHighRest + " дней чтобы похудеть.");
        System.out.println("Если спортсмен будет в день терять " + deyAverageRest + " грамм, то ему потребуеца " + nedDeyAverageRest + " дней чтобы похудеть.");

    }

    public static void task8() {
        System.out.println("Задача 8");
        int masha = 67_760;
        int denis = 83_690;
        int kristina = 76_230;
        byte earMonth = 12;
        int earMasha = masha * earMonth;
        int raisedSalaryMasha = masha / 10 + masha;
        int earRaisedMasha = raisedSalaryMasha * earMonth;
        int differenceSallaryEarMasha = earRaisedMasha - earMasha;
        int earDenis = denis * earMonth;
        int raisedSalaryDenis = denis / 10 + denis;
        int earRaisedDenis = raisedSalaryDenis * earMonth;
        int differenceSallaryEarDenis = earRaisedDenis - earDenis;
        int earKristina = kristina * earMonth;
        int raisedSalaryKristina = kristina / 10 + denis;
        int earRaisedKristina = raisedSalaryKristina * earMonth;
        int differenceSallaryEarKristina = earRaisedKristina - earKristina;
        System.out.println("Маша получала " + masha + " рублей. Годовой доход был " + earMasha + " рублей.");
        System.out.println("Маша теперь получает " + raisedSalaryMasha + " рублей. Годовой доход вырос на " + differenceSallaryEarMasha + " рубля.");
        System.out.println("Денис получал " + denis + " рублей. Годовой доход был " + earDenis + " рублей.");
        System.out.println("Денис теперь получает " + raisedSalaryDenis + " рублей. Годовой доход вырос на " + differenceSallaryEarDenis + " рубля.");
        System.out.println("Кристина получала " + kristina + " рублей. Годовой доход был " + earKristina + " рублей.");
        System.out.println("Кристина теперь получает " + raisedSalaryKristina + " рублей. Годовой доход вырос на " + differenceSallaryEarKristina + " рубля.");
    }
}
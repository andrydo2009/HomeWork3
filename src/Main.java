public class Main {
    public static void main(String[] args)
    {System.out.println("Hello world!");
        System.out.println(" ");
        System.out.println("Mission 1");
        byte screw = 15;
        System.out.println("Винтов в коробке " + screw + " штук");
        int student = 1000;
        System.out.println("Студентов в аудитории " + student + " человек");
        short house = 103;
        System.out.println("Площадь дома " + house + " кв. метра");
        long lightSpeed= 299792458L;
        System.out.println("Скорость света " + lightSpeed + " м/с");
        double car = 3.5;
        System.out.println("Длинна машины " + car + " метра");
        float yacht = 45.3F;
        System.out.println("Длинна яхты " + yacht + " метра");


        System.out.println(" ");
        System.out.println("Mission 2");
        double a = 27.12;
        System.out.println(a);
        long b = 987678965549L;
        System.out.println(b);
        byte c = 2;
        System.out.println(c);
        int d = 786;
        System.out.println(d);
        short e = 569;
        System.out.println(e);
        short f = -159;
        System.out.println(f);
        long g = 27897L;
        System.out.println(g);
        float h = 67F;
        System.out.println(h);
        boolean k = car > yacht;
        System.out.println(k);
        boolean m = car < yacht;
        System.out.println(m);

        System.out.println(" ");
        System.out.println("Mission 3");
        short class1 = 23;
        System.out.println("У Людмилы Павловны  " + class1 + " ученика");
        short class2 = 27;
        System.out.println("У Анны Сергеевны " + class2 + " учеников");
        short class3 = 30;
        System.out.println("У Екатерины Андреевны " + class3 + " учеников");
        short papperBox = 480;
        System.out.println("Куплено " + papperBox + " листов бумаги для всех учеников");
        int allSchol = class1 + class2 + class3;
        System.out.println("Всего учеников " + allSchol);
        int distribution = papperBox / allSchol;
        System.out.println("На кажого ученика в школе приходится по " + distribution + " листов бумаги");

        System.out.println(" ");
        System.out.println("Mission 4");
        int bottle = 16;
        int botlleMachineTime = 2;
        System.out.println("Производительность машины для изготовления бутылок - " + bottle + " бутылок за " + botlleMachineTime + " минуты");
        int botlle1 = bottle / botlleMachineTime;
        int bottle20 =  botlle1 * 20;
        System.out.println("За 20 минут работы машина произвела " + bottle20 + " штук бутылок");
        int bottle1440 = botlle1 * 1440;
        System.out.println("За сутки работы машина произвела " + bottle1440 + " штук бутылок");
        int botlle4320 = botlle1 * 4320;
        System.out.println("За 3 суток работы машина произвела " + botlle4320 + " штук бутылок");
        int bottle44640 = botlle1 * 44640;
        System.out.println("За месяц работы машина произвела " + bottle44640 + " штук бутылок");

        System.out.println(" ");
        System.out.println("Mission 5");
        short  allContainerPaint = 120;
        System.out.println("Всего для ремонта школы необходимо " + allContainerPaint + " банок краски");
        short whiteContainerPaint = 2;
        short brownContainerPaint = 4;
        int oneClassContainerPaint = whiteContainerPaint + brownContainerPaint;
        System.out.println("На каждый класс всего уходит по " + whiteContainerPaint + " банки белой краски и по " + brownContainerPaint + " банки коричневой краски");
        int allClass = allContainerPaint / oneClassContainerPaint;
        System.out.println("Всего классов в школе " + allClass );
        int oneClassContainerWgitePaint = allClass * whiteContainerPaint;
        int oneClassContainerBrowPaint = allClass * brownContainerPaint;
        System.out.println("В школе, где " + allClass + " классов, нужно " + oneClassContainerWgitePaint + " банок белой краски и " + oneClassContainerBrowPaint + " банок коричневой краски");

        System.out.println(" ");
        System.out.println("Mission 6");
        System.out.println("Рецепт спорсмена перед тренировкой: ");
        byte bananasAll = 5;
        short oneBananas = 80;
        System.out.println("Бананы " + bananasAll + " штук (1 банан - " + oneBananas + " грамм)" );
        short weightMilkToo = 200;
        short milkAll = 2;
        short oneMilk = 105;
        System.out.println("Молоко " + weightMilkToo + " грамм (100 мл = " + oneMilk + " грамм)" );
        byte iceCream = 2;
        short oneIceCream = 100;
        System.out.println("Мороженое " + iceCream + " брикета (1 брикет - " + oneIceCream + " грамм)" );
        byte egg = 4;
        short oneEgg = 70;
        System.out.println("Яйца " + egg + " штуки (1 яйцо - " + oneEgg + " грамм)" );
        int weightBananas = bananasAll * oneBananas;
        System.out.println("Общий вес бананов в таком котктеле = " + weightBananas + " грамм");
        int weightMilk = milkAll * oneMilk;
        System.out.println("Общий вес молока в таком котктеле = " + weightMilk + " грамм");
        int weightIceCream = iceCream * oneIceCream;
        System.out.println("Общий вес мороженного в таком котктеле = " + weightIceCream + " грамм");
        int weightEgg = egg * oneEgg;
        System.out.println("Общий вес яиц в таком котктеле = " + weightEgg + " грамм");
        float cocktail = weightBananas + weightMilk + weightIceCream + weightEgg;
        float cocktailWeight = cocktail / 1000;
        System.out.println("Общий вес всех продуктов в таком котктеле = " + cocktail + " грамм или " + cocktailWeight + " килограмм");


        System.out.println(" ");
        System.out.println("Mission 7");
        byte weightMan = 7;
        int weightManGramm = weightMan * 1000;
        System.out.println("Спортсмену нужно сбросить - " + weightMan + " кг");
        short weightOne = 250;
        short weightToo = 500;
        int weightOneGramm = weightManGramm / weightOne;
        System.out.println("Eсли спортсмен будет терять каждый день по 250 грамм, то он похудеет на 7 кг за " + weightOneGramm + " дней");
        int weightTooGramm = weightManGramm / weightToo;
        System.out.println("Eсли спортсмен будет терять каждый день по 500 грамм, то он похудеет на 7 кг за " + weightTooGramm + " дней");
        int allDayGramm = weightOne + weightToo;
        int averageDayGramm = allDayGramm / 2;
        System.out.println("В среднем спортсмен теряет в день " + averageDayGramm + " грамм в день");
        int averageDay = weightManGramm / averageDayGramm;
        System.out.println("Eсли в среднем спортсмен теряет в день 375 грамм, то он похудеет на 7 кг в среднем за " + averageDay + " дней");

        System.out.println(" ");
        System.out.println("Mission 8");
        int oldMaria = 67760;
        int oldDenis = 83690;
        int oldCristina = 76230;
        int oldYearM = oldMaria * 12;
        int oldYearD = oldDenis * 12;
        int oldYearC = oldCristina * 12;

        int newMaria = (int) (oldMaria * 0.1);
        int newDenis = (int) (oldDenis * 0.1);
        int newCristina = (int) (oldCristina * 0.1);
        int endMaria = newMaria + oldMaria;
        int endDenis = newDenis + oldDenis;
        int endCristina = newCristina + oldCristina;
        int newYearM = endMaria * 12;
        int newYearD = endDenis * 12;
        int newYearC = endCristina * 12;
        int averageM = newYearM - oldYearM;
        int averageD = newYearD - oldYearD;
        int averageC = newYearC - oldYearC;
        System.out.println(" - Маша получает в месяц " + oldMaria + " рублей. Годовой доход " + oldYearM + " рублей." );
        System.out.println(" - Денис получает в месяц  " + oldDenis + " рублей. Годовой доход " + oldYearD + " рублей." );
        System.out.println(" - Кристина получает в месяц " + oldCristina + " рублей. Годовой доход " + oldYearC + " рублей." );
        System.out.println("Если каждому увеличить зарплату на 10% от текущей месячной то теперь : ");
        System.out.println(" - Маша теперь получает в месяц " + endMaria + " рублей. Годовой доход " + newYearM + " рубля и вырос на " + averageM + " рублей.");
        System.out.println(" - Денис теперь получает в месяц  " + endDenis + " рублей. Годовой доход " + newYearD + " рублей и вырос на " + averageD + " рубля.");
        System.out.println(" - Кристина теперь получает в месяц " + endCristina + " рубля. Годовой доход " + newYearC + " рублей и вырос на " + averageC + " рублей.");





    }
}
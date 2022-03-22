public class TestShop {

    public static void main(String args[]) {

        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) ПРОИЗВОДИТЕЛИ
        Manufacturer bmw = new Manufacturer("BWM",
                "Germany", "Bavaria", "665544", "876666");

        Manufacturer audi = new Manufacturer("Audi", "Germany", "Berlin", "123123", "980765");



        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) АВТОМОБИЛИ
        Car bmw316i = new Car("BMW", "316i", 1994);
        Car ladaSamara = new Car("Lada", "Samara", 1987);
        Car mazdaMX5 = new Car("Mazda", "MX5", 2008);
        Car mercedesC500 = new Car("Mercedes", "C500", 1993);
        Car trabant = new Car("trabant", "600", 1962);
        Car opelAstra = new Car("Opel", "Astra", 1991);


        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) ЕВТИНА РЕЗЕРВНА ЧАСТ
        Part cheapPart = new Part("Tires 165/50/13", 302.36,
                345.58, audi, "T332", PartCategory.TIRES);

        // ДОБАВЯМЕ ИНФОРМАЦИЯ ЗА КОИ КОЛИ Е ПРИЛОЖИМА
        cheapPart.аddSupportedCar(ladaSamara);
        cheapPart. Добавете още 2 автомобила...



        // ДЕФИНИРАМЕ (СЪЗДАВАМЕ) СКЪПА РЕЗЕРВНА ЧАСТ
        Part expensivePart = new Part("BMW Engine Oil",
                633.17, 670.0, bmw, "Oil431", PartCategory.ENGINE);

        // ДОБАВЯМЕ ИНФОРМАЦИЯ ЗА КОИ КОЛИ Е ПРИЛОЖИМА
        expensivePart.аddSupportedCar(bmw316i);
        expensivePart. Добавете още 4 автомобила...


// // // // // // // // // // // // // // // // // // // // //

        // СЪЗДАВАМЕ НОВ МАГАЗИН
        Shop newShop = new Shop(" (Име по ваш избор) ");


        // ДОБАВЯМЕ ЧАСТИ В МАГАЗИНА
        newShop.addPart(cheapPart);// ЕВТИНА СКЪПА ЧАСТ
        newShop. Добавете скъпа /expensivePart/ част


        // РАЗПЕЧАТВАМЕ ИНФОРМАЦИЯ ЗА МАГАЗИНА
        System.out.println(името на обекта);

    }

} // END

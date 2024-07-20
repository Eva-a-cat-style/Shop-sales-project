package app;




public class Main {

    static int quantity;
    static double cost;
    static double totalCost;
    static double dayCount;
    private final static String CURRENCY = "UAH";
    static double price;
    static double daySales;
    public static void main(String[] args) {
        //в тз была указана 1 продажа в день, я решила сделать счётчик продаж, потому что если мы
        // укажем 1 продажу в день, тогда в этой переменной теряется смысл, ведь кол-во дней
        // = кол-ву продаж. Я решила сделать немного интереснее...

        quantity = 1;
        price = 2499.99;
        daySales = 4;
        cost = quantity + price;
        dayCount = quantity + price * daySales;
        totalCost = dayCount * 5;


        System.out.printf("Product No 1: Smartphone"  +
                "\nTotal sales for 5 days is %s %.2f" ,  CURRENCY ,
                totalCost);
        System.out.printf ("\nSales by day is %s %.2f", CURRENCY
                , dayCount);

//Тут не игралась с переменными, оставила всё, как в тз.
        //Единственное, отличается конечный total sales for 7 days
        // в тз 10486,85, а уменя 10486,84. Пока ещё думаю почему.

        price = 1498.12;
        dayCount = price;
        totalCost = dayCount * 7;
        System.out.printf("%n Product No 2: Laptop"  +
                        "\nTotal sales for 7 days is %s %.2f" ,  CURRENCY ,
                totalCost);
        System.out.printf ("\nSales by day is %s %.2f", CURRENCY
                , dayCount);



//Сделала вот ещё такой вариант со сканером, чтобы включить элементы интерактива
       // String CURR_UAH = "UAH";
        // Scanner scanner = new Scanner(System.in);
        //System.out.print("Product No 2:Laptop"+"\nInput total cost " +
          //      "of items," + CURR_UAH + ": ");
        //double totalCost = scanner.nextDouble();

        //System.out.print("Input quota of items, pcs.: ");
        //double quota = scanner.nextInt();

        //double avgCost = totalCost / quota;
        //System.out.printf("Average cost per item " +
          //      "is %s %.2f", CURR_UAH, avgCost);

    //    scanner.close();

    }
}

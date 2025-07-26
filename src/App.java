public class App {
    public static void main(String[] args) {
        System.out.println( "Market" );

        Product p1 = new Product( "Хлеб" , 100 );
        Person  a1 = new Person( "Иванов" , 1000 );
        Person  a2 = new Person( "Петров" , 2000 );

    }
}

class Product {
    private String name;
    private int price;

    // Конструктор по умолчанию
    public Product() {
        this.name = "Noname";
        this.price = 0;
    }

    // Конструктор только с именем
    public Product( String name , int price ) {
        this.name = name;
        this.price = price;
    }

    /* Геттеры и сеттеры для свойств */

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }
}

class Person {
    private String name;
    private int wallet;
    private Product[] products;

    // Конструктор по умолчанию
    public Person() {
        this.name = "Noname";
        this.wallet = 0;
    }

    // Конструктор только с именем
    public Person( String name , int wallet ) {
        this.name = name;
        this.wallet = wallet;
    }

    /* Геттеры и сеттеры для свойств */

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet( int wallet ) {
        this.wallet = wallet;
    }
}
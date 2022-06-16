package RealLifeProjectWithPolymorphism;

public class Main {

    public static void main(String[] args) {
        // referans tiplerinin birbirini tutması sonucu olan durumdur(aralarında inheritance varsa birbirlerini tutabilir)
        CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
        customerManager.add();
    }
}

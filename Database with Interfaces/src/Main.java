public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new OracleCustomerDal());  // bu kaliteli olan kod
       //ilk olarak eski yapı
        // customerManager.customerDal = new OracleCustomerDal();
        //customerManager.customerDal = new MySqlCustomerDal();

        customerManager.add();
    }
}

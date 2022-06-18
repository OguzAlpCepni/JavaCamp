public class CustomerManager {

        //iş kodları bu bölümde yaz
    private ICustomerDal customerDal;       //  Bu yöntemle yapılabilir ama daha güzel bir yöntem var

    public CustomerManager(ICustomerDal customerDal){
        this.customerDal=customerDal;
    }

    public void add(){
        customerDal.add();

    }

}

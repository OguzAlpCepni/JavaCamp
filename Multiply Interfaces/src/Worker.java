public class Worker implements IWorkable ,IEatable,IPayable{
    @Override
    public void work(){
        System.out.println("çalışıyor");
    }  // bizim çalışanımız

    @Override
    public void Pay() {
        System.out.println("kendi iscimize para 500 öde");
    }

    @Override
    public void eat() {
        System.out.println("yemek çıkartılacak");
    }
}

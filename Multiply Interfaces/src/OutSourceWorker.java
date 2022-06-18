public class OutSourceWorker implements IWorkable,IPayable{
    @Override
    public void work() {
        System.out.println("çalisiyor");
    }

    @Override
    public void Pay() {
        System.out.println("para verilecek");
    }
}

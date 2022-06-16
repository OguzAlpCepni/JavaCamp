package RealLifeProjectWithPolymorphism;

public class  CustomerManager {

    BaseLogger logger;

    CustomerManager(BaseLogger logger){
        this.logger=logger;
    }
    public void add(){
        System.out.println("musteri eklendi");
        logger.log("Log mesaji");
    }
}

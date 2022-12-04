package abstraction.abstractClass;

public abstract class BangladeshBank {
    abstract double getdollerRate();//This is a abstract method
    public static boolean printBankName(){
        System.out.println("This will be call from Bangladesh bank");
        return false;
    }
}

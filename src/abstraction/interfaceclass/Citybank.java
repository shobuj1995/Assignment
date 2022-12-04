package abstraction.interfaceclass;

public class Citybank implements Bank3 {
    @Override
    public float rateOfInterest() {
        return 8.00F;
    }

}
class PrintInterestRate{
    public static void main(String[] args) {
        Citybank object = new Citybank();
        System.out.println(object.rateOfInterest());

    }
}

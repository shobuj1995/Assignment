package abstraction.abstractClass;

public class DollerRareCheck {
    public static void main(String[] args) {
        BrackBank object = new BrackBank();
        System.out.println(object.getdollerRate());

        CityBank cityObject =new CityBank();
        System.out.println(cityObject.getdollerRate());
        System.out.println(BrackBank.printBankName());

    }
}

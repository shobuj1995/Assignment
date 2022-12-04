package abstraction.abstractClass;

public class BrackBank extends BangladeshBank {
    @Override
    double getdollerRate() {   //getdollerRate abstract method overriden from BangladeshBank class.
        return 112;
    }
}

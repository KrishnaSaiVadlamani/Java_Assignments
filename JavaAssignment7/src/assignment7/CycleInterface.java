package assignment7;

public class CycleInterface {

}
interface ICycle {
    void description();
}

class UniCycle implements ICycle {
    public void description() {
        System.out.println("This is an instance of UniCycle");
    }
}

class BiCycle implements ICycle {
    public void description() {
        System.out.println("This is an instance of BiCycle");
    }
}

class TriCycle implements ICycle {
    public void description() {
        System.out.println("This is an instance of TriCycle");
    }
}



abstract class FClass {
    public abstract ICycle getCycle(String cycleType);
}

class FCycle extends FClass {

    @Override
    public ICycle getCycle(String cycleType) {
        if(cycleType.equalsIgnoreCase("unicycle")) {
            return new UniCycle();
        }
        if(cycleType.equalsIgnoreCase("bicycle")) {
            return new BiCycle();
        }
        if(cycleType.equalsIgnoreCase("tricycle")) {
            return new TriCycle();
        }
        return null;
    }


    public static void main(String[] args) {

        FClass cycleFactory = new FCycle();

        ICycle uniCycle = cycleFactory.getCycle("unicycle");
        uniCycle.description();

        ICycle biCycle = cycleFactory.getCycle("bicycle");
        biCycle.description();

        ICycle triCycle = cycleFactory.getCycle("tricycle");
        triCycle.description();
    }

}

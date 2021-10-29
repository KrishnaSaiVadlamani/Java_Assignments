package Krishna.Assignment5.main;

import Krishna.Assignment5.singleton.Singleton;
import Krishna.Assignment5.data.Data;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printinstance();
        data.localMembersprint();

        Singleton singleton=new Singleton("Hi Krishna");
        singleton.print();

        /*Singleton singleton = Singleton.Initialize("Hi");
        singleton.print();*/
    }
}

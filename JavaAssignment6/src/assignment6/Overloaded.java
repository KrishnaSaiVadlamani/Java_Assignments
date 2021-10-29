package assignment6;

public class Overloaded {
    Overloaded(){
        this(2);

    }
    Overloaded(int variable){
        System.out.println(variable+" parameterized constructor called");
    }
}

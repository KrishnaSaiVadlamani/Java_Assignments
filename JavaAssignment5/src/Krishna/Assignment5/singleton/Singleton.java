package Krishna.Assignment5.singleton;

public class Singleton {
    String string;
    public Singleton(String string1){
        this.string=string1;
    }

    public static Singleton Initialize(String string){
        Singleton singleton=new Singleton(string);
        return singleton;
    }

    public void print(){
     System.out.println(string);
    }

}

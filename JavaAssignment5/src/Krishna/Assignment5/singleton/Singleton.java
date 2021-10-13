package Krishna.Assignment5.singleton;

public class Singleton {
    String str;
    private Singleton(String str1){
        this.str=str1;
    }

    public static Singleton Initialize(String s){
        Singleton singleton=new Singleton(s);
        return singleton;
    }

    public void print(){
     System.out.println(str);
    }

}

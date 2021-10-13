package assignment7;

public class InnerClass {
    public static void main (String[] args) {
        OuterClassTwo.InnerClassTwo x=new OuterClassTwo().new InnerClassTwo("Hi! Krishna");
    }
}
class OuterClassOne{
    OuterClassOne(){
        System.out.println("OuterClassOne constructor");
    }
    class InnerClassOne{
        InnerClassOne(String testString)
        {
            System.out.println("InnerClassOne non default constructor printing testString = "+testString);
        }
    }
}
class OuterClassTwo{
    OuterClassTwo(){
        System.out.println("OuterClassTwo constructor");
    }

    class InnerClassTwo extends OuterClassOne.InnerClassOne{
        InnerClassTwo(String testString)
        {
            new OuterClassOne().super(testString);
            System.out.println("InnerClassTwo non default constructor");
        }
    }
}

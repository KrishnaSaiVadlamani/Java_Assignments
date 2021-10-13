class Exception1 extends Exception{
    Exception1(String message){
        super(message);
    }
}
class Exception2 extends Exception{
    Exception2(String message){
        super(message);
    }
}
class Exception3 extends Exception{
    Exception3(String message){
        super(message);
    }
}
public class Assignment8 {
    public void checkmethod() throws Exception{
//        throw new Exception1("exception1");
//        throw new Exception2("exception2"); //unreachable statement
//        throw new Exception3("exception3"); //unreachable statement
        throw new NullPointerException();
    }
    public static void main(String args[]){
        Assignment8 assignment=new Assignment8();
        try{
            assignment.checkmethod();
        }catch(Exception e){
            System.out.println("Catch block executed");
        }finally {
            System.out.println("finally executed");
        }
    }

}

package pg.p2;
import pg.p1.*;
public class B extends A{
     public static void main(String[] args){
        System.out.println("Class B in package pg.p2");
        A o1 = new A();
        o1.m1();
     }
}

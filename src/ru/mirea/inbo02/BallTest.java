package ru.mirea.inbo02;
import java.lang.*;

public class BallTest {
    public static void main(String[ ] arqs){

        Ball b1 = new Ball("BestBallEver","blue",4);
        Ball b2 = new Ball("KillerFoot");
        Ball b3 = new Ball("BestBallEver","blue");
        Ball b4 = new Ball();

        System.out.println(b1.getSize());
        System.out.println(b2.getModel());
        System.out.println(b3.getColor());

        b1.getAll();
    }
}

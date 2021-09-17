import java.util.*;
import java.lang.*;

class  GravityCalc {
    public static void main(String[] args){
    double gravity = -9.81;
    double initialVelocity = 0.0;
    double fallingTime = 10.0;
    double initaialPosition = 0.0;
    double finalPosition = 0.0;
    finalPosition = 0.5 * gravity * (fallingTime*fallingTime) + initialVelocity + initaialPosition;
    System.out.println("the object's Position After " + fallingTime + " seconds is: " + finalPosition + "m");
    }
}

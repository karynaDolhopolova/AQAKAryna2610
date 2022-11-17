package homeWork3;

import javax.swing.*;
import java.util.Random;

public class ClassLesson3 {
    public static void main(String[] args) {
        int[] mass = new int[]{-2, 4, 48, 100, 5, -25, 70, 58, 67, -36, -18, 90, 105, 15, -3, 20, 69, 40, 33, -10};

        for(int i : mass) {
            if (i > 0&&i%2==0) {
                System.out.println(i);
            }
        }

        int sum=0;
        for(int b:mass){
            if(b>5&&b<45) {
            sum+=b;
            }
        }
        System.out.println("Sum of all positive numbers from 5 to 45: "+sum);
    }
}


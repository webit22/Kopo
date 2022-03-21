package kr.ac.kopo.day0321;
import java.util.Random;

public class AreaMain {
    public static void main(String[] args) {
        System.out.println("<< 면적 구하기 >>");
        System.out.print("[ 1-정사각형, 2-직사각형, 3-삼각형, 4-원 ]");

        AreaCalc ac = new AreaCalc();

        Random rand = new Random();
        int shapeNum = rand.nextInt(4) + 1; // 1 ~ 4

        int len = rand.nextInt(10) + 1;
        int height = rand.nextInt(10) + 1;
        int width = rand.nextInt(10) + 1;

        switch (shapeNum){
            case 1 :
                System.out.println("\n정사각형의 면적은 " + ac.square(len) + "입니다.");
                break;
            case 2 :
                System.out.println("\n직사각형의 면적은 " + ac.rectangle(height, width) + "입니다.");
                break;
            case 3 :
                System.out.println("\n삼각형의 면적은 " + ac.triangle(height, width) + "입니다.");
                break;
            case 4 :
                System.out.println("\n원의 면적은 " + ac.circle(len) + "입니다.");
                break;
        }
    }
}

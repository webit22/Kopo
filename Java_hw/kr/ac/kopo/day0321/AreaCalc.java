package kr.ac.kopo.day0321;

public class AreaCalc {
    final double PI = 3.14;
    int h; // height
    int w; // width
    int r; // radius

    AreaCalc(){
        this(0, 0, 0);
    }

    AreaCalc(int h){
        this(0, 0, 0);
    }

    AreaCalc(int h, int w){
        this(0, 0, 0);
    }

    AreaCalc(int h, int w, int r){
        this.h = h;
        this.w = w;
        this.r = r;
    }

    int areaCal(int num1, int num2){
        return num1 * num2;
    }

    int square(int h){
        return areaCal(h, h);
    }

    int rectangle(int h, int w){
        return areaCal(h, w);
    }

    int triangle(int h, int w){
        int area = areaCal(h, w);
        return area / 2;
    }

    int circle(int r){
        int area = (int)(PI * r * r);
        return area;
    }
}
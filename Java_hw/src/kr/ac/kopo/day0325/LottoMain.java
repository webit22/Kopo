package kr.ac.kopo.day11;

import java.util.Scanner;

public class LottoMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("게임 수를 입력하세요 : ");

        LottoUtil lu = new LottoUtil();
        lu.start(Integer.parseInt(sc.nextLine()));
    }
}
package kr.ac.kopo.day0318;
import java.util.Scanner;

public class IceCreamMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("구입할 아이스크림 개수를 입력하세요 : ");
        int num = sc.nextInt();
        IceCream[] res = icInfo(num);

        System.out.println("\n< 총 " + num + "개의 아이스크림 구매정보 출력 >");
        System.out.println("번호" + "\t" + "이름" + "\t" + "가격");

        int sum = 0;
        for (int i = 0; i < num; i++) {
            System.out.println((i + 1) + "\t" + res[i].name + "\t" + res[i].price);
            sum += res[i].price;
        }
        System.out.println("\n총 판매액 : " + sum);
    }

    static IceCream[] icInfo(int cnt){
        Scanner sc = new Scanner(System.in);
        IceCream[] ic = new IceCream[cnt];

        for(int i = 0; i < cnt; i++){
            ic[i] = new IceCream();
            System.out.println("\n*** " + (i + 1) + "번째로 구입할 아이스크림 ***");
            System.out.print("아이스크림 이름 : ");
            ic[i].name = sc.next();
            System.out.print("아이스크림 가격 : ");
            ic[i].price = sc.nextInt();
        }
        return ic;
    }
}

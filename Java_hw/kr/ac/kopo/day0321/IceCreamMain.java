package kr.ac.kopo.day0321;
import java.util.Scanner;

public class IceCreamMain {

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0, cntNum = 0;
        String str = "y";

        while(str.equals("y") || str.equals("Y")){
            System.out.print("구입할 아이스크림 개수를 입력하세요 : ");
            int num = Integer.parseInt(sc.nextLine());
            cntNum += num;
            IceCream[] res = icInfo(num);

            System.out.println("\n< 총 " + num + "개의 아이스크림 구매정보 출력 >");
            System.out.println("번호" + "\t" + "이름" + "\t" + "가격");

            for (int i = 0; i < num; i++) {
                System.out.println((i + 1) + "\t" + res[i].name + "\t" + res[i].price);
                sum += res[i].price;
            }

            System.out.print("계속 주문하시겠습니까? (yes : Y/y, no : N/n) => ");
            str = sc.nextLine();
            if(str.equals("n") || str.equals("N"))
                break;
        }

        System.out.println("\n총 판매 개수 : " + cntNum + "개");
        System.out.println("총 판매액 : " + sum + "원");
    }
}
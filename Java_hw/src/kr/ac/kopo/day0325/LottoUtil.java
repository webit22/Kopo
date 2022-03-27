package kr.ac.kopo.day11;

import java.util.*;
import java.util.Map.Entry;

public class LottoUtil {

    Map<Integer, Integer> map = new HashMap();
    Scanner sc = new Scanner(System.in);
    private int cnt;
    private int round = 6;

    LottoUtil(){}

    public void start(int cnt) {
        System.out.print("어떤 방법으로 할지 고르세요 (1~6) : ");
        int choice = Integer.parseInt(sc.nextLine());
        int[] retArr;

        switch (choice) {
            case 1:
                for (int i = 0; i < cnt; i++) {
                    retArr = generate01();
                    System.out.println("게임" + (i + 1) + " : " + Arrays.toString(retArr));
                }
                break;
            case 2:
                for (int i = 0; i < cnt; i++) {
                    retArr = generate02();
                    System.out.println("게임" + (i + 1) + " : " + Arrays.toString(retArr));
                }
                break;
            case 3:
                for (int i = 0; i < cnt; i++)
                    generate03();
                break;
            case 4:
                for (int i = 0; i < cnt; i++)
                    generate04();
                break;
            case 5:
                for (int i = 0; i < cnt; i++)
                    generate05();
                break;
            case 6:
                for (int i = 0; i < cnt; i++)
                    generate06();
                break;
        }

    }

    //    1 ~ 45 사이의 로또번호 6개 추출
    //    Random class
    private int[] generate01() {
        Random r = new Random();
        r.setSeed(System.currentTimeMillis());

        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = r.nextInt(45) + 1;
        }
        return arr;
    }

    //    Math.random
    private int[] generate02() {
        int[] arr = new int[6];
        for (int i = 0; i < 6; i++) {
            arr[i] = (int) (Math.random() * 45 + 1);
        }
        return arr;
    }

    //    HashMap
    private void generate03() {
        int count = 0;
        while (count < 6) {
            Integer num = (int) (Math.random() * 45 + 1);
            if (!map.containsValue(num)) {
                map.put(count, num);
                count++;
            }
        }
        for (Entry<Integer, Integer> data : map.entrySet()) {
            System.out.print(data.getValue() + " ");
        }
        System.out.println();
    }

    //  Set
    private void generate04() {
        Set<Integer> set = new HashSet<>();
        int count = 0;
        Integer num;
        while (count < 6) {
            num = (int) (Math.random() * 45 + 1);
            if (!set.contains(num)) {
                set.add(num);
                count++;
            }
        }
        for (Integer data : set) {
            System.out.print(data + " ");
        }
        System.out.println();
    }

    //    ArrayList
    private void generate05() {
        List<Integer> list = new ArrayList<>();
        Integer num;

        for(int i = 0; i < 6; i++){
            num = (int) (Math.random() * 45 + 1);
            list.add(num);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

    //    LinkedList
    private void generate06() {
        List<Integer> list = new LinkedList<>();
        int num;

        for(int i = 0; i < 6; i++){
            num = (int) (Math.random() * 45 + 1);
            list.add(num);
        }

        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
    }

}
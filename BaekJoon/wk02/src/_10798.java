import java.util.Scanner;

public class _10798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] strArr = new String[5];

        for (int row = 0; row < 5; row++) {

            strArr[row] = sc.next();
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < 5; j++) {
            char res;
            for (int i = 0; i < 5; i++) {
                res = strArr[i][j];
                if (res != ' ')
                    sb.append(res);
                else
                    continue;
            }
        }

        System.out.println(sb);

    }
}

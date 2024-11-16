package phone_random;

import java.util.*;
public class P_number {
    public static void main(String[]arags) {
        String [] number_F = {"133","185","155","178"};
        String [] number_L = {"2606","1201","3107",};
        Scanner sc = new Scanner(System.in);
        int First = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        int Last = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        int ordar = sc2.nextInt();
        System.out.println(number_F[First]);

        System.out.println(number_L[Last]);
        System.out.println(ordar);

        Random random = new Random();
        for (int start =0;start<=ordar;start++){
            int middle_number = random.nextInt(9000) + 1000;
            // 打印由 number_F、middle_number 和 number_L 组成的拼接字符串
System.out.println(number_F[First]+middle_number+number_L[Last]);


        }
    }
}


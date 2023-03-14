package TongSoChan;

import java.util.Scanner;

public class TongSoChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số nguyên dương n: ");
        int n = sc.nextInt();
        int sum = 0;

        if (n < 0) {
            System.out.println("Vui lòng nhập lại");
        } else {
            for (int i = 0; i <= n; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println("Tổng các số chẵn : "+ sum);
        }

    }
}

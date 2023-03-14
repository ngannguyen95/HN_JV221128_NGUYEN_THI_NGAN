package Mang;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[50];
        Random random = new Random();


        // in mảng
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;

        }
        System.out.println(Arrays.toString(arr));

        // tìm min,max

        int max = 0;
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(" Gía trị lớn nhất: " + max);
        System.out.println(" Gía trị nhỏ nhất: " + min);

        // sắp xếp mảng tăng dần
        Arrays.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:" + "\n" + Arrays.toString(arr));

        // đếm số nguyên tố
        int count = 0;
        boolean check = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 2; j < arr[i]; j++) {

                if (arr[i] < 2) {
                    check = false;
                    break;
                } else
                    if (arr[i]==2){
                        check=true;
                    }else  if (arr[i] % j == 0) {
                        check = false;
                        break;
                    } else
                        check = true;
                }
            if (check) {
                count++;
            }

            } System.out.println("Tổng số nguyên tố  " + count);
        }
    }

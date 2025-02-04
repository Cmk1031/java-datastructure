package list.test.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class ListEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int num;
        while(true) {
            num = input.nextInt();
            if(num==0) break;
            else {
                list.add(num);
            }
        }
        int total = 0;
        for (Integer i : list) {
            total+=i;
        }
        double avg = (double) total / list.size();
        System.out.println("입력한 정수의 합계: "+ total);
        System.out.println("입력한 정수의 평균: "+ avg);
    }
}

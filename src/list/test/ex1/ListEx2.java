package list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();

        int num;
        while(true) {
            num = input.nextInt();
            if(num==0) {
                break;
            } else {
                list.add(num);
            }
        }
        for(int i=0; i<list.size(); i++) {
            System.out.print(list.get(i));
            if(i!=list.size()-1) {
                System.out.print(", ");
            }
        }

    }
}

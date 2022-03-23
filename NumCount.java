

import java.util.Scanner;

class NumCount {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] numbers = new int[num];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }


        int count = 0;
        int find = scanner.nextInt();
        for (int value : numbers) {
            if (value == find){
                count++;
            }
        }
        System.out.println(count);


    }
}

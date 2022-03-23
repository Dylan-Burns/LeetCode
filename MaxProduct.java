

import java.util.Scanner;

class MaxProduct {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[] arr = new int[num];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scanner.nextInt();
        }


        int maxProduct;
        int nextProduct;
        while(true){
            if(arr.length == 2){
                System.out.println(arr[0] * arr[1]);
                break;
            } else {
                for(int i = 0; i < arr.length; i++) {
                    for (int j = i + 1; j < arr.length; j++) {
                        maxProduct = arr[i] * arr[j];
                        nextProduct = arr[j] * arr[j + 1];
                        if (maxProduct < nextProduct) {
                            maxProduct = nextProduct;
                            System.out.println(maxProduct);
                            break;
                        } else if(maxProduct > nextProduct){
                            System.out.println(maxProduct);
                        }
                    }
                }
            }
        }
    }
}

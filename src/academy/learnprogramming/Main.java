package academy.learnprogramming;

public class Main {


    public static void main(String[] args) {
        System.out.println("1st -----------------------");
        int[] arr1 = {2, 3, 4};
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + " ");

        }

        System.out.println("2nd -----------------------");

        //2nd task array elements 0

        int[] arr2 = new int[10];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = 0;
            System.out.print(arr2[i] + " ");
        }

    }

}


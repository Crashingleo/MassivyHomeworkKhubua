import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Zadacha 1 //

        System.out.println(" Задача 1");
        int[] firstArray = new int []{1, 2, 3};
        double[] secondArray = new double []{1.57, 7.654, 9.986};
        String[] thirdArray = new String []{"hello", " ", "world"};
        
        // Zadacha 2//
        
        System.out.println("Задача 2");
        for (int i = 0; i < firstArray.length; i++) {
            System.out.print(firstArray[i]);
            if (i < 2){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++) {
            System.out.print(secondArray[i]);
            if(i < 2){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < thirdArray.length; i++) {
            System.out.print(thirdArray[i]);
            if(i < 2){
                System.out.print(", ");
            }
        }
        System.out.println();
        
        // Zadacha 3 //
        
        System.out.println("Задача 3");
        for (int i = (firstArray.length - 1); i >= 0; i--) {
            System.out.print(firstArray[i]);
            if (i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = (secondArray.length - 1);  i >= 0 ; i--) {
            System.out.print(secondArray[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = (thirdArray.length - 1); i >= 0; i--) {
            System.out.print(thirdArray[i]);
            if(i > 0){
                System.out.print(", ");
            }
        }
        System.out.println();

        // Zadacha 4 //

        System.out.println("Задача 4");
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] % 2 != 0) {
                firstArray[i] = firstArray[i] + 1;
            }
            System.out.println(firstArray[i]);
        }

        // Zadacha 5 //

        System.out.println("Задача 5");








    }
}
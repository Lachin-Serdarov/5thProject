import java.util.Scanner;

public class Project5th {
    public static void main(String[] args) {

        // Dərs 1 - 10 ölçülü array yarat, elementlərini ekrana çap et.

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++ ) {
            System.out.println("#" + (i + 1) + " - " + arr[i]);
        }

        // Dərs 2 - Arrayin bütün elementlərinin cəmini və ədədi ortasını tap.

        int[] arr1 = {3, 22, 54, 9, 10};


        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            sum += arr1[i];
        }
        double average = (double) sum / arr1.length;

        System.out.println("Arrayın bütün elementlərinin cəmi: " + sum);
        System.out.println("Arrayın bütün elementlərinin cəmi: " + average);


        // Dərs 3 - Arrayin neçə cüt, neçə tək elementi olduğunu tap.

        int[] arr2 = {76, 11, 3, 8};

        int even = 0;
        int odd = 0;

        for (int i = 0; i < arr2.length; i++)  {
            if (arr2[i] % 2 ==0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Cüt ədədlərin sayı: " + even);
        System.out.println("Tək ədədlərin sayı: " + odd);


        // Dərs 4 - Arrayin ən böyük və ən kiçik elementini tap.

        int[] arr3 = {12, 5, 8, 21, 3, 17};

        int min = arr3[0];
        int max = arr3[0];

        for (int i = 1; i < arr3.length; i++) {
            if (arr3[i] < min) {
                min = arr3[i];
            }
            if (arr3[i] > max) {
                max = arr3[i];
            }
        }
        System.out.println("Ən böyük ədəd: " + max);
        System.out.println("Ən kiçik ədəd: " + min);

        // Dərs 5 - Arrayin elementlərini sondan əvvələ doğru çap et.

        int[] arr4 = {9, 4, 41, 12, 1, 5, 33};

        for (int i = arr4.length - 1; i >= 0; i--) {
            System.out.println(arr4[i]);
        }

        // Dərs 6 - İstifadəçi bir ədəd daxil edir. Bu ədəd arraydadırsa indeksini, yoxdursa "Tapılmadı" yaz.

        int[] arr5 = {1, 2, 3, 14, 22, 0, 7};
        Scanner scr = new Scanner(System.in);

        System.out.println("Ədəd daxil edin: ");

        int num = scr.nextInt();

        boolean find = false;
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] == num) {
                System.out.println("İndeks: " + i);
                find = true;
                break;
            }
        }
        if (!find) {
            System.out.println("Tapılmadı.");
        }

        // Dərs 7 - Matrisin əsas diaqonalındakı elementləri çap et

        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Əsas diaqonal: ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i][i] + " ");
        }

        // Dərs 8 - Matrisin köməkçi diaqonalındakı elementləri çap et

        int[][] matrix2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println("Köməkçi diaqonal: ");
        int n2 = matrix2.length;
        for (int i = 0; i < n2; i++) {
            System.out.println(matrix2[i][n2-1-i] + " ");
        }


        /* Dərs 9 -
        *
        * *
        *  *
        *  *  *
        *  *  *  *
        *  *  *  *  * For ile bu patterni cekin */

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }


    }
}

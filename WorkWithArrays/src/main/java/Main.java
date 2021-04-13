public class Main {
    public static void sortArrayReverseOrder(int[] array) {
        int arrayLength = array.length;
        while (arrayLength >= 0) {
            for (int i = 0; i < array.length; i++) {
                if (i + 1 < array.length && array[i] > array[i + 1]) {
                    int a = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = a;
                }
            }
            arrayLength--;
        }
    }

    public static int sumOfThePositiveNumbers(int[] array) {
        int sum = 0;
        for (int i : array) {
            if (i > 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static double averageNumbersFromArray(int[] array) {
        int average = 0;
        for (int i : array) {
            average += i;
        }
        return (double) average / array.length;
    }

    public static void replaceAllDuplicated(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int j = 0;
            if (i < array.length) {
                j = i + 1;
            }
            while (j < array.length) {
                if (array[i] == array[j])
                    array[j] = 0;
                j++;
            }
        }
    }

    public static void main(String[] args) {
        int array[] = new int[]{3, 2, 3, 1, 4, 2, 8, 3};
        sortArrayReverseOrder(array);
        for (int i : array) {
            System.out.print(i);
        }
        System.out.println();
        int sum = sumOfThePositiveNumbers(array);
        System.out.println(sum);
        double average = averageNumbersFromArray(array);
        System.out.println(average);
        int[] arrayAdvanced = new int[]{3, 2, 3, 1, 4, 2, 8, 3};
        replaceAllDuplicated(arrayAdvanced);
        for (int i : arrayAdvanced) {
            System.out.print(i);
        }
    }
}

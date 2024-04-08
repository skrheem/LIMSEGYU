package chap05;

public class programming02 {
    public static void main(String[] args) {
        System.out.println(sumExceptFirst(1, 2, 3, 4));
        int arr[] = {2,3};
        System.out.println(sumExceptFirst(1, arr));
        System.out.println(sumExceptFirst(1,2,3,4,5));
    }

    public static int sumExceptFirst(int first, int... numbers) {
        int returnValue = 0;
        for (int i = 0; i < numbers.length; i++) {
            returnValue += numbers[i];
        }
        return returnValue;
    }
}
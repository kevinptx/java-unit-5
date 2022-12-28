public class RecursiveIndex {

    public static int recursiveIndex(int[] intArray, int num) {

        return _recursiveIndex(intArray, num, 0);
    }

    public static int _recursiveIndex(int[] intArray, int num, int index) {
        if (index == intArray.length) {
            return -1;
        }

        if (num == intArray[index]) {
            return index;
        }

        return _recursiveIndex(intArray, num, index + 1);
    }

    public static void main(String[] args) {
        int[] oneToTen = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        System.out.println(recursiveIndex(oneToTen, 7));

        // Example where it is not found
        System.out.println(recursiveIndex(oneToTen, 0));

    }
}
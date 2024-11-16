public class Prime {

    public static void checkPrime(int nums) {

        if (nums <= 1) {
            return;
        } else {
            for (int i = 2; i * i <= nums; i++) {

                if (nums % i == 0) {
                    return;
                }
            }
            System.out.print(nums + " ");
        }
    }

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            checkPrime(i);
        }

    }

}
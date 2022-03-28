class Fatorial {
    public static void main(String args[]) {
        long num = 5;

        for (long i = num ; i >= 1 ; i=i-1) {
            num = num * i;
        }
        System.out.println(num);
    }
}
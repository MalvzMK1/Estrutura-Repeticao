class Fatorial {
    public static void main(String args[]) {
        long num = 15;
        long fat = num;
        
        for (long i = num-1 ; i >= 2 ; i=i-1) {
            fat = fat * i;
        }
        System.out.println(num + "! = " + fat);
    }
}
class Tabuada {
    public static void main(String args[]) {
        int num = 5;

        //Quantidade de tabuadas
        for (int i = 1 ; i <= 3 ; i++) {
            //Construção da tabuada
            for (int j = 0 ; j <= 10 ; j++) {
                System.out.println(num + " x " + j + " = " + num*j);
            }
            num++;
            System.out.println();
        }
    }
}
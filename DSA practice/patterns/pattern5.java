class pattern5 {

    public void pattern5(int n) {

        for(int i = 0; i < n; i++) {

            for(int j = n; j >i; j--) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String args[]) {

        pattern5 obj = new pattern5();
        obj.pattern5(5);
    }
}
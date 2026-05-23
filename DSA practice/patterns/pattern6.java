class pattern6 {
    public void pattern6(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        pattern6 obj=new pattern6();
        obj.pattern6(5);
    }
}
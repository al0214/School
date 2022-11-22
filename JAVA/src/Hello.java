public class Hello {
    public static void main(String[] args) {
        for(int i = -2; i <= 2; i++) {
            for (int j = 2; j >= -2; j--) {
                if(i==0 && j==0)
                    System.out.print("O");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
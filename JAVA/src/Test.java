public class Test {
    public static void main(String[] args) {
        for(int y = 2; y >= -2; y--) {
            for (int x = -2; x <= 2; x++) {
                if(y>x+1 || y<x-1 || y<-1*x-1 || y>-1*x+1)
                    System.out.print("#");
                else if(y==0 && x==0)
                    System.out.print("O");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
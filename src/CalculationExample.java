import java.util.Scanner;

public class CalculationExample {

    private void calculate(int x, int y){
        try{
            int a =x+y;
            int b =x-y;
            int c =x*y;
            float d =x/y;
            System.out.println("Tong x+y la : "+a);
            System.out.println("Hieu x+y la : "+b);
            System.out.println("Tich x+y la : "+c);
            System.out.println("Thuong x+y la : "+d);
        }catch (Exception e){
            System.err.println("Xay ra ngoai le : "+e.getMessage());
        }
    }

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap vao x : ");
        int x = scanner.nextInt();

        System.out.println("Nhap vao y : ");
        int y = scanner.nextInt();

        CalculationExample calculationExample = new CalculationExample();
        calculationExample.calculate(x,y);
    }
}

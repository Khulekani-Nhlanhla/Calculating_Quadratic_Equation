import java.util.Scanner;

public class ProjectClass {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("This Program calculates the roots of a quadratic equation (ax^2+bx+c");
        System.out.printf("Please enter the value of a: ");
        double x1,x2;
        int VariableA = Sc.nextInt();
        System.out.printf("Please enter the value of b: ");
        int VariableB = Sc.nextInt();
        System.out.printf("Please enter the value of c: ");
        int VariableC = Sc.nextInt();
        if (VariableA == 0){
            System.out.println("The cofficient 'a' cannot be zero ");
        }else {
            double DeltaValue = (int) (Math.pow(VariableB, 2) - (4 * VariableA * VariableC));
            System.out.println("The value of delta is: " + DeltaValue);


            switch (DeltaValue > 0 ? 2 : (DeltaValue == 0 ? 1 : 0)) {
                case 0:
                    System.out.println("There is no real roots ");
                    break;
                case 1:
                     x1 = -VariableB /(2*VariableA);
                    System.out.printf("There is one real root: x1 = %.2f", x1);
                    break;
                case 2:
                    x1 = (-VariableB + Math.sqrt(DeltaValue))/(2 * VariableA);
                    x2 = (-VariableB - Math.sqrt(DeltaValue))/(2 * VariableA);
                    System.out.printf("There are two real roots: x1 = %.2f , x2 = %.2f%n",x1, x2 );
            }
        }

    }
}

import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args) {

        Scanner pair1 = new Scanner(System.in);
        System.out.println("Enter your first Coordinate Point: ");
        String x1 = pair1.nextLine();
        int x1C=Integer.parseInt(x1.substring(1,2));
        int y1C=Integer.parseInt(x1.substring(3,4));

        Scanner pair2 = new Scanner(System.in);
        System.out.println("Enter your second Coordinate Point: ");
        String x2 = pair1.nextLine();
        int x2C=Integer.parseInt(x2.substring(1,2));
        int y2C=Integer.parseInt(x2.substring(3,4));



        LinearEquation equation = new LinearEquation(x1C,y1C,x2C,y2C);
        System.out.println(equation.pair1());
        System.out.println(equation.pair2());
        System.out.println(equation.slope());
        System.out.println(equation.yIntercept());
        System.out.println(equation.Equation());
        System.out.println(equation.distance());


        Scanner thirdXCoord = new Scanner(System.in);
        System.out.println("Enter a third x-value: ");
        String x3 = thirdXCoord.nextLine();
        int x3C = Integer.parseInt(x3);
        System.out.println(equation.pair3());



    }

}


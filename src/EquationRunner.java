import java.util.Scanner;


public class EquationRunner {
    public static void main(String[] args) {

        Scanner pair1 = new Scanner(System.in);
        System.out.println("Enter your first Coordinate Point: ");
        String x1 = pair1.nextLine();
        int x1C=Integer.parseInt(x1.substring(x1.indexOf("(")+1,x1.indexOf(",")));
        int y1C=Integer.parseInt(x1.substring(x1.indexOf(",") + 1,x1.indexOf(")")));

        Scanner pair2 = new Scanner(System.in);
        System.out.println("Enter your second Coordinate Point: ");
        String x2 = pair1.nextLine();
        int x2C=Integer.parseInt(x2.substring(x2.indexOf("(")+1,x2.indexOf(",")));
        int y2C=Integer.parseInt(x2.substring(x2.indexOf(",")+1,x2.indexOf(")")));



        LinearEquation equation = new LinearEquation(x1C,y1C,x2C,y2C);
        equation.equationInfo();

        Scanner thirdXCoord = new Scanner(System.in);
        System.out.println("Enter a third x-value: ");
        String x3 = thirdXCoord.nextLine();
        int x3C = Integer.parseInt(x3);
        LinearEquation x3Coord = new LinearEquation(x1C,y1C,x2C,y2C,x3C);
        System.out.println(x3Coord.pair3());



    }

}


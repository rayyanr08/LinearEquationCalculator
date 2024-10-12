public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double x3;
// initialized every instance variable required

    // created a constructor to input all the values and perform expressions
    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }

//created another constructor for the third pair of coordinates
    public LinearEquation(int x1, int y1, int x2, int y2, double x3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;

    }


// returns the slope value that will be used in methods within this class
    private double getNumericSlope() {
        double slope = (double) (y2 - y1) / (x2 - x1);
        return Math.round(slope * 100.0) / 100.0;
    }

    // Method to return slope as a String (following the "nice" formatting from rubric)
    public String slope() {
        int deltaY = y2 - y1;
        int deltaX = x2 - x1;

        // Handle "nice" slope cases (rubric specifications)
        if (deltaX == 1 && deltaY == 1)
        {
            if (deltaY % deltaX == 0) {
                return "" +getNumericSlope(); // simplifies if it can be
            }
            return "";  //  2x + 1
        }
        else if (deltaX == -1 && deltaY > 0)
        {
            if (deltaY % deltaX == 0) {
                return "" +getNumericSlope();// simplifies if it can be
            }
            return "-" + deltaY;  //  -x + 1
        }
        else if (deltaY == 0)
        {
            if (deltaY % deltaX == 0) {
                return "" +getNumericSlope();// simplifies if it can be
            }
            return "0";  // horizontal line
        }
        else if (deltaX < 0 && deltaY > 0)
        {
            if (deltaY % deltaX == 0) {
                return "" +getNumericSlope();// simplifies if it can be
            }
            return "-" + Math.abs(deltaY) + "/" + Math.abs(deltaX);  //  -2/3x
        }
        else if (deltaX < 0 && deltaY < 0)
        {
            if (deltaY % deltaX == 0 && deltaX > 1) {// simplifies if it can be
                return "" + getNumericSlope();
            }
            return Math.abs(deltaY) + "/" + Math.abs(deltaX);
        }

        else
        {
            return deltaY + "/" + deltaX;  // Return slope as fraction (2/3x)
        }
    }


    // returns string for the linear equation in y=mx+b form
    public String Equation() {
        double slope = (double) (y2 - y1) / (x2 - x1); // initializing variable slope in order to get more accurate answers when evaluating expressions
        String intercept = "" + yIntercept(); // initialized new variable because of conditionals for negative and positive possibilities (y intercept being negative)
        if (Double.valueOf(intercept) > 0){
            intercept = " + " + intercept;
        } else if (Double.valueOf(intercept) == 0) {
            intercept = "";

        }
        else {
            intercept = "- " + intercept;
        }
        return "y = " + slope() + "x " + intercept;

    }

    // y intercept as a double using the slope intercept form equation
    public double yIntercept() {
        double slope = (double) (y2 - y1) / (x2 - x1); // initializing variable slope in order to get more accurate answers when evaluating expressions
        double intercept = y1 - slope * x1;
        return Math.round(intercept * 10.0) / 10.0;
    }


    // uses the distance formula and displays the distance after rounding it to the nearest hundreth
    public double distance() {
        double distanceF = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return (double)Math.round(distanceF * 100) /100;

    }


    // displays the first coordinate
    public String pair1(){

        return "(" + x1 + ", " + y1 + ")";
    }

    // displays the second coordinate
    public String pair2(){

        return "(" + x2 + ", " + y2 + ")";
    }


  // displays the solved coordinate for the third x value
    public String pair3() {
        double slope = (double) (y2 - y1) / (x2 - x1); // initializing variable slope in order to get more accurate answers when evaluating expressions
        double y3 = slope * x3 + yIntercept();
        return "(" + String.format("%.2f", x3) + ", " + String.format("%.2f", y3) + ")";
    }



    // uses void method to store all the necessary information about the coordinates
    public void equationInfo(){
        System.out.println("First pair: " + pair1());
        System.out.println(("Second pair: " + pair2()));
        System.out.println("Slope of line: " + getNumericSlope()); //real slope that can be used for expressions
        System.out.println("Y-Intercept: " + yIntercept());
        System.out.println("Slope intercept form: " + Equation());
        System.out.println("Distance between points is: " + distance());

    }


}




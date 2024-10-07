public class LinearEquation {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private double x3;


    public LinearEquation(int x1, int y1, int x2, int y2){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;

    }


    public LinearEquation(int x1, int y1, int x2, int y2, double x3){
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;

    }

    public double slope() {
        int deltay = y2 - y1;
        int deltax = x2 - x1;

        if (deltay % deltax == 0) {
            return deltay/deltax; // Handle undefined slope (optional)
        } else {
            return Double.parseDouble(deltay + "/" + deltax);

        }

    }


    public String Equation() {
        return "y = " + slope() + "x " + "+ " + yIntercept();
    }

    public double yIntercept() {
        Double yIntercept1 = Double.valueOf(y1 / (slope() * x1));
        return (double) Math.round(yIntercept1 * 100) /100;

    }

    public double distance() {
        double distanceF = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1, 2));
        return (double) Math.round(distanceF * 100) /100;

    }

    public String pair1(){
        return "(" + x1 + ", " + y1 + ")";
    }

    public String pair2(){
        return "(" + x2 + ", " + y2 + ")";
    }

    public String pair3(){
        double yValue = slope() * x3 + yIntercept();
        double xValue = x3/1.0;
        return "(" + xValue + ", " + yValue + ")";
    }


}

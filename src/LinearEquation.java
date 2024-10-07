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


    public String slope() {
        int deltay = y2 - y1;
        int deltax = x2 - x1;

        if (deltay % deltax == 0) {
            return String.valueOf(Math.round(deltay / deltax * 100.0)/100.0 );

        } else if (deltax < 0) {
            deltax = deltax * -1;
            deltay = deltay * -1;
            return String.valueOf(deltay / deltax);

        } else if (deltax < 0 && deltay < 0) {
            deltax = deltax * -1;
            deltay = deltay * -1;

        } else {
            return String.valueOf(deltay) + "/" + String.valueOf(deltax);

        }
        return "";
    }



    public String Equation() {
        return "y = " + slope() + "x " + "+ " + yIntercept();
    }

    public double yIntercept() {
        Double yIntercept1 = Double.valueOf(y1 - (Double.parseDouble(slope()) * x1));
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
        return "(" + x3/1.0 + "," + (Double.parseDouble(slope()) * x3 + yIntercept()) + ")";
    }


    public void equationInfo(){
        System.out.println(pair1());
        System.out.println((pair2()));
        System.out.println(slope());
        System.out.println(yIntercept());
        System.out.println(Equation());
        System.out.println(distance());

    }


}

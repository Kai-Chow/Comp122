import java.lang.Math;

public class SimpleCircle {
    public static void main (String args[]) {

        double r = 2.5;
        
        // replace the following two lines
        double area = Math.PI * (Math.pow(r, 2));
        double circumference = Math.PI * r;
  
        System.out.println(r);
        System.out.println(area);
        System.out.println(circumference);
     }
    /* Terminal results (rounded)
     * r = 2.5
     * area = 19.63
     * circumference = 7.85
     */
}

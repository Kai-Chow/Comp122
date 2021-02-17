
public class Cosines {
	public static void main(String[] args) {
        double a = 3.0;
        double b = 5.0;
        double theta = (2 * Math.PI) / 3;
        double c;
        
        double cosTheta = Math.cos(theta);
        c = Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b)*cosTheta;
        
        System.out.println(c);
    }    
	//The answer is 48.9 recurring 
}

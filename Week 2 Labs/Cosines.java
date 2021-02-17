
public class Cosines {
	public static void main(String[] args) {
        double a = 3.0;
        double b = 5.0;
        double theta = (2 * Math.PI) / 3;
        double c;
        
		// c = square root of (a^2 + b^2 - ((2*a*b)*cos(theta))
        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) - (2 * a * b)*(Math.cos(Theta)));
        
        System.out.println(c);
    }    
	//The answer is 6.9 recurring 
}

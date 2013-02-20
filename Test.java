public class Test {
	public static void main (String[] args) 
	{
	System.out.println("Digite el valor de a"); 
	String z=System.console().readLine();  
	System.out.println("Digite el valor de v"); 
	String j=System.console().readLine(); 
	System.out.println("Digite el valor de t"); 
	String p=System.console().readLine(); 
	System.out.println("Digite el valor de x"); 
	String f=System.console().readLine(); 
	double a=Double.parseDouble(z);
	double v=Double.parseDouble(j);
	double t=Double.parseDouble(p);
	double x=Double.parseDouble(f);
	double score = 1.5*a*Math.pow(t,2)+v*t+x;
	System.out.println("el valor x(t) es:");
	System.out.println(score);
	}
}
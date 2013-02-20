class santiago2 { 
public static void pay(double basePay, int hours) { 
if (basePay < 8.0) {
System.out.println("no puede trabajar menos de 8 horas");
} else if (hours > 60) {
System.out.println("no puede trabajar mas de 60 horas");
} else {

int overtimeHours = 0;

if (hours > 40) {

overtimeHours = hours - 40;  
hours = 40; 
}
double pay = basePay * hours;
pay += overtimeHours * basePay * 1.5;
System.out.println("Pay this employee $" + pay); 
}
} 
public static void main(String[] arguments) { 
pay(4.5, 33);
pay(7.0, 49);
pay(10.0, 62); 
}
}
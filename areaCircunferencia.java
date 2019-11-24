//Realiza un programa que calcule el área de una circunferencia de radio 5,2 centímetros.

public class areaCircunferencia {
	
	public static double CalculaArea() {
		
		double radio=5.2;
		
		return Math.PI*(radio*radio);
		
	}
	
	public static void main(String[] args){
		
		System.out.println("El área de la circunferencia es igual a: " + CalculaArea() + " centímetros cuadrados");
		
	}
}

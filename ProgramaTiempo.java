/*Realiza un programa con una variable entera t la cual contiene un tiempo 
en segundos y queremos conocer este tiempo pero expresado en horas, minutos y segundos.*/

public class ProgramaTiempo {
	
	public static void main(String[] args){
		
		int t=4867357;
		
		int horas=t/3600, resto=t%3600, minutos=resto/60, segundos=resto%60;
		
		System.out.println("El tiempo es: " + horas + " horas " + minutos + " minutos " + segundos + " segundos");
		
	}
}

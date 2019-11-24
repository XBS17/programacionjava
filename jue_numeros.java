import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class jue_numeros {
	public static void main(String[] args){
	juego Mijuego=new juego();
	Mijuego.pide_numeros();	
		}
	}



class juego{
	
		int numero_secreto;
		int intentos=10;
		
		juego(){
			numero_secreto=(int) (Math.random()*100+1);
			}
		public void pide_numeros(){
			int numero=0;
			lee_teclado teclado=new lee_teclado();
			do{
				System.out.print("Introduce un numero ");
				numero=teclado.lee();
				intentos--;
				if(numero<numero_secreto)
					System.out.println("Has puesto un número pequeño");
				if(numero>numero_secreto)
					System.out.println("Has puesto un número grande");
				if(numero==numero_secreto)
					System.out.println("Has acertado");
				else
					System.out.println("Te quedan "+intentos+" intentos");
				
			}while(numero!=numero_secreto && intentos>0);
			}
		
	class lee_teclado
	{
		public int lee(){
			int numero=0;
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br= new BufferedReader(isr);
			try{
				numero=Integer.parseInt(br.readLine());
			}catch(IOException e){}
			return numero;
			}
		}
	}

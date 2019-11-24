//Realiza un programa que genere letras aleatoriamente y determine si son vocales o consonantes.

public class VocalesConsonantes {
	
  public static void main(String[] args) {
    char letra; 
    boolean esConsonante; 
    // con este bucle imprimo 20 posibles variables
    for (int i = 0; i<40; i++) {
      // consonante queda a true
      esConsonante = true; 
      // aplico letras aleatorias
      letra = (char)(Math.random()*26 + 'A');
      // 5 casos: si es vocal, consonante es false 
      switch(letra){
        case 'A': esConsonante = false; break; 
        case 'E': esConsonante =  false; break; 
        case 'I': esConsonante = false; break; 
        case 'O': esConsonante = false; break; 
        case 'U': esConsonante = false; break; 
      }
      // imprime si es true
      if(esConsonante){
        System.out.println(letra + " es una consonante");
      // imprime si es false  
      } else {
        System.out.println(letra + " es una vocal"); 
      }
    }
  }
}

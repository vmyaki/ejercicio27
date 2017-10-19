
public class Main {

	public static void main(String[] args) {
		//Declaramos dos objetos
		Coche renault=new Coche();
		Coche ford=new Coche();
		
		//Inicializamos los objetos
		renault.matricula="3456y";
		renault.color="rojo";
		renault.velocidad=0;
		renault.aceleracion=5;
		
		ford.matricula="2299q";
		ford.color="verde";
		ford.velocidad=0;
		ford.aceleracion=18;
		
		//Bucle para aumentar la velocidad
		int i=0;
		while(i<10)
			{
				renault.velocidad=renault.velocidad+renault.aceleracion;
				ford.velocidad=ford.velocidad+ford.aceleracion;
				i++;
				
			}
		
		System.out.println("El coche Renault con matrícula " +renault.matricula+ ",de color "+renault.color+ ",con velocidad "+renault.velocidad+ " y aceleracion "+renault.aceleracion);
		System.out.println("El coche Ford con matrícula " +ford.matricula+ ",de color "+ford.color+ ",con velocidad "+ford.velocidad+ " y aceleracion "+ford.aceleracion);
		
		
		
	}

}

/*
 En un nuevo proyecto crear una clase que represente una Computadora, usted determine
que atributos describirían mejor a dicho objeto y luego agregue un constructor para
inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de
la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado
de todos sus atributos.
 */
package ejercicio.pkg2.guia1parte1;

public class Ejercicio2Guia1parte1 {

   
    public static void main(String[] args) {
        Computadora ComputadoraUno = new Computadora("HP", 1, 16);
       
        System.out.println(ComputadoraUno.getMarca()+" "+ComputadoraUno.getProcesador()+" "+ComputadoraUno.getRam());
    }
    
}

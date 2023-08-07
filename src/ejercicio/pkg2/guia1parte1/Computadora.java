/*
 En un nuevo proyecto crear una clase que represente una Computadora, usted determine
que atributos describirían mejor a dicho objeto y luego agregue un constructor para
inicializar sus atributos y los respectivos métodos getter y setter. Desde el método main de
la clase principal del proyecto, instanciar una Computadora y mostrar por consola el estado
de todos sus atributos.
 */
package ejercicio.pkg2.guia1parte1;

public class Computadora {
    private String marca;
    private int procesador;
    private int ram;

    public Computadora(String marca, int procesador, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getProcesador() {
        return procesador;
    }

    public void setProcesador(int procesador) {
        this.procesador = procesador;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
    
}

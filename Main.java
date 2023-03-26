import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Conejo c=new Conejo();
        c.setNombre("Carlos");
        c.setEdad(c.numEdad());
        c.setRaza("Rex");
        c.setPelaje(c.tipoPelaje());
        c.setCmorejas(12);
        System.out.println("El nombre del conejo es "+c.getNombre());
        c.mostrarAtributos();
    }
}
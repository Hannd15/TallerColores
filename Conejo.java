import java.util.Random;

public class Conejo {
    String raza,pelaje,nombre;
    int edad,cmorejas;

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getCmorejas() {
        return cmorejas;
    }

    public void setCmorejas(int cmorejas) {
        this.cmorejas = cmorejas;
    }

    public void mostrarAtributos(){
        System.out.print("El conejo tiene "+edad+" años, es de raza "+raza+", tiene un pelaje de color "+pelaje+" y sus orejas miden "+cmorejas+" centímetros");
    }
    public String tipoPelaje(){
        String[] pelaje={"Negro","Blanco","Marrón"};
        Random r = new Random();
        int index = r.nextInt(pelaje.length);
        return pelaje[index];
    }
    public int numEdad(){
        Random r = new Random();
        return r.nextInt(12);
    }

}

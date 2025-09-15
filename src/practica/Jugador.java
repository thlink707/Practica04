package practica;


public class Jugador {
    private String nombre, posicion;
    private int edad, estatura, dorsal;

    public Jugador(String nombre, String posicion, int edad, int estatura, int dorsal) {
        this.nombre = nombre;
        this.posicion = posicion;
        this.edad = edad;
        this.estatura = estatura;
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getEdad() {
        return edad;
    }

    public int getEstatura() {
        return estatura;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    
    
}

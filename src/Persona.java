public class Persona {
    
    private int edad;
    private double estatura;
    private int nombre;
    
    public Persona(int edad, double estatura, int nombre) {
        this.edad = edad;
        this.estatura = estatura;
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    

}

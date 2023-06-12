public class Jefe extends Persona{

    private static final int VALOR_VIDA = 15;
    private int vida;

    public Jefe(int edad, double estatura, int nombre) {
        super(edad, estatura, nombre);
        this.vida = VALOR_VIDA;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    
    
}

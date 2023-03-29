public class Perro extends Animal{
private String raza;

    public Perro() {
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public Perro(String nombre, int edad, float peso, String raza) {
        super(nombre, edad, peso);
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return (this.peso>o.peso ? 1 : -1 );
    }
}

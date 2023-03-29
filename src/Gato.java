public class Gato extends Animal{
 private String pelaje;

 public Gato() {
    }

    public Gato(String pelaje) {
        this.pelaje = pelaje;
    }

    public Gato(String nombre, int edad, float peso, String pelaje) {
        super(nombre, edad, peso);
        this.pelaje = pelaje;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "pelaje='" + pelaje + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                '}';
    }

    @Override
    public int compareTo(Animal o) {
        return (this.peso>o.peso ? 1 : -1);
    }
}

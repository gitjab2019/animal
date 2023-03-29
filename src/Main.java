import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

    ArrayList<Animal> veterinaria=new ArrayList<>();

    Gato cat1=new Gato("Miyunga",7,15.0f,"Gris");
    Gato cat2=new Gato("Garfield",9,10.0f,"Atigrado");
    Perro dog1=new Perro("Linye",12,20.0f,"Cruza");
    Perro dog2=new Perro("Chiquita",10,7.0f,"Terrier");

    veterinaria.add(cat1);
    veterinaria.add(cat2);
    veterinaria.add(dog1);
    veterinaria.add(dog2);

    Collections.sort(veterinaria);

    System.out.println("Veterinaria Ordenada: "+veterinaria);
    }
}
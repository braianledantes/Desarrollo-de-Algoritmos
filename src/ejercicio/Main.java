package ejercicio;

public class Main {

    public static void main(String[] args) {
        Especie[] especies = new Especie[3];

        int poblacion;
        double tasa;
        String nombre;
        for (int i = 0; i < especies.length; i++) {
            System.out.println("especie " + i);
            System.out.println("ingrese la tasa:");
            poblacion = TecladoIn.readInt();
            System.out.println("ingrese la poblacion");
            tasa = TecladoIn.readDouble();
            System.out.println("ingrese el nombre");
            nombre = TecladoIn.readLine();

            especies[i] = new Especie(tasa, poblacion, nombre);
        }
    }
}

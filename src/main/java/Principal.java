import java.util.Random;

public class Principal {
    public static void main (String [] args){

        // La interface puede ser usada, al igual
        // que las clases abstractas, para:

        // 1. Ser implementada por otras clases (StringCompara.java,
        // IntegerCompara.java)

        // 2. Declarar objetos de la misma,
        // que serán construidos por medio de alguna de las clases
        // que implementen la interfaz:

        Compara i1 = new IntegerCompara (5), i2 = new IntegerCompara (5), s1 = new StringCompara ("hola");

        System.out.println ("Comparación de objetos declarados Compara " + i1.mayorQue (i2));
        // 3. Declarar estructuras genéricas de los mismos;
        // atención, porque también podemos construir el array
        // por medio de la "interface", aunque la misma no
        // tenga constructores propios;

        // l1 va a representar una lista sin ordenar de IntegerCompara
        Lista l1 = new Lista ();
        // l2 va a representar una lista ordenada de IntegerCompara
        Lista l2 = new ListaOrdenada();
        // l3 va a representar una lista sin ordenar de StringCompara
        Lista l3 = new Lista ();
        // l4 va a representar una lista ordenada de StringCompara
        Lista l4 = new ListaOrdenada();
        // l5 va a representar una lista sin ordenar de DoubleCompara
        Lista l5 = new Lista ();
        // l6 va a representar una lista ordenada de DoubleCompara
        Lista l6 = new ListaOrdenada();

        // Creamos una semilla para generar elementos aleatorios
        Random r1 = new Random ();

        // En el array v1 podemos incluir objetos de cualquier
        // clase que implemente la interfaz Compara,
        // de manera indistinta
        for (int i = 0; i < 50; i = i + 2){
            // A partir de la semilla r1 generamos
            // objetos "Integer" aleatorios;
            // Los convertimos a "IntegerCompara" y los
            // introducimos en el array v1
            Compara ic = new IntegerCompara (r1.nextInt());
            l1.incluir (ic);
            l2.incluir (ic);
            // Convertimos los datos de tipo IntegerCompara a String,
            // y se los pasamos al constructor de StringCompara
            // Observa que en el array v podemos introducir
            // objetos de cualquier clase que implemente "Compara"
            Compara sc = new StringCompara (ic.toString());
            l3.incluir (sc);
            l4.incluir (sc);

            // Ahora generamos un double con la misma semilla
            // y lo incluimos en ambas listas; en una de manera "desordenada",
            // en la otra de manera "ordenada"
            Compara sd = new DoubleCompara (r1.nextDouble());
            l5.incluir (sd);
            l6.incluir (sd);

        }
        // Haciendo uso del metodo "toString()"
        // de la clase Lista mostramos las listas por pantalla
        // Observa que los objetos aparecen o no ordenados,
        // dependiendo de la lista que usemos
        System.out.println ("La lista de enteros sin ordenar " + l1.toString());
        System.out.println ("La lista de enteros ordenada " + l2.toString());
        System.out.println ("La lista de cadenas sin ordenar " + l3.toString());
        System.out.println ("La lista de cadenas ordenada " + l4.toString());
        System.out.println ("La lista de double sin ordenar " + l5.toString());
        System.out.println ("La lista de double ordenada " + l6.toString());

    }
}

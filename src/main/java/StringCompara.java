
// La cabecera de la clase IntegerCompara
// ahora usa la palabra clave "implements"
// para declarar su relación con la interface
// "Compara"

// Aunque éste no es el caso, una clase puede heredar
// de otra, e implementar varias interfaces, que
// aparecerán separadas por comas

// Se puede observar que no declaramos la clase
// como "abstract", lo cual nos obliga a dar una
// implementación de todos los métodos de la
// interface "Compara", si no obtendremos un error
// de compilación

public class StringCompara implements Compara {
    // Por comodidad, nos declaramos
    // el atributo "dato" como "public":
    public String dato;

    public StringCompara (String s){
        super ( );
        this.dato = s;
    }

    // Redefinimos todos los métodos de la interface "Compara";
    // Es importante observar el modificador "public"
    // en todos los métodos redefinidos de la interface,
    // que allí omitíamos, pero que en la clase
    // debemos añadir (si no serían "package")
    public boolean mayorQue (Compara c){
        boolean aux = false;
        if (c instanceof StringCompara sc){
            aux = (this.dato.compareTo(sc.dato) > 0);
        }
        return aux;
    }

    public boolean menorQue (Compara c){
        boolean aux = false;
        if (c instanceof StringCompara sc){
            aux = (this.dato.compareTo(sc.dato) < 0);
        }
        return aux;
    }

    public boolean igualQue (Compara c){
        boolean aux = false;
        if (c instanceof StringCompara sc){
            aux = (this.dato.compareTo(sc.dato) == 0);
        }
        return aux;
    }
    // Redefinimos el metodo "toString(): String"
    // para que muestre del objeto "dato" de forma adecuada
    public String toString(){
        return this.dato;
    }
}

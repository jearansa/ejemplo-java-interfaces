
// La cabecera de la clase IntegerCompara
// ahora usa la palabra clave "implements"
// para declarar su relación con la interface
// "Compara"

// Aunque éste no es el caso, una clase puede heredar
// de otra, e implementar varias interfaces, que
// aparecerían separadas por comas

// Se puede observar que no declaramos la clase
// como "abstract", lo cual nos obliga a dar una
// implementación de todos los métodos de la
// interface "Compara", si no obtendremos un error
// de compilación

public class IntegerCompara implements Compara{
    // Por comodidad, nos declaramos
    // el atributo "dato" como "public":
    public Integer dato;

    public IntegerCompara (int i){
        super();
        this.dato = Integer.valueOf (i);
    }

    // Redefinimos todos los métodos de la interface "Compara";
    // Es importante observar el modificador "public"
    // en todos los métodos redefinidos de la interface,
    // que allí omitíamos, pero que en la clase
    // debemos añadir (si no serían "package")
    public boolean mayorQue (Compara i){
        boolean aux = false;
        if (i instanceof IntegerCompara ic){
            aux = (this.dato > ic.dato);
        }
        return aux;
    }

    public boolean menorQue (Compara i){
        boolean aux = false;
        if (i instanceof IntegerCompara ic){
            aux = (this.dato < ic.dato);
        }
        return aux;
    }

    public boolean igualQue (Compara i){
        boolean aux = false;
        if (i instanceof IntegerCompara ic){
            aux = (this.dato.equals( ic.dato ));
        }
        return aux;
    }
    // Redefinimos el metodo "toString(): String"
    // para que muestre del objeto "dato" de forma adecuada,
    // añadiendo un salto de línea
    public String toString( ) {
        return this.dato.toString( );
    }
}

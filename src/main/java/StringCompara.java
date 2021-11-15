
// La cabecera de la clase IntegerCompara
// ahora usa la palabra clave "implements"
// para declarar su relaci�n con la interface
// "Compara"

// Aunque �ste no es el caso, una clase puede heredar
// de otra, e implementar varias interfaces, que
// aparecer�an separadas por comas

// Se puede observar que no declaramos la clase
// como "abstract", lo cual nos obliga a dar una
// implementaci�n de todos los m�todos de la
// interface "Compara", si no obtendremos un error
// de compilaci�n

public class StringCompara implements Compara {
	// Por comodidad, nos declaramos
	// el atributo "dato" como "public":
	public String dato;

	public StringCompara (String i){
		super ( );
		this.dato = i;
	}

	// Redefinimos todos los m�todos de la interface "Compara";
	// Es importante observar el modificador "public"
	// en todos los m�todos redefinidos de la interface,
	// que all� omit�amos, pero que en la clase
	// debemos a�adir (si no ser�an "package")
	public boolean mayorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof StringCompara){
			StringCompara ic = (StringCompara) i1;
			aux = (this.dato.compareTo(ic.dato) > 0);
		}
		return aux;
	}

	public boolean menorQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof StringCompara){
			StringCompara ic = (StringCompara) i1;
			aux = (this.dato.compareTo(ic.dato) < 0);
		}
		return aux;
	}

	public boolean igualQue (Compara i1){
		boolean aux = false;
		if (i1 instanceof StringCompara){
			StringCompara ic = (StringCompara) i1;
			aux = (this.dato.compareTo(ic.dato) == 0);
		}
		return aux;
	}
	// Redefinimos el método "toString(): String"
	// para que muestre del objeto "dato" de forma adecuada
	public String toString(){
		return this.dato.toString();
	}
}
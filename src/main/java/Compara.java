

// Observa las particularidades de la sintaxis de la declaraci�n
// de interfaces; de nuevo debemos declararlas como "public";
// Todos los m�todos de la interface son "public" y "abstract"
// La recomendaci�n general es que no se a�adan esos modificadores,
// pero es importante recordar su existencia

// Como se puede observar, la propia interface Compara
// se puede usar para declarar el tipo de los par�metros
// en la cabecera de las funciones del interface

public interface Compara{
	boolean mayorQue (Compara o1);
	boolean menorQue (Compara o1);
	boolean igualQue (Compara o1);
}
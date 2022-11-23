
// Observa las particularidades de la sintaxis de la declaración
// de interfaces; de nuevo debemos declararlas como "public";
// Todos los métodos de la interface son "public" y "abstract"
// La recomendación general es que no se añadan esos modificadores,
// pero es importante recordar su existencia

// Como se puede observar, la propia interface Compara
// se puede usar para declarar el tipo de los parámetros
// en la cabecera de las funciones del interface

public interface Compara{
    boolean mayorQue (Compara o1);
    boolean menorQue (Compara o1);
    boolean igualQue (Compara o1);
}

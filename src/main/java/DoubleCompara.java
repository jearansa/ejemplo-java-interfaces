
public class DoubleCompara implements Compara {

    public Double dato;

    public DoubleCompara (double d){
        super();
        this.dato = Double.valueOf (d);
    }
    public boolean mayorQue (Compara c){
        boolean aux = false;
        if (c instanceof DoubleCompara dc){
            aux = (this.dato > dc.dato);
        }
        return aux;
    }
    public boolean menorQue (Compara c){
        boolean aux = false;
        if (c instanceof DoubleCompara dc){
            aux = (this.dato < dc.dato);
        }
        return aux;
    }
    public boolean igualQue (Compara c){
        boolean aux = false;
        if (c instanceof DoubleCompara dc){
            aux = (Math.abs (this.dato - dc.dato ) < 0.001);
        }
        return aux;
    }
    public String toString(){
        return this.dato.toString();
    }
}

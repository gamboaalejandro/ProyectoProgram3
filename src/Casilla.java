import java.util.*;

class Casilla<T>{
    private Vecindad<T> vecino;
    private Ficha<T> ficha;
    private boolean ocupada=false;

    public boolean GetOcupada(){
        return this.ocupada;
    }

    // este constructor crea una casilla sin ficha
    public Casilla(Vecindad<T> vecino){
        this.vecino=vecino;
        this.ocupada=false;
    }

    // este constructor crea una casilla con ficha
    public Casilla (Ficha<T> Ficha,Vecindad<T> vecino){
        this.ficha=Ficha;
        this.vecino=vecino;
        this.ocupada = true;
    }

    public Ficha<T> GetFicha(){
        return this.ficha;
    }

    public void SetFicha(Ficha<T> ficha) throws ExceptionFicha  {
        if (ocupada== true){
            throw new ExceptionFicha();
        }else{this.ficha=ficha;}
    }

    public void RemoveFicha(){
        this.ficha=null;
        this.ocupada=false;
    }
    
    public Vecindad<T> GetVecino(){
        return this.vecino;
    }

    public ArrayList<Casilla<T>> GetVecinos(){
        return this.vecino.GetVecinos();
    }

}

class ExceptionFicha extends Exception{
    public String toString(){
        return "Casilla is not avaliable to set ficha";
    }
}
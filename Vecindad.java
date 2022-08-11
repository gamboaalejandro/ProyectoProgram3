import java.util.*;
//Esta abstraccion toma en cuenta cualquier tipo de
class Vecindad<T>{
    private ArrayList<Casilla<T>> vecinos=new ArrayList<Casilla<T>>();

    public ArrayList<Casilla<T>> GetVecinos(){
        return this.vecinos;
    }
}

class VecindadCuadricula<T> extends Vecindad<T>{
    private ArrayList<Casilla<T>> vecinoscolumna=new ArrayList<Casilla<T>>();
    private ArrayList<Casilla<T>> vecinosfila=new ArrayList<Casilla<T>>();

    public ArrayList<Casilla<T>> GetVecinitos(){
        return this.GetVecinos();
    }
    
    public ArrayList<Casilla<T>> GetFila(){
        return this.vecinosfila;
    }

    public ArrayList<Casilla<T>> GetColumna(){
        return this.vecinoscolumna;
    }

    public void VerifyMatch(ArrayList<Casilla<T>> Visitados,ArrayList<T> NumerosMatch,ArrayList<Casilla<T>> recorrer){
        System.out.println("Lista numeros Match: "+NumerosMatch);
        for(Casilla<T> C:recorrer){
            Ficha<T> ficha=C.GetFicha();
            if(!Visitados.contains(C)){
                Visitados.add(C);
                if(!NumerosMatch.contains(ficha.GetValor()))
                    NumerosMatch.add(ficha.GetValor());
            VecindadCuadricula<T> vecino=(VecindadCuadricula<T>)C.GetVecino();
            vecino.VerifyMatch(Visitados,NumerosMatch,vecino.GetFila());
            }  
        }
    }

    public void VerifyMatch1(ArrayList<Casilla<T>> Visitados,ArrayList<T> NumerosMatch,ArrayList<Casilla<T>> recorrer){
        System.out.println("Lista numeros Match: "+NumerosMatch);
        for(Casilla<T> C:recorrer){
            Ficha<T> ficha=C.GetFicha();
            if(!Visitados.contains(C)){
                Visitados.add(C);
                if(!NumerosMatch.contains(ficha.GetValor()))
                    NumerosMatch.add(ficha.GetValor());
            VecindadCuadricula<T> vecino=(VecindadCuadricula<T>)C.GetVecino();
            vecino.VerifyMatch1(Visitados,NumerosMatch,vecino.GetColumna());
            }  
        }
    }

    public String toString(){
        String F= "";
        String C= "";
        for (Casilla<T> c: vecinosfila ){
            F = F + c.GetFicha().GetValor();
        }
        for (Casilla<T> c2: vecinoscolumna ){
            C = C + c2.GetFicha().GetValor();
        }
        return "Vecinos Fila"+ F +"Vecinos columna"+C;
    }
}

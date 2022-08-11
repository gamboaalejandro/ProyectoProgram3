import java.util.*;

interface Restriccion<T>{
    public boolean IsMatch(T t,Casilla<T> c);
    
}

class ReglaNumerica implements Restriccion<Integer>{

    public boolean IsMatch(Integer t,Casilla<Integer> c){
        VecindadCuadricula<Integer> vecino=(VecindadCuadricula<Integer>)c.GetVecino();
        ArrayList<Casilla<Integer>> l1=new ArrayList<Casilla<Integer>>();
        ArrayList<Integer> l2=new ArrayList<Integer>();
        ArrayList<Casilla<Integer>> l3=new ArrayList<Casilla<Integer>>();
        ArrayList<Integer> l4=new ArrayList<Integer>();
        vecino.VerifyMatch(l1,l2,vecino.GetFila());
        vecino.VerifyMatch1(l3,l4,vecino.GetColumna());
        if((!l2.contains(t))&&(!l4.contains(t))){
            l2.add(t);
            l4.add(t);
        }   
        if((l2.size()==(l1.size()))&&(l4.size()==(l3.size()))){
            System.out.println("La Ficha de valor "+ t+ "hace match ");
            return true;
        }
        else
            return false;
    }

    public boolean GameOver(ArrayList<Casilla<Integer>> Visitados, Casilla<Integer> C1){
        ReglaNumerica Regla = new ReglaNumerica();
        for (Casilla<Integer> C: C1.GetVecinos()){
            if (!Visitados.contains(C)){
                Visitados.add(C);
                if (!Regla.IsMatch(C1.GetFicha().GetValor(),C1))return false;
            }
            GameOver(Visitados,C);          
        }
        return true;       
    }
}

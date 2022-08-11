
class Ficha<T>{
    private T valor;

    public T GetValor(){
        return this.valor;
    }

    public void SetValor(T valor){
        this.valor=valor;
    }

    public Ficha(T valor){
        this.valor =valor;
    }
    
}

/*public boolean GameOver(ArrayList<Casilla<Integer>> Visitados, Casilla<Integer> C1){
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
public void PonerFicha(Ficha<Integer> f1, Casilla<Integer> c1){
    if (!c1.Getocupada()){
        try{
            c1.SetFicha(f1);
        }catch(ExceptionFicha e){
            e.printStackTrace();
        }finally{
            ReglaNumerica regla = new ReglaNumerica();
            if (regla.IsMatch(f1.GetValor(), c1))
                System.out.println("la ficha de numero"+f1.GetValor()+"Hace un match en fila y columna");
            if(GameOver(new ArrayList<Casilla<Integer>>(),c1)){
                System.out.println("la ficha de numero"+f1.GetValor()+"Hace el Game Over");
            }
        }
    }
}*/



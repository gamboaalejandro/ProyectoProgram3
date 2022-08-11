class Fichita{
    
}

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



import java.util.*;

public class PruebaProyecto {

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
    public static void main(String [] agrs){

       /*VecindadCuadricula<Integer> v1=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v2=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v3=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v4=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v5=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v6=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v7=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v8=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v9=new VecindadCuadricula<Integer>();

        Casilla<Integer> c1=new Casilla<Integer>(v1);
        Casilla<Integer> c2=new Casilla<Integer>(v2);
        Casilla<Integer> c3=new Casilla<Integer>(v3);
        Casilla<Integer> c4=new Casilla<Integer>(v4);
        Casilla<Integer> c5=new Casilla<Integer>(v5);
        Casilla<Integer> c6=new Casilla<Integer>(v6);
        Casilla<Integer> c7=new Casilla<Integer>(v7);
        Casilla<Integer> c8=new Casilla<Integer>(v8);
        Casilla<Integer> c9=new Casilla<Integer>(v9);
        
        v1.GetFila().add(c2);
        v1.GetColumna().add(c4);

        v2.GetFila().add(c1);
        v2.GetFila().add(c3);
        v2.GetColumna().add(c5);

        v3.GetFila().add(c2);
        v3.GetColumna().add(c6);

        v4.GetFila().add(c5);
        v4.GetColumna().add(c1);
        v4.GetColumna().add(c7);
        
        v5.GetFila().add(c4);
        v5.GetFila().add(c6);
        v5.GetColumna().add(c2);
        v5.GetColumna().add(c8);

        v6.GetFila().add(c5);
        v6.GetColumna().add(c3);
        v6.GetColumna().add(c9);

        v7.GetFila().add(c8);
        v7.GetColumna().add(c4);

        v8.GetFila().add(c9);
        v8.GetFila().add(c7);
        v8.GetColumna().add(c5);

        v9.GetFila().add(c8);
        v9.GetColumna().add(c6);
        */
      
        VecindadCuadricula<Integer> v1=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v2=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v3=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v4=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v5=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v6=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v7=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v8=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v9=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v10=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v11=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v12=new VecindadCuadricula<Integer>();
        VecindadCuadricula<Integer> v13=new VecindadCuadricula<Integer>();

        //fichassssssss
        Ficha<Integer> f1= new Ficha<Integer>(5);
        Ficha<Integer> f2= new Ficha<Integer>(2);
        Ficha<Integer> f3= new Ficha<Integer>(4);
        Ficha<Integer> f4= new Ficha<Integer>(3);
        Ficha<Integer> f5= new Ficha<Integer>(4);
        Ficha<Integer> f6= new Ficha<Integer>(5);    
        Ficha<Integer> f7= new Ficha<Integer>(1); 
        Ficha<Integer> f8= new Ficha<Integer>(3);
        Ficha<Integer> f9= new Ficha<Integer>(2);
        Ficha<Integer> f10= new Ficha<Integer>(1);
        Ficha<Integer> f11= new Ficha<Integer>(1);
        Ficha<Integer> f12= new Ficha<Integer>(5);
        Ficha<Integer> f13= new Ficha<Integer>(2);
        //casillasssssssssssssssssss

        Casilla<Integer> c1=new Casilla<Integer>(f1,v1);
        Casilla<Integer> c2=new Casilla<Integer>(f2,v2);
        Casilla<Integer> c3=new Casilla<Integer>(f3,v3);
        Casilla<Integer> c4=new Casilla<Integer>(f4,v4);
        Casilla<Integer> c5=new Casilla<Integer>(f5,v5);
        Casilla<Integer> c6=new Casilla<Integer>(f6,v6);
        Casilla<Integer> c7=new Casilla<Integer>(f7,v7);
        Casilla<Integer> c8=new Casilla<Integer>(f8,v8);
        Casilla<Integer> c9=new Casilla<Integer>(f9,v9);
        Casilla<Integer> c10=new Casilla<Integer>(f10,v10);
        Casilla<Integer> c11=new Casilla<Integer>(f11,v11);
        Casilla<Integer> c12=new Casilla<Integer>(f12,v12);
        Casilla<Integer> c13=new Casilla<Integer>(f13,v13);

        v1.GetFila().add(c2);
        v1.GetColumna().add(c4);

        v2.GetFila().add(c1);
        v2.GetFila().add(c3);
        v2.GetColumna().add(c10);
        v2.GetColumna().add(c5);


        v3.GetFila().add(c2);
        v3.GetColumna().add(c6);

        v4.GetFila().add(c5);
        v4.GetFila().add(c11);
        v4.GetColumna().add(c1);
        v4.GetColumna().add(c7);
        
        v5.GetFila().add(c4);
        v5.GetFila().add(c6);
        v5.GetColumna().add(c2);
        v5.GetColumna().add(c8);

        v6.GetFila().add(c5);
        v6.GetFila().add(c13);
        v6.GetColumna().add(c3);
        v6.GetColumna().add(c9);

        v7.GetFila().add(c8);
        v7.GetColumna().add(c4);

        v8.GetFila().add(c9);
        v8.GetFila().add(c7);
        v8.GetColumna().add(c12);
        v8.GetColumna().add(c5);

        v9.GetFila().add(c8);
        v9.GetColumna().add(c6);

        v10.GetColumna().add(c2);

        v11.GetFila().add(c4);

        v12.GetColumna().add(c8);

        v13.GetFila().add(c6);
        
        ReglaNumerica regla =new ReglaNumerica();
        /*f13.SetValor(20);
        f6.SetValor(20);*/
        regla.IsMatch(c6.GetFicha().GetValor(),c6);
        

        regla.GameOver(new ArrayList<Casilla<Integer>>(),c6);
        
        
    }
}


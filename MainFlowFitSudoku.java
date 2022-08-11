import java.util.ArrayList;

public class MainFlowFitSudoku {
    
    public static void main(String [] argv){

       /* Vecindad<Integer> v1=new Vecindad<Integer>();
        Vecindad<Integer> v2=new Vecindad<Integer>();
        Vecindad<Integer> v3=new Vecindad<Integer>();
        Vecindad<Integer> v4=new Vecindad<Integer>();
        Vecindad<Integer> v5=new Vecindad<Integer>();
        Vecindad<Integer> v6=new Vecindad<Integer>();
        Vecindad<Integer> v7=new Vecindad<Integer>();
        Vecindad<Integer> v8=new Vecindad<Integer>();
        Vecindad<Integer> v9=new Vecindad<Integer>();

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
        
        Vecindad<Integer> v1=new Vecindad<Integer>();
        Vecindad<Integer> v2=new Vecindad<Integer>();
        Vecindad<Integer> v3=new Vecindad<Integer>();
        Vecindad<Integer> v4=new Vecindad<Integer>();
        Vecindad<Integer> v5=new Vecindad<Integer>();
        Vecindad<Integer> v6=new Vecindad<Integer>();
        Vecindad<Integer> v7=new Vecindad<Integer>();
        Vecindad<Integer> v8=new Vecindad<Integer>();
        Vecindad<Integer> v9=new Vecindad<Integer>();
        Vecindad<Integer> v10=new Vecindad<Integer>();
        Vecindad<Integer> v11=new Vecindad<Integer>();
        Vecindad<Integer> v12=new Vecindad<Integer>();
        Vecindad<Integer> v13=new Vecindad<Integer>();

        //fichassssssss
        Ficha<Integer> f1= new Ficha<Integer>(0);
        Ficha<Integer> f2= new Ficha<Integer>(0);
        Ficha<Integer> f3= new Ficha<Integer>(0);
        Ficha<Integer> f4= new Ficha<Integer>(0);
        Ficha<Integer> f5= new Ficha<Integer>(0);
        Ficha<Integer> f6= new Ficha<Integer>(0);    
        Ficha<Integer> f7= new Ficha<Integer>(0); 
        Ficha<Integer> f8= new Ficha<Integer>(0);
        Ficha<Integer> f9= new Ficha<Integer>(0);
        Ficha<Integer> f10= new Ficha<Integer>(0);
        Ficha<Integer> f11= new Ficha<Integer>(0);
        Ficha<Integer> f12= new Ficha<Integer>(0);
        Ficha<Integer> f13= new Ficha<Integer>(0);
        //casillasssssssssssssssssss
        try {
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
            System.out.println("c ANTES  "+c11.GetFicha().GetValor());
            regla.PonerNumero(1,f11,c11);
            System.out.println("c DESPUES "+c11.GetFicha().GetValor());
            System.out.println("c ANTES  "+c4.GetFicha().GetValor());
            regla.PonerNumero(3,f4,c4);
            System.out.println("c DESPUES "+c4.GetFicha().GetValor());
            System.out.println("c ANTES  "+c6.GetFicha().GetValor());
            regla.PonerNumero(5,f6,c6); 
            System.out.println("c DESPUES "+c6.GetFicha().GetValor());
            System.out.println("c ANTES  "+c13.GetFicha().GetValor());
            regla.PonerNumero(2,f13,c13); 
            System.out.println("c DESPUES "+c13.GetFicha().GetValor());
            System.out.println("c ANTES  "+c8.GetFicha().GetValor());
            regla.PonerNumero(3,f8,c8);
            System.out.println("c DESPUES "+c8.GetFicha().GetValor());
            System.out.println("c ANTES  "+c12.GetFicha().GetValor());
            regla.PonerNumero(5,f12,c12);
            System.out.println("c DESPUES "+c12.GetFicha().GetValor());
            System.out.println("c ANTES  "+c11.GetFicha().GetValor());
            regla.PonerNumero(4,f5,c10);
            System.out.println("c DESPUES "+c12.GetFicha().GetValor());
            
        }catch (ExceptionFicha e) {
            System.out.println("Por favor colocar la ficha correctamente");
        }catch (ExceptionNumber e){
            System.out.println("Por favor colocar el number correctamente");

        }
    }
}
class ExceptionFicha extends Exception{
    public String toString(){
        return "Casilla is not avaliable to set ficha";
    }

}

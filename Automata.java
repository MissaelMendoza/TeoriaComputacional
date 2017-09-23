//Missael Alberto Mendoza Acosta 140051
//aa(abc*)*
//Características: El automata tiene una cadena válida ya definida, en este caso es aaabccc 
//Lógica: Para cada estado se definió una clase, en dicha clase se válida para que se recorra la cadena y de esta manera,determinar
//si el caracter es válido para el estado correspondiente. Para este ejemplo la letra c entra en un estado de recursividad y de
//esta manera permite ingresar cualquier cantidad de 'c'.
package automata;

public class Automata {
    int x=0;
    char [] letra;
    boolean validacion;

    public static void main(String[] args) {
                 
        String cadena ="aaabccc";
        Automata ob = new Automata();           
        ob.letra = cadena.toCharArray();
        ob.q0();
        if(ob.validacion)
             System.out.println("aceptacion");
        else System.out.println("no aceptacion");
    }
  
   public void q0(){
       System.out.println("En q0");
       validacion=false;
    if(x<letra.length){
       if(letra[x]=='a'){
            x++;
            q1();
       }else if(letra[x]=='b'){
           x++; 
           Error();
       }
       else if(letra[x]=='c'){
           x++; 
           Error();
       }
    }
   
   }
   public void q1(){
    System.out.println("En q1");
    validacion=false;
    if(x<letra.length){
       if(letra[x]=='a'){
            x++;
            q2();
       }else if(letra[x]=='b'){
           x++; 
           Error();
       }
       else if(letra[x]=='c'){
           x++; 
           Error();
       }
    }
     
   }
   public void q2(){
     validacion=true;
    if(x<letra.length){
       if(letra[x]=='a'){
            x++;
            q3();
       }else if(letra[x]=='b'){
           x++; 
           Error();
       }
       else if(letra[x]=='c'){
           x++; 
           Error();
       }
    }
   
   }
   public void q3(){
     System.out.println("En q3 ");
   validacion=false;
    if(x<letra.length){
       if(letra[x]=='a'){
            x++;
            Error();
       }else if(letra[x]=='b'){
           x++; 
           q4();
       }
       else if(letra[x]=='c'){
           x++; 
           Error();
       }
    }
   
   }
      public void q4(){
           System.out.println("En q4 ");
    validacion=true;
    if(x<letra.length){
       if(letra[x]=='a'){
            x++;
            Error();
       }else if(letra[x]=='b'){
           x++; 
           Error();
       }
       else if(letra[x]=='c'){
           x++; 
           q4();
       }
    }
   }
    
   public void Error(){
   System.out.println("Error");
   validacion = false;
   return ;
   }
  

   }
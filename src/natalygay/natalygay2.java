package natalygay;
import java.util.*;
public class natalygay2 {
    static String nombre ;
    static int N1,N2,R,op,ops;
    static Scanner sc = new Scanner (System.in);
    public static void main(String[]agrs){
     System.out.println("ingrese su nombre");
     nombre=sc.nextLine();
     System.out.println("ingresar su genero");
     System.out.println("1.hombre    2.mujer");
     op=sc.nextInt();
        do{
            if(op!=2){
             System.out.println("bienvenido "+nombre+" a nuestra base de operaciones");
             System.out.println("1.suma");
             System.out.println("2.resta");
             System.out.println("3.multiplicacion");
             System.out.println("4.divicion");
             System.out.println("5.salir");
             System.out.println("eliga la opcion a realizar");
             ops=sc.nextInt();            
            }else{
             System.out.println("bienvenida "+nombre+" a nuestra base de operaciones");
             System.out.println("1.suma");
             System.out.println("2.resta");
             System.out.println("3.multiplicacion");
             System.out.println("4.divicion");
             System.out.println("5.salir");
             System.out.println("eliga la opcion a realizar");
             ops=sc.nextInt();
            }
         switch(ops){
         case 1 -> suma ();
         case 2 -> resta();
         case 3 -> multiplicacion();
         case 4 -> divicion ();
         case 5 -> salir ();
        }
        }while(ops!=5);
    }    
    static void suma(){
        System.out.println("ingresar un digito");
        N1=sc.nextInt();
        System.out.println("ingresar segundo digito");
        N2=sc.nextInt();
        R=N1+N2;
        System.out.println("el resultado de la suma es "+R);
    }
    static void resta (){
        System.out.println("ingresar un digito");
        N1=sc.nextInt();
        System.out.println("ingresar segundo digito");
        N2=sc.nextInt();
        R=N1-N2;
        System.out.println("el resultado de la resta es "+R);
    }
    static void multiplicacion(){
        System.out.println("ingresar un digito");
        N1=sc.nextInt();
        System.out.println("ingresar segundo digito");
        N2=sc.nextInt();
        R=N1*N2;
        System.out.println("el resultado de la multiplicacion es "+R);
    }
    static void divicion(){
        System.out.println("ingresar un digito");
        N1=sc.nextInt();
        System.out.println("ingresar segundo digito");
        N2=sc.nextInt();
        R=N1/N2;
        System.out.println("el resultado de la divicion es "+R);
    }
     static void salir(){
     System.out.println("gracias por usar el programa vuelve pronto");
    }
}
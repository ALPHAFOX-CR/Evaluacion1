
package Vista;

import Modelo.Banco;
import java.util.Scanner;


public class ClasePrincipal {

  
    public static void main(String[] args) {
        
        Scanner punto = new Scanner (System.in);
        Banco c = new Banco();
        int op;
        do{
        System.out.println("1. CREAR BANCO. ");
        System.out.println("2. CREAR SEDES BANCARIAS. ");
        System.out.println("3. CONSULTAR SEDES BANCARIAS. ");
        System.out.println("4. CONSULTAR CUENTAS. ");
        System.out.println("0. SALIR.");
        System.out.println("-------------------------------------------------------------");
        System.out.print("ESCOJA EL NUMERO QUE DESEA REALIZAR : ");
        op = punto.nextInt();
       
            switch (op) {
                case 1:
                    System.out.print(Banco.CrearBanco());
                    break;
                case 2:
                    System.out.print(Banco.CrearSede());
                    break;
                case 3:
                    System.out.print(Banco.CrearSede());
                    break;
                case 4:
                    System.out.print(Banco.CrearCuentas());
                    break;
                default:
                    break;
            }
        
    }while(op != 0);
    }
    
}

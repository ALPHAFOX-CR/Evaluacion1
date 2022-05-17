
package Modelo;
import java.util.Scanner;

public class Banco {
    
    private String Nombre;
    private String NombreSede;
    private String Direccion;
    private String Ciudad;
    private int NoCuenta;
    private String TipoCuenta;
    private int SaldoInicial;
    private String TitularCuenta;
    private int Cedula;
    private String Sexo;
    
    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getNombreSede() {
        return NombreSede;
    }
    public void setNombreSede(String NombreSede) {
        this.NombreSede = NombreSede;
    }
    public String getDireccion() {
        return Direccion;
    }
    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    public String getCiudad() {
        return Ciudad;
    }
    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    public int getNoCuenta() {
        return NoCuenta;
    }
    public void setNoCuenta(int NoCuenta) {
        this.NoCuenta = NoCuenta;
    }
    public String getTipoCuenta() {
        return TipoCuenta;
    }
    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }
    public int getSaldoInicial() {
        return SaldoInicial;
    }
    public void setSaldoInicial(int SaldoInicial) {
        this.SaldoInicial = SaldoInicial;
    }
    public String getTitularCuenta() {
        return TitularCuenta;
    }
    public void setTitularCuenta(String TitularCuenta) {
        this.TitularCuenta = TitularCuenta;
    }
    public int getCedula() {
        return Cedula;
    }
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    public String getSexo() {
        return Sexo;
    }
    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }
    
    public static String CrearBanco(){
        String NomBanco;
        Scanner Crear = new Scanner(System.in);
            System.out.print("ESCRIBA EL NOMBRE DEL BANCO : ");
            NomBanco = Crear.nextLine();
    return "";
    }
    
    public static String CrearSede(){
        
        Scanner Crear = new Scanner(System.in);
        int N;
        System.out.print("DIGITE LA CANTIDAD DE SEDES QUE DESEA ABRIR : ");
        N = Crear.nextInt();
        String[] NombreSede = new String[N];
        String[] Direccion = new String[N];
        String[] Ciudad = new String[N];
            
        for(int i = 0; i < N; i++){
            System.out.println("-----------------------------------");
            System.out.print("DIGITE EL NOMBRE DE LA SEDE : ");
            NombreSede[i] = Crear.next();
            System.out.print("DIGITE LA DIRECCION DE LA SEDE : ");
            Direccion[i] = Crear.next();
            System.out.print("DIGITE LA CIUDAD DE LA SEDE : ");
            Ciudad[i] = Crear.next();
            System.out.println("-----------------------------------");
        }
            System.out.println(" ------------ SEDE ABIERTAS ------------ ");
        
        for(int i = 0; i < N; i++){
            System.out.println("NOMBRE DE LA SEDE " +(i + 1)+ " : " + NombreSede[i]);
            System.out.println("DIRECCION DE LA SEDE " +(i + 1)+ " : " + Direccion[i]);
            System.out.println("CIUDAD DE LA SEDE " +(i + 1)+ " : " + Ciudad[i]);
            System.out.println("-----------------------------------");
        }
            
    return "";
    }
    
    public static String CrearCuentas(){
        Scanner Crear = new Scanner(System.in);
        int N;
        
        System.out.println("----- MAXIMO DE CUENTAS 10 -----");
        
        System.out.print("DIGITE LA CANTIDAD DE CUENTAS QUE DESEA ABRIR : ");
        N = Crear.nextInt();
        
        String[] TitularCuenta = new String[N];
        int[] Cedula = new int[N];
        String[] Sexo = new String[N];
        String[] TipoCuenta = new String[N];
        int[] NoCuenta = new int[N];
        int[] SaldoInicial = new int[N];
        
        for(int i = 0; i < N; i++){
            System.out.println("--------------------------------------------------------------");
            System.out.print("DIGITE EL NOMBRE DEL TITULAR DE LA CUENTA : ");
            TitularCuenta[i] = Crear.next();
            System.out.print("DIGITE LA CEDULA DEL TITULAR DE LA CUENTA : ");
            Cedula[i] = Crear.nextInt();
            System.out.print("DIGITE EL SEXO DEL TITULAR DE LA CUENTA : ");
            Sexo[i] = Crear.next();
            System.out.print("DIGITE EL TIPO DE CUENTA QUE DESEA ABRIR (AHORRO O CORRIENTE) : ");
            TipoCuenta[i] = Crear.next();
            System.out.print("DIGITE EL NUMERO DE CUENTA : ");
            NoCuenta[i] = Crear.nextInt();
            System.out.print("DIGITE EL SALDO INICIAL DE LA CUENTA : ");
            SaldoInicial[i] = Crear.nextInt();
            System.out.println("--------------------------------------------------------------");
        }
        
            System.out.println("----- CUENTAS ABIERTAS -----");
            
            
        for(int i = 0; i < N; i++){
            
            System.out.println("            |" +(i + 1)+ "|        ");
            System.out.println("NOMBRE DEL TITULAR " +(i + 1)+ " : " + TitularCuenta[i]);
            System.out.println("CEDULA DEL TITULAR " +(i + 1)+ " : " + Cedula[i]);
            System.out.println("SEXO DEL TITULAR " +(i + 1)+ " : " + Sexo[i]);
            System.out.println("TIPO DE LA CUENTA " +(i + 1)+ " : " + TipoCuenta[i]);
            System.out.println("NUMERO DE LA CUENTA " +(i + 1)+ " : " + NoCuenta[i]);
            System.out.println("SALDO INICIAL DE LA CUENTA " +(i + 1)+ " : " + SaldoInicial[i]);
            System.out.println("--------------------------------------------------------------");
        }
        return "";
    }
    
}


package javaapplication5;


public class JavaApplication5 {
    
    private static int cantidadjugadores;
    private static String mejorjugador;
    private static String peorjudador;
    private static int añosdelequipo;
    
    JavaApplication5(){
    }

    public static int getCantidadjugadores() {
        return cantidadjugadores;
    }

    public static void setCantidadjugadores(int aCantidadjugadores) {
        cantidadjugadores = aCantidadjugadores;
    }

    public static int getAñosdelequipo() {
        return añosdelequipo;
    }

    
    public static void setAñosdelequipo(int aAñosdelequipo) {
        añosdelequipo = aAñosdelequipo;
    }

   

   
    public static String getMejorjugador() {
        return mejorjugador;
    }

  
    public static void setMejorjugador(String aMejorjugador) {
        mejorjugador = aMejorjugador;
    }

    public static String getPeorjudador() {
        return peorjudador;
    }

    
    public static void setPeorjudador(String aPeorjudador) {
        peorjudador = aPeorjudador;
        
    }
   
    public void partido(){
    System.out.println("Cuantos jugadores hay");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miproyecto_;

/**
 *
 * @author ArnauMB
 */
public class Ex03_Penjat {
    
    public static void main(String[] args) {
        final String[] paraules = {"patata","armari","bicicleta","advocat","ascensor","astronauta","autopista","avinguda","bigoti","carretera"};
        final char[][] estatPenjatInicial =
        {
          {' ',' ',' ',' ','_','_','_','_',' ',' ',' ',' '},                                      
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' '},
          {' ','_','_','|','_',' ',' ',' ',' ',' ',' ',' '},                                      
          {'|',' ',' ',' ',' ','|','_','_','_','_','_',' '},
          {'|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
          {'|','_','_','_','_','_','_','_','_','_','_','|'}
         };        
        //mostrarEstatPenjat(estatPenjatInicial);
        
            char [][] estatPenjat= new char[estatPenjatInicial.length][estatPenjatInicial[0].length];
            inicialitzarEstatPenjat(estatPenjatInicial,estatPenjat);
            int index= (int)(Math.random()*paraules.length);
            String paraula=paraules[index];
            int totalErrors=0;
            int totalEncerts=0;
            boolean[] lletresEncertades = new boolean[paraula.length()];
            String lletres="";
        do{
            
                    
        }while(totalEncerts<paraula.length() && totalErrors<MAXIMINTENTS);
    }
    
    
    static void mostrarEstatPenjat(char[][] estat) {
        for(char[]fila : estat){
            for(char valor : fila){
                System.out.println(valor);
            }
            System.out.println("");
        }
    }
    
    static void inicialitzarEstatPenjat(char[][] estatPenjatIni, char[][] estat) {
        for(int i=0; i<estatPenjatIni.length; i++){
            for(int j=0; j<estatPenjatIni[0].length; j++){
                estat[i][j]=estatPenjatIni[i][j];
            }
        }
    }
    
    static void mostrarParaula(String paraula, boolean[] encertades) {
        
    }
    
    static void mostrarLletresIntroduides(String lletres) {
        
    }
    
    static String demanarLletra(String lletres) {
    
    }
    
    static boolean existeixLletra(String lletres, char lletra) {
    
    }
    
    static void actualitzarEstatPenjat(char[][] penjat,int errors) {
        
    }
    
    static void netejaPantalla() {
    
    }
    

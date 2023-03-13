/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miproyecto_;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author ArnauMB
 */
public class Ex03_Penjat {
    public static int MAXINTENTS = 8;
    public static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        final char[][] penjat = {
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
   
        String[] palabras = {"patata","armari","bicicleta",
                            "advocat","ascensor","astronauta","autopista",
                            "avinguda","bigoti","carretera","castanya",
                            "cervell","civada","cultura","dentista","esquena",
                            "estrella","formatge","gendre","genoll",
                            "infermera","internet","maduixa","malaltia",
                            "maluc","mandarina","maquinista","motocicleta",
                            "nebot","pastanaga","patinet","perruqueria",
                            "pissarra","professor","quadrat","taronja",
                            "tramvia","trapezi","tricicle","violeta"};
        
        String linea = null, palabra = palabras[(int) (Math.random()*palabras.length)];
        int i, n = palabra.length(), turnos = 0, totalEncerts = 0;
        char letra = 0, caracter;
        char[] casillas = new char[n];
        boolean encontrado;
        String letras="";
        mostrarParaulaEnAsteriscos(casillas);
        mostrarEstatPenjat(penjat);
        do {
            System.out.println("\nOportunitats restants: " + (MAXINTENTS-turnos));
            System.out.print("Paraula: ");
            mostrarParaula(casillas);
            System.out.print("\nLletres: "+letras);
            do{
                System.out.print("\nIntrodueix lletra: ");
                linea= demanarLletra(linea);
                letra = linea.charAt(0);
                if (letras.contains(String.valueOf(letra))) {
                System.out.print("Lletra repetida! Si us plau, introdueix una lletra nova.");
                }
            } while (letras.contains(String.valueOf(letra)));
            letras+=letra;
            encontrado = false;
            for(i=0; i<n; i++) {
                caracter = palabra.charAt(i);
                if(Character.toUpperCase(letra)==Character.toUpperCase(caracter)) {
                    encontrado = true;
                    if(casillas[i]=='*') {
                        casillas[i] = caracter;
                        totalEncerts++;
                    }
                }
            }
            if(!encontrado) {
                turnos++;
                System.out.println("Letra no encontrada.");
                actualitzarEstatPenjat(penjat,turnos);
            }
            mostrarEstatPenjat(penjat);
            netejaPantalla();
        } while(turnos<MAXINTENTS&&totalEncerts<n);
        if(totalEncerts==n)
            System.out.println("Felicitats, has guanyat");
        else
            System.out.println("OOOOOoooohhhh! Has perdut!!");
        System.out.println("La paraula secreta era: " + palabra );                            
    }
    
    static void mostrarEstatPenjat(char[][] estat) {
        
        for (char[] fila : estat) {
            for (char valor : fila) {
                System.out.print(valor);
            }
            System.out.println("");
        }  
    }

    static void mostrarParaulaEnAsteriscos(char[] casillas) {
        
        for(int i=0; i<casillas.length; i++)
            casillas[i] = '*';  
    }
        
    static void mostrarParaula(char[] casillas) {
        
        for(int i=0; i<casillas.length; i++)
                System.out.print(" " + casillas[i]);   
    }
    
     static String demanarLletra(String linea) {
        
        linea = teclado.nextLine();
        return linea;
    }
    
    static void actualitzarEstatPenjat(char[][] penjat,int errors) {
        switch(errors-1) {
                case 0:
                        penjat[1][8]='|';
                        break;
                case 1:
                        penjat[2][8]='O';
                        break;
                case 2:
                        penjat[3][8]='|';
                        break;
                case 3:
                        penjat[3][7]='/';   
                        break;
                case 4:
                        penjat[3][9]='\\';
                        break;
                case 5:
                        penjat[4][8]='|';
                        break;
                case 6:
                        penjat[5][7]='/';
                        break;
                case 7:
                        penjat[5][9]='\\';
                        break;
                default:
                    break;
                }
    }
    
    static void netejaPantalla() {
           try {
  		if (System.getProperty("os.name").contains("Windows")) {
    		  new ProcessBuilder("cmd", "/c", "cls").
                          inheritIO().start().waitFor();
  		} else {
    	    		System.out.print("\033[H\033[2J");
    			System.out.flush();
  		}
            } catch (IOException | InterruptedException ex) {}
    }
}

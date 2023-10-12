/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo7_strings;

/**
 *
 * @author ricardo
 */
public class Exemplo7_strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String metade1;
    String metade2;
    String total;
    
    metade1="corona";
    System.out.println(metade1);
    
    metade2="virus";
    System.out.println(metade2);
    
    total=metade1+metade2;//total é concatenação de metade e metade 2
    System.out.println(total);
    
    int c=total.length();
    System.out.println(c);
    
    String pequenina=total.substring(3, 7);
    System.out.println(pequenina);
    
    String depois=total.replaceAll("ona","ina");
    System.out.println(depois);
    
    int igual=depois.compareToIgnoreCase("corinavirus");
    System.out.println(igual);
    
    int indice=depois.indexOf("ina");
    System.out.println(indice);
    
    depois=depois.toUpperCase();
    System.out.println(depois);
    
    }
    
}

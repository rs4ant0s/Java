/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplo4_input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ricardo
 */
public class Exemplo4_input {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
    InputStreamReader inputStreamReader = new InputStreamReader (System.in);
    BufferedReader reader = new BufferedReader (inputStreamReader);
    System.out.println("Indique primeiro valor:");
    int valor = Integer.parseInt(reader.readLine());
    System.out.println("Indique segundo valor:");
    int valor2 = Integer.parseInt(reader.readLine());
    System.out.println("A soma é");
    System.out.println(valor+valor2);
    
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin22;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Adri
 */
public class Lectura {

    public static ArrayList<String> leerLinea(int palabras) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> texto = new ArrayList<>();
        System.out.println("Teclea palabra: ");
        try {
            for (int i = 0; i < palabras; i++) {
                texto.add(br.readLine());
            }
        } catch (IOException ex) {
            ex.getMessage();
        }
        Collections.sort(texto);
        return texto;
    }

    public static void leerArrayList(ArrayList<String> array) {
        for (String palabra : array) {
            System.out.println(palabra);
        }
    }

    public static void escribirFichero(ArrayList<String> array, String nombreFichero) {

        File fichero = new File(nombreFichero);
        PrintWriter p = null;
        int i = 0;
        try {
            p = new PrintWriter(fichero);
            for (String palabra : array) {
                i++;
                p.println(Integer.toString(i)+ ". " + palabra);
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            p.close();
        }

    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3.p01.gestormusica;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Juan
 */
public class GestorMusica {

  /**
   * Atribut Scanner, compartit per tots els mètodes de la classe
   */
  private final Scanner scanner = new Scanner(System.in);
  /**
   * Ruta de l'arxiu csv amb la biblioteca musical
   */
  private String arxiuBiblioteca;
  /**
   * ArrayList amb les dades de les cançons que formen la biblioteca
   */
  private ArrayList<Canço> llista;

  /**
   * Constructor de la classe. Inicialitza els atributs de la classe. Obre
   * l'arxiu csv indicat com a paràmetre amb les dades de la biblioteca i amb
   * les dades de cada línia crea una instància de Canço i l'afegeix a l'atribut
   * llista de la classe.
   *
   * @param arxiuBiblioteca la ruta de l'arxiu amb les dades de la biblioteca,
   * on cada línia conté les dades d'una de les cançons, amb el format:
   * autor;titol;ruta_absoluta_de_l'arxiu 
   * Per exemple: 
   * Dire Straits;Sultans Of Swing;C:\Users\Juan\Music\Musica\DireStraits-GreatestHitsEssential\cd1\01 - Sultans Of Swing.mp3
   */
  public GestorMusica(String arxiuBiblioteca) {
  }

  /**
   * Mètode principal que inicia l'execució de la instància de GestorMusica.
   * Mostra un menú d'opcions i executar l'opció triada fins que aquest 
   * seleccioni l'opció de finalitzar, moment en el qual s'hauran de salvar
   * les dades de la biblioteca a l'arxiu CSV, amb els canvis que s'hagin
   * produït durant l'execució (canvis a les etiquetes ID3 i/o addició de
   * nous arxius trobats en escanejar directoris
   */
  public void iniciar() {

  }

  /**
   * Classe que permet gestionar una biblioteca de música. Mostra un menú a
   * l'usuari amb opcions per cercar a un directori tots els arxius mp3 per
   * afegir-los a la biblioteca, editar les etiquetes ID3 dels arxius i
   * reproduir arxius de la biblioteca. 
   * Es pot executar la classe directament des de Netbeans, però per tal de que 
   * la visualització sigui la correcta (a la consola de Netbeans el mètode 
   * d'esborrar pantalla no funciona correctament), es recomana executar-la des 
   * d'un terminal de Windows (cmd.exe) o de GNU/Linux. Un cop obert el terminal, 
   * s'ha de canviar al directori arrel del projecte i executar: 
   * 
   *    java -classpath .\build\classes;.\lib\jline-3.9.0.jar;.\lib\jlayer-1.0.1.jar;.\lib\jansi-1.18.jar m03.uf3.p01.gestormusica.GestorMusica ruta_arxiu_csv
   *
   * @param args com a únic paràmetre, se li ha de proporcionar la ruta de
   * l'arxiu csv amb les dades de la biblioteca.
   */
  public static void main(String[] args) {
    if (args.length != 1) {
      System.out.println("Ús: GestorMusica nom_arxiu.csv");
    } else {
      GestorMusica gestor = new GestorMusica(args[0]);
      gestor.iniciar();
    }
  }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3.p01.gestormusica;

/**
 *
 * @author Juan
 */

/**
 * Classe de prova, per verificar el funcionament del reproductor de música.
 * Per executar la prova, primer cal modificar les dades de la canço i la ruta
 * de l'arxiu corresponent a la línia del mètode main on es crea la instància de
 * Canço i seguidament compilar el projecte (F11).
 * Es pot executar la classe directament des de Netbeans, però per tal de que la 
 * visualització sigui la correcta (a la consola de Netbeans el mètode d'esborrar
 * pantalla no funciona correctament), es recomana executar-la des d'un terminal
 * de Windows (cmd.exe) o de GNU/Linux. Un cop obert el terminal, s'ha de canviar
 * al directori arrel del projecte i executar:
 * 
 * java -classpath .\build\classes;.\lib\jline-3.9.0.jar;.\lib\jlayer-1.0.1.jar;.\lib\jansi-1.18.jar m03.uf3.p01.gestormusica.ProvaReproductor
 * 
 * @author Juan
 */
public class ProvaReproductor {
  public static void main(String[] args) {
    Canço canço = new Canço("Dire Straits", "Sultans of swing",
      "F:/Dropbox/Moduls/DAM/M03/UF3/m03.uf3.p01.GestorMusica/01 - Sultans Of Swing.mp3");
    Reproductor reproductor = new Reproductor(canço);
    reproductor.reproduir();
  }
}

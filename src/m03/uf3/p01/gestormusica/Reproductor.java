/* * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m03.uf3.p01.gestormusica;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

/**
 *
 * @author Juan
 */
public class Reproductor {

  private boolean stop = false;
  private Player player;
  private Canço canço;

  /**
   * Constructor de la classe. Crea una instància del reproductor i la inicialitza
   * amb el paràmetre canço. No inicia la reproducció immediatament, s'haurà de
   * crida al mètode {@link #reproduir() reproduir}.
   * @param canço la instància de Canço a reproduir
   */
  public Reproductor(Canço canço) {
    this.canço = canço;
    try {
      player = new Player(new FileInputStream(canço.getArxiu()));
    } catch (FileNotFoundException ex) {
      System.out.println("ERROR: no s'ha trobat l'arxiu: " + canço.getArxiu());
    } catch (JavaLayerException ex) {
      System.out.println("ERROR: no s'ha pogut crear el reproductor");
    }
  }

  /**
   * Inicia la reproducció de la cançó proporcionada al constructor.
   * La reproducció es pot aturar en qualsevol moment prement alguna tecla.
   * Durant la reproducció es mostren les dades de la canço i un comptador del 
   * temps de reproducció.
   */
  public void reproduir() {
    new Thread() {
      public void run() {
        int segons, segonAnt = -1;
        try {
          while (!stop) {
            segons = player.getPosition() / 1000;
            if (segons > segonAnt) {
              Utils.netejaPantalla();
              System.out.println("Reproduint: " + canço);
              System.out.printf("%02d:%02d%n", segons / 60, segons % 60);
              System.out.println("Prem qualsevol tecla per finalitzar la reproducció");
              segonAnt = segons;
            }
            player.play(1);
          }
        } catch (JavaLayerException e) {
          System.out.println("Error al reproductor: " + e.getMessage());
        }
        player.close();
      }
    }.start();
    Utils.pausaFinsTecla();
    stop = true;
  }
}

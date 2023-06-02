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
public class Canço {
  private String titol;
  private String autor;
  private String arxiu;

  /**
   * Constructor de la classe
   * @param autor
   * @param titol
   * @param arxiu 
   */
  public Canço(String autor, String titol, String arxiu) {
    this.titol = titol;
    this.autor = autor;
    this.arxiu = arxiu;
  }
  
  // Getters i setters
  public String getTitol() {
    return titol;
  }

  public void setTitol(String titol) {
    this.titol = titol;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getArxiu() {
    return arxiu;
  }

  public void setArxiu(String arxiu) {
    this.arxiu = arxiu;
  }

  @Override
  public String toString() {
    return autor + " - " + titol + " - " + arxiu;
  }
  
  
}

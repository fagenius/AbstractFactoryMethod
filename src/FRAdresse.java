/*
 * FRAdresse.java
 */

/**
 * Adresse française (Concrete Product)
 */
public class FRAdresse extends AbstractAdresse {
  private static final String PAYS = "FRANCE";
  
  public String getCountry() {
    return PAYS;
  }
  
  public String toString() {
    return getRue() + EOL + getCodePostal() + " " + getVille() + EOL + PAYS + EOL;
  }
  
}

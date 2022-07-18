/*
 * USAdresse.java
 */

/**
 * Adresse américaine (Concrete Product)
 */
public class USAdresse extends AbstractAdresse {
  private static final String PAYS = "USA";
  
  public String getCountry() {
    return PAYS;
  }
  
  public String toString() {
    return getRue() + EOL + getVille() + ", " + getRegion() + " " + getCodePostal() + EOL + PAYS + EOL;
  }
  
}

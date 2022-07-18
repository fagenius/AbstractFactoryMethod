/*
 * USAdresse.java
 */

/**
 * Adresse am�ricaine (Concrete Product)
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

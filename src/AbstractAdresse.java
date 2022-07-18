/*
 * Adresse.java
 */

/**
 * Adresse abstraite (AbstractProduct)
 */
public abstract class AbstractAdresse {
  private String rue;
  private String ville;
  private String region;
  private String codePostal;
  
  public static final String EOL = System.getProperty("line.separator");
  
  public String getRue() {
    return this.rue;
  }
  
  public String getVille() {
    return this.ville;
  }
  
  public String getCodePostal() {
    return this.codePostal;
  }
  
  public String getRegion() {
    return this.region;
  }
  
  public abstract String getCountry();
  
  public void setRue(String valeur) {
    this.rue = valeur;
  }
  
  public void setVille(String valeur) {
    this.ville = valeur;
  }
  
  public void setRegion(String valeur) {
    this.region = valeur;
  }
  
  public void setCodePostal(String valeur) {
    this.codePostal = valeur;
  }
  
  public String toString() {
    return getRue() + EOL + getVille() + " " + getCodePostal() + EOL;
  }
  
}

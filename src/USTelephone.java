/*
 * USTelephone.java
 */

/**
 * Téléphone américian (Concrete Product)
 */
public class USTelephone extends AbstractTelephone {
  private static final String CODE_REGIONAL = "1";
  private static final int N_DIGITS = 10;
  
  public String getCodeRegional() {
    return CODE_REGIONAL;
  }
  
  public void setNumero(String valeur){
    if (valeur.length() == N_DIGITS){
      super.setNumero(valeur);
    }
  }
  
  public String toString() {
    String num = getNumero();
    return "(" + getCodeRegional() + ") "
            + num.substring(0, 3) + "-"
            + num.substring(3, 6) + "-"
            + num.substring(6, 10);
  }
  
}

/*
 * FRTelephone.java
 */

/**
 * Téléphone français (Concrete Product)
 */
public class FRTelephone extends AbstractTelephone {
  
  private static final String CODE_REGIONAL = "33";
  private static final int N_DIGITS = 9;
  
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
    return getCodeRegional() + "."
            + "0" + num.charAt(0) + "."
            + num.substring(1, 3) + "."
            + num.substring(3, 5) + "."
            + num.substring(5, 7) + "."
            + num.substring(7, 9);
  }
  
}

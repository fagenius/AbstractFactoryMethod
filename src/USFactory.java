/*
 * USFactory.java
 */

/**
 * Factory d'adresses et téléphones américains (Concrete Factory)
 */
public class USFactory extends AbstractFactory {
  
  public AbstractAdresse createAdresse() {
    return new USAdresse();
  }
  
  public AbstractTelephone createTelephone() {
    return new USTelephone();
  }

  public AbstractDrapeau createDrapeau() {
    return new USDrapeau();
  }

}

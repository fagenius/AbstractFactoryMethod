/*
 * FRFactory.java
 */

/**
 * Factory d'adresses et téléphones français (Concrete Factory)
 */
public class FRFactory extends AbstractFactory {
  
  public AbstractAdresse createAdresse() {
    return new FRAdresse();
  }
  
  public AbstractTelephone createTelephone() {
    return new FRTelephone();
  }

  public AbstractDrapeau createDrapeau() {
    return new FRDrapeau();
  }

}

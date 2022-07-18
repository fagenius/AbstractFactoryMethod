/*
 * FRFactory.java
 */

/**
 * Factory d'adresses et t�l�phones fran�ais (Concrete Factory)
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

/*
 * AbstractFactory.java
 */

/**
 * Abstract Factory
 */
public abstract class AbstractFactory {
  
  // getFactory()
  public static AbstractFactory createFactory(String type) {
    AbstractFactory factory;
    if (type.equalsIgnoreCase("fr")) {
      factory = new FRFactory();
    } else {
      factory = new USFactory();
    }
    return factory;
  }
  
  // Factory Methods
  public abstract AbstractAdresse createAdresse();
  public abstract AbstractTelephone createTelephone();
  public abstract AbstractDrapeau createDrapeau();
  
}

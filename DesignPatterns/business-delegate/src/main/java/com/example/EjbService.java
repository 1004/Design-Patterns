package com.example;

/**
 * 
 * Service EJB implementation
 *
 */
public class EjbService implements BusinessService {

  @Override
  public void doProcessing() {
    System.out.println("EjbService is now processing");
  }
}
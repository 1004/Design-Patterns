package com.example;

/**
 * 
 * Visitor interface.
 * 
 */
public interface UnitVisitor {

  void visitSoldier(Soldier soldier);

  void visitSergeant(Sergeant sergeant);

  void visitCommander(Commander commander);

}
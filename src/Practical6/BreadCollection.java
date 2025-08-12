/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

/**
 *
 * @author USER
 */
public class BreadCollection {
  // (part a)
  public final static String[] BREADTYPE = {
      "Plain", "Wholemeal", "Raisin",
      "Banana", "Corn"
  };
  // (part b)
  public final static int PLAIN = 0;
  public final static int WHOLEMEAL = 1;
  public final static int RAISIN = 2;
  public final static int BANANA = 3;
  public final static int CORN = 4;

  private double costOfFlour;
  private Bread breads[];

  public BreadCollection() throws Exception {
    breads = new Bread[BREADTYPE.length];
    for (int i = 0; i < breads.length; i++) {
      breads[i] = new Bread(BREADTYPE[i]);
    }
  }

  public void initAmountOfFlour() throws Exception {
    breads[PLAIN].setAmtOfFlour(500);
    breads[WHOLEMEAL].setAmtOfFlour(600);
    breads[RAISIN].setAmtOfFlour(300);
    breads[BANANA].setAmtOfFlour(400);
    breads[CORN].setAmtOfFlour(600);
  }

  public Bread getBread(int index) {
    return breads[index];
  }

  public int getNumOfBreads() {
    return breads.length;
  }

  public void setCostOfFlour(double costOfFlour) throws Exception {
    if (costOfFlour < 0)
      throw new Exception("Error setting cost of Flour....");
    else
      this.costOfFlour = costOfFlour;
  }

  public double getCostOfFlour() {
    return costOfFlour;
  }

}

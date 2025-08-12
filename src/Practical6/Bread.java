/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Practical6;

import java.io.Serializable;

/**
 *
 * @author USER
 */
public class Bread implements Serializable {

  private String name;
  private int amtOfFlour;
  private int noOfLoaves;

  public Bread(String name) {
    this.name = name;
    this.amtOfFlour = 0;
    this.noOfLoaves = 0;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAmtOfFlour() {
    return this.amtOfFlour;
  }

  public void setAmtOfFlour(int amtOfFlour) {
    this.amtOfFlour = amtOfFlour;
  }

  public int getNoOfLoaves() {
    return this.noOfLoaves;
  }

  public void setNoOfLoaves(int noOfLoaves) {
    this.noOfLoaves = noOfLoaves;
  }

}

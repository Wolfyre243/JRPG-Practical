package Practical6;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Product implements Serializable {
  private String code;
  private double price;

  public Product(String s, double p) {
    code = s;
    price = p;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String newCode) {
    this.code = newCode;
  }

  public double getPrice() {
    return this.price;
  }

  public void setPrice(double newPrice) {
    this.price = newPrice;
  }

}

public class ProductManager {
  public void saveProduct(Product pdt) {
    File f = new File("product.dat");
    try {
      FileOutputStream fos = new FileOutputStream(f);
      ObjectOutputStream os = new ObjectOutputStream(fos);

      os.writeObject(pdt);
      os.close();

    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

  public Product loadProduct() {
    File f = new File("product.dat");

    try {
      FileInputStream fis = new FileInputStream(f);
      ObjectInputStream ois = new ObjectInputStream(fis);

      Product product = (Product) ois.readObject();
      ois.close();

      return product;

    } catch (FileNotFoundException e) {
      System.out.println("File not found.");
      return null;
    } catch (Exception e) {
      System.out.println("Unknown error.");
      return null;
    }
  }
}

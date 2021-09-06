package com.example.springtest.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//getter and setter method created
@Component //object is created in spring container
public class Alien {

  private int ID;
  private String aName, tech;

  //Alien object doesn't know laptop object is available.
  // To connect Alien and laptop we have to use autowire.
  //Autowire will serach for the object and connect them.
  //Here laptop and alien object arec connected
  @Autowired //Seraches by type.
  //For now i will use autowire
  // @Qualifier("lap1") //searches by name
  private Laptop laptop; //laptop class

  //Alien is dependent on laptop class

  public Alien() {
    super();
    System.out.println("obj created");
  }

  public int getID() {
    return ID;
  }

  public void setID(int iD) {
    this.ID = iD;
  }

  public String getaName() {
    return aName;
  }

  public void setaName(String aName) {
    this.aName = aName;
  }

  public String getTech() {
    return tech;
  }

  public void setTech(String tech) {
    this.tech = tech;
  }

  public Laptop getLaptop() {
    return laptop;
  }

  public void setLaptop(Laptop laptop) {
    this.laptop = laptop;
  }

  public void show() {
    System.out.println("Hi Vikash!");
    laptop.laptopCompile();
  }
}

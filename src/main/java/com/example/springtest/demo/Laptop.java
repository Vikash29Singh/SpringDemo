package com.example.springtest.demo;

import org.springframework.stereotype.Component;

//laptop obj is created
//spring container
// Component instanciate object . Simply means we need an object
// @Component("lap1") //component is created by name
@Component //component has no name
public class Laptop {

  private int lID;
  private String lname;

  public int getlID() {
    return lID;
  }

  public void setlID(int lID) {
    this.lID = lID;
  }

  public String getLname() {
    return lname;
  }

  public void setLname(String lname) {
    this.lname = lname;
  }

  @Override
  public String toString() {
    return "Laptop [lID=" + lID + ", lname=" + lname + "]";
  }

  public void laptopCompile() {
    System.out.println("compile it");
  }
}

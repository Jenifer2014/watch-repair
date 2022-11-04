package Testng;

import org.testng.annotations.Test;

public class groups {
  @Test (groups={"Apple"})
  public void apple1() {
	  System.out.println("I am apple1 i phone");
  }
  @Test (groups={"Apple"})
  public void apple2() {
	  System.out.println("I am apple2 i phone");
  }
  @Test (groups={"Apple"})
  public void apple3() {
	  System.out.println("I am apple3 i phone");
  }
  @Test (groups={"Vivo"})
  public void vivo1() {
	  System.out.println("I am Vivo1 i phone");
  }
  @Test (groups={"Vivo"})
  public void vivo2() {
	  System.out.println("I am Vivo2 i phone");  
  }
  @Test (groups={"Vivo"})
  public void vivo3() {
	  System.out.println("I am Vivo3 i phone");
  }
  @Test (groups={"Samsung"})
  public void samsung1() {
	  System.out.println("I am Samsung i phone");
  }
  @Test (groups={"Samsung"})
  public void samsung2() {
	  System.out.println("I am Samsung2 i phone");
  }
  @Test (groups={"Samsung"})
  public void samsung3() {
	  System.out.println("I am Samsung3 i phone");
  }
  @Test (groups={"MI"})
  public void mi1() {
	  System.out.println("I am MI i phone");
  }
  @Test (groups={"MI"})
  public void mi2() {
	  System.out.println("I am MI2 i phone");
  }
  @Test (groups={"MI"})
  public void mi3() {
	  System.out.println("I am MI3 i phone");
  }
}

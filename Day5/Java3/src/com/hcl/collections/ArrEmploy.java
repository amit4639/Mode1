package com.hcl.collections;

import java.util.ArrayList;
import java.util.List;

public class ArrEmploy {
  /**
   * List interface.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    List lstemploy = new ArrayList();
    lstemploy.add(new Employ(1, "sai", 54986));
    lstemploy.add(new Employ(2, "kumar", 58745));
    lstemploy.add(new Employ(3, "yash", 5498));
    lstemploy.add(new Employ(4, "raghu", 549865));
    for (Object object : lstemploy) {
      Employ e = (Employ)object;
      System.out.println(e);
    }
  }
}

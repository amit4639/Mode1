package com.hcl.ast;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudent {
  /**
   * object input stream.
   * @param args for passing arguments.
   */
  public static void main(String[] args) {
    try {
      FileInputStream fin = new FileInputStream("c:/files/student.txt");
      ObjectInputStream objin = new ObjectInputStream(fin);
      Student d = (Student)objin.readObject();
      System.out.println(d);
      objin.close();
      fin.close();
    } catch (FileNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}

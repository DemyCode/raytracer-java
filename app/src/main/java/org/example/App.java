package org.example;

public class App {
  public static void main(String[] args) {
    Image image = new Image(100, 100);
    image.save_to_ppm_p3("output.ppm");
  }
}

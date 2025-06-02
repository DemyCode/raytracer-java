package org.example;

import java.io.FileWriter;
import java.io.IOException;

public class Image {
  private Integer[][][] pixels;

  public Image(int width, int height) {
    this.pixels = new Integer[height][width][3];
    for (int i = 0; i < height; i++) {
      for (int j = 0; j < width; j++) {
        this.pixels[i][j][0] = 0; // Initialize with black color
        this.pixels[i][j][1] = 0; // Initialize with black color
        this.pixels[i][j][2] = 0; // Initialize with black color
      }
    }
  }

  public Image(Integer[][][] pixels) {
    if (pixels == null || pixels.length == 0 || pixels[0].length == 0 || pixels[0][0].length != 3) {
      throw new IllegalArgumentException("Invalid pixel data");
    }
    this.pixels = pixels;
  }

  // https://my.eng.utah.edu/~cs5610/ppm.html
  public void save_to_ppm_p3(String output_path) {
    try {
      FileWriter writer = new FileWriter(output_path);

      writer.write("P3\n");
      // TODO: Write the pixel values here to the file

      writer.close();
    } catch (IOException e) {
      System.err.println("Error writing to file: " + e.getMessage());
    }
  }
}

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ScoreManipulation {

  private Scanner skener;
  private PrintWriter zapisovac;
  private File subor;

  public ScoreManipulation() {
    subor = new File("scores.txt");
    try {
      skener = new Scanner(subor);
      zapisovac = new PrintWriter(subor);
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e);
      System.out.println("Subor sa nenašiel!!");
    }
  }

  public void writeScore(int paScore) throws IOException {
    if (subor.createNewFile()) {
      try {
        zapisovac.println("História tvojích hier:");
      } catch (Exception e) {
        System.out.println("Error: " + e);
        e.printStackTrace();
      } finally {
        zapisovac.close();
      }
    } else {
      System.out.println("Súbor už existuje!");
    }
    try {
      zapisovac.println(paScore);
    } catch (Exception e) {
      System.out.println("Error: " + e);
      e.printStackTrace();
    } finally {
      zapisovac.close();
    }
  }

  public void readScores() throws IOException {
    try {
      while (skener.hasNextInt()) {
        skener.nextInt();
      }
    } catch (Exception e) {
      System.out.println("Error: " + e);
      System.out.println();
    } finally {
      skener.close();
    }
  }
}

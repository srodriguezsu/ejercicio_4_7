import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        MayorMenor w = new MayorMenor();
        w.setContentPane(w.contentPane);
        w.setSize(500,250);
        w.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        w.setTitle("¿Mayor o menor?");
        w.setVisible(true);
    }
}
package joptionpane02;

import javax.swing.JOptionPane;

public class JOptionPane02 {

    public static void main(String[] args) {
        char ch;
        while (true) {
            ch = JOptionPane.showInputDialog(null, "Izaberite neku od opcija:\n"
                    + "a - povrsina Valjka \n"
                    + "b - koren \n"
                    + "c - funkcija \n"
                    + "k - kraj programa \n").charAt(0);
            if (ch == 'k') {
                JOptionPane.showMessageDialog(null, "Kraj programa");
                break;
            } else {
                switch (ch) {
                    case 'a':
                        povrsinaValjka();
                        break;
                    case 'b':
                        koren();
                        break;
                    case 'c':
                        funkcija();
                        break;
                    default:
                        JOptionPane.showInputDialog(null, "Greska u unosu");
                        continue;

                }

            }

        }

    }

    static void funkcija() {
        int x = Integer.parseInt(JOptionPane.showInputDialog(null, "x = "));
        JOptionPane.showMessageDialog(null, (Math.pow(x, 4) + 5 * Math.pow(x, 2) - 7));

    }

    static void povrsinaValjka() {
        double r = Double.parseDouble(JOptionPane.showInputDialog(null, " r = "));
        double H = Double.parseDouble(JOptionPane.showInputDialog(null, " H= "));
        double Pb = 2 * Math.pow(r, 2) * Math.PI;
        double Pom = 2 * r * Math.PI * H;

        JOptionPane.showMessageDialog(null, "Povrsina valjka je: " + (2 * Pb + Pom));

    }

    static void koren() {
        double x = Double.parseDouble(JOptionPane.showInputDialog(null, " x = "));
        double f = Math.pow(x, 2) + 5 * x - 2;
        if (f < 0) {
            System.out.println("Resenje je kompleksno");
        } else {
            JOptionPane.showMessageDialog(null, "Koren je: " + (Math.sqrt(f) * 100 / 100.0));

        }

    }

}

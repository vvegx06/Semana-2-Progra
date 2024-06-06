/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practsem2;

import javax.swing.JOptionPane;

public class Practsem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nota;
        nota = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su nota:"));
        if (nota >= 70) {
            JOptionPane.showMessageDialog(null, "Usted aprovó");
        }
            if (nota <= 69) {
                JOptionPane.showMessageDialog(null, "Usted reprobó");
            }
         
    }
}
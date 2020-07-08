/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lcs;

/**
 *
 * @author josed
 */
public class LCS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaCirS n =new ListaCirS();
        n.InsertarUltimo(10);
        n.InsertarUltimo(8);
        n.InsertarUltimo(5);
        n.InsertarUltimo(2);
        n.InsertarUltimo(20);
        n.InsertarUltimo(25);
        n.InsertarUltimo(26);
        n.InsertarUltimo(1);
        n.imprimir();
        n.GenerarGraphyz();
    }
    
}

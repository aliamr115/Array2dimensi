/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul202457201010;

import javax.swing.JOptionPane;

/**
 *
 * @author Alia - 202457201010
 */
public class modul202457201010_1 {
    public static void main(String[] args) {
        int data[][] = {{4,6,4,2,8,4,2,10},{4,6,4,2,8,4,2,10}};
        for(int a =0; a<data.length; a++){
            for(int b =0; b<data[a].length; b++){
                System.out.print(data[a][b]+" ");
            }
            System.out.println("");
        }
        System.out.println("----------------------");
        
        int cariBaris = Integer.parseInt(JOptionPane.showInputDialog("Masukkan baris(0-1)"));
        int cariKolom = Integer.parseInt(JOptionPane.showInputDialog("Masukkan kolom(0-7)"));
        
        if(cariBaris >=0 && cariBaris<data.length && cariKolom >=0 && cariKolom <data[cariBaris].length){
           
            int nilai = Integer.parseInt(JOptionPane.showInputDialog("Masukkan nilai dari : ("+cariBaris+","+cariKolom+")"));
            data[cariBaris][cariKolom]=nilai;
            System.out.println("Nilai dari ("+cariBaris+","+cariKolom+") Telah dirubah");
        }else{
            System.out.println("Index atau kolom tidak valid!");
        }
        System.out.println("\nArray setelah dirubah");
        for(int a=0; a<data.length; a++){
            for(int b=0; b<data[a].length; b++){
                System.out.print(data[a][b]+ " ");
            }
            System.out.println("");
        }
        System.out.println("");
        
    }
}

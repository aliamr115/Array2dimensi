/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul202457201010;

/**
 *
 * @author alia-202457201010
 */
public class modul202457201010_3 {
    public static void main(String[] args) {
       String data[][]= {
         {"ABDUL","Kediri","085646668991"},
         {"KUSNO","Trenggalek","085646668992"},
         {"PONIRAN","Bojonegoro","085656668999"}
     };
     
     System.out.print("NAMA\t");
     System.out.print(" ALAMAT\t");
     System.out.print("        TELEPON\t");
     System.out.println("");
     String nama ="";
     
     
      for (int a = 0; a<data.length; a++) { 
            System.out.print(String.format("%-10s",data[a][0]));
            System.out.print(String.format("%-15s",data[a][1]));
            System.out.print(String.format("%-10s",data[a][2]));
            System.out.println("");
             } 
    }
           
}

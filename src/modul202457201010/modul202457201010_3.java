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
       String data[][] = {{"NAMA\t", "TELEPON\t", "ALAMAT\t"},
{"ABDUL\t", "085646668991\t", "Kediri\t"},
{"KUSNO\t", "085646668992\t", "Treanggalek\t"},
{"PONIRAN\t", "085646668999\t","Bojonegoro\t"}};
           
        for (int a = 0; a<data.length; a++) { 
             for (int b = 0; b<data[0].length; b++) { 
                 System.out.print(data[a][b] + " "); 
             } 
             System.out.print("\n"); 
        }
        
        
    }
           
}

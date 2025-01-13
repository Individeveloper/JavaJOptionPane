/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gradewithjoptionpane;
import javax.swing.JOptionPane;
/**
 *
 * @author LENOVO
 */
public class GradeWithJOptionPane {

    /**
     * @param args the command line arguments
     */
    
    public static void GradeFunction(){
            String Grade = "";
            String inputNama = JOptionPane.showInputDialog(null, "Masukkan Nama \n (Gunakan nama lengkap)");
            String inputKelas = JOptionPane.showInputDialog(null, "Masukkan Kelas");
            String inputNilai = JOptionPane.showInputDialog(null, "Masukkan Nilai");       
        
            int nilai = Integer.parseInt(inputNilai); 
        
        
        
            if (nilai >= 90){
                Grade = "A";
            } else if(nilai >= 85) {
                Grade = "B+";
            } else if(nilai >= 80){
                Grade = "B";
            } else if(nilai >= 75){
                Grade = "C+";
            } else if(nilai >= 70){
                Grade = "C";
            } else if( nilai >= 60) {
                Grade = "D";
            } else {
                Grade = "E";
            }
        
            JOptionPane.showMessageDialog(null, "Nama: "+ inputNama + "\nKelas: " + inputKelas + "\nNilai: " + inputNilai + "\nGrade: " + Grade );
            
        }
  
    public static void main(String[] args) {
        // TODO code application logic here
        
        // pembuatan menu PopUp
        String Menu = JOptionPane.showInputDialog(null, "Menu \n 1. Grade nilai \n 2. Riwayat \n (pilih dengan no)");
        int menuInt = Integer.parseInt(Menu);
        //PopUp menginput nama dan grade
        
        
        if (menuInt == 1){
            GradeFunction();
        } else {
            JOptionPane.showMessageDialog(null, "Coming Soon");
        }
        
    } 
    
} 

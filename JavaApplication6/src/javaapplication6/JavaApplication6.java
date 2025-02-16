/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package javaapplication6;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;


/**
 *
 * @author LENOVO
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame frame = new JFrame("Konversi Massa");
        frame.setSize(300, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        // label input nilai
        JLabel label = new JLabel("inputkan nilai");
        label.setBounds(20,20,120,30);
        frame.add(label);
        
        // textbox
        JTextField input = new JTextField();
        input.setBounds(120, 20, 120, 30);
        frame.add(input);
        
        //combobox 1
        String[] options = {"KG", "HG", "DAG", "G", "DG", "CG", "MG"};
        JComboBox<String> combobox1 = new JComboBox<>(options);
        combobox1.setBounds(20, 60, 100, 30);
        frame.add(combobox1);
        
        //combobox2
        JComboBox<String> combobox2 = new JComboBox<>(options);
        combobox2.setBounds(150, 60, 100, 30);
        frame.add(combobox2);
        
        //button proses
        JButton btnProses = new JButton("Proses");
        btnProses.setBounds(20, 120, 100, 30);
        frame.add(btnProses);
        
        //button clear
        JButton btnClear= new JButton("Clear");
        btnClear.setBounds(150, 120, 100, 30);
        frame.add(btnClear);
        
        //hasil
        JLabel hasil = new JLabel("Hasil: ");
        hasil.setBounds(20,180,350,30);
        frame.add(hasil);
        
        //event listener
        btnProses.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double inputvalue = Double.parseDouble(input.getText());
                    String from = (String) combobox1.getSelectedItem();
                    String to = (String) combobox2.getSelectedItem();
                    
                    //konversi ke kilogram
                    HashMap<String, Double> toKg = new HashMap<>();
                    toKg.put("KG", 1.0);
                    toKg.put("HG", 10.0);
                    toKg.put("DAG", 100.0);
                    toKg.put("G", 1000.0);
                    toKg.put("DG", 10000.0);
                    toKg.put("CG", 100000.0);
                    toKg.put("MG", 1000000.0);
                    
                    //konversi ke tujuan
                    double inKilo = inputvalue * toKg.get(from);
                    double result = inKilo / toKg.get(to);
                    
                    hasil.setText("Hasil: " + result);
                } catch (NumberFormatException ex) {
                    hasil.setText("Masukkan angka yang valid");
                }
            }
        });
        
        //clear button
        btnClear.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                input.setText("");
                hasil.setText("Hasil: ");
            }
        });
        
        frame.setVisible(true);
    }
    
}

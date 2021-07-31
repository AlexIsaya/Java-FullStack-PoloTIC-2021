
package Logic;

import GUI.MainVentana;


public class Main {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create a mainwindow object
        MainVentana mainWindow = new MainVentana();
        
        // Make the window visible
        mainWindow.setVisible(true);
        
        // Center the window
        mainWindow.setLocationRelativeTo(null);
    }
    
}

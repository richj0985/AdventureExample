/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author richj0985
 */
public class RunGame {
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
       // create the interface
       GUI gui = new GUI(); 
       // show the interface
       gui.setVisible(true);
       
       // create the map
       Map map = new Map("zelda/tiles.txt");
       
       // create the game controller
       Controller c = new Controller(gui, map, 8, 8);
    }
}

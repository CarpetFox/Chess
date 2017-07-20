/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

/**
 *
 * @author Joshua
 */
public class Chess {

    public static boolean checkmate;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        Game game = new Game();
        checkmate = false;
        boolean finished = false;
        while(!finished){    
            if(checkmate == true){
            
            }
            else{
                game.run();
            }
        }
    }
    
}

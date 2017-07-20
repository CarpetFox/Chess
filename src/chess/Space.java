/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Joshua
 */
public class Space {
    private Piece piece;
    private int row;
    private int column;
    private JLabel label;
    
    public Space(int rowy, int columny, JLabel jLabel)
    {
        row = rowy;
        column = columny;
        piece = null;
        label = jLabel;
    }
    
    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }
    
    public Piece getPiece()
    {
        return piece;
    }
    
    public int getRow()
    {
        return row;
    }
    
    public int getColumn()
    {
        return column;
    }
    
    public void updateLabel()
    {
        if(piece != null){
            
            if(piece.getColour().equals("Black")){
                if(piece instanceof Castle){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/blackCastle.png")));
                }
                else if(piece instanceof Pawn){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/blackPawn.png")));
                }
                else if(piece instanceof Bishop){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/blackBishop.png")));
                }
                else if(piece instanceof Knight){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/blackHorse.png")));
                }
                else if(piece instanceof Queen){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/blackQueen.png")));
                }
                else if(piece instanceof King){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/blackKing.png")));
                }
            }
            else{
                if(piece instanceof Castle){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/whiteCastle.png")));
                }
                else if(piece instanceof Pawn){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/whitePawn.png")));
                }
                else if(piece instanceof Bishop){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/whiteBishop.png")));
                }
                else if(piece instanceof Knight){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/whiteHorse.png")));
                }
                else if(piece instanceof Queen){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/whiteQueen.png")));
                }
                else if(piece instanceof King){

                    label.setIcon(new javax.swing.ImageIcon(getClass().getResource("/chess/Images/whiteKing.png")));
                }
            }
            
        }
        else{
            label.setIcon(null);
            label.setText("");
        }
    }
    
    public void setLabel(String newText)
    {
        label.setText(newText);
    }
}

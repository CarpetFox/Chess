/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.ArrayList;

/**
 *
 * @author Joshua
 */
public abstract class Piece {
    Space currentSpace;
    private String colour;
    
    public Piece(String colour, Space space)
    {
        currentSpace = space;
        this.colour = colour;
    }
    
    public void setSpace(Space space)
    {
        currentSpace = space;
    }
    
    public String getColour()
    {
        return colour;
    }
    
    public abstract String toString();

    
    public abstract ArrayList<Space> getMoveList(ArrayList<Space> spaces);
    
    public abstract ArrayList<Space> getTakeList(ArrayList<Space> spaces);
    
}

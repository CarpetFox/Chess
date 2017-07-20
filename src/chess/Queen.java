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
public class Queen extends Piece{

    public Queen(String colour, Space space) {
        super(colour, space);
    }

    @Override
    public String toString() {
        return "queen";
    }

    @Override
    public ArrayList<Space> getMoveList(ArrayList<Space> spaces) {
        ArrayList<Space> moveList = new ArrayList<>();
        
        Castle castle = new Castle(getColour(), currentSpace);
        ArrayList<Space> castleMoveList = castle.getMoveList(spaces);
        
        Bishop bishop = new Bishop(getColour(), currentSpace);
        ArrayList<Space> bishopMoveList = bishop.getMoveList(spaces);
        
        moveList.addAll(castleMoveList);
        moveList.addAll(bishopMoveList);
        
        return moveList;
    }

    @Override
    public ArrayList<Space> getTakeList(ArrayList<Space> spaces) {
        ArrayList<Space> takeList = new ArrayList<>();
        
        Castle castle = new Castle(getColour(), currentSpace);
        ArrayList<Space> castleTakeList = castle.getTakeList(spaces);
        
        Bishop bishop = new Bishop(getColour(), currentSpace);
        ArrayList<Space> bishopTakeList = bishop.getTakeList(spaces);
        
        takeList.addAll(castleTakeList);
        takeList.addAll(bishopTakeList);
        
        return takeList;
    }
    
}

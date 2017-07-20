/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Joshua
 */
public class King extends Piece{

    public King(String colour, Space space) {
        super(colour, space);
    }

    @Override
    public String toString() {
        return "king";
    }

    @Override
    public ArrayList<Space> getMoveList(ArrayList<Space> spaces) {
        ArrayList<Space> moveList = new ArrayList<>();
        
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        int currentPosition = ((row-1)*8)+(column-1);
        
            if(row > 1 && column > 1){
                Space nextSpace = spaces.get(currentPosition - 9);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1){
                Space nextSpace = spaces.get(currentPosition - 8);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1 && column < 8){
                Space nextSpace = spaces.get(currentPosition - 7);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(column > 1){
                Space nextSpace = spaces.get(currentPosition - 1);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(column < 8){
                Space nextSpace = spaces.get(currentPosition + 1);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column > 1){
                Space nextSpace = spaces.get(currentPosition + 7);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8){
                Space nextSpace = spaces.get(currentPosition + 8);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column < 8){
                Space nextSpace = spaces.get(currentPosition + 9);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
        
        
        return moveList;
    }

    @Override
    public ArrayList<Space> getTakeList(ArrayList<Space> spaces) {
        ArrayList<Space> moveList = new ArrayList<>();
        
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        int currentPosition = ((row-1)*8)+(column-1);
        
            if(row > 1 && column > 1){
                Space nextSpace = spaces.get(currentPosition - 9);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1){
                Space nextSpace = spaces.get(currentPosition - 8);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1 && column < 8){
                Space nextSpace = spaces.get(currentPosition - 7);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(column > 1){
                Space nextSpace = spaces.get(currentPosition - 1);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(column < 8){
                Space nextSpace = spaces.get(currentPosition + 1);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column > 1){
                Space nextSpace = spaces.get(currentPosition + 7);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8){
                Space nextSpace = spaces.get(currentPosition + 8);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column < 8){
                Space nextSpace = spaces.get(currentPosition + 9);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
        
        Iterator it = moveList.iterator();
            while(it.hasNext()){
                Space space = (Space) it.next();
                if(space.getPiece().getColour().equals(getColour())){
                    it.remove();
                }
            }
        return moveList;
    }
    
}

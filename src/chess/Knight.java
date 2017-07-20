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
public class Knight extends Piece{

    public Knight(String colour, Space space) {
        super(colour, space);
    }

    @Override
    public String toString() {
        return "knight";
    }

    @Override
    public ArrayList<Space> getMoveList(ArrayList<Space> spaces) {
        ArrayList<Space> moveList = new ArrayList<>();
        
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        int currentPosition = ((row-1)*8)+(column-1);
        
            if(row > 2 && column > 1){
                Space nextSpace = spaces.get(currentPosition - 17);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 2 && column < 8){
                Space nextSpace = spaces.get(currentPosition - 15);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1 && column > 2){
                Space nextSpace = spaces.get(currentPosition - 10);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1 && column < 7){
                Space nextSpace = spaces.get(currentPosition - 6);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column > 2){
                Space nextSpace = spaces.get(currentPosition + 6);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column < 7){
                Space nextSpace = spaces.get(currentPosition + 10);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 7 && column > 1){
                Space nextSpace = spaces.get(currentPosition + 15);
                if(nextSpace.getPiece() == null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 7 && column < 8){
                Space nextSpace = spaces.get(currentPosition + 17);
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
        
            if(row > 2 && column > 1){
                Space nextSpace = spaces.get(currentPosition - 17);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 2 && column < 8){
                Space nextSpace = spaces.get(currentPosition - 15);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1 && column > 2){
                Space nextSpace = spaces.get(currentPosition - 10);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row > 1 && column < 7){
                Space nextSpace = spaces.get(currentPosition - 6);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column > 2){
                Space nextSpace = spaces.get(currentPosition + 6);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 8 && column < 7){
                Space nextSpace = spaces.get(currentPosition + 10);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 7 && column > 1){
                Space nextSpace = spaces.get(currentPosition + 15);
                if(nextSpace.getPiece() != null){
                    moveList.add(nextSpace);
                }
            }
            
            if(row < 7 && column < 8){
                Space nextSpace = spaces.get(currentPosition + 17);
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

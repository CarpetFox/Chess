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
public class Pawn extends Piece{

    private String direction;
    private boolean moved;
    
    public Pawn(String colour, Space space, String direction) {
        super(colour, space);
        this.direction = direction;
        moved = false;
    }

    @Override
    public String toString() {
        return "pawn";
    }

    @Override
    public ArrayList<Space> getMoveList(ArrayList<Space> spaces) {
        ArrayList<Space> moveList = new ArrayList<>();
        
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        int currentPosition = ((row-1)*8)+(column-1);
        
        if(row == 1){
            direction = "south";
        }
        else if(row == 8){
            direction = "north";
        }
        
        if(direction.equals("north")){
            Space moveSpace = spaces.get(currentPosition - 8);
            if(moveSpace.getPiece()==null){
               moveList.add(moveSpace);
           }
            if(moved == false){
                moveSpace = spaces.get(currentPosition - 16);
                if(moveSpace.getPiece()==null){
                    moveList.add(moveSpace);
                }
            }
        }
        else{
            Space moveSpace = spaces.get(currentPosition + 8);
            if(moveSpace.getPiece()==null){
               moveList.add(moveSpace);
           }
            if(moved == false){
                moveSpace = spaces.get(currentPosition + 16);
                if(moveSpace.getPiece()==null){
                    moveList.add(moveSpace);
                }
            }
        }
        return moveList;
    }

    @Override
    public ArrayList<Space> getTakeList(ArrayList<Space> spaces) {
        ArrayList<Space> takeList = new ArrayList<>();
        
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        int currentPosition = ((row-1)*8)+(column-1);
        
        if(direction.equals("north")){
            Space takeSpace;
            
            if(column != 1 && row > 1){
                takeSpace = spaces.get(currentPosition - 9);
                if(takeSpace.getPiece()!=null){
                    takeList.add(takeSpace);
                }
            }
            if(column != 8 && row > 1){
                takeSpace = spaces.get(currentPosition - 7);
                if(takeSpace.getPiece()!=null){
                    takeList.add(takeSpace);
                }
            }
        }
        else{
            Space takeSpace;
            
            if(column != 1 && row < 8){
                takeSpace = spaces.get(currentPosition + 7);
                if(takeSpace.getPiece()!=null){
                    takeList.add(takeSpace);
                }
            }
            if(column != 8 && row < 8){
                takeSpace = spaces.get(currentPosition + 9);
                if(takeSpace.getPiece()!=null){
                    takeList.add(takeSpace);
                }
            }
        }
        Iterator it = takeList.iterator();
        while(it.hasNext()){
            Space space = (Space) it.next();
            if(space.getPiece().getColour().equals(getColour())){
                it.remove();
            }
        }
        return takeList;
    }
    
    public void moved()
    {
        moved = true;
    }
    
    
    
}

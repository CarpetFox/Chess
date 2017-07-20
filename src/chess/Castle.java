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
public class Castle extends Piece{

    public Castle(String colour, Space space) {
        super(colour, space);
    }

    @Override
    public ArrayList<Space> getMoveList(ArrayList<Space> spaces) {
        
        ArrayList<Space> moveList = new ArrayList<>();
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        
        int currentPosition = ((row-1)*8)+(column-1);
        
        for(int i = (currentPosition -1); i > (currentPosition - column); i --){
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
            }
        }
        
        for(int i = (currentPosition + 1); i <= (currentPosition + (8 - column)); i++){
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
            }
        }
        
        for(int i = (currentPosition -8); i > (currentPosition - (row*8)); i -= 8){
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
            }
        }
        
        for(int i = (currentPosition +8); i <= (currentPosition + ((8-row)*8)); i += 8){
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
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
        
        for(int i = (currentPosition -1); i > (currentPosition - column); i --){
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                takeList.add(spaces.get(i));
                break;
            }
        }
        
        for(int i = (currentPosition + 1); i <= (currentPosition + (8 - column)); i++){
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                takeList.add(spaces.get(i));
                break;
            }
        }
        
        for(int i = (currentPosition -8); i > (currentPosition - (row*8)); i -= 8){
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                takeList.add(spaces.get(i));
                break;
            }
        }
        
        for(int i = (currentPosition +8); i <= (currentPosition + ((8-row)*8)); i += 8){
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                takeList.add(spaces.get(i));
                break;
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

    @Override
    public String toString() {
        return "castle";
    }
    
}

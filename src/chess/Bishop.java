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
public class Bishop extends Piece{

    public Bishop(String colour, Space space) {
        super(colour, space);
    }

    @Override
    public String toString() {
        return "bishop";
    }

    @Override
    public ArrayList<Space> getMoveList(ArrayList<Space> spaces) {
        
        ArrayList<Space> moveList = new ArrayList<>();
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        
        int currentPosition = ((row-1)*8)+(column-1);
        
        int numOfTimes = column - 1;
        for(int i = (currentPosition -9); i >= 0 ; i -= 9){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
            }
            numOfTimes--;
        }
        
        numOfTimes = 8 - column;
        for(int i = (currentPosition + 9); i < 64; i += 9){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
            }
            numOfTimes--;
        }
        numOfTimes = 8-column;
        for(int i = (currentPosition -7); i >= 0; i -= 7){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
            }
            numOfTimes--;
        }
        numOfTimes = column - 1;
        for(int i = (currentPosition +7); i < 64; i += 7){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                moveList.add(spaces.get(i));
            }
            else{
                break;
            }
            numOfTimes--;
        }
        
        return moveList;
    }

    @Override
    public ArrayList<Space> getTakeList(ArrayList<Space> spaces) {
        
        ArrayList<Space> moveList = new ArrayList<>();
        int row = currentSpace.getRow();
        int column = currentSpace.getColumn();
        
        int currentPosition = ((row-1)*8)+(column-1);
        
        int numOfTimes = column - 1;
        for(int i = (currentPosition -9); i >= 0 ; i -= 9){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                moveList.add(spaces.get(i));
                break;
            }
            numOfTimes--;
        }
        
        numOfTimes = 8 - column;
        for(int i = (currentPosition + 9); i < 64; i += 9){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                moveList.add(spaces.get(i));
                break;
            }
            numOfTimes--;
        }
        numOfTimes = 8-column;
        for(int i = (currentPosition -7); i >= 0; i -= 7){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                moveList.add(spaces.get(i));
                break;
            }
            numOfTimes--;
        }
        numOfTimes = column - 1;
        for(int i = (currentPosition +7); i < 64; i += 7){
            if(numOfTimes == 0){
                break;
            }
            if(spaces.get(i).getPiece()==null){
                
            }
            else{
                moveList.add(spaces.get(i));
                break;
            }
            numOfTimes--;
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

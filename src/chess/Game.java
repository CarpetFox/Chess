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
public class Game{
    private Board board;
    private ArrayList<Space> spaces;
    private ArrayList<Piece> whitePieces;
    private ArrayList<Piece> blackPieces;
    private King blackKing;
    private King whiteKing;
    private String turn;
    
    
    public static boolean clicked;
    public static int selected;
    
    public Game(){
        board = new Board();
        board.setVisible(true);
        selected = 0;
        spaces = new ArrayList<>();
        turn = "White";
        
        Space a1 = new Space(1,1,board.getLabel(0));
        Space a2 = new Space(1,2,board.getLabel(1));
        Space a3 = new Space(1,3,board.getLabel(2));
        Space a4 = new Space(1,4,board.getLabel(3));
        Space a5 = new Space(1,5,board.getLabel(4));
        Space a6 = new Space(1,6,board.getLabel(5));
        Space a7 = new Space(1,7,board.getLabel(6));
        Space a8 = new Space(1,8,board.getLabel(7));
        
        Space b1 = new Space(2,1,board.getLabel(8));
        Space b2 = new Space(2,2,board.getLabel(9));
        Space b3 = new Space(2,3,board.getLabel(10));
        Space b4 = new Space(2,4,board.getLabel(11));
        Space b5 = new Space(2,5,board.getLabel(12));
        Space b6 = new Space(2,6,board.getLabel(13));
        Space b7 = new Space(2,7,board.getLabel(14));
        Space b8 = new Space(2,8,board.getLabel(15));
        
        Space c1 = new Space(3,1,board.getLabel(16));
        Space c2 = new Space(3,2,board.getLabel(17));
        Space c3 = new Space(3,3,board.getLabel(18));
        Space c4 = new Space(3,4,board.getLabel(19));
        Space c5 = new Space(3,5,board.getLabel(20));
        Space c6 = new Space(3,6,board.getLabel(21));
        Space c7 = new Space(3,7,board.getLabel(22));
        Space c8 = new Space(3,8,board.getLabel(23));
        
        Space d1 = new Space(4,1,board.getLabel(24));
        Space d2 = new Space(4,2,board.getLabel(25));
        Space d3 = new Space(4,3,board.getLabel(26));
        Space d4 = new Space(4,4,board.getLabel(27));
        Space d5 = new Space(4,5,board.getLabel(28));
        Space d6 = new Space(4,6,board.getLabel(29));
        Space d7 = new Space(4,7,board.getLabel(30));
        Space d8 = new Space(4,8,board.getLabel(31));
        
        Space e1 = new Space(5,1,board.getLabel(32));
        Space e2 = new Space(5,2,board.getLabel(33));
        Space e3 = new Space(5,3,board.getLabel(34));
        Space e4 = new Space(5,4,board.getLabel(35));
        Space e5 = new Space(5,5,board.getLabel(36));
        Space e6 = new Space(5,6,board.getLabel(37));
        Space e7 = new Space(5,7,board.getLabel(38));
        Space e8 = new Space(5,8,board.getLabel(39));
        
        Space f1 = new Space(6,1,board.getLabel(40));
        Space f2 = new Space(6,2,board.getLabel(41));
        Space f3 = new Space(6,3,board.getLabel(42));
        Space f4 = new Space(6,4,board.getLabel(43));
        Space f5 = new Space(6,5,board.getLabel(44));
        Space f6 = new Space(6,6,board.getLabel(45));
        Space f7 = new Space(6,7,board.getLabel(46));
        Space f8 = new Space(6,8,board.getLabel(47));
        
        Space g1 = new Space(7,1,board.getLabel(48));
        Space g2 = new Space(7,2,board.getLabel(49));
        Space g3 = new Space(7,3,board.getLabel(50));
        Space g4 = new Space(7,4,board.getLabel(51));
        Space g5 = new Space(7,5,board.getLabel(52));
        Space g6 = new Space(7,6,board.getLabel(53));
        Space g7 = new Space(7,7,board.getLabel(54));
        Space g8 = new Space(7,8,board.getLabel(55));
        
        Space h1 = new Space(8,1,board.getLabel(56));
        Space h2 = new Space(8,2,board.getLabel(57));
        Space h3 = new Space(8,3,board.getLabel(58));
        Space h4 = new Space(8,4,board.getLabel(59));
        Space h5 = new Space(8,5,board.getLabel(60));
        Space h6 = new Space(8,6,board.getLabel(61));
        Space h7 = new Space(8,7,board.getLabel(62));
        Space h8 = new Space(8,8,board.getLabel(63));

        
        spaces.add(a1);
        spaces.add(a2);
        spaces.add(a3);
        spaces.add(a4);
        spaces.add(a5);
        spaces.add(a6);
        spaces.add(a7);
        spaces.add(a8);
        
        spaces.add(b1);
        spaces.add(b2);
        spaces.add(b3);
        spaces.add(b4);
        spaces.add(b5);
        spaces.add(b6);
        spaces.add(b7);
        spaces.add(b8);
        
        spaces.add(c1);
        spaces.add(c2);
        spaces.add(c3);
        spaces.add(c4);
        spaces.add(c5);
        spaces.add(c6);
        spaces.add(c7);
        spaces.add(c8);
        
        spaces.add(d1);
        spaces.add(d2);
        spaces.add(d3);
        spaces.add(d4);
        spaces.add(d5);
        spaces.add(d6);
        spaces.add(d7);
        spaces.add(d8);
        
        spaces.add(e1);
        spaces.add(e2);
        spaces.add(e3);
        spaces.add(e4);
        spaces.add(e5);
        spaces.add(e6);
        spaces.add(e7);
        spaces.add(e8);
        
        spaces.add(f1);
        spaces.add(f2);
        spaces.add(f3);
        spaces.add(f4);
        spaces.add(f5);
        spaces.add(f6);
        spaces.add(f7);
        spaces.add(f8);
        
        spaces.add(g1);
        spaces.add(g2);
        spaces.add(g3);
        spaces.add(g4);
        spaces.add(g5);
        spaces.add(g6);
        spaces.add(g7);
        spaces.add(g8);
        
        spaces.add(h1);
        spaces.add(h2);
        spaces.add(h3);
        spaces.add(h4);
        spaces.add(h5);
        spaces.add(h6);
        spaces.add(h7);
        spaces.add(h8);
        
        Pawn pawn1 = new Pawn("White", g1, "north");
        g1.setPiece(pawn1);
        
        Pawn pawn2 = new Pawn("White", g2, "north");
        g2.setPiece(pawn2);
        
        Pawn pawn3 = new Pawn("White", g3, "north");
        g3.setPiece(pawn3);
        
        Pawn pawn4 = new Pawn("White", g4, "north");
        g4.setPiece(pawn4);
        
        Pawn pawn5 = new Pawn("White", g5, "north");
        g5.setPiece(pawn5);
        
        Pawn pawn6 = new Pawn("White", g6, "north");
        g6.setPiece(pawn6);
        
        Pawn pawn7 = new Pawn("White", g7, "north");
        g7.setPiece(pawn7);
        
        Pawn pawn8 = new Pawn("White", g8, "north");
        g8.setPiece(pawn8);
        
        Castle castle1 = new Castle("White", h8);
        h8.setPiece(castle1);
        
        Castle castle2 = new Castle("White", h1);
        h1.setPiece(castle2);
        
        Knight knight1 = new Knight("White", h2);
        h2.setPiece(knight1);
        
        Knight knight2 = new Knight("White", h7);
        h7.setPiece(knight2);
        
        Bishop bishop1 = new Bishop("White", h3);
        h3.setPiece(bishop1);
        
        Bishop bishop2 = new Bishop("White", h6);
        h6.setPiece(bishop2);
        
        Queen whiteQueen = new Queen("White", h4);
        h4.setPiece(whiteQueen);
        
        whiteKing = new King("White", h5);
        h5.setPiece(whiteKing);
        
        whitePieces = new ArrayList<>();
        whitePieces.add(pawn1);
        whitePieces.add(pawn2);
        whitePieces.add(pawn3);
        whitePieces.add(pawn4);
        whitePieces.add(pawn5);
        whitePieces.add(pawn6);
        whitePieces.add(pawn7);
        whitePieces.add(pawn8);
        whitePieces.add(castle1);
        whitePieces.add(castle2);
        whitePieces.add(knight1);
        whitePieces.add(knight2);
        whitePieces.add(bishop1);
        whitePieces.add(bishop2);
        whitePieces.add(whiteQueen);
        whitePieces.add(whiteKing);
        
        
        //create black pieces
        Pawn pawn9 = new Pawn("Black", b1, "south");
        b1.setPiece(pawn9);
        
        Pawn pawn10 = new Pawn("Black", b2, "south");
        b2.setPiece(pawn10);
        
        Pawn pawn11 = new Pawn("Black", b3, "south");
        b3.setPiece(pawn11);
        
        Pawn pawn12 = new Pawn("Black", b4, "south");
        b4.setPiece(pawn12);
        
        Pawn pawn13 = new Pawn("Black", b5, "south");
        b5.setPiece(pawn13);
        
        Pawn pawn14 = new Pawn("Black", b6, "south");
        b6.setPiece(pawn14);
        
        Pawn pawn15 = new Pawn("Black", b7, "south");
        b7.setPiece(pawn15);
        
        Pawn pawn16 = new Pawn("Black", b8, "south");
        b8.setPiece(pawn16);
        
        Castle castle3 = new Castle("Black", a8);
        a8.setPiece(castle3);
        
        Castle castle4 = new Castle("Black", a1);
        a1.setPiece(castle4);
        
        Knight knight3 = new Knight("Black", a2);
        a2.setPiece(knight3);
        
        Knight knight4 = new Knight("Black", a7);
        a7.setPiece(knight4);
        
        Bishop bishop3 = new Bishop("Black", a3);
        a3.setPiece(bishop3);
        
        Bishop bishop4 = new Bishop("Black", a6);
        a6.setPiece(bishop4);
        
        Queen blackQueen = new Queen("Black", a5);
        a5.setPiece(blackQueen);
        
        blackKing = new King("Black", a4);
        a4.setPiece(blackKing);
        
        blackPieces = new ArrayList<>();

        blackPieces = new ArrayList<>();
        blackPieces.add(pawn9);
        blackPieces.add(pawn10);
        blackPieces.add(pawn11);
        blackPieces.add(pawn12);
        blackPieces.add(pawn13);
        blackPieces.add(pawn14);
        blackPieces.add(pawn15);
        blackPieces.add(pawn16);
        blackPieces.add(castle3);
        blackPieces.add(castle4);
        blackPieces.add(knight3);
        blackPieces.add(knight4);
        blackPieces.add(bishop3);
        blackPieces.add(bishop4);
        blackPieces.add(blackQueen);
        blackPieces.add(blackKing);
        
        updateLabels();
    }
        
    private boolean kingInCheck(King king, ArrayList<Piece> pieces)
    {
        boolean inCheck = false;
        for(Piece piece: pieces){
            System.out.println(piece.toString());
            ArrayList<Space> takeList = piece.getTakeList(spaces);
            for(Space space: takeList){
                if(space.getPiece()==king){
                    inCheck = true;
                }
            }
        }
        return inCheck;
    }
    
    private boolean checkMate(King king, ArrayList<Piece> kingsPieces, ArrayList<Piece> enemyPieces)
    {
        boolean checkMate = false;
        if(kingInCheck(king, enemyPieces)){
        
            checkMate = true;
            
            for(Piece piece: kingsPieces){
                ArrayList<Space> moveList = piece.getMoveList(spaces);
                ArrayList<Space> takeList = piece.getTakeList(spaces);
                Space originalPosition = piece.currentSpace;
                
                
                for(Space space: moveList){
                    piece.setSpace(space);
                    space.setPiece(piece);
                    originalPosition.setPiece(null);
                    
                    if(!kingInCheck(king, enemyPieces)){
                        checkMate = false;
                    }
                    piece.setSpace(originalPosition);
                    originalPosition.setPiece(piece);
                    space.setPiece(null);
                    
                    if(checkMate == false){
                        return checkMate;
                    }
                }
                
                for(Space space: takeList){
                    Piece takePiece = space.getPiece();
                    enemyPieces.remove(takePiece);
                    piece.setSpace(space);
                    space.setPiece(piece);
                    originalPosition.setPiece(null);
                    
                    if(!kingInCheck(king, enemyPieces)){
                        checkMate = false;
                    }
                    piece.setSpace(originalPosition);
                    originalPosition.setPiece(piece);
                    space.setPiece(takePiece);
                    enemyPieces.add(takePiece);
                    
                    if(checkMate == false){
                        return checkMate;
                    }
                    
                }
            }
        
        }
        return checkMate;
        
        
        
        
    }
    
    
    public void run() throws InterruptedException
    {
        updateLabels();
        board.setGameText1("Player turn: " + turn);
        
        Space selectedSpace;
        Piece selectedPiece;
        
        if(checkMate(blackKing, blackPieces, whitePieces)){
            board.setGameText1("Checkmate!");
            Chess.checkmate = true;
            return;
        }
        if(checkMate(whiteKing, whitePieces, blackPieces)){
            board.setGameText1("Checkmate!");
            Chess.checkmate = true;
            return;
        }
        if(kingInCheck(whiteKing, blackPieces)){
            board.setGameText1("White King in check!");
            //selectedSpace = whiteKing.currentSpace;
            //selectedPiece = whiteKing;
        }
        else if(kingInCheck(blackKing, whitePieces)){
            board.setGameText1("Black King in check!");
            //selectedSpace = blackKing.currentSpace;
            //selectedPiece = blackKing;
        }
        
        
        clicked = false;
        board.setGameText("Please select a piece.");
        while(!clicked){
            Thread.sleep(100);
        }
        if(spaces.get(selected).getPiece()==null){
            return;
        }
        
        

            selectedSpace = spaces.get(selected);
            selectedPiece = selectedSpace.getPiece();

            if(!selectedPiece.getColour().equals(turn)){
                return;
            }
            //if(kingInCheck(whiteKing, blackPieces) && !(selectedPiece instanceof King)){
            //    return;
            //}
            //if(kingInCheck(blackKing, whitePieces) && !(selectedPiece instanceof King)){
            //    return;
            //}


        ArrayList<Space> moveSpaces = selectedPiece.getMoveList(spaces);
        ArrayList<Space> takeSpaces = selectedPiece.getTakeList(spaces);
        for(Space space: moveSpaces){
            space.setLabel("can");
        }

        //for(Space space: takeSpaces){
        //    space.setLabel("take");
        //}
        
        
        clicked = false;
        board.setGameText("Please select where to move.");
        while(!clicked){
            Thread.sleep(100);
        }
        
        Space moveToSpace = spaces.get(selected);
        
        
        if(moveSpaces.contains(moveToSpace) || takeSpaces.contains(moveToSpace)){
            
            
            
            Piece originalPiece = moveToSpace.getPiece();
            ArrayList<Piece> oppositePieces = whitePieces;
            if(originalPiece != null){
                if(originalPiece.getColour().equals("Black")){
                    oppositePieces = blackPieces;
                }
            }
            
            selectedSpace.setPiece(null);
            selectedPiece.setSpace(moveToSpace);
            moveToSpace.setPiece(selectedPiece);
            oppositePieces.remove(originalPiece);
            

            //code to make sure have to move king out of check or prevent check   
                
                
                King currentKing;
                if(turn.equals("White")){
                    currentKing = whiteKing;
                }
                else{
                    currentKing = blackKing;
                }
                if(selectedPiece.getColour().equals("White")){
                    oppositePieces = blackPieces;
                }
                
                if(kingInCheck(currentKing, oppositePieces)){
                    selectedSpace.setPiece(selectedPiece);
                    selectedPiece.setSpace(selectedSpace);
                    
                    moveToSpace.setPiece(originalPiece);
                    if(originalPiece != null){
                        oppositePieces.add(originalPiece);
                    }
                    
                    return;
                    
                }
                
         
            if(selectedPiece instanceof Pawn){
                ((Pawn)selectedPiece).moved();
            }
            
            if(turn.equals("White")){
                turn = "Black";
            }
            else{
                turn = "White";
            }
        }
        
        
    }
    
    public void updateLabels()
    {
        for(Space space: spaces){
                space.updateLabel();
            }
    }
    
}

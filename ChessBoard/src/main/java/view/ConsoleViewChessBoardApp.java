package view;

import interfaces.Messages;
import model.data.BoardCell;
import model.data.Color;

public class ConsoleViewChessBoardApp implements IViewChessBoardApp{

    @Override
    public void showBoard(BoardCell[][] board) {
        int showedLength = board[0].length;
        if ( showedLength > Messages.CONSOLE_WIDTH){
            System.out.println(Messages.CHESS_BOARD_WARNING_MESS);
            showedLength = Messages.CONSOLE_WIDTH;
        }
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < showedLength; j++){
                if(board[i][j].getColor() == Color.BLACK){System.out.print("*");}
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    @Override
    public void showWelcomeMess(String str) {

    }
}


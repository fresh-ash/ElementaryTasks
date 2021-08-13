package model;

import model.data.BoardCell;
import model.data.Color;

public class ChessBoardBuilder {
    Integer height;
    Integer width;
    BoardCell[][] board;

    Color changeColor(Color color){
        if(color == Color.BLACK) {
            return Color.WHITE;
        }
        return Color.BLACK;
    }

    void createBoard(){
        Color color = Color.BLACK;
        for (int i = 0; i < height; i++){
            for (int j = 0; j < width; j++){
                board[i][j] = new BoardCell(j, i, color);
                color = changeColor(color);
            }
            if(width%2 == 0) color = changeColor(color);
        }
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public BoardCell[][] getBoard() {
        if (this.height > 0 && this.width > 0){
            this.board = new BoardCell[height][width];
            createBoard();
        }
        return board;
    }

    public void setBoard(BoardCell[][] board) {
        this.board = board;
    }
}

package view;

import model.data.BoardCell;

public interface IViewChessBoardApp {
    void showBoard(BoardCell[][] board);
    void showWelcomeMess(String str);
}

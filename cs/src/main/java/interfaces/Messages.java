package interfaces;

public interface Messages {
    int CONSOLE_WIDTH = 80;
    String INCORRECT_INPUT = "Incorrect input! Try again!";
    String UNDEFINED_ERR = "Undefined exception!";
    //ChessBoardApp messages
    String CHESS_BOARD_WARNING_MESS = "Console window does not have needed width! You'll see cut version!";

    String ENVELOPES_WELCOME_MESSAGE = "Try to put one envelop in another!";
    String TRIANGLES_WELCOME_MESSAGE = "==========TRIANGLES!=========\n";
    String TRIANGLES_FORMAT_INPUT_MESSAGE = "Type your data with next format:\n"
                                            + "<name>,<sideA length>,<sideB length>,<sideC length>";
}

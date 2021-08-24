package interfaces;

public interface Messages {
    int CONSOLE_WIDTH = 80;
    String START_MAIN_MESSAGE = "=============Elementary Tasks==============\n" +
                                "1. Chess Board\n" +
                                "2. Envelopes Analysis\n" +
                                "3. Triangles Sorting\n" +
                                "4. File Parser\n" +
                                "5. Number in Words\n" +
                                "6. Happy Tickets\n" +
                                "7. Numerical Sequence\n" +
                                "8. Fibonacci Numbers\n" +
                                "0. Exit\n" +
                                "Please, enter your choice with next format: <number>";

    String INCORRECT_INPUT = "Incorrect input! Try again!";
    String UNDEFINED_ERR = "Undefined exception!";
    String CHECK_ANSWER = "Do you want to continue?\nPlease, type \'yes\' or \'y\':";
    //ChessBoardApp messages
    String CHESS_BOARD_WELCOME_MESS = "==========Chess Board===========";
    String CHESS_BOARD_FORMAT_INPUT = "Please, enter your data with next format:\n <height>, <width>";
    String CHESS_BOARD_WARNING_MESS = "Console window does not have needed width! You'll see cut version!";
    String HAPPY_TICKET_WELCOME_MESSAGE = "==========Happy Tickets==========";
    String ENVELOPES_WELCOME_MESSAGE = "Try to put one envelop in another!";
    String TRIANGLES_WELCOME_MESSAGE = "==========TRIANGLES=========\n";
    String TRIANGLES_FORMAT_INPUT_MESSAGE = "Type your data with next format:\n"
                                            + "<name>,<sideA length>,<sideB length>,<sideC length>";

    String[] FIRST_RANGE = {"one", "two", "three","four", "five",
                            "six", "seven", "eight", "nine", "ten", "eleven",
                            "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

    String[] SECOND_RANGE = {"twenty", "thirty", "forty", "fifty",
                            "sixty", "seventy", "eighty", "ninety"};

    String[] RANGES = {"million", "thousand", "hundred"};

    String PARSER_WELCOME_MESSAGE = "Type your data with next format:\n"
                                    + "<file path>, <string for count> or\n" +
                                        "<file path>, <string>, <replace string>";

    String NUMERICAL_SEQUENCE_WELCOME_MESS = "============Numerical Sequence============";
    String NUMERICAL_SEQUENCE_GET_LENGTH_SEQUENCE = "Please, enter needed length of sequence and minimal square\n" +
                                                        "<length of sequence>, <minimal square>";



}

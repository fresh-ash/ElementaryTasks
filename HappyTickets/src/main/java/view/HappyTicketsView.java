package view;

public class HappyTicketsView implements IViewHappyTickets{

    @Override
    public void showResult(Integer easyWayCount, Integer difficultWayCount, int winner) {
        System.out.println("Ease way got " + easyWayCount + " \'happy\' tickets!");
        System.out.println("Difficult way got " + difficultWayCount + " \'happy\' tickets!");
        printWinner(winner);
    }

    @Override
    public void showWelcomeMess(String str) {
        System.out.println(str);
    }

    void printWinner(int value){
        if (value > 0){
            System.out.println("Ease Way wins!");
        }
        if (value < 0){
            System.out.println("Difficult Way wins!");
        }
        if (value == 0) {
            System.out.println("Draw!");
        }
    }
}

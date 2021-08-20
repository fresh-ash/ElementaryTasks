package view;

import java.util.Map;

public class HappyTicketsView implements IViewHappyTickets{

    @Override
    public void showResult(Map<String, Integer> map, String winner) {
        System.out.printf("Easy way got %s Happy Tickets\n", map.get("EasyWay"));
        System.out.printf("Difficult way got %s Happy Tickets\n", map.get("DifficultWay"));
        System.out.println(winner);
    }

    @Override
    public void showWelcomeMess(String str) {
        System.out.println(str);
    }
}

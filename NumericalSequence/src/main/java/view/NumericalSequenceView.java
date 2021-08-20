package view;

import java.util.List;

public class NumericalSequenceView implements INumericalSequenceView{


    @Override
    public void showWelcomeMessage(String str) {
        System.out.println(str);
    }

    @Override
    public void showSequence(List<Integer> sequence) {
        System.out.println("You got next sequence:\n" + sequence);
    }
}

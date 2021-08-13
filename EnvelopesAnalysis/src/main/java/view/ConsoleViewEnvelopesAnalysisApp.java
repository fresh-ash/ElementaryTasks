package view;

import model.Envelope;

public class ConsoleViewEnvelopesAnalysisApp implements IView{

    @Override
    public void showCompareEnvelopes(Envelope envAB, Envelope envCD, boolean result) {
        if(result){
            System.out.printf("Success!\nYou put %s into %s.\n", envCD.toString(), envAB.toString());
        }
        else {
            System.out.printf("You tried, but %s and %s cannot be nested!\n", envCD.toString(), envAB.toString());
        }
    }

    @Override
    public void showWelcomeMessage(String str) {
        System.out.println(str);
    }
}

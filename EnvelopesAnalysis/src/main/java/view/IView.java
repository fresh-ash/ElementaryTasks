package view;

import model.Envelope;

public interface IView {
    void showCompareEnvelopes(Envelope envAB, Envelope envCD, boolean result);
    void showWelcomeMessage(String str);
}

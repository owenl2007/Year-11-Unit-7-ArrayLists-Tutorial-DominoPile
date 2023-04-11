import java.util.ArrayList;
import java.util.Collections;

public class DominoPile {
    private ArrayList<Domino> pile;

    public DominoPile() {
        pile = new ArrayList<>();
    }

    public ArrayList<Domino> getPile() {
        return (pile);
    }

    public void newStack6() {
        int a = 0;
        int p = 0;
        for (int i = 0; i <= 6; i++) {
            for (a = p; a < 6; a++) {
                pile.add(new Domino(i, a));
            }
            p++;
            pile.add(new Domino(i, a));
        }
    }

    public void shuffle() {
        ArrayList<Domino> temp = new ArrayList<>();

        for (int i = pile.size(); i > 0; i--) {
            int min = 0;
            int range = i - min + 1;
            int rand = (int) (Math.random() * range) + min;

            temp.add(pile.get(rand));
        }
        pile = temp;
    }
}
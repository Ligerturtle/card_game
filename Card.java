import Enums.Face;
import Enums.Suit;

public class Card implements CardIF{
    private Face face;
    private Suit suit;

    public Card(Face face, Suit suit){
        this.face = face;
        this.suit = suit;
    }
    @Override
    public Face getFace() {
        return this.face;
    }

    @Override
    public Suit getSuit() {
        return this.suit;
    }

    @Override
    public void setFace(Face face) {
        this.face = face;
    }

    @Override
    public void setSuit(Suit suit) {
        this.suit = suit;
    }
}

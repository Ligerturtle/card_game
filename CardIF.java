import Enums.Face;
import Enums.Suit;

public interface CardIF {
    public Face getFace();
    public Suit getSuit();
    public void setFace(Face face);
    public void setSuit(Suit suit);
}

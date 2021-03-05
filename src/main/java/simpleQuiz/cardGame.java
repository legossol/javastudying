package simpleQuiz;

import java.util.ArrayList;
import java.util.Collection;

class Card{
    String suit;
    String number;
    public Card(String suit, String number){
        this.suit = suit;
        this.number = number;
    }
    public String toString(){
        return"{"+suit +"  " + number + ")";
    }
}
class Deck{
    ArrayList<Card> deck = new ArrayList<Card>();
    String[] suit = {"club", "diamond", "heart", "spade"};
    String[] number = {"2","3","4","5","6","7","8","9","10","j","q","k","a"};
    //카드를 생성하여 댁에 넣는다
    public Deck(){
        //52장의 카드를 가지고 있는 덱을 찾는다
        for(int i = 0; i < suit.length; i++)
            for(int j =0; j < number.length;j++)
                deck.add(new Card(suit[i], number[j]));
    }
    //카드를 섞는다.
    public void shuffle(){
        Collection.shuffle(deck);
    }
    //덱의 처음에서 카드를 제거하여 반환한다.
    public Card deal(){
        return deck.remove(0);
    }
}

class Player{
    ArrayList<Card> list = new ArrayList<Card>();

    public void getCard(Card card){
        list.add(card);
    }
    public void showCard(){
        System.out.println(list);
    }
}
public class cardGame {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        Player p1 = new Player();
        Player p2 = new Player();

//        p1.getCard(deck.d


        for(int i=0; i<5; i++){
            p1.getCard(deck.deal());
        }
        p1.showCard();
        for(int i=0; i<5; i++){
            p2.getCard(deck.deal());
        }
        p2.showCard();
    }


}

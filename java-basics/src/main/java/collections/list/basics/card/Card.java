package collections.list.basics.card;

public record Card(Suit suit, String face, int rank) {

    public enum Suit {
        CLUB, DIAMOND, HEART, SPADE;

        public char getImage() {
            return (new char[]{9827, 9830, 9829, 9824})[this.ordinal()];
        }
    }

        @Override
        public String toString(){
            int index = face.equals("10")? 2:1;
            String faceString = face.substring(0, index);
            return "%s%c(%d)".formatted(faceString, suit.getImage(), rank);
        }

//        public static Card getNumericCard(Suit suit, int cardNumber){
//            if (cardNumber > 1 && cardNumber < 11){
//
//         }


}

public class Main {
    public static void main(String[] args) {

        //Problem 1
        Circle c1 = new Circle(2.67);
        System.out.println("c1: ");
        System.out.println(c1.toString());
        System.out.println();

        Circle c2 = new Circle(3, false, "Red");
        System.out.println("c2: ");
        System.out.println(c2.toString());
        System.out.println();

        Rectangle r1 = new Rectangle(3, 2, true, "Blue");
        System.out.println("r1: ");
        System.out.println(r1.toString());
        System.out.println();

        Rectangle r2 = new Rectangle(3.2, 4, false, "Red");
        System.out.println("r2: ");
        System.out.println(r2.toString());


        //Problem 2
        Word w1 = new Word("Go Cubs Go", "Cub");
        System.out.println("New Word object");
        System.out.println("Superclass word: " + w1.getSentence());
        System.out.println("Subclass word: " + w1.getNoVowelsWord());
        System.out.println("Is word a substring of sentence? " + w1.isSubstring());
        System.out.println();

        Word w2 = new Word("Applepie", "Apple");
        System.out.println("New Word object");
        System.out.println("Superclass word: " + w2.getSentence());
        System.out.println("Subclass word: " + w2.getNoVowelsWord());
        System.out.println("Is word a substring of sentence? " + w2.isSubstring());
        System.out.println();

        System.out.println("w1 and w2 are the same? " + w1.equals(w2));
    }
}
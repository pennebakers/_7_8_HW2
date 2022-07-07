public class Word extends Sentence{
    private String noVowelsWord;
    // private String sentence = "";


    public Word(String s,String w){
        super(s);
        //super.sentence = s;
        noVowelsWord=w.replaceAll("[AEIOUaeiou]","");
    }

    public String getNoVowelsWord() {
        return noVowelsWord;
    }
    public boolean isSubstring() {
        return getSentence().contains(noVowelsWord);
    }

}

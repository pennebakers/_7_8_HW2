public class Sentence {

    private String Sentence;

    public Sentence(String s){
        Sentence=s;

    }

    public String getSentence() {
        return Sentence;
    }

    @Override
    public boolean equals(Object obj){
        Sentence s = (Sentence) obj;

        if(this.getSentence()== s.getSentence()){
            return true;
        }
        else return false;
    }


}
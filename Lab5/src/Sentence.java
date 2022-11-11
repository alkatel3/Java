import java.util.regex.Pattern;

public class Sentence {
    private SentencePart[] sentenceParts;
    public Sentence(String sentenceString) {
        final String[] sentencePartsStrings = sentenceString.split(" +|(?=,|\\p{Punct}|…)"); //TODO I'm and +-and other
        sentenceParts = new SentencePart[sentencePartsStrings.length];
        for (int i = 0; i < sentenceParts.length; i++) {
            if (Pattern.matches("\\p{Punct}", sentencePartsStrings[i].substring(0, 1))) {
                sentenceParts[i] = new Punctuation(sentencePartsStrings[i]);
            } else {
                sentenceParts[i] = new Word(sentencePartsStrings[i]);
            }
        }
    }

    public Word GetFirstWord(){
        for(int i=0;i<sentenceParts.length;i--) {
            if(sentenceParts[i].GetIndex()==0){
                continue;
            }
            return (Word) sentenceParts[i];
        }
        return new Word("");
    }
    public Word GetLastWord(){
        for(int i=sentenceParts.length-1;i>=0;i--) {
            if(sentenceParts[i].GetIndex()==0){
                continue;
            }
            return (Word) sentenceParts[i];
        }
        return new Word("");
    }

    public void SetFirstWord(Word word){
        for(int i=0;i<sentenceParts.length;i--) {
            if(sentenceParts[i].GetIndex()==1){
                sentenceParts[i]=word;
                break;
            }

        }
    }
    public void SetLastWord(Word word){
        for(int i=sentenceParts.length-1;i>=0;i--) {
            if(sentenceParts[i].GetIndex()==0){
                sentenceParts[i]=word;
                break;
            }
        }
    }

    public void Show(){
        for(int i=0; i<sentenceParts.length;i++){
            sentenceParts[i].Show();
            if((i<(sentenceParts.length-1)&&sentenceParts[i].GetIndex()==0&&sentenceParts[i+1].GetIndex()==0)||
                    (i<(sentenceParts.length-1)&&sentenceParts[i].GetIndex()==1&&sentenceParts[i+1].GetIndex()==0)){
                continue;
            }
            System.out.print(' ');
        }
    }
}

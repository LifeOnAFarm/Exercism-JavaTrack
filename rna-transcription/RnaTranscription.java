import java.util.ArrayList;
import java.util.stream.Collectors;

class RnaTranscription {

    String transcribe(String dnaStrand) {

        if(dnaStrand == "") return "";

        ArrayList <Character> dnaLetters = new ArrayList<>(); 

        for(int i = 0; i<dnaStrand.length(); i++){
            dnaLetters.add(dnaStrand.charAt(i));
        }

        for(int x = 0; x < dnaLetters.size(); x++){
            if(dnaLetters.get(x) == 'G'){
                dnaLetters.set(x, 'C');
            } else if (dnaLetters.get(x) == 'C'){
                dnaLetters.set(x, 'G');
            } else if (dnaLetters.get(x) == 'T'){
                dnaLetters.set(x, 'A');
            } else if ( dnaLetters.get(x) == 'A'){
                dnaLetters.set(x, 'U');
            }
        }

        String listString = dnaLetters.stream().map(Object::toString)
                        .collect(Collectors.joining(""));

        return(listString);
    }

}

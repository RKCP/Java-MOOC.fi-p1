
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess
        
        if (this.word.contains(letter)) {
            if (!this.guessedLetters.contains(letter)) {
                this.guessedLetters += letter;
            } // if the letter has already been guessed, nothing happens
        }else {
        // it the word does not contains the guessed letter, number of faults increase
            if (!this.guessedLetters.contains(letter)) {
                this.guessedLetters += letter;
                this.numberOfFaults++;
            }   
        }

        


    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word
        
        // BUILD THE HIDDEN WORD WITH UNDERSCORES
        int hiddenWordUnderscores = 0;
        String hiddenWord = "";
        StringBuilder newHiddenWord = new StringBuilder("");
        
        for (int i = 0; i < this.word.length(); i++) {
            hiddenWord += "_";
            newHiddenWord.append("_");
        }
        
        // GO THROUGH EACH CHARACTER IN THIS.WORD AND SEE IF IT MATCHES THE GUESS. 
        // IF IT DOES, REPLACE THE UNDERSCORE AT THAT INDEX WITH THE GUESSED LETTER.
        for (int i = 0; i < this.word.length(); i++) {
            char currentChar = this.word.charAt(i);
            String currentLetter = "" + currentChar;
            
            // IF THE CURRENT LETTER IS IN THE WORD
            if (this.guessedLetters.contains(currentLetter)) {
                // GET THE CURRENT UNDERSCORE OF THE INDEX WE ARE IN, SET IT TO currentChar
                newHiddenWord.setCharAt(i, currentChar);
            }
        }     
        hiddenWord = newHiddenWord.toString();

        return hiddenWord;
        
    }
    
        // could have used the below verision which doesn't set the hiddenWord at the start, but does it as it loops through this.word, putting
        // underscores if the guessedLetters String doesn't contain the current char in this.word we are itterating with, and adding the char
        // to the hiddenWord if it is in the guessedLetters String. I guess I did it the way I did, based on how the question was phrased. Still, I should
        // have thought about doing it this way. Oh well, at least I know now for the future.
        
//        
//        String hiddenVersionOfWord = "";
// 
//        int letterIndex = 0;
//        while (letterIndex < this.word.length()) {
//            char character = this.word.charAt(letterIndex);
// 
//            if (this.guessedLetters.contains("" + character)) {
//                hiddenVersionOfWord = hiddenVersionOfWord + character;
//            } else {
//                hiddenVersionOfWord = hiddenVersionOfWord + "_";
//            }
// 
//            letterIndex++;
//        }
//   
}

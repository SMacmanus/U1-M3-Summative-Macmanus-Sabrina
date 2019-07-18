package com.company.U1M3SummativeMacmanusSabrina;

public class Word {
    private String word;
    private String definition;

    public Word(){}
    public Word(String word, String definition){
        this.word = word;
        this.definition = definition;
    }

    public String getWord(){return this.word;}
    public void setWord(String word){this.word = word;}
    public String getDefinition() {return this.definition;}
    public void setDefinition(String Definition){this.definition = definition;}
}

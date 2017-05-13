package controllers;

/**
 * Created by stus on 12.05.17.
 */
public class Word {
    public String word;
    public String translate;
    public float usage = 2;

    public Word(String word, String translate, float usage) {
        this.word = word;
        this.translate = translate;
        this.usage = usage;
    }
}

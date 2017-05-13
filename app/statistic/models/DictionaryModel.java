package statistic.models;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by stus on 13.05.17.
 */
public class DictionaryModel {
    public List<WordModel> learnedDictionary = new ArrayList<>();
    public List<WordModel> studiedDictionary = new ArrayList<>();

    public DictionaryModel(List<WordModel> learnedDictionary, List<WordModel> studiedDictionary) {
        this.learnedDictionary = learnedDictionary;
        this.studiedDictionary = studiedDictionary;
    }

    public DictionaryModel() {

    }

    public void update(List<WordModel> learnedDictionary, List<WordModel> studiedDictionary){
        this.learnedDictionary = learnedDictionary;
        this.studiedDictionary = studiedDictionary;
    }
}

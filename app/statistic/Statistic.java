package statistic;

import statistic.models.DictionaryModel;
import statistic.models.StatisticModel;
import statistic.models.UserModel;

import java.util.Date;
import java.util.List;

/**
 * Created by stus on 11.05.17.
 */
public class Statistic {
    public static void updateStatistic(String id) {
        UserModel userModel = new UserModel();
        userModel = userModel.getUserById(id);
        DictionaryModel dictionaryModel = userModel.dictionary;
        List<StatisticModel> statisticList = userModel.statistic;
        float wordRaiting = 0f;
        float rating;
        for (int i = 0; i < dictionaryModel.learnedDictionary.size(); i++) {
            float wordFrequency = dictionaryModel.learnedDictionary.get(i).frequency;
            float wordUsage = dictionaryModel.learnedDictionary.get(i).usage;
            wordRaiting += wordFrequency * wordUsage;
        }
        rating = wordRaiting / dictionaryModel.learnedDictionary.size();
        statisticList.add(new StatisticModel(rating, new Date()));
        userModel.updateUser(userModel);
    }
}

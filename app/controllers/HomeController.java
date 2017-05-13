package controllers;

import play.mvc.*;
import statistic.Statistic;
import statistic.models.DictionaryModel;
import statistic.models.StatisticModel;
import statistic.models.UserModel;
import statistic.models.WordModel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
//        List<WordModel> learnedDictionary = Arrays.asList(new WordModel("dsdsd","вывыв",0.4f,0.6f)
//                ,new WordModel("dsddsdsdsd","в2ывыв",0.6f,0.6f));
//        List<WordModel> studiedDictionary = Arrays.asList(new WordModel("ddddddd", "вывыв", 0.3f, 0.6f)
//                , new WordModel("dsddsdsdsd", "в2ывыв", 0.8f, 0.5f));
//        DictionaryModel dictionaryModel = new DictionaryModel(learnedDictionary,studiedDictionary);
//        List<StatisticModel> statisticModelList = Arrays.asList(new StatisticModel(0.5f,new Date()),new StatisticModel(0.3f,new Date()));
//        new UserModel("223311212","test","343434343",dictionaryModel,statisticModelList).insert();
        Statistic.updateStatistic("223311212");
        return ok(Statistic.getStatistic("223311212"));

    }


}

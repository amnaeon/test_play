package models.requestModels;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.jongo.MongoCollection;
import play.Play;
import uk.co.panaxiom.playjongo.PlayJongo;

import java.util.Date;

/**
 * Created by stus on 11.05.17.
 */

public class UserModel {
    public static PlayJongo jongo = Play.application().injector().instanceOf(PlayJongo.class);

    public static MongoCollection messages() {
        return jongo.getCollection("temp");
    }

    @JsonProperty("_id")
    public ObjectId id;
    public String name;
    public String sername;
    public Date timeStemp;
    public float rating;

    public UserModel insert() {
        messages().save(this);
        return this;
    }

    public UserModel(String name, String sername, Date timeStemp, float rating) {
        this.name = name;
        this.sername = sername;
        this.timeStemp = timeStemp;
        this.rating = rating;
    }

    public UserModel() {
    }
}


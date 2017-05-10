package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.bson.types.ObjectId;
import org.jongo.MongoCollection;
import play.Play;
import uk.co.panaxiom.playjongo.PlayJongo;

public class TeleramBotMessage {
    public static PlayJongo jongo = Play.application().injector().instanceOf(PlayJongo.class);

    public static MongoCollection messages() {
        return jongo.getCollection("telegram_bot_message");
    }

    @JsonProperty("_id")
    public ObjectId id;

    public String name;

    public String message;

    public TeleramBotMessage insert() {
        messages().save(this);
        return this;
    }


}

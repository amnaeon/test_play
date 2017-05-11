package controllers;

import ExternalServices.TelegramApi;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import models.TeleramBotMessage;
import models.requestModels.TextMessageSendModel;
import play.Configuration;
import play.Logger;
import play.libs.ws.WSClient;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by stus on 11.05.17.
 */
public class KeyboardController extends Controller {
    private final Configuration configuration;
    private WSClient wsClient;
    private TelegramApi telegramApi;


    @Inject
    public KeyboardController(WSClient wsClient, Configuration configuration) {
        this.wsClient = wsClient;
        this.configuration = configuration;
        telegramApi = new TelegramApi(wsClient, configuration);
    }


    public Result onUpdate() {
        ObjectMapper mapper = new ObjectMapper();
        JsonNode requestData = request().body().asJson();
        if (requestData != null) {
            Logger.error(request().body().asText());
            Logger.error(request().body().asJson().toString());

            List<List<String>> keyWordList = new ArrayList<>();
            List<String> line = Arrays.asList("dsd","dddd","qqqqqq");
            keyWordList.add(line);
            telegramApi.createKeyboard(keyWordList);
        }
        return ok("кек");
    }
}

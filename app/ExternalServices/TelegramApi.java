package ExternalServices;

import com.fasterxml.jackson.databind.JsonNode;
import models.requestModels.TextMessageSendModel;
import play.Configuration;
import play.libs.Json;
import play.libs.ws.WSClient;
import play.libs.ws.WSResponse;

import java.util.List;
import java.util.concurrent.CompletionStage;

public class TelegramApi {
    static String path;
    private final WSClient ws;

    public TelegramApi(WSClient ws, Configuration configuration) {
        this.ws = ws;
        path = configuration.getString("telegram.botApi");
    }

    public void sendMessage(TextMessageSendModel message) {
        CompletionStage<WSResponse> response = ws.url(path + "sendMessage")
                .setContentType("application/json")
                .post(Json.toJson(message));
        final CompletionStage<JsonNode> result = response.thenApply(wsResponse -> {
            JsonNode json = wsResponse.asJson();
            return json;

        });
    }

    public void createKeyboard(List<List<String>> data) {
        CompletionStage<WSResponse> response = ws.url(path + "ReplyKeyboardMarkup")
                .setContentType("application/json")
                .post(Json.toJson(data));
        final CompletionStage<JsonNode> result = response.thenApply(wsResponse -> {
            JsonNode json = wsResponse.asJson();
            return json;

        });
    }
}

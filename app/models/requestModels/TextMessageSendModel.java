package models.requestModels;

public class TextMessageSendModel {
    public long chat_id;
    public String  text;

    public TextMessageSendModel(){

    }

    public TextMessageSendModel(long chat_id,String  text){
        this.chat_id = chat_id;
        this.text = text;
    }
}

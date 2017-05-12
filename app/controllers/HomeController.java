package controllers;

import models.requestModels.UserModel;
import play.mvc.*;

import java.util.Date;

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
            new UserModel("223287412","Влад", "Карпенко", new Date(), 0.33434f).insert();
            new UserModel("158074167","Юра", "Брайко", new Date(), 0.13434f).insert();
            new UserModel("193027237","Андрей", "Вельтищев", new Date(), 0.43434f).insert();
        return ok("кек");
    }


}

package statistic.models;

import java.util.Date;

/**
 * Created by stus on 13.05.17.
 */
public class StatisticModel {
    public float raitng;
    public Date timeStemp;

    public StatisticModel(float raitng, Date timeStemp) {
        this.raitng = raitng;
        this.timeStemp = timeStemp;
    }
}

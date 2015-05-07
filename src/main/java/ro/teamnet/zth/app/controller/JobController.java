package ro.teamnet.zth.app.controller;

import ro.teamnet.zth.api.annotations.MyController;
import ro.teamnet.zth.api.annotations.MyRequestMethod;

/**
 * Created by Ionutz on 07.05.2015.
 */
@MyController(urlPath = "/jobs")
public class JobController {

    @MyRequestMethod(urlPath = "/all")
    public String getAllJobs() {
        return "allJobs";
    }

    @MyRequestMethod(urlPath = "/one")
    public String getOneJob() {
        return "oneRandomJob";
    }
}

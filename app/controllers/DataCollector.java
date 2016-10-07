package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class DataCollector extends Controller {

    public static void index() {
    	
    	String data = request.params.get("message");
    	Logger.log4j.info(data.toString());
        renderJSON("success");
    }

}
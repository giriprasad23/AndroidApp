package com.blakky.helper;

import java.util.ArrayList;
import java.util.List;

import org.apache.http.NameValuePair;
import org.json.JSONArray;
import org.json.JSONObject;

import android.util.Log;

public class UserFunctions {

	private Json jsonParser;
	public static final String feedurl = "http://omega.uta.edu/~sas4798/food_get.php";
	public static final String clothurl = "http://omega.uta.edu/~sas4798/cloth_get.php";
	public static final String housingurl = "http://omega.uta.edu/~sas4798/house_get.php";
	public static final String furniurl = "http://omega.uta.edu/~sas4798/furni_get.php";

	public JSONArray getDetails() throws Exception{
		// getting JSON Object
		JSONArray json = jsonParser.getJson(feedurl);
		Log.i("tag", json+"");
		return json;
		
	}

	public JSONArray getClothDetails() throws Exception{
		// getting JSON Object
		JSONArray json = jsonParser.getJson(clothurl);
		Log.i("tag", json+"");
		return json;
		
	}
	
	public JSONArray getHousingDetails() throws Exception{
		// getting JSON Object
		JSONArray json = jsonParser.getJson(housingurl);
		Log.i("tag", json+"");
		return json;
		
	}
	
	public JSONArray getFurniDetails() throws Exception{
		// getting JSON Object
		JSONArray json = jsonParser.getJson(furniurl);
		Log.i("tag", json+"");
		return json;
		
	}
}

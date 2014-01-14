package com.ebn.generator;
 
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import java.lang.Thread;
import java.lang.Runnable;
import java.lang.Exception;

public class Generator extends CordovaPlugin{
	
	public static final String INITIALIZE = "initialize";

	@Override
	public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
 		
		try{
			Thread t = new Thread(new Runnable(){
			
				public void run(){
				
					while(true){
						fireEvent();
						try{
							Thread.sleep(15000);
						}catch(Exception e){
							continue;
						}
					}
				
				}
			});
			t.start();
		}catch(Exception e){
			//that's not good. do stuff to safe the day
			return false;
		}
		return true;
	}

	private void fireEvent(){
		webView.sendJavascript("alert('it works!')");
	}

}

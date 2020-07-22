package com.pref.my;

import android.app.Activity;
import android.os.Bundle;
import com.pref.my.R;
import android.content.Context;
import android.content.SharedPreferences; 
import android.telephony.TelephonyManager;
import android.content.Intent; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 	import android.widget.EditText; 
	 
public class MainActivity extends Activity { 	 
	    Button button; 
	    EditText editText; 
 
	    @Override 
	    protected void onCreate(Bundle savedInstanceState) { 
	        super.onCreate(savedInstanceState); 
	        setContentView(R.layout.activity_main); 
	 
	        button = (Button) findViewById(R.id.button); 
	        editText = (EditText) findViewById(R.id.editText); 
	 
 
	  
	  
	  
	    } 
	 
	    public void onClick(View view) { 
	        String name = editText.getText().toString(); 
	        if(name.length() == 0){ 
	            editText.setError("You must enter your name"); 
	        } 
	        else { 
int m= 90;
//To save
SharedPreferences settings = getSharedPreferences("YOUR_PREF_NAME", 0);
SharedPreferences.Editor editor = settings.edit();
editor.putInt("m",m);
editor.commit();


	        
	            Intent intent = new Intent(MainActivity.this, Activity2.class); 
String n2= "5";	            intent.putExtra("name", name); 
intent.putExtra("n2", n2); 	            
	
	
	            
	            
	            startActivity(intent); 
	        } 
	    } 
	} 

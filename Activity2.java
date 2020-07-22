package com.pref.my;
import android.content.SharedPreferences; 


import android.content.Context;
import android.content.SharedPreferences; 
import android.telephony.TelephonyManager;


import android.content.Intent; 
import android.app.Activity; 
import android.os.Bundle; 
import android.view.View; 
import android.widget.Button; 
import android.widget.TextView; 
 public class Activity2 extends Activity { 	 
  Button button; 
	   TextView textView; 
	 
	    @Override 
	    protected void onCreate(Bundle savedInstanceState) { 
	        super.onCreate(savedInstanceState);	        setContentView(R.layout.activity_1); 
	        button = (Button) findViewById(R.id.button); 
	        textView = (TextView) findViewById(R.id.textView); 
	        String name = getIntent().getStringExtra("name");
	        
String n2 = getIntent().getStringExtra("n2");	        







//To retrieve
SharedPreferences settings = getSharedPreferences("YOUR_PREF_NAME", 0);
int m = settings.getInt("SNOW_DENSITY", 0); //0 is the default value

int y=m+1;
	         
	        textView.setText("Hello "+name+y+name); 
} 
    public void onClick(View view) {
      String name = getIntent().getStringExtra("name"); 
        
     
    Intent intent = new Intent(Activity2.this, name.class); 
   intent.putExtra("name", name);
   
   
   
   
   startActivity(intent); 
	    } }
	    
//////*	    
	    
package com.example.choretab;

import java.io.File;
import com.parse.Parse;
import com.parse.ParseAnalytics;
import com.parse.ParseObject;
import com.parse.ParseTwitterUtils;
import com.parse.ParseUser;
import com.parse.ParseException;
import com.parse.LogInCallback;
import com.parse.SignUpCallback;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

public class Login extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
    	Parse.initialize(this, "msXDh7zu5fMVxmR4IRLMjC7Yf42fKpzdQLwVkEHD", "gJd7ZnXizyr3dJyFUgWlO1KtdKKI0NmD4pGonOTi");
    	ParseTwitterUtils.initialize("8a6TfJCj39xZFrtBCLuIhg", "MaEWpZzdnuQA8v8NOxbW7KmyrLPWRDl3TJItGELsOg");
    	//ParseAnalytics.trackAppOpened(getIntent());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.login, menu);
        return true;
        }
    
    public void twitterLogIn()
    {
    	ParseTwitterUtils.logIn(this, new LogInCallback() {
      	  @Override
      	  public void done(ParseUser user, ParseException err) {
      	    if (user == null) {
      	      Log.d("ChoreTab", "Uh oh. The user cancelled the Twitter login.");
      	    } else if (user.isNew()) {
      	      Log.d("ChoreTab", "User signed up and logged in through Twitter!");
      	    } else {
      	      Log.d("ChoreTab", "User logged in through Twitter!");
      	    }
      	  }
      	});
    }
    public void loginTo(View view)
    {  
    	/*
    	ParseUser.logInInBackground("test123", "test123", new LogInCallback() {
    		  public void done(ParseUser user, ParseException e) {
    		    if (user != null) {
    		    	Intent intent = new Intent(this, WelcomeActivity.class);
    		        startActivity(intent);
    		      // Hooray! The user is logged in.
    		    } else {
    		      // Signup failed. Look at the ParseException to see what happened.
    		    }
    		  }
    		});
    		*/
    	
    	Intent intent = new Intent(this, WelcomeActivity.class);
        startActivity(intent);
        
        
    }
    
    
    
    
}


package com.example.user.binarybeast;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class login_activity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_activity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login_activity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void authenticateUser(View view) {
        EditText usernameEntry = (EditText) findViewById(R.id.usernameText);
        EditText passwordEntry = (EditText) findViewById(R.id.passwordText);
        String username = usernameEntry.getText().toString();
        String password = passwordEntry.getText().toString();

        if(username.equals("user"))  {
            if(password.equals("pass")) {
                //start activity, say you logged in, whatevers
                Intent intent = new Intent(this, HomePage.class);
                startActivity(intent);
            }
        }
    }
    public void cancelLogin(View view){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
}

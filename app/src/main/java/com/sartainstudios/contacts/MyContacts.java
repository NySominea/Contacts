package com.sartainstudios.contacts;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;


public class MyContacts extends AppCompatActivity {

    // starts and shows activity_my_contacts
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_contacts);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_my_contacts, menu);
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

        //handle presses on the action bar items
        switch (item.getItemId()) {
            //case R.id.action_search:
             //   startActivity(new Intent(this, SearchActivity.class));
            //    return true;
           // case R.id.action_add_friend:
          //      startActivity(new Intent(this, AddFriend.class));
          //      return true;
          //  case R.id.action_my_profile:
          //      startActivity(new Intent(this, MyProfile.class));
         //       return true;
            case R.id.action_about:
                startActivity(new Intent(this, AboutContacts.class));
                return true;
            //case R.id.action_settings:
            //    startActivity(new Intent(this, SettingsActivity.class));
            //    return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
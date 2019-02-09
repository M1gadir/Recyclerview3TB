package com.magad.recyclerview3tb;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.magad.recyclerview3tb.Fragment.FragmentGridDua;
import com.magad.recyclerview3tb.Fragment.FragmentGridSatu;
import com.magad.recyclerview3tb.Fragment.FragmentGridTiga;

public class MainActivity extends AppCompatActivity {

    FragmentManager fm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fm = getSupportFragmentManager();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        fm.beginTransaction().add(R.id.wadah,new FragmentGridSatu()).commit();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_kali,menu);
        return super.onCreateOptionsMenu(menu);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Fragment destination = null;

        switch (item.getItemId()) {
            case R.id.griddua :
                destination = new FragmentGridDua();
                break;
            case R.id.gridtiga:
                destination = new FragmentGridTiga();
                break;
        }
        assert destination != null;
        fm.beginTransaction().replace(R.id.wadah,destination).addToBackStack("").commit();
        return super.onOptionsItemSelected(item);
    }
}

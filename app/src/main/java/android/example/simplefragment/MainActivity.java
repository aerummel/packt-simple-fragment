package android.example.simplefragment;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.View;

import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get a fragment manager
        FragmentManager fManager = getSupportFragmentManager();

        // Create a new fragment using the manager passing in the id of the layout to hold it
        Fragment frag = fManager.findFragmentById(R.id.fragmentHolder);

        // Check the fragment has not already been initialized
        if (frag == null) {
            //Initialize the fragment based on out SimpleFragment
            frag = new SimpleFragment();
            fManager.beginTransaction().add(R.id.fragmentHolder, frag).commit();
        }
    }
}
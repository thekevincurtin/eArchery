package edu.gatech.earchery.earchery;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ViewFlipper;

public class InitialTraining extends AppCompatActivity {
    ViewFlipper viewFlipper;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial_training);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        viewFlipper = (ViewFlipper) findViewById(R.id.view_flipper);
    }
    public void flipView(View view){
        viewFlipper.showNext();
    }
}

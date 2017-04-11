package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int falconsScore = 0;
    int patriotsScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForFalcons(0);
        displayForPatriots(0);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    /**
     * Method called when Falcon Touch Down button clicked
     */
    public void touchDownFalcons(View view) {
        falconsScore = falconsScore + 6;
        displayForFalcons(falconsScore);
    }

    /**
     * Method called when Falcons Field Goal button clicked
     */
    public void fieldGoalFalcons(View view) {
        falconsScore = falconsScore + 3;
        displayForFalcons(falconsScore);
    }

    /**
     * Method called when Falcons Safety button is clicked
     */
    public void safetyFalcons(View view) {
        falconsScore = falconsScore + 2;
        displayForFalcons(falconsScore);
    }

    /**
     * Method called when Falcons Extra Points button is clicked
     */
    public void extraPointFalcons(View view) {
        falconsScore = falconsScore + 1;
        displayForFalcons(falconsScore);
    }

    /**
     * Method called when Patriots touch down button clicked
     */
    public void touchDownPatriots(View view) {
        patriotsScore = patriotsScore + 6;
        displayForPatriots(patriotsScore);
    }

    /**
     * Method called when Patriots field goal button clicked
     */
    public void fieldGoalPatriots(View view) {
        patriotsScore = patriotsScore + 3;
        displayForPatriots(patriotsScore);
    }

    /**
     * Method called when Patriots safety button is clicked
     */
    public void safetyPatriots(View view) {
        patriotsScore = patriotsScore + 2;
        displayForPatriots(patriotsScore);
    }

    /**
     * Method called when Patriots Extra Points button is clicked
     */
    public void extraPointPatriots(View view) {
        patriotsScore = patriotsScore + 1;
        displayForPatriots(patriotsScore);
    }

    /**
     * Displays the given score for the Falcons - method displayForTeamA declared
     */
    public void displayForFalcons(int falconsScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(falconsScore));
    }

    /**
     * Displays the given score for the Patriots - method displayForTeamA declared
     */
    public void displayForPatriots(int patriotsScore) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(patriotsScore));
    }

    /**
     * Method called to reset
     */
    public void restAllScore(View view) {
        falconsScore = 0;
        patriotsScore = 0;
        displayForFalcons(falconsScore);
        displayForPatriots(patriotsScore);
    }


}
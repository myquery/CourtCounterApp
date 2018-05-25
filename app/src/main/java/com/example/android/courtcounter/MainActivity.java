package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /**
     * declare the variable to hold scores for both team
     */
    int teamAPoint = 0;
    int teamBPoint = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /**
     * Method that add 3 points to team A score
     */

    public void addThreeForTeamA(View v){
        teamAPoint += 3;
        displayTeamA(teamAPoint);


    }
    /**
     * Method that add 2 points to team A score
     */
    public void addTwoForTeamA(View v){
        teamAPoint += 2;
        displayTeamA(teamAPoint);
    }

    /**
     * Method that add 1 point to team A score
     */
    public void addOneForTeamA(View v){
        teamAPoint += 1;
        displayTeamA(teamAPoint);

    }

    /**
     * Method that add 3 points to team B score
     */
    public void addThreeForTeamB(View v){
        teamBPoint += 3;
        displayTeamB(teamBPoint);

    }

    /**
     * Method that add 2 points to team B score
     */
    public void addTwoForTeamB(View v){
        teamBPoint += 2;
        displayTeamB(teamBPoint);

    }

    /**
     * Method that add 1 point to team B score
     */

    public void addOneForTeamB(View v){
        teamBPoint += 2;
        displayTeamB(teamBPoint);

    }

    /**
     * Method that reset scores for both team B score
     */
    public void resetPoints(View v){
       teamAPoint = 0;
       teamBPoint = 0;
        displayTeamA(teamAPoint);
        displayTeamB(teamBPoint);

    }

    /**
     * Method that displays Team A total scores
     */
    private void displayTeamA(int score){
        TextView teamAScore = (TextView) findViewById(R.id.team_a_score);
                teamAScore.setText(String.valueOf(score));
    }

    /**
     * Method that displays Team B total scores
     */
    private void displayTeamB(int score){
        TextView teamBScore = (TextView) findViewById(R.id.team_b_score);
        teamBScore.setText(String.valueOf(score));
    }
}

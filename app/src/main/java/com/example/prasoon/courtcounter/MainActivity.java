package com.example.prasoon.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int teamAScore=0;
    int teamBScore=0;

    private void displayTeamAScore(int scoreTeamA)
    {
        TextView t =(TextView) findViewById(R.id.Score_TeamA);
        t.setText(String.valueOf(scoreTeamA));
    }
    private void displayTeamBScore(int scoreTeamB)
    {
        TextView t =(TextView) findViewById(R.id.Score_TeamB);
        t.setText(String.valueOf(scoreTeamB));
    }

    public void threeTeamA(View view){
        teamAScore+=3;
        displayTeamAScore(teamAScore);
    }
    public void twoTeamA(View view)
    {
        teamAScore+=2;
        displayTeamAScore(teamAScore);
    }
    public void freeThrowTeamA(View view)
    {
        ++teamAScore;
        displayTeamAScore(teamAScore);
    }
    public void threeTeamB(View view){
        teamBScore+=3;
        displayTeamBScore(teamBScore);
    }
    public void twoTeamB(View view)
    {
        teamBScore+=2;
        displayTeamBScore(teamBScore);
    }
    public void freeThrowTeamB(View view)
    {
        ++teamBScore;
        displayTeamBScore(teamBScore);
    }
    public void resetScore(View view)
    {
        teamAScore=0;
        teamBScore=0;
        displayTeamAScore(teamAScore);
        displayTeamBScore(teamBScore);
    }
}

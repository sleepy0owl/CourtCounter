package com.example.sourav.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    /**
     * team a goals and fouls variable
     */
    int teamAGoals = 0;
    int teamAFouls = 0;

    /**
     *team b goals and fouls variables
     */
    int teamBGoals = 0;
    int teamBFouls = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayGoalsTeamA(teamAGoals);
        displayFoulsTeamA(teamAFouls);
        displayGoalsTeamB(teamBGoals);
        displayFoulsTeamB(teamBFouls);
    }

    /**
     * display score function for team a
     */
    public void displayGoalsTeamA(int team_a_score){
        TextView teamAGoals = findViewById(R.id.team_a_score);
        teamAGoals.setText(String.valueOf(team_a_score));
    }

    /**
     * display fouls for team a
     */
    public void displayFoulsTeamA(int team_a_fouls){
        TextView teamAFouls = findViewById(R.id.team_a_fouls);
        teamAFouls.setText(String.valueOf(team_a_fouls));
    }
    //////////////////for team b/////////////////////////
    /////////////////////////////////////////////////////
    /////////////////////////////////////////////////////
    /**
     * display score function for team a
     */
    public void displayGoalsTeamB(int team_b_score){
        TextView teamAGoals = findViewById(R.id.team_b_score);
        teamAGoals.setText(String.valueOf(team_b_score));
    }

    /**
     * display fouls for team a
     */
    public void displayFoulsTeamB(int team_b_fouls){
        TextView teamAFouls = findViewById(R.id.team_b_fouls);
        teamAFouls.setText(String.valueOf(team_b_fouls));
    }

    /**
     * team a increment methods
     */
    public void incrementGoalsTeamA(View view){
        teamAGoals = teamAGoals + 1;
        displayGoalsTeamA(teamAGoals);
    }
    public void incrementFoulsTeamA(View view){
        teamAFouls = teamAFouls + 1;
        displayFoulsTeamA(teamAFouls);
    }
    /**
     * team b increment methods
     */
    public void incrementGoalsTeamB(View view){
        teamBGoals = teamBGoals + 1;
        displayGoalsTeamB(teamBGoals);
    }
    public void incrementFoulsTeamB(View view){
        teamBFouls = teamBFouls + 1;
        displayFoulsTeamB(teamBFouls);
    }

    /**
     * reset function
     */
    public void reset(View view){
        teamAGoals = 0;
        teamAFouls = 0;
        teamBGoals = 0;
        teamBFouls = 0;
        displayGoalsTeamA(teamAGoals);
        displayFoulsTeamA(teamAFouls);
        displayGoalsTeamB(teamBGoals);
        displayFoulsTeamB(teamBFouls);
    }

}

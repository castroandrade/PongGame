package Game.Screens.Elements.Score;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author VPF
 */
public class Score {
    protected int pScore;

    public Score(int pScore) {
        this.pScore = pScore;
    }

    public void newScore () {
        this.pScore ++;
    }

    public int getPlayerScore() {
        return pScore;
    }

    public void setPlayerScore(int playerScore) {
        this.pScore = playerScore;
    }
}

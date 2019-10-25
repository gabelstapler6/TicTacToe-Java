
package TicTacToe;

/**
 * Player
 */
public class Player {
    private int score;
    private String name;
    public int[] playerClicks = new int[9];
    
    public Player(String n) {
        this.name = n;
        this.score = 0;

    }
    public void setName(String name) {
        this.name = name;
    }
    public void incScore(int score) {
        this.score++;
    }

    public boolean checkWin() {
        int win = 0, x = 0;
        for(int value = 0; value < 8; value++){
            for(int i = 0; i < 3; i++){
                switch(value){                          
                    case 0: 
                    if(this.playerClicks[i] == 1)
                        win++;
                    x = 3;
                    break;
                    case 1: 
                    if(this.playerClicks[i+x] == 1)
                        win++;
                    x++;
                    break;
                    case 2:
                    if(this.playerClicks[i+x] == 1)
                        win++;
                    x++;
                    break;
                    case 3: 
                    case 4:
                    case 5:
                    for(int y = 0; y < 9; y += 3){
                        if(this.playerClicks[i+y] == 1)
                            win++;
                    }
                    
                    
                }
            }
            if(win == 3){
                return true;
            }
            win = 0;
        }
        return false;
    }

    
}
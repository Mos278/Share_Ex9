public class Manager {
    //    
    private Game game;

    public void setManager(Game game){
        this.game = game;
    }

    //sorting
    public void execute(){
        game.initializeGame();
        game.playingGame();
        game.ShowResult();
    }
}


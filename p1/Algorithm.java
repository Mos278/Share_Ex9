public abstract class Algorithm {
	
	protected abstract void initializeGame();
	protected abstract void playingGame();
	protected abstract void showResult();
	
	
	public final void sort() {
		initializeGame();
		playingGame();
		showResult();
	}
}

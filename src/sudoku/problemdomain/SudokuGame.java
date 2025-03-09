package sudoku.problemdomain;

import java.io.Serializable;

public class SudokuGame implements Serializable {
    private final GameState gameState;
    private final int[][] griState;

    public static final int GRID_BOUNDARY = 9;

    public SudokuGame(GameState gameState, int[][] gridState) {
        this.gameState = gameState;
        this.griState = gridState;
    }

    public GameState getGameState() {
        return gameState;
    }

    public int[][] getGriState() {
        return SudokuUtilities.copyToNewArray(griState);
    }
}

import javax.swing.*;

public class App {

	public static void main(String[] args) {
		int boardHeight = 600;
		int boardWidth = boardHeight;

		JFrame frame = new JFrame("Jogo da Cobrinha");
		frame.setVisible(true);
		frame.setSize(boardHeight, boardWidth);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		SnakeGame snakeGame = new SnakeGame(boardHeight, boardWidth);
		frame.add(snakeGame);
		frame.pack();
		snakeGame.requestFocus();
	}

}

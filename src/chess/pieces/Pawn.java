package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece {
	
	public Pawn(Board board,Color color) {
		super(board,color);
	}
	
	@Override
	public String toString() {
		if(getColor()==Color.WHITE) {
			return 	"\u2659";
			}
			else {
				return "\u265f";
			}
	}
}

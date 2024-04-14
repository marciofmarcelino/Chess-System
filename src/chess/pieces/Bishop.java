package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Bishop extends ChessPiece{
	
	public Bishop (Board board,Color color){
		super(board,color);
	}
	
	
	@Override
	@Override
	public String toString() {
		if(getColor()==Color.WHITE) {
			return 	"\u2657";
			}
			else {
				return "\u265d";
			}
	}

}

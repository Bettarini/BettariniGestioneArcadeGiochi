package services;

import java.util.ArrayList;

import models.Game;


public class GameService {
		ArrayList <Game> games = new ArrayList <Game>();
		public void insertGame(String nome, int anno, int livello)
		{
			Game game1 = new Game("SuperAvventura", 2020, 5);	
			Game game2 = new Game("BattagliaGalattica", 2018, 3);
			Game game3 = new Game("MisteroNellaForesta", 2023, 7);
			Game game4 = new Game("RacingPro", 2021, 4);
			
			this.games.add(game1);
		}
		
}

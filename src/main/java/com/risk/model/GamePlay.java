package com.risk.model;

import java.util.List;

/**
 * This class represents the Game Play state at any point of time.
 * 
 * @author <a href="zinnia.rana.22@gmail.com">Zinnia Rana</a>
 * @version 0.0.1
 */

public class GamePlay {
	
	/**
	 * State of the entire game at any point of time.
	 */
	private List<Player> game_state;
	
	/**
	 * Map File name for the current game play
	 */
	private String file_name;

	/**
	 * Map object for the current game play
	 */
	private com.risk.model.Map map;

	/**
	 * Currently active phase during game play
	 */
	private String game_phase;

	/**
	 * Currently active player during game play.
	 */
	private int current_player;

	/**
	 * List of Cards which are free and are not held by any player.
	 */
	private List<Card> free_cards;

	/**
	 * Status message for GamePlay. Contains messages from various validations
	 * during GamePlay.
	 */
	private String status;

	private static Attack attack;

	/**
	 * @return the attack instance
	 */
	public static Attack getAttack() {
		return attack.getAttackInstance();
	}

	/**
	 * @return the game_state
	 */
	public List<Player> getGame_state() {
		return game_state;
	}

	/**
	 * @param game_state the game_state to set
	 */
	public void setGame_state(List<Player> game_state) {
		this.game_state = game_state;
	}

	/**
	 * @return the file_name
	 */
	public String getFile_name() {
		return file_name;
	}

	/**
	 * @param file_name the file_name to set
	 */
	public void setFile_name(String file_name) {
		this.file_name = file_name;
	}

	/**
	 * @return the game_phase
	 */
	public String getGame_phase() {
		return game_phase;
	}

	/**
	 * @param game_phase the game_phase to set
	 */
	public void setGame_phase(String game_phase) {
		this.game_phase = game_phase;
	}

	/**
	 * @return the status of the game state with any error message if they exist
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status Any messages to be displayed while rendering the game state.
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the currently active player in the game state
	 */
	public int getCurrent_player() {
		return current_player;
	}

	/**
	 * @param current_player sets the currently active player in the game state
	 */
	public void setCurrent_player(int current_player) {
		this.current_player = current_player;
	}

	/**
	 * @return the current list of free cards
	 */
	public List<Card> getFree_cards() {
		return free_cards;
	}

	/**
	 * @param free_cards list of cards to be set as freely available cards.
	 */
	public void setFree_cards(List<Card> free_cards) {
		this.free_cards = free_cards;
	}

	/**
	 * @return the currently active map object
	 */
	public com.risk.model.Map getMap() {
		return map;
	}

	/**
	 * @param map the currently active map object.
	 */
	public void setMap(com.risk.model.Map map) {
		this.map = map;
	}

}
package language.phones.vowels;

import language.phones.Sound;

public class Vowel extends Sound {
	boolean round;
	Height height;
	Backness backness;
	public Vowel(char ipa, boolean isRound, Backness front, Height up){
		this.ipa = ipa;
		round = isRound;
		height = up;
		backness = front;
	}
}

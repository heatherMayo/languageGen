package language.phones.vowels;

import language.phones.Sound;
import language.phones.Voice;

public class Vowel extends Sound {
	private boolean round = false ; //assume no if not specified
	private boolean nasal = false; //assume no if not specified, specify after rounded - ie the height backness bool should specify roundness and not nasality
	private Height height;
	private Backness backness;
	private Voice voice = Voice.VOICED; //optional, assume standard for now when not specified
	private Tone tone = Tone.NONE; // optional, assume none when not specified
	private Contour contour = Contour.NONE; //optional, assume none when not specified
	public Vowel(Height h, Backness b, boolean r, boolean n, Voice v, Tone t, Contour c){
		this.setHeight(h);
		this.setBackness(b);
		this.setRound(r);
		this.setNasal(n);
		this.setVoice(v);
		this.setTone(t);
		this.setContour(c);		
	}
	/**
	 * @return If the vowel is rounded
	 */
	public boolean isRound() {
		return round;
	}
	/**
	 * @param round Sets whether the vowel is rounded
	 */
	public void setRound(boolean round) {
		this.round = round;
	}
	/**
	 * @return If the vowel is nasal
	 */
	public boolean isNasal() {
		return nasal;
	}
	/**
	 * @param round Sets whether the vowel is nasal
	 */
	public void setNasal(boolean nasal) {
		this.nasal = nasal;
	}
	
	/**
	 * @return The height
	 */
	public Height getHeight() {
		return height;
	}
	/**
	 * @param height The height to set
	 */
	public void setHeight(Height height) {
		this.height = height;
	}
	/**
	 * @return The backness
	 */
	public Backness getBackness() {
		return backness;
	}
	/**
	 * @param backness The backness to set
	 */
	public void setBackness(Backness backness) {
		this.backness = backness;
	}
	/**
	 * @return The voicing
	 */
	public Voice getVoice() {
		return voice;
	}
	/**
	 * @param voice The voicing to set
	 */
	public void setVoice(Voice voice) {
		this.voice = voice;
	}
	/**
	 * @return The tone
	 */
	public Tone getTone() {
		return tone;
	}
	/**
	 * @param tone The tone to set
	 */
	public void setTone(Tone tone) {
		this.tone = tone;
	}
	/**
	 * @return The contour
	 */
	public Contour getContour() {
		return contour;
	}
	/**
	 * @param contour The contour to set
	 */
	public void setContour(Contour contour) {
		this.contour = contour;
	}
	public class VowelBuilder{
		private boolean _round = false ; //assume no if not specified
		private boolean _nasal = false; //assume no if not specified, specify after rounded - ie the height backness bool should specify roundness and not nasality
		private Height _height;
		private Backness _backness;
		private Voice _voice = Voice.VOICED; //optional, assume standard for now when not specified
		private Tone _tone = Tone.NONE; // optional, assume none when not specified
		private Contour _contour = Contour.NONE; //optional, assume none when not specified
		public VowelBuilder(){	
		}
		public Vowel buildVowel(){
			return new Vowel(_height, _backness, _round, _nasal, _voice, _tone, _contour);
		}
		public VowelBuilder round(boolean r){
			this._round=r;
			return this;
		}
		public VowelBuilder nasal(boolean n){
			this._nasal=n;
			return this;
		}
		public VowelBuilder height(Height h){
			this._height=h;
			return this;
		}
		public VowelBuilder round(Backness b){
			this._backness=b;
			return this;
		}
		public VowelBuilder voice(Voice v){
			this._voice=v;
			return this;
		}
		public VowelBuilder tone(Tone t){
			this._tone=t;
			return this;
		}
		public VowelBuilder contour(Contour c){
			this._contour=c;
			return this;
		}
	}
}

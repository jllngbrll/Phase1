public class Weapon {
	private String sType;
	private int nAttack, nSpeedPenalty;
	
	public Weapon(String sType, int nAttack, int nSpeedPenalty){
		this.sType = sType;
		this.nAttack = nAttack;
		this.nSpeedPenalty = nSpeedPenalty;
	}
	
	public String getType() {
		return sType;
	}
	
	public void setType(String sType) {
		this.sType = sType;
	}
	
	public int getAttack() {
		return nAttack;
	}
	
	public void setAttack(int nAttack) {
		this.nAttack = nAttack;
	}
	
	public int getSpeedPenalty() {
		return nSpeedPenalty;
	}
	
	public void setSpeedPenalty(int nSpeedPenalty) {
		this.nSpeedPenalty = nSpeedPenalty;
	}
	
}

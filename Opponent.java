public class Opponent {
	private String sOpponent;
	private int nHitPoint, nAttack, nDefense, nSpeed;
	
	public Opponent(String sOpponent, int nHitPoint, int nAttack, int nDefense, int nSpeed){
		this.sOpponent = sOpponent;
		this.nHitPoint = nHitPoint;
		this.nAttack = nAttack;
		this.nDefense = nDefense;
		this.nSpeed = nSpeed;
	}
	
	public String getsOpponent() {
		return sOpponent;
	}
	public void setsOpponent(String sOpponent) {
		this.sOpponent = sOpponent;
	}
	public int getHitPoint() {
		return nHitPoint;
	}
	public void setHitPoint(int nHitPoint) {
		this.nHitPoint = nHitPoint;
	}
	public int getAttack() {
		return nAttack;
	}
	public void setAttack(int nAttack) {
		this.nAttack = nAttack;
	}
	public int getDefense() {
		return nDefense;
	}
	public void setDefense(int nDefense) {
		this.nDefense = nDefense;
	}
	public int getSpeed() {
		return nSpeed;
	}
	public void setSpeed(int nSpeed) {
		this.nSpeed = nSpeed;
	}
	
	public int attack(Player player, int nPlayerDamDiv){
		int nPlayerDamagedGet = (this.getAttack()-player.getDefense())/nPlayerDamDiv;
		if(nPlayerDamagedGet < 0){
			nPlayerDamagedGet = 0;
		}
		int newPlayerHP = player.getHitPoint()-nPlayerDamagedGet;
		
		if(newPlayerHP<0)
            newPlayerHP = 0;
        
        player.setHitPoint(newPlayerHP);
        
        return nPlayerDamagedGet;
	}
}
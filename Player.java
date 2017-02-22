import java.util.*;
public class Player {
	private int nHitPoint, nAttack, nDefense, nSpeed, nExperience, nTotalUse;
	
	public Player(int nHitPoint, int nAttack, int nDefense, int nSpeed, int nExperience, int nTotalUse){
		this.nHitPoint = nHitPoint;
		this.nAttack = nAttack;
		this.nDefense = nDefense;
		this.nSpeed = nSpeed;
		this.nExperience = nExperience;
		this.nTotalUse = nTotalUse;
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

	public int getExperience() {
		return nExperience;
	}

	public void setExperience(int nExperience) {
		this.nExperience = nExperience;
	}

	public int getTotalUse() {
		return nTotalUse;
	}

	public void setTotalUse(int nTotalUse) {
		this.nTotalUse = nTotalUse;
	}
	
	public String selectCommand(String sPlayerLastComm){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whatchu gonna do??");
		System.out.println("1 - Attack");
		System.out.println("2 - Defend");
		System.out.println("3 - Charge");
		System.out.println("");
        
        String sUserChoice = sc.nextLine();
       
        return sUserChoice;
	}
	
	public int attack(Opponent opponent, int nPlayerAmtOfAttack){
		int nOppDamageGet = ((this.getAttack()*nPlayerAmtOfAttack)-opponent.getDefense());
        if (nOppDamageGet < 0) {
        	nOppDamageGet = 0;
        }
        
        int newOppHP = opponent.getHitPoint()-nOppDamageGet;
        
        if (newOppHP < 0){
        	newOppHP=0;
        }    
        
        opponent.setHitPoint(newOppHP);
        
        return nOppDamageGet;
	}
	
	public int defend(){
		int nDamageDivider = 2;
        return nDamageDivider;
	}
	
	public int charge(){
		int nAttackMult = 3;
        return nAttackMult;
	}
}

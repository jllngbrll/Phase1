public class Armor {
	private String sType;
    private int nDefense, nSpeedPenalty;

    public Armor(String sType, int nDefense, int nSpeedPenalty) {
        this.sType = sType;
        this.nDefense = nDefense;
        this.nSpeedPenalty = nSpeedPenalty;
    }
    
    public String getType() {
        return sType;
    }

    public void setType(String sType) {
        this.sType = sType;
    }


    public int getDefense() {
        return nDefense;
    }

    public void setDefense(int nDefense) {
        this.nDefense = nDefense;
    }


    public int getSpeedPenalty() {
        return nSpeedPenalty;
    }

    public void setSpeedPenalty(int nSpeedPenalty) {
        this.nSpeedPenalty = nSpeedPenalty;
    }
    
}

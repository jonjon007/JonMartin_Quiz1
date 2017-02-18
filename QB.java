
public class QB {
	private final float MAX_SCORE = 2.375f;
	private final float MAX_RATING = 158.3f;
	private float td;
	private float yards;
	private float intr;
	private float comp;
	private float att;
	public QB(float t, float y, float i, float c, float a){
		td = t;
		yards = y;
		intr = i;
		comp = c;
		att = a;
	}
	public float getTd() {
		return td;
	}
	public void setTd(int td) {
		this.td = td;
	}
	public float getYards() {
		return yards;
	}
	public void setYards(float yards) {
		this.yards = yards;
	}
	public float getIntr() {
		return intr;
	}
	public void setIntr(int intr) {
		this.intr = intr;
	}
	public float getComp() {
		return comp;
	}
	public void setComp(int comp) {
		this.comp = comp;
	}
	public float getAtt() {
		return att;
	}
	public void setAtt(int att) {
		this.att = att;
	}
	private float getA(){
		float a = (comp/att - .3f) * 5;
		return ((a < MAX_SCORE) ? a : MAX_SCORE);
	}
	private float getB(){
		float b = (yards/att - 3) * .25f;
		return ((b < MAX_SCORE) ? b : MAX_SCORE);
	}
	private float getC(){
		float c = (td/att) * 20;
		return ((c < MAX_SCORE) ? c : MAX_SCORE);
	}
	private float getD(){
		float d = 2.375f - ((intr/att) * 25);
		return ((d < MAX_SCORE) ? d : MAX_SCORE);
	}
	public float getRating(){
		float rating = ((getA()+getB()+getC()+getD())/6)*100;
		return ((rating < MAX_RATING) ? rating : MAX_RATING);
	}
	/* Testing *
	public String statsToString(){
		return ("Completion %: " + getA() + " Yards/Attempt: " + getB() + " TDs/Attempt: " + getC() + " Int/Attempt: " + getD());
	}
	@Override
	public String toString() {
		return "QB [td=" + td + ", yards=" + yards + ", intr=" + intr + ", comp=" + comp + ", att=" + att + "]";
	}
	*/
}

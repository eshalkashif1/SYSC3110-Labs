/** SYSC 2101 - Prof-Student-TA Example
 * 
 *
 */

import java.util.ArrayList;
import java.util.Date;

public class Prof {
	private String name;
	private Date midtermDate;

	private ArrayList<ProfListener> profListeners;

	public Prof(String aName) {
		this.name = aName;
		this.profListeners = new ArrayList<ProfListener>();
	}

	public Date getMidterm() {
		return this.midtermDate;
	}

	public String getName() {
		return this.name;
	}

	public void setMidterm(Date date) {
		this.midtermDate = date;
		ProfEvent profEvent = new ProfEvent(this, date);
		for(ProfListener l: this.profListeners){
			l.handleMTDate(profEvent);
		}
	}
	
	public void postponeMidterm(Date date){
		this.midtermDate = date;
		ProfEvent profEvent = new ProfEvent(this, date);
		for(ProfListener l: this.profListeners){
			l.handlePostponeMT(profEvent);
		}
	}

	public void addProfListener(ProfListener profListener){
		this.profListeners.add(profListener);
	}

	public void removeProfListener(ProfListener profListener){
		this.profListeners.remove(profListener);
	}

	public static void main(String[] args) {

		Prof p = new Prof("Safaa");
		Student s = new Student("Mike");
		Student s2 = new Student("Anna");
		TeachingAssistant ta = new TeachingAssistant("Michael");
	
		p.addProfListener(s);
		p.addProfListener(s2);
		p.addProfListener(ta);
	
		Date midterm = new Date();
		p.setMidterm(midterm);
	
		p.postponeMidterm(new Date(midterm.getTime() + 1000000000));
	}

}

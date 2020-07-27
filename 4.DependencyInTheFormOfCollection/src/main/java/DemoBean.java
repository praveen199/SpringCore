import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class DemoBean {
	
	private String name;
	private int marks[];
	private List names;
	private Set phones;
	private Map capitals;
	private Properties faculities;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	public List getNames() {
		return names;
	}
	public void setNames(List names) {
		this.names = names;
	}
	public Set getPhones() {
		return phones;
	}
	public void setPhones(Set phones) {
		this.phones = phones;
	}
	public Map getCapitals() {
		return capitals;
	}
	public void setCapitals(Map capitals) {
		this.capitals = capitals;
	}
	public Properties getFaculities() {
		return faculities;
	}
	public void setFaculities(Properties faculities) {
		this.faculities = faculities;
	}
	
	public String sayHello() {
		System.out.println("name : " + name);
		for(int i =0;i<marks.length;i++){
			System.out.println(marks[i] + " : " + i);
		}
		System.out.println("names : " + names.toString());
		System.out.println("phones : " + phones.toString());
		System.out.println("capitals : " + capitals.toString());
		System.out.println("faculities : " + faculities.toString());
		
		return "Good Morning";
	}
	
}

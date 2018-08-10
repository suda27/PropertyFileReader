package autowire;

import org.springframework.stereotype.Component;

@Component
public class ApplicationUser {

	private String name;
	//private String name="Wow";
	
	public ApplicationUser() {
		
	}
	
	public ApplicationUser(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "ApplicationUser [name=" + name + "]";
	}
	
}

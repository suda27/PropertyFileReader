package autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Application {
	
	@Autowired
	private ApplicationUser applicationUser;
	
	public Application() {
		
	}
	
	public Application(ApplicationUser applicationUser) {
		super();
		this.applicationUser = applicationUser;
	}

	public ApplicationUser getApplicationUser() {
		return applicationUser;
	}
	
	public void setApplicationUser(ApplicationUser applicationUser) {
		this.applicationUser = applicationUser;
	}

	@Override
	public String toString() {
		return "Application [applicationUser=" + applicationUser + "]";
	}
	

}

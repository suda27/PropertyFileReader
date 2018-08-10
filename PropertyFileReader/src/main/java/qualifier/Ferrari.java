package qualifier;

import org.springframework.stereotype.Component;

@Component("ferrari")
public class Ferrari implements Car {

	public String getCarName() {
		return "This is a Ferrai";
	}

}

package qualifier;

import org.springframework.stereotype.Component;

@Component("mustang")
public class Mustang implements Car {

	public String getCarName() {
		return "This is a Mustang";
	}

}

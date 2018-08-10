package qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Bond {

	@Autowired
	@Qualifier("ferrari")
	private Car car;
	
	public String displayCarName() {
		return car.getCarName();
	}
}

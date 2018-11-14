package modulea;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.ms.springboot.MyTest;
import org.ms.springboot.domain.PropertyService;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@MyTest
public class TestPropertyService {

	@Inject
	private PropertyService service;
	
	@Test
	public void testPropertyService() {
		System.out.println(service.getProperty());
	}
	
}

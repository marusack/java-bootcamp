package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;


import entitys.MeetingRestApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MeetingRestApplication.class)
@WebAppConfiguration
public class MeetingRestApplicationTests {

	@Test
	public void contextLoads() {
	}

}

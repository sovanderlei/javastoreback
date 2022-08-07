package com.api.javastoreback.service;
 
import static org.assertj.core.api.Assertions.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment; 

import com.api.javastoreback.modal.Tbuser; 
 
@SpringBootTest(webEnvironment=WebEnvironment.RANDOM_PORT)
public class TbuserServiceTest {

	@Autowired
	private TbuserService service;
	
	@Test
	public void shouldReturnValidDateInTheFuture() {
		
		List<Tbuser> ListReturn = new ArrayList<Tbuser>();
		ListReturn = (List<Tbuser>) service.findAll();
		
		assertThat(ListReturn.size() > 0);
		assertThat(ListReturn.size()).isEqualTo(9);
		assertThat(ListReturn.get(0).getAtivo()).isEqualTo("YES");
		
	}
	
	
	
}

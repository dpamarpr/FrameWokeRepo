package Practice_Pack1;

import org.testng.annotations.Test;

public class ContactTest {
		
		@Test
		public void creartecontactTest() {
			String BROWSER=System.getProperty("browser");
			String URL=System.getProperty("url");
			String USERNAME=System.getProperty("username");
			String PASSWORD=System.getProperty("password");
			
			System.out.println("execute creartecontactTest");
			System.out.println(BROWSER);
			System.out.println(URL);
			System.out.println(USERNAME);
			System.out.println(PASSWORD);


			
		}
		
		@Test
		public void midifycontactTest() {
			
			System.out.println("modify creartecontactTest");
			
		}
		
		@Test
		public void DletecontactTest() {
			
			System.out.println("delete creartecontactTest");
			
		}
}

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.BDDMockito.*;
import static org.junit.Assert.*;
import bean.Customer;


@RunWith(MockitoJUnitRunner.class)
public class CustomerTest {
	
//	Customer sut = new Customer("11","fname","lname",(double)2000);
	@Mock
	Customer sut = new Customer("1", "sakshi", "kathuria", 100.10);
	String id = "11";
	String fname;
	String lname;
	double bal;
	
	@Before
    public void setUp() {
         
    }

	@Test
	public void testGetCustomerId() {
		
		
		//given
		willReturn(id).given(sut).getCustomerID();
	//	willDoNothing().given(sut).setCustomerID(anyString());
		
		//when
		String result = sut.getCustomerID();
		
		
		
		//then
		assertEquals(result,id);
	}
	
	@Test
	public void testSetCustomerId() {
		
		//given
		willCallRealMethod().given(sut).setCustomerID(anyString());
		willCallRealMethod().given(sut).getCustomerID();
		
		//when
		sut.setCustomerID("23");
		
		//then
		String id = sut.getCustomerID();
	//	System.out.println("id is "+id);
		assertEquals(id,"23");
	}
	
	@Test
	public void testGetFirstName() {
		
		willReturn(fname).given(sut).getFirstName();
		
		String name = sut.getFirstName();
		
		assertEquals(name,fname);
		
	}
	
	@Test
	public void testSetFirstName(){
		
		willCallRealMethod().given(sut).setFirstName(anyString());
		willCallRealMethod().given(sut).getFirstName();
		
		sut.setFirstName("sakshi");
		String name = sut.getFirstName();
		assertEquals(name,"sakshi");
				
	}
	
	@Test
	public void testGetLastName(){
		
		willReturn(lname).given(sut).getLastName();
		
		String name = sut.getLastName();
		
		assertEquals(name,lname);
	}
	@Test
	public void testSetLastName(){
		
		willCallRealMethod().given(sut).setLastName(anyString());
		willCallRealMethod().given(sut).getLastName();
		
		sut.setLastName("kathuria");
		String name = sut.getLastName();
		assertEquals(name,"kathuria");
	}
	@Test
	public void testGetBalance(){
		willReturn(bal).given(sut).getBalance();
		
		double bal1 = sut.getBalance();
		
		assertEquals(bal1,bal,0.0);
	}
	
	@Test
	public void testSetBalance(){
		
		willCallRealMethod().given(sut).setBalance(anyDouble());
		willCallRealMethod().given(sut).getBalance();
		
		sut.setBalance(100.0);
		double bal = sut.getBalance();
		assertEquals(bal,100.0,0.0);
	}
}

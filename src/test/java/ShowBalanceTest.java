

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import servlet.ShowBalance;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class ShowBalanceTest {

	/*@Mock
	HttpServletRequest mockRequest;*/
	HttpServletRequest mockRequest = mock(HttpServletRequest.class);
	HttpServletResponse mockResponse = mock(HttpServletResponse.class);
	/*@Mock
	HttpServletResponse mockResponse;*/
	
	@InjectMocks ShowBalance systemUnderTest;
	
	
	@Test
	public void testDoGet()throws Exception{
		 ServletOutputStream mockOutput = mock(ServletOutputStream.class);

	        
	        when(mockResponse.getOutputStream()).thenReturn(mockOutput);
	 //       ShowBalance sh=mock(ShowBalance.class);
	        ShowBalance sh = new ShowBalance();
	       // RequestDispatcher dispatcher =new (anyString());
	       // when(mockRequest.getRequestDispatcher(anyString())).thenReturn(dispatcher);
	         //Mockito.when(sh.doGet(mockRequest, mockResponse)).thenReturn();
	        	sh.doGet(mockRequest, mockResponse);
	        verify(mockResponse).setContentType("plain/text");
	        verify(mockOutput).println("Hi Servlet!");
	}
	
}

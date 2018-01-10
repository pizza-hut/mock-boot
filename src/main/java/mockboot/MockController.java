package mockboot;

//import org.springframework.stereotype.Controller;

//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;

@RestController
public class MockController {
	
	@RequestMapping(value="/mock/ocdmapi/contact/{sourceSystem}/{externalKey}", method=RequestMethod.GET, produces="application/json")
	public Contact getCustomerAccount(@PathVariable String sourceSystem, @PathVariable String externalKey) {
		//Contact contact = new Contact(sourceSystem, externalKey, null);
		//System.out.println("sourceSystem="+contact.getSourceSystem()+" "+"externalKey="+contact.getexternalKey());
		MockService mockService = new MockService();
		Contact contact;
		contact = mockService.getContactDetails(sourceSystem, externalKey);		
		return contact;
		
	}
	
	@RequestMapping(value="/mock/ocdmapi/test/{sourceSystem}/{externalKey}", method=RequestMethod.GET)
	public String testController(@PathVariable String sourceSystem, @PathVariable String externalKey) {
		return sourceSystem+":"+externalKey;
	}
	
	@RequestMapping(value="/mock/ocdmapi/contactMethods/{sourceSystem}/{externalKey}", method=RequestMethod.GET, produces="application/json")
	public ContactMethods getContactMethods(@PathVariable String sourceSystem, @PathVariable String externalKey) {
		MockService mockService = new MockService();
		ContactMethods contactMethods;
		contactMethods = mockService.getContactMethods(sourceSystem, externalKey);
		return contactMethods;
	}
	
	@RequestMapping(value="/mock/ocdmapi/policyReferences/{sourceSystem}/{externalKey}", method=RequestMethod.GET, produces="application/json")
	public PolicyReference getPolicyReference(@PathVariable String sourceSystem, @PathVariable String externalKey) {
		MockService mockService = new MockService();
		PolicyReference policyReference;
		policyReference = mockService.getPolicyReference(sourceSystem, externalKey);
		return policyReference;
	}

}

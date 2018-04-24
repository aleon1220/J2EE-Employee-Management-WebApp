/*Hands On exam for the JSF Module.
 * Andres Leon emp number: 404376
 * date: 27/jul/2011
 * Validator Class
 *  */
package validator;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;


public class ExpValidator implements Validator{

	public void validate(FacesContext arg0, UIComponent arg1, Object arg2) throws ValidatorException {
		
		FacesMessage message = new FacesMessage();
		message.setSummary("Incorrect Experience format: Must  be a Number");
		String expS = arg2.toString();
		
		try{
			Float.parseFloat(expS);
		}catch(Exception e){
			throw new ValidatorException(message);
		}
	}
}

/**
 * 
 */
package com.seqirus.storefront.controllers.pages;

import de.hybris.platform.acceleratorstorefrontcommons.controllers.pages.AbstractPageController;
import de.hybris.platform.cms2.exceptions.CMSItemNotFoundException;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.seqirus.core.dataObjects.SavetheValue;
import com.seqirus.facades.SavethevalueData;
import com.seqirus.facades.cutomer.data.SeqirusCustomerRegistrationData;
import com.seqirus.facades.savethevalue.impl.SavethevalueFacadeimpl;
import com.seqirus.storefront.checkout.steps.validation.impl.DefaultDeliveryMethodCheckoutStepValidator;
import com.seqirus.storefront.savethevalue.utils.PopulateSavethevalueDataUtils;
import com.seqirus.storefront.util.SeqirusCustomerRequestDataProcessor;

/**
 * @author 912952
 *
 */
@Controller
public class Savethevaluecontroller extends AbstractPageController {
	@Resource(name="savethevalueFacade")
	private SavethevalueFacadeimpl savethevalueFacade;
	
	@GetMapping(value = "/savethevalue")
	public String savethevalue(@ModelAttribute("Savethevalue ") final SavetheValue Savethevalue,Model model) throws CMSItemNotFoundException
	{
		
		return "pages/cms/savethevalue";
	}
	private static final Logger LOGGER = Logger.getLogger(DefaultDeliveryMethodCheckoutStepValidator.class);

	@RequestMapping(value = "/submitForm", method ={ RequestMethod.GET, RequestMethod.POST }) 
	@ResponseStatus(value=HttpStatus.OK)
	public String savethevalue(@ModelAttribute("SavetheValue") final SavetheValue savetheValue ,final Model model, final HttpServletRequest request) throws CMSItemNotFoundException{	
		SavethevalueData SavethevalueData= new PopulateSavethevalueDataUtils().populateSavethevalueData(savetheValue);

		savethevalueFacade.getsavethevalue(SavethevalueData);
		
		
		/*
		 * final SavethevalueData values =
		 * savethevalueFacade.getsavethevalue(SavethevalueData);
		 * LOGGER.info("true"); values.getName(); values.getEmailid();
		 */
		/*
		 * model.addAttribute("Savethevalue", Savethevalue);
		 * model.addAttribute("name", Savethevalue.getName());
		 * model.addAttribute("emailId", Savethevalue.getEmailId());
		 */
		return "pages/cms/savethevalue2";
 }
}
	
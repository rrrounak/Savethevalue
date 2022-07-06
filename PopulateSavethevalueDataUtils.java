/**
 * 
 */
package com.seqirus.storefront.savethevalue.utils;

import org.apache.log4j.Logger;

import com.seqirus.core.dataObjects.SavetheValue;
import com.seqirus.facades.SavethevalueData;
import com.seqirus.flu360.facades.cutomer.data.SeqirusB2BCustomerRegistrationData;
import com.seqirus.storefront.forms.CustomerRegisterForm;
import com.seqirus.storefront.forms.utils.PopulateSeqirusFormToSeqirusDataUtil;

/**
 * @author 912952
 *
 */
public class PopulateSavethevalueDataUtils {
	private static final Logger LOGGER = Logger.getLogger(PopulateSavethevalueDataUtils.class);


	public SavethevalueData populateSavethevalueData(final SavetheValue form)
	{
		SavethevalueData savedata=null;
		if (form != null)
		{
			savedata = new SavethevalueData();
			
			if (form.getName() != null)
			{
				savedata.setName(form.getName());
			}
			if (form.getEmailId() != null)
			{
				savedata.setEmailid(form.getEmailId());
			}
		}
		
		return savedata;
	}
}

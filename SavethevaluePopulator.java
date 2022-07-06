/**
 *
 */
package com.seqirus.facades.savethevalue.populator;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.seqirus.core.model.SavethevalueModel;
import com.seqirus.facades.SavethevalueData;


/**
 * @author 912952
 *
 */
public class SavethevaluePopulator implements Populator<SavethevalueData, SavethevalueModel>
{

	public void populate(final SavethevalueData source, final SavethevalueModel target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setName(source.getName());
		target.setEmailid(source.getEmailid());


	}



}

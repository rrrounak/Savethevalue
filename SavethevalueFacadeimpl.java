/**
 *
 */
package com.seqirus.facades.savethevalue.impl;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.model.ModelService;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import com.facades.savethevalue.SavethevalueFacade;
import com.seqirus.core.model.SavethevalueModel;
import com.seqirus.facades.SavethevalueData;


/**
 * @author 912952
 *
 */
public class SavethevalueFacadeimpl implements SavethevalueFacade
{
	static Logger logger = Logger.getLogger(SavethevalueFacadeimpl.class);


	@Resource(name = "modelService")
	private ModelService modelService;


	private Populator<SavethevalueData, SavethevalueModel> savethevaluePopulator;


	/**
	 * @return the savethevaluePopulator
	 */
	public Populator<SavethevalueData, SavethevalueModel> getSavethevaluePopulator()
	{
		return savethevaluePopulator;
	}



	/**
	 * @param savethevaluePopulator
	 *           the savethevaluePopulator to set
	 */
	public void setSavethevaluePopulator(final Populator<SavethevalueData, SavethevalueModel> savethevaluePopulator)
	{
		this.savethevaluePopulator = savethevaluePopulator;
	}






	@Override
	public void getsavethevalue(final SavethevalueData savethevalueData)
	{

		try
		{
			final SavethevalueModel savethevaluemodel = modelService.create(SavethevalueModel.class);

			getSavethevaluePopulator().populate(savethevalueData, savethevaluemodel);
			modelService.save(savethevaluemodel);


		}
		catch (final Exception e)
		{
			logger.error("Error" + e);
		}



	}


}

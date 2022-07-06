/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30-Jun-2022, 4:31:24 PM                     ---
 * ----------------------------------------------------------------
 */
package com.seqirus.core.model;

import de.hybris.bootstrap.annotations.Accessor;
import de.hybris.platform.core.model.ItemModel;
import de.hybris.platform.servicelayer.model.ItemModelContext;

/**
 * Generated model class for type Savethevalue first defined at extension seqirusb2bcore.
 */
@SuppressWarnings("all")
public class SavethevalueModel extends ItemModel
{
	/**<i>Generated model type code constant.</i>*/
	public static final String _TYPECODE = "Savethevalue";
	
	/** <i>Generated constant</i> - Attribute key of <code>Savethevalue.name</code> attribute defined at extension <code>seqirusb2bcore</code>. */
	public static final String NAME = "name";
	
	/** <i>Generated constant</i> - Attribute key of <code>Savethevalue.emailid</code> attribute defined at extension <code>seqirusb2bcore</code>. */
	public static final String EMAILID = "emailid";
	
	
	/**
	 * <i>Generated constructor</i> - Default constructor for generic creation.
	 */
	public SavethevalueModel()
	{
		super();
	}
	
	/**
	 * <i>Generated constructor</i> - Default constructor for creation with existing context
	 * @param ctx the model context to be injected, must not be null
	 */
	public SavethevalueModel(final ItemModelContext ctx)
	{
		super(ctx);
	}
	
	/**
	 * <i>Generated constructor</i> - Constructor with all mandatory attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _emailid initial attribute declared by type <code>Savethevalue</code> at extension <code>seqirusb2bcore</code>
	 * @param _name initial attribute declared by type <code>Savethevalue</code> at extension <code>seqirusb2bcore</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SavethevalueModel(final String _emailid, final String _name)
	{
		super();
		setEmailid(_emailid);
		setName(_name);
	}
	
	/**
	 * <i>Generated constructor</i> - for all mandatory and initial attributes.
	 * @deprecated since 4.1.1 Please use the default constructor without parameters
	 * @param _emailid initial attribute declared by type <code>Savethevalue</code> at extension <code>seqirusb2bcore</code>
	 * @param _name initial attribute declared by type <code>Savethevalue</code> at extension <code>seqirusb2bcore</code>
	 * @param _owner initial attribute declared by type <code>Item</code> at extension <code>core</code>
	 */
	@Deprecated(since = "4.1.1", forRemoval = true)
	public SavethevalueModel(final String _emailid, final String _name, final ItemModel _owner)
	{
		super();
		setEmailid(_emailid);
		setName(_name);
		setOwner(_owner);
	}
	
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Savethevalue.emailid</code> attribute defined at extension <code>seqirusb2bcore</code>. 
	 * @return the emailid
	 */
	@Accessor(qualifier = "emailid", type = Accessor.Type.GETTER)
	public String getEmailid()
	{
		return getPersistenceContext().getPropertyValue(EMAILID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Savethevalue.name</code> attribute defined at extension <code>seqirusb2bcore</code>. 
	 * @return the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.GETTER)
	public String getName()
	{
		return getPersistenceContext().getPropertyValue(NAME);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Savethevalue.emailid</code> attribute defined at extension <code>seqirusb2bcore</code>. 
	 *  
	 * @param value the emailid
	 */
	@Accessor(qualifier = "emailid", type = Accessor.Type.SETTER)
	public void setEmailid(final String value)
	{
		getPersistenceContext().setPropertyValue(EMAILID, value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of <code>Savethevalue.name</code> attribute defined at extension <code>seqirusb2bcore</code>. 
	 *  
	 * @param value the name
	 */
	@Accessor(qualifier = "name", type = Accessor.Type.SETTER)
	public void setName(final String value)
	{
		getPersistenceContext().setPropertyValue(NAME, value);
	}
	
}

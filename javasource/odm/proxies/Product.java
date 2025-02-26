// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package odm.proxies;

public class Product
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "ODM.Product";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		ProductCode("ProductCode"),
		Name("Name"),
		Price("Price"),
		DateAttr("DateAttr"),
		NameVA("NameVA"),
		Product_Category("ODM.Product_Category"),
		Product_SubCategory("ODM.Product_SubCategory");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Product(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "ODM.Product"));
	}

	protected Product(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject)
	{
		if (productMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("ODM.Product", productMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a ODM.Product");

		this.productMendixObject = productMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Product.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static odm.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return odm.proxies.Product.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static odm.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new odm.proxies.Product(context, mendixObject);
	}

	public static odm.proxies.Product load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return odm.proxies.Product.initialize(context, mendixObject);
	}

	public static java.util.List<odm.proxies.Product> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<odm.proxies.Product> result = new java.util.ArrayList<odm.proxies.Product>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//ODM.Product" + xpathConstraint))
			result.add(odm.proxies.Product.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of ProductCode
	 */
	public final java.lang.String getProductCode()
	{
		return getProductCode(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductCode
	 */
	public final java.lang.String getProductCode(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.ProductCode.toString());
	}

	/**
	 * Set value of ProductCode
	 * @param productcode
	 */
	public final void setProductCode(java.lang.String productcode)
	{
		setProductCode(getContext(), productcode);
	}

	/**
	 * Set value of ProductCode
	 * @param context
	 * @param productcode
	 */
	public final void setProductCode(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String productcode)
	{
		getMendixObject().setValue(context, MemberNames.ProductCode.toString(), productcode);
	}

	/**
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice()
	{
		return getPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Price.toString());
	}

	/**
	 * Set value of Price
	 * @param price
	 */
	public final void setPrice(java.math.BigDecimal price)
	{
		setPrice(getContext(), price);
	}

	/**
	 * Set value of Price
	 * @param context
	 * @param price
	 */
	public final void setPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal price)
	{
		getMendixObject().setValue(context, MemberNames.Price.toString(), price);
	}

	/**
	 * @return value of DateAttr
	 */
	public final java.util.Date getDateAttr()
	{
		return getDateAttr(getContext());
	}

	/**
	 * @param context
	 * @return value of DateAttr
	 */
	public final java.util.Date getDateAttr(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DateAttr.toString());
	}

	/**
	 * Set value of DateAttr
	 * @param dateattr
	 */
	public final void setDateAttr(java.util.Date dateattr)
	{
		setDateAttr(getContext(), dateattr);
	}

	/**
	 * Set value of DateAttr
	 * @param context
	 * @param dateattr
	 */
	public final void setDateAttr(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date dateattr)
	{
		getMendixObject().setValue(context, MemberNames.DateAttr.toString(), dateattr);
	}

	/**
	 * @return value of NameVA
	 */
	public final java.lang.String getNameVA()
	{
		return getNameVA(getContext());
	}

	/**
	 * @param context
	 * @return value of NameVA
	 */
	public final java.lang.String getNameVA(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.NameVA.toString());
	}

	/**
	 * Set value of NameVA
	 * @param nameva
	 */
	public final void setNameVA(java.lang.String nameva)
	{
		setNameVA(getContext(), nameva);
	}

	/**
	 * Set value of NameVA
	 * @param context
	 * @param nameva
	 */
	public final void setNameVA(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String nameva)
	{
		getMendixObject().setValue(context, MemberNames.NameVA.toString(), nameva);
	}

	/**
	 * @return value of Product_Category
	 */
	public final odm.proxies.Category getProduct_Category() throws com.mendix.core.CoreException
	{
		return getProduct_Category(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_Category
	 */
	public final odm.proxies.Category getProduct_Category(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		odm.proxies.Category result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Product_Category.toString());
		if (identifier != null)
			result = odm.proxies.Category.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Product_Category
	 * @param product_category
	 */
	public final void setProduct_Category(odm.proxies.Category product_category)
	{
		setProduct_Category(getContext(), product_category);
	}

	/**
	 * Set value of Product_Category
	 * @param context
	 * @param product_category
	 */
	public final void setProduct_Category(com.mendix.systemwideinterfaces.core.IContext context, odm.proxies.Category product_category)
	{
		if (product_category == null)
			getMendixObject().setValue(context, MemberNames.Product_Category.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Product_Category.toString(), product_category.getMendixObject().getId());
	}

	/**
	 * @return value of Product_SubCategory
	 */
	public final odm.proxies.SubCategory getProduct_SubCategory() throws com.mendix.core.CoreException
	{
		return getProduct_SubCategory(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_SubCategory
	 */
	public final odm.proxies.SubCategory getProduct_SubCategory(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		odm.proxies.SubCategory result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Product_SubCategory.toString());
		if (identifier != null)
			result = odm.proxies.SubCategory.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Product_SubCategory
	 * @param product_subcategory
	 */
	public final void setProduct_SubCategory(odm.proxies.SubCategory product_subcategory)
	{
		setProduct_SubCategory(getContext(), product_subcategory);
	}

	/**
	 * Set value of Product_SubCategory
	 * @param context
	 * @param product_subcategory
	 */
	public final void setProduct_SubCategory(com.mendix.systemwideinterfaces.core.IContext context, odm.proxies.SubCategory product_subcategory)
	{
		if (product_subcategory == null)
			getMendixObject().setValue(context, MemberNames.Product_SubCategory.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Product_SubCategory.toString(), product_subcategory.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final odm.proxies.Product that = (odm.proxies.Product) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "ODM.Product";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}

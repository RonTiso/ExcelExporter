// This file was generated by Mendix Modeler 7.23.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package excelimporter.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the ExcelImporter module

	/**
	* Enables the parsing of external entities from the DTD. This is turned off by default.
	*/
	public static boolean getEnableExternalEntities()
	{
		return (java.lang.Boolean)Core.getConfiguration().getConstantValue("ExcelImporter.EnableExternalEntities");
	}
}
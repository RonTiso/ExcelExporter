// This file was generated by Mendix Modeler.
//
// WARNING: Only the following code will be retained when actions are regenerated:
// - the import list
// - the code between BEGIN USER CODE and END USER CODE
// - the code between BEGIN EXTRA CODE and END EXTRA CODE
// Other code you write will be lost the next time you deploy the project.
// Special characters, e.g., é, ö, à, etc. are supported in comments.

package odm.actions;

import com.mendix.systemwideinterfaces.core.UserAction;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.webui.CustomJavaAction;

public class Sleep extends CustomJavaAction<java.lang.Boolean>
{
	private java.lang.Long SleepTime;

	public Sleep(IContext context, java.lang.Long SleepTime)
	{
		super(context);
		this.SleepTime = SleepTime;
	}

	@java.lang.Override
	public java.lang.Boolean executeAction() throws Exception
	{
		// BEGIN USER CODE
		Thread.sleep(this.SleepTime);
		return true;
		// END USER CODE
	}

	/**
	 * Returns a string representation of this action
	 */
	@java.lang.Override
	public java.lang.String toString()
	{
		return "Sleep";
	}

	// BEGIN EXTRA CODE
	// END EXTRA CODE
}

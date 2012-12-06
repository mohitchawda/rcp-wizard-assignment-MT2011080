package org.iiitb.assignment.mt2011080_rcp.pages;

import java.util.Calendar;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.DateTime;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class ScheduleDetails extends WizardPage {
	
	private Combo  c_agent;
	private Label l_agent, l_dob;
	private Composite container;
	DateTime calendar ;

	final static String[] agents = {"MakeMyTrip","Yatra","ClearTrip"};
	
	/**
	 * Create the wizard.
	 */
	public ScheduleDetails() {
		super("Page3");
		setTitle("Select Travel Agency and Date of Journey");
		setDescription("Provide Travel agent and date of journey");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		layout.numColumns = 2;
		
		l_agent = new Label(container, SWT.NONE);
		l_agent.setText("Travel Agent");
		
		c_agent = new Combo(container, SWT.BORDER|SWT.READ_ONLY);
		GridData gridData = new GridData();
		c_agent.setLayoutData(gridData);
		//c_agent.setText("Not Specified");
		c_agent.setItems(agents);
		
		l_dob = new Label(container, SWT.NONE);
		l_dob.setText("Date of Journey");
		
		calendar = new DateTime(container, SWT.CALENDAR);
		
		setControl(container);
		setPageComplete(true);
	}

		public String getC_agent(){
			
			return c_agent.getText();
			
			
		}
		
		public String getDate(){
			
			String t_date;
			
			t_date = calendar.getYear()  + "-" + (calendar.getMonth() + 1) + "-"+calendar.getDay() ;
			
			return t_date;
			
			
		}
		
		
		
}

package org.iiitb.assignment.mt2011080_rcp.pages;

import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Text;

public class RouteDetails extends WizardPage implements KeyListener {

	private Text t_from, t_dest, t_via;
	private Label l_from, l_dest,l_via;
	
	private Composite container;
	
	/**
	 * Create the wizard.
	 */
	public RouteDetails() {
		super("Page2");
		setTitle("Please provide following details");
		setDescription("Give source and destination");
	}

	/**
	 * Create contents of the wizard.
	 * @param parent
	 */
	public void createControl(Composite parent) {
		Composite container = new Composite(parent, SWT.NULL);
		GridLayout layout = new GridLayout();
		container.setLayout(layout);
		
		layout.numColumns = 2;
		
		l_from = new Label(container, SWT.NONE);
		l_from.setText("From");
		
		t_from = new Text(container, SWT.BORDER|SWT.SINGLE);
		t_from.setText("");
		t_from.addKeyListener(this);
		
		l_dest = new Label(container, SWT.NONE);
		l_dest.setText("Destination");
		
		t_dest =new Text(container, SWT.BORDER|SWT.SINGLE);
		t_dest.setText("");
		t_dest.addKeyListener(this);
		
		l_via = new Label(container,SWT.NONE);
		l_via.setText("Via");
		
		t_via = new Text(container, SWT.BORDER|SWT.SINGLE);
		t_via.setText("");
		
		GridData gd = new GridData(GridData.FILL_HORIZONTAL);
		t_from.setLayoutData(gd);
		t_dest.setLayoutData(gd);
		t_via.setLayoutData(gd);

		setControl(container);
		setPageComplete(false);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		if(t_from.getText().isEmpty() == false && t_dest.getText().isEmpty() == false)
			setPageComplete(true);
		else
			setPageComplete(false);
		
	}

	public String getT_from(){
		
		return t_from.getText();		
		
	}
	
	public String getT_dest(){
		
		return t_dest.getText();		
	}
	
	public String getT_via(){
		
		if(t_via.getText() == null){
			
			return "Not Specified";
		}
		else
			return t_via.getText();
		
	}
}

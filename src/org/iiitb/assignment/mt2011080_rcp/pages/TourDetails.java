package org.iiitb.assignment.mt2011080_rcp.pages;

import org.eclipse.jface.wizard.IWizardPage;
import org.eclipse.jface.wizard.WizardPage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.events.KeyListener;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class TourDetails extends WizardPage {

	private Text t_tour; 
	private Label l_tour;
	private Composite container;
	
	
	/**
	 * Create the wizard.
	 */
	public TourDetails() {
		super("Page1");
		setTitle("Welcome To Travel Planner");
		setDescription("Add your Tour details here");
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
		
		l_tour = new Label(container, SWT.NONE);
		l_tour.setText("Tour Name");
		
		t_tour = new Text(container, SWT.BORDER|SWT.SINGLE);
		t_tour.setText("");
		
		t_tour.addKeyListener(new KeyListener() {
			
			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				
				
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				if(!t_tour.getText().isEmpty()){
					setPageComplete(true);					
				}
			}
			
			
		});

		GridData gridData = new GridData(GridData.FILL_HORIZONTAL);
		t_tour.setLayoutData(gridData);
		
		
		
		setControl(container);
	setPageComplete(false);
	}

	public String getT_tour() {
		return t_tour.getText();
	}

	public IWizardPage getNextPage(){
		Display.getDefault().asyncExec(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
			}
		});
		
		
		return super.getNextPage();
		
			
	}
		
}

package org.iiitb.assignment.mt2011080_rcp.mainwizard;

import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.iiitb.assignment.mt2011080_rcp.pages.*;
import org.iiitb.assignment.mt2011080_rcp.utility.*;


public class TravelWizard extends Wizard implements INewWizard {

	protected TourDetails tourDetails;
	protected RouteDetails routeDetails;
	protected ScheduleDetails scheduledetails;
	
	public TravelWizard() {
		// TODO Auto-generated constructor stub
		super();
		setNeedsProgressMonitor(true);
	}

	public void addPages(){
		
		tourDetails = new TourDetails();
		routeDetails = new RouteDetails();
		scheduledetails = new ScheduleDetails();
		
		addPage(tourDetails);
		addPage(routeDetails);
		addPage(scheduledetails);
		
		
	}
	
	/*public boolean canFinish(){
		
		if(getContainer().getCurrentPage()== tourDetails )
			return false;
		else
			return true;
	}*/
	
	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		// TODO Auto-generated method stub

	}

	@Override
	public boolean performFinish() {
		// TODO Auto-generated method stub
		System.out.println(tourDetails.getT_tour());
		System.out.println(routeDetails.getT_from());
		System.out.println(routeDetails.getT_dest());
		System.out.println(routeDetails.getT_via());
		System.out.println(scheduledetails.getC_agent());
		System.out.println(scheduledetails.getDate());
		String sqlQuery;
		int var;
		try{
			
			sqlQuery = "insert into tourdetails (t_name,t_fromcity,t_destcity,t_viacity,t_agentname,t_date) values ('"+ tourDetails.getT_tour() +"','"+ routeDetails.getT_from() +"','"+ routeDetails.getT_dest() +"','"+ routeDetails.getT_via() +"','"+ scheduledetails.getC_agent() +"','"+ scheduledetails.getDate() +"')";
			System.out.println(sqlQuery);
			var = Query.Insert(sqlQuery);
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
			
		return true;
	}

}

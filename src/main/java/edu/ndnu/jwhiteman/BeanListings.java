/**
@author James Whiteman

Keeps track of all the listings that have been posted before.
When a hyperlink is clicked from the summary page, the associated
listing will be marked as the 'current' one so that it's details
can be pulled by the 'listing.xhtml' page.
*/

package edu.ndnu.jwhiteman;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import javax.faces.component.html.HtmlDataTable;
import javax.inject.Named;
import javax.inject.Inject;

@ManagedBean
@Named("beanListings")
@ApplicationScoped
public class BeanListings
{
	// Properties
	private List<Listing> listings = new ArrayList<Listing>();
	private Listing currentListing;
	private HtmlDataTable datatableListings;

	// Main
	public String goToListing()
	{
		Listing listing = (Listing)datatableListings.getRowData();
		currentListing = listing;
		return "/listing.xhtml";
	}

	// Setters
	public void setListings(List<Listing> listings)
	{
		this.listings = listings;
	}

	public void setCurrentListing(Listing currentListing)
	{
		this.currentListing = currentListing;
	}

	public void setDatatableListings(HtmlDataTable datatableListings)
	{
        this.datatableListings = datatableListings;
    }

	// Getters
	public List<Listing> getListings()
	{
		return listings;
	}

	public Listing getCurrentListing()
	{
		return currentListing;
	}

	public HtmlDataTable getDatatableListings()
    {
        return datatableListings;
    }
}
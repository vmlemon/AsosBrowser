
package example.com.astateofstyle.models.productsbycategory;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class ProdsByCategory {

    @SerializedName("AlsoSearched")
    @Expose
    private List<Object> alsoSearched = new ArrayList<Object>();
    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Facets")
    @Expose
    private List<Facet> facets = new ArrayList<Facet>();
    @SerializedName("ItemCount")
    @Expose
    private Integer itemCount;
    @SerializedName("Listings")
    @Expose
    private List<Listing> listings = new ArrayList<Listing>();
    @SerializedName("RedirectUrl")
    @Expose
    private String redirectUrl;
    @SerializedName("SortType")
    @Expose
    private String sortType;

    /**
     * 
     * @return
     *     The alsoSearched
     */
    public List<Object> getAlsoSearched() {
        return alsoSearched;
    }

    /**
     * 
     * @param alsoSearched
     *     The AlsoSearched
     */
    public void setAlsoSearched(List<Object> alsoSearched) {
        this.alsoSearched = alsoSearched;
    }

    /**
     * 
     * @return
     *     The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * 
     * @param description
     *     The Description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * 
     * @return
     *     The facets
     */
    public List<Facet> getFacets() {
        return facets;
    }

    /**
     * 
     * @param facets
     *     The Facets
     */
    public void setFacets(List<Facet> facets) {
        this.facets = facets;
    }

    /**
     * 
     * @return
     *     The itemCount
     */
    public Integer getItemCount() {
        return itemCount;
    }

    /**
     * 
     * @param itemCount
     *     The ItemCount
     */
    public void setItemCount(Integer itemCount) {
        this.itemCount = itemCount;
    }

    /**
     * 
     * @return
     *     The listings
     */
    public List<Listing> getListings() {
        return listings;
    }

    /**
     * 
     * @param listings
     *     The Listings
     */
    public void setListings(List<Listing> listings) {
        this.listings = listings;
    }

    /**
     * 
     * @return
     *     The redirectUrl
     */
    public String getRedirectUrl() {
        return redirectUrl;
    }

    /**
     * 
     * @param redirectUrl
     *     The RedirectUrl
     */
    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    /**
     * 
     * @return
     *     The sortType
     */
    public String getSortType() {
        return sortType;
    }

    /**
     * 
     * @param sortType
     *     The SortType
     */
    public void setSortType(String sortType) {
        this.sortType = sortType;
    }

}

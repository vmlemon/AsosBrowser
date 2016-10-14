
package example.com.astateofstyle.models.categories;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Category {

    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("Listing")
    @Expose
    private List<Listing> listing = new ArrayList<Listing>();
    @SerializedName("SortType")
    @Expose
    private String sortType;

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
     *     The listing
     */
    public List<Listing> getListing() {
        return listing;
    }

    /**
     * 
     * @param listing
     *     The Listing
     */
    public void setListing(List<Listing> listing) {
        this.listing = listing;
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

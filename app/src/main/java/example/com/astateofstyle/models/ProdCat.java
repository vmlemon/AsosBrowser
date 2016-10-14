
package example.com.astateofstyle.models;

import java.util.ArrayList;
import java.util.List;
//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class ProdCat {

    @SerializedName("Description")
    @Expose
    private String description;
    @SerializedName("ProdCatListing")
    @Expose
    private List<ProdCatListing> listing = new ArrayList<ProdCatListing>();
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
    public List<ProdCatListing> getListing() {
        return listing;
    }

    /**
     * 
     * @param listing
     *     The ProdCatListing
     */
    public void setListing(List<ProdCatListing> listing) {
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

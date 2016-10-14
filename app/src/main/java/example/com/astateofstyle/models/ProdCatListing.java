
package example.com.astateofstyle.models;

//import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

//@Generated("org.jsonschema2pojo")
public class ProdCatListing {

    @SerializedName("CategoryId")
    @Expose
    private String categoryId;
    @SerializedName("Name")
    @Expose
    private String name;
    @SerializedName("ProductCount")
    @Expose
    private Integer productCount;

    /**
     * 
     * @return
     *     The categoryId
     */
    public String getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId
     *     The CategoryId
     */
    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The Name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The productCount
     */
    public Integer getProductCount() {
        return productCount;
    }

    /**
     * 
     * @param productCount
     *     The ProductCount
     */
    public void setProductCount(Integer productCount) {
        this.productCount = productCount;
    }

}

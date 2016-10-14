
package example.com.astateofstyle.models;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Listing {

    @SerializedName("BasePrice")
    @Expose
    private Double basePrice;
    @SerializedName("Brand")
    @Expose
    private String brand;
    @SerializedName("CurrentPrice")
    @Expose
    private String currentPrice;
    @SerializedName("HasMoreColours")
    @Expose
    private Boolean hasMoreColours;
    @SerializedName("IsInSet")
    @Expose
    private Boolean isInSet;
    @SerializedName("PreviousPrice")
    @Expose
    private String previousPrice;
    @SerializedName("ProductId")
    @Expose
    private Integer productId;
    @SerializedName("ProductImageUrl")
    @Expose
    private List<String> productImageUrl = new ArrayList<String>();
    @SerializedName("RRP")
    @Expose
    private String rRP;
    @SerializedName("Title")
    @Expose
    private String title;

    /**
     * 
     * @return
     *     The basePrice
     */
    public Double getBasePrice() {
        return basePrice;
    }

    /**
     * 
     * @param basePrice
     *     The BasePrice
     */
    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    /**
     * 
     * @return
     *     The brand
     */
    public String getBrand() {
        return brand;
    }

    /**
     * 
     * @param brand
     *     The Brand
     */
    public void setBrand(String brand) {
        this.brand = brand;
    }

    /**
     * 
     * @return
     *     The currentPrice
     */
    public String getCurrentPrice() {
        return currentPrice;
    }

    /**
     * 
     * @param currentPrice
     *     The CurrentPrice
     */
    public void setCurrentPrice(String currentPrice) {
        this.currentPrice = currentPrice;
    }

    /**
     * 
     * @return
     *     The hasMoreColours
     */
    public Boolean getHasMoreColours() {
        return hasMoreColours;
    }

    /**
     * 
     * @param hasMoreColours
     *     The HasMoreColours
     */
    public void setHasMoreColours(Boolean hasMoreColours) {
        this.hasMoreColours = hasMoreColours;
    }

    /**
     * 
     * @return
     *     The isInSet
     */
    public Boolean getIsInSet() {
        return isInSet;
    }

    /**
     * 
     * @param isInSet
     *     The IsInSet
     */
    public void setIsInSet(Boolean isInSet) {
        this.isInSet = isInSet;
    }

    /**
     * 
     * @return
     *     The previousPrice
     */
    public String getPreviousPrice() {
        return previousPrice;
    }

    /**
     * 
     * @param previousPrice
     *     The PreviousPrice
     */
    public void setPreviousPrice(String previousPrice) {
        this.previousPrice = previousPrice;
    }

    /**
     * 
     * @return
     *     The productId
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 
     * @param productId
     *     The ProductId
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    /**
     * 
     * @return
     *     The productImageUrl
     */
    public List<String> getProductImageUrl() {
        return productImageUrl;
    }

    /**
     * 
     * @param productImageUrl
     *     The ProductImageUrl
     */
    public void setProductImageUrl(List<String> productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    /**
     * 
     * @return
     *     The rRP
     */
    public String getRRP() {
        return rRP;
    }

    /**
     * 
     * @param rRP
     *     The RRP
     */
    public void setRRP(String rRP) {
        this.rRP = rRP;
    }

    /**
     * 
     * @return
     *     The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The Title
     */
    public void setTitle(String title) {
        this.title = title;
    }

}

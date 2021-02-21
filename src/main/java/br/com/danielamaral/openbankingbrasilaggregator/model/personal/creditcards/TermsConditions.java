
package br.com.danielamaral.openbankingbrasilaggregator.model.personal.creditcards;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "minimumFeeRate",
    "additionalInfo",
    "elegibilityCriteriaInfo",
    "closingProcessInfo"
})
public class TermsConditions implements Serializable
{

    @JsonProperty("minimumFeeRate")
    private String minimumFeeRate;
    @JsonProperty("additionalInfo")
    private String additionalInfo;
    @JsonProperty("elegibilityCriteriaInfo")
    private String elegibilityCriteriaInfo;
    @JsonProperty("closingProcessInfo")
    private String closingProcessInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7391076984117887558L;

    @JsonProperty("minimumFeeRate")
    public String getMinimumFeeRate() {
        return minimumFeeRate;
    }

    @JsonProperty("minimumFeeRate")
    public void setMinimumFeeRate(String minimumFeeRate) {
        this.minimumFeeRate = minimumFeeRate;
    }

    public TermsConditions withMinimumFeeRate(String minimumFeeRate) {
        this.minimumFeeRate = minimumFeeRate;
        return this;
    }

    @JsonProperty("additionalInfo")
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @JsonProperty("additionalInfo")
    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public TermsConditions withAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
        return this;
    }

    @JsonProperty("elegibilityCriteriaInfo")
    public String getElegibilityCriteriaInfo() {
        return elegibilityCriteriaInfo;
    }

    @JsonProperty("elegibilityCriteriaInfo")
    public void setElegibilityCriteriaInfo(String elegibilityCriteriaInfo) {
        this.elegibilityCriteriaInfo = elegibilityCriteriaInfo;
    }

    public TermsConditions withElegibilityCriteriaInfo(String elegibilityCriteriaInfo) {
        this.elegibilityCriteriaInfo = elegibilityCriteriaInfo;
        return this;
    }

    @JsonProperty("closingProcessInfo")
    public String getClosingProcessInfo() {
        return closingProcessInfo;
    }

    @JsonProperty("closingProcessInfo")
    public void setClosingProcessInfo(String closingProcessInfo) {
        this.closingProcessInfo = closingProcessInfo;
    }

    public TermsConditions withClosingProcessInfo(String closingProcessInfo) {
        this.closingProcessInfo = closingProcessInfo;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public TermsConditions withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("minimumFeeRate", minimumFeeRate).append("additionalInfo", additionalInfo).append("elegibilityCriteriaInfo", elegibilityCriteriaInfo).append("closingProcessInfo", closingProcessInfo).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalInfo).append(closingProcessInfo).append(additionalProperties).append(minimumFeeRate).append(elegibilityCriteriaInfo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TermsConditions) == false) {
            return false;
        }
        TermsConditions rhs = ((TermsConditions) other);
        return new EqualsBuilder().append(additionalInfo, rhs.additionalInfo).append(closingProcessInfo, rhs.closingProcessInfo).append(additionalProperties, rhs.additionalProperties).append(minimumFeeRate, rhs.minimumFeeRate).append(elegibilityCriteriaInfo, rhs.elegibilityCriteriaInfo).isEquals();
    }

}

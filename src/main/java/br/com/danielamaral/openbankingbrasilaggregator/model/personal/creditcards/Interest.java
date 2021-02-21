
package br.com.danielamaral.openbankingbrasilaggregator.model.personal.creditcards;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "rates",
    "instalmentRates",
    "otherCredits"
})
public class Interest implements Serializable
{

    @JsonProperty("rates")
    private List<Rate> rates = new ArrayList<Rate>();
    @JsonProperty("instalmentRates")
    private List<InstalmentRate> instalmentRates = new ArrayList<InstalmentRate>();
    @JsonProperty("otherCredits")
    private List<OtherCredit> otherCredits = new ArrayList<OtherCredit>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2009297799011864745L;

    @JsonProperty("rates")
    public List<Rate> getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(List<Rate> rates) {
        this.rates = rates;
    }

    public Interest withRates(List<Rate> rates) {
        this.rates = rates;
        return this;
    }

    @JsonProperty("instalmentRates")
    public List<InstalmentRate> getInstalmentRates() {
        return instalmentRates;
    }

    @JsonProperty("instalmentRates")
    public void setInstalmentRates(List<InstalmentRate> instalmentRates) {
        this.instalmentRates = instalmentRates;
    }

    public Interest withInstalmentRates(List<InstalmentRate> instalmentRates) {
        this.instalmentRates = instalmentRates;
        return this;
    }

    @JsonProperty("otherCredits")
    public List<OtherCredit> getOtherCredits() {
        return otherCredits;
    }

    @JsonProperty("otherCredits")
    public void setOtherCredits(List<OtherCredit> otherCredits) {
        this.otherCredits = otherCredits;
    }

    public Interest withOtherCredits(List<OtherCredit> otherCredits) {
        this.otherCredits = otherCredits;
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

    public Interest withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("rates", rates).append("instalmentRates", instalmentRates).append("otherCredits", otherCredits).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(instalmentRates).append(otherCredits).append(additionalProperties).append(rates).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Interest) == false) {
            return false;
        }
        Interest rhs = ((Interest) other);
        return new EqualsBuilder().append(instalmentRates, rhs.instalmentRates).append(otherCredits, rhs.otherCredits).append(additionalProperties, rhs.additionalProperties).append(rates, rhs.rates).isEquals();
    }

}

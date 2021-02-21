
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
    "name",
    "code",
    "chargingTriggerInfo",
    "prices",
    "minimum",
    "maximum"
})
public class Service implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("code")
    private String code;
    @JsonProperty("chargingTriggerInfo")
    private String chargingTriggerInfo;
    @JsonProperty("prices")
    private List<Price> prices = new ArrayList<Price>();
    @JsonProperty("minimum")
    private Minimum minimum;
    @JsonProperty("maximum")
    private Maximum maximum;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1055804952670414645L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Service withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    public Service withCode(String code) {
        this.code = code;
        return this;
    }

    @JsonProperty("chargingTriggerInfo")
    public String getChargingTriggerInfo() {
        return chargingTriggerInfo;
    }

    @JsonProperty("chargingTriggerInfo")
    public void setChargingTriggerInfo(String chargingTriggerInfo) {
        this.chargingTriggerInfo = chargingTriggerInfo;
    }

    public Service withChargingTriggerInfo(String chargingTriggerInfo) {
        this.chargingTriggerInfo = chargingTriggerInfo;
        return this;
    }

    @JsonProperty("prices")
    public List<Price> getPrices() {
        return prices;
    }

    @JsonProperty("prices")
    public void setPrices(List<Price> prices) {
        this.prices = prices;
    }

    public Service withPrices(List<Price> prices) {
        this.prices = prices;
        return this;
    }

    @JsonProperty("minimum")
    public Minimum getMinimum() {
        return minimum;
    }

    @JsonProperty("minimum")
    public void setMinimum(Minimum minimum) {
        this.minimum = minimum;
    }

    public Service withMinimum(Minimum minimum) {
        this.minimum = minimum;
        return this;
    }

    @JsonProperty("maximum")
    public Maximum getMaximum() {
        return maximum;
    }

    @JsonProperty("maximum")
    public void setMaximum(Maximum maximum) {
        this.maximum = maximum;
    }

    public Service withMaximum(Maximum maximum) {
        this.maximum = maximum;
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

    public Service withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("code", code).append("chargingTriggerInfo", chargingTriggerInfo).append("prices", prices).append("minimum", minimum).append("maximum", maximum).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(code).append(name).append(chargingTriggerInfo).append(maximum).append(additionalProperties).append(prices).append(minimum).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Service) == false) {
            return false;
        }
        Service rhs = ((Service) other);
        return new EqualsBuilder().append(code, rhs.code).append(name, rhs.name).append(chargingTriggerInfo, rhs.chargingTriggerInfo).append(maximum, rhs.maximum).append(additionalProperties, rhs.additionalProperties).append(prices, rhs.prices).append(minimum, rhs.minimum).isEquals();
    }

}

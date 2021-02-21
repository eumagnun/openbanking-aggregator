
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
    "interval",
    "indexer",
    "customers"
})
public class Application_ implements Serializable
{

    @JsonProperty("interval")
    private String interval;
    @JsonProperty("indexer")
    private Indexer_ indexer;
    @JsonProperty("customers")
    private Customers__ customers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8082178689878598962L;

    @JsonProperty("interval")
    public String getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public Application_ withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("indexer")
    public Indexer_ getIndexer() {
        return indexer;
    }

    @JsonProperty("indexer")
    public void setIndexer(Indexer_ indexer) {
        this.indexer = indexer;
    }

    public Application_ withIndexer(Indexer_ indexer) {
        this.indexer = indexer;
        return this;
    }

    @JsonProperty("customers")
    public Customers__ getCustomers() {
        return customers;
    }

    @JsonProperty("customers")
    public void setCustomers(Customers__ customers) {
        this.customers = customers;
    }

    public Application_ withCustomers(Customers__ customers) {
        this.customers = customers;
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

    public Application_ withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("interval", interval).append("indexer", indexer).append("customers", customers).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(interval).append(indexer).append(customers).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Application_) == false) {
            return false;
        }
        Application_ rhs = ((Application_) other);
        return new EqualsBuilder().append(interval, rhs.interval).append(indexer, rhs.indexer).append(customers, rhs.customers).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}


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
public class Application implements Serializable
{

    @JsonProperty("interval")
    private String interval;
    @JsonProperty("indexer")
    private Indexer indexer;
    @JsonProperty("customers")
    private Customers_ customers;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -7326246680517826534L;

    @JsonProperty("interval")
    public String getInterval() {
        return interval;
    }

    @JsonProperty("interval")
    public void setInterval(String interval) {
        this.interval = interval;
    }

    public Application withInterval(String interval) {
        this.interval = interval;
        return this;
    }

    @JsonProperty("indexer")
    public Indexer getIndexer() {
        return indexer;
    }

    @JsonProperty("indexer")
    public void setIndexer(Indexer indexer) {
        this.indexer = indexer;
    }

    public Application withIndexer(Indexer indexer) {
        this.indexer = indexer;
        return this;
    }

    @JsonProperty("customers")
    public Customers_ getCustomers() {
        return customers;
    }

    @JsonProperty("customers")
    public void setCustomers(Customers_ customers) {
        this.customers = customers;
    }

    public Application withCustomers(Customers_ customers) {
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

    public Application withAdditionalProperty(String name, Object value) {
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
        if ((other instanceof Application) == false) {
            return false;
        }
        Application rhs = ((Application) other);
        return new EqualsBuilder().append(interval, rhs.interval).append(indexer, rhs.indexer).append(customers, rhs.customers).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

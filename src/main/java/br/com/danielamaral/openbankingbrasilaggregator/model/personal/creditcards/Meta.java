
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
    "totalRecords",
    "totalPages"
})
public class Meta implements Serializable
{

    @JsonProperty("totalRecords")
    private long totalRecords;
    @JsonProperty("totalPages")
    private long totalPages;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6022364456345658515L;

    @JsonProperty("totalRecords")
    public long getTotalRecords() {
        return totalRecords;
    }

    @JsonProperty("totalRecords")
    public void setTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Meta withTotalRecords(long totalRecords) {
        this.totalRecords = totalRecords;
        return this;
    }

    @JsonProperty("totalPages")
    public long getTotalPages() {
        return totalPages;
    }

    @JsonProperty("totalPages")
    public void setTotalPages(long totalPages) {
        this.totalPages = totalPages;
    }

    public Meta withTotalPages(long totalPages) {
        this.totalPages = totalPages;
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

    public Meta withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("totalRecords", totalRecords).append("totalPages", totalPages).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(totalPages).append(totalRecords).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Meta) == false) {
            return false;
        }
        Meta rhs = ((Meta) other);
        return new EqualsBuilder().append(totalPages, rhs.totalPages).append(totalRecords, rhs.totalRecords).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

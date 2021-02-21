
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
    "referentialRateIndexer",
    "rate",
    "applications",
    "minimumRate",
    "maximumRate"
})
public class Rate implements Serializable
{

    @JsonProperty("referentialRateIndexer")
    private String referentialRateIndexer;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("applications")
    private List<Application> applications = new ArrayList<Application>();
    @JsonProperty("minimumRate")
    private String minimumRate;
    @JsonProperty("maximumRate")
    private String maximumRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -6855592445325272717L;

    @JsonProperty("referentialRateIndexer")
    public String getReferentialRateIndexer() {
        return referentialRateIndexer;
    }

    @JsonProperty("referentialRateIndexer")
    public void setReferentialRateIndexer(String referentialRateIndexer) {
        this.referentialRateIndexer = referentialRateIndexer;
    }

    public Rate withReferentialRateIndexer(String referentialRateIndexer) {
        this.referentialRateIndexer = referentialRateIndexer;
        return this;
    }

    @JsonProperty("rate")
    public String getRate() {
        return rate;
    }

    @JsonProperty("rate")
    public void setRate(String rate) {
        this.rate = rate;
    }

    public Rate withRate(String rate) {
        this.rate = rate;
        return this;
    }

    @JsonProperty("applications")
    public List<Application> getApplications() {
        return applications;
    }

    @JsonProperty("applications")
    public void setApplications(List<Application> applications) {
        this.applications = applications;
    }

    public Rate withApplications(List<Application> applications) {
        this.applications = applications;
        return this;
    }

    @JsonProperty("minimumRate")
    public String getMinimumRate() {
        return minimumRate;
    }

    @JsonProperty("minimumRate")
    public void setMinimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
    }

    public Rate withMinimumRate(String minimumRate) {
        this.minimumRate = minimumRate;
        return this;
    }

    @JsonProperty("maximumRate")
    public String getMaximumRate() {
        return maximumRate;
    }

    @JsonProperty("maximumRate")
    public void setMaximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
    }

    public Rate withMaximumRate(String maximumRate) {
        this.maximumRate = maximumRate;
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

    public Rate withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("referentialRateIndexer", referentialRateIndexer).append("rate", rate).append("applications", applications).append("minimumRate", minimumRate).append("maximumRate", maximumRate).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rate).append(maximumRate).append(minimumRate).append(additionalProperties).append(referentialRateIndexer).append(applications).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Rate) == false) {
            return false;
        }
        Rate rhs = ((Rate) other);
        return new EqualsBuilder().append(rate, rhs.rate).append(maximumRate, rhs.maximumRate).append(minimumRate, rhs.minimumRate).append(additionalProperties, rhs.additionalProperties).append(referentialRateIndexer, rhs.referentialRateIndexer).append(applications, rhs.applications).isEquals();
    }

}

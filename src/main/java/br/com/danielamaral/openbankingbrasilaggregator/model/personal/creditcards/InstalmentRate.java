
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
public class InstalmentRate implements Serializable
{

    @JsonProperty("referentialRateIndexer")
    private String referentialRateIndexer;
    @JsonProperty("rate")
    private String rate;
    @JsonProperty("applications")
    private List<Application_> applications = new ArrayList<Application_>();
    @JsonProperty("minimumRate")
    private String minimumRate;
    @JsonProperty("maximumRate")
    private String maximumRate;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 8023088286407602535L;

    @JsonProperty("referentialRateIndexer")
    public String getReferentialRateIndexer() {
        return referentialRateIndexer;
    }

    @JsonProperty("referentialRateIndexer")
    public void setReferentialRateIndexer(String referentialRateIndexer) {
        this.referentialRateIndexer = referentialRateIndexer;
    }

    public InstalmentRate withReferentialRateIndexer(String referentialRateIndexer) {
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

    public InstalmentRate withRate(String rate) {
        this.rate = rate;
        return this;
    }

    @JsonProperty("applications")
    public List<Application_> getApplications() {
        return applications;
    }

    @JsonProperty("applications")
    public void setApplications(List<Application_> applications) {
        this.applications = applications;
    }

    public InstalmentRate withApplications(List<Application_> applications) {
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

    public InstalmentRate withMinimumRate(String minimumRate) {
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

    public InstalmentRate withMaximumRate(String maximumRate) {
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

    public InstalmentRate withAdditionalProperty(String name, Object value) {
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
        if ((other instanceof InstalmentRate) == false) {
            return false;
        }
        InstalmentRate rhs = ((InstalmentRate) other);
        return new EqualsBuilder().append(rate, rhs.rate).append(maximumRate, rhs.maximumRate).append(minimumRate, rhs.minimumRate).append(additionalProperties, rhs.additionalProperties).append(referentialRateIndexer, rhs.referentialRateIndexer).append(applications, rhs.applications).isEquals();
    }

}

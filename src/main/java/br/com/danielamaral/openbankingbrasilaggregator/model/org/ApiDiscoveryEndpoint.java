
package br.com.danielamaral.openbankingbrasilaggregator.model.org;

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
    "ApiDiscoveryId",
    "ApiEndpoint"
})
public class ApiDiscoveryEndpoint implements Serializable
{

    @JsonProperty("ApiDiscoveryId")
    private String apiDiscoveryId;
    @JsonProperty("ApiEndpoint")
    private String apiEndpoint;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2786405253748818174L;

    @JsonProperty("ApiDiscoveryId")
    public String getApiDiscoveryId() {
        return apiDiscoveryId;
    }

    @JsonProperty("ApiDiscoveryId")
    public void setApiDiscoveryId(String apiDiscoveryId) {
        this.apiDiscoveryId = apiDiscoveryId;
    }

    public ApiDiscoveryEndpoint withApiDiscoveryId(String apiDiscoveryId) {
        this.apiDiscoveryId = apiDiscoveryId;
        return this;
    }

    @JsonProperty("ApiEndpoint")
    public String getApiEndpoint() {
        return apiEndpoint;
    }

    @JsonProperty("ApiEndpoint")
    public void setApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
    }

    public ApiDiscoveryEndpoint withApiEndpoint(String apiEndpoint) {
        this.apiEndpoint = apiEndpoint;
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

    public ApiDiscoveryEndpoint withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiDiscoveryId", apiDiscoveryId).append("apiEndpoint", apiEndpoint).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(apiEndpoint).append(additionalProperties).append(apiDiscoveryId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiDiscoveryEndpoint) == false) {
            return false;
        }
        ApiDiscoveryEndpoint rhs = ((ApiDiscoveryEndpoint) other);
        return new EqualsBuilder().append(apiEndpoint, rhs.apiEndpoint).append(additionalProperties, rhs.additionalProperties).append(apiDiscoveryId, rhs.apiDiscoveryId).isEquals();
    }

}

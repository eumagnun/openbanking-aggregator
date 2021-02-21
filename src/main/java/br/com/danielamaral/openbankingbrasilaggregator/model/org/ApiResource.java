
package br.com.danielamaral.openbankingbrasilaggregator.model.org;

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
    "ApiFamilyType",
    "ApiVersion",
    "ApiResourceId",
    "ApiDiscoveryEndpoints"
})
public class ApiResource implements Serializable
{

    @JsonProperty("ApiFamilyType")
    private String apiFamilyType;
    @JsonProperty("ApiVersion")
    private long apiVersion;
    @JsonProperty("ApiResourceId")
    private String apiResourceId;
    @JsonProperty("ApiDiscoveryEndpoints")
    private List<ApiDiscoveryEndpoint> apiDiscoveryEndpoints = new ArrayList<ApiDiscoveryEndpoint>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -225782665072263085L;

    @JsonProperty("ApiFamilyType")
    public String getApiFamilyType() {
        return apiFamilyType;
    }

    @JsonProperty("ApiFamilyType")
    public void setApiFamilyType(String apiFamilyType) {
        this.apiFamilyType = apiFamilyType;
    }

    public ApiResource withApiFamilyType(String apiFamilyType) {
        this.apiFamilyType = apiFamilyType;
        return this;
    }

    @JsonProperty("ApiVersion")
    public long getApiVersion() {
        return apiVersion;
    }

    @JsonProperty("ApiVersion")
    public void setApiVersion(long apiVersion) {
        this.apiVersion = apiVersion;
    }

    public ApiResource withApiVersion(long apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    @JsonProperty("ApiResourceId")
    public String getApiResourceId() {
        return apiResourceId;
    }

    @JsonProperty("ApiResourceId")
    public void setApiResourceId(String apiResourceId) {
        this.apiResourceId = apiResourceId;
    }

    public ApiResource withApiResourceId(String apiResourceId) {
        this.apiResourceId = apiResourceId;
        return this;
    }

    @JsonProperty("ApiDiscoveryEndpoints")
    public List<ApiDiscoveryEndpoint> getApiDiscoveryEndpoints() {
        return apiDiscoveryEndpoints;
    }

    @JsonProperty("ApiDiscoveryEndpoints")
    public void setApiDiscoveryEndpoints(List<ApiDiscoveryEndpoint> apiDiscoveryEndpoints) {
        this.apiDiscoveryEndpoints = apiDiscoveryEndpoints;
    }

    public ApiResource withApiDiscoveryEndpoints(List<ApiDiscoveryEndpoint> apiDiscoveryEndpoints) {
        this.apiDiscoveryEndpoints = apiDiscoveryEndpoints;
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

    public ApiResource withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apiFamilyType", apiFamilyType).append("apiVersion", apiVersion).append("apiResourceId", apiResourceId).append("apiDiscoveryEndpoints", apiDiscoveryEndpoints).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(apiFamilyType).append(apiVersion).append(additionalProperties).append(apiResourceId).append(apiDiscoveryEndpoints).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ApiResource) == false) {
            return false;
        }
        ApiResource rhs = ((ApiResource) other);
        return new EqualsBuilder().append(apiFamilyType, rhs.apiFamilyType).append(apiVersion, rhs.apiVersion).append(additionalProperties, rhs.additionalProperties).append(apiResourceId, rhs.apiResourceId).append(apiDiscoveryEndpoints, rhs.apiDiscoveryEndpoints).isEquals();
    }

}

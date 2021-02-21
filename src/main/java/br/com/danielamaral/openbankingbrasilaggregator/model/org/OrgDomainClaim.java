
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
    "Status",
    "AuthorityName",
    "RegistrationId",
    "AuthorisationDomainName"
})
public class OrgDomainClaim implements Serializable
{

    @JsonProperty("Status")
    private String status;
    @JsonProperty("AuthorityName")
    private String authorityName;
    @JsonProperty("RegistrationId")
    private String registrationId;
    @JsonProperty("AuthorisationDomainName")
    private String authorisationDomainName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -4931423724855997779L;

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    public OrgDomainClaim withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("AuthorityName")
    public String getAuthorityName() {
        return authorityName;
    }

    @JsonProperty("AuthorityName")
    public void setAuthorityName(String authorityName) {
        this.authorityName = authorityName;
    }

    public OrgDomainClaim withAuthorityName(String authorityName) {
        this.authorityName = authorityName;
        return this;
    }

    @JsonProperty("RegistrationId")
    public String getRegistrationId() {
        return registrationId;
    }

    @JsonProperty("RegistrationId")
    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public OrgDomainClaim withRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    @JsonProperty("AuthorisationDomainName")
    public String getAuthorisationDomainName() {
        return authorisationDomainName;
    }

    @JsonProperty("AuthorisationDomainName")
    public void setAuthorisationDomainName(String authorisationDomainName) {
        this.authorisationDomainName = authorisationDomainName;
    }

    public OrgDomainClaim withAuthorisationDomainName(String authorisationDomainName) {
        this.authorisationDomainName = authorisationDomainName;
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

    public OrgDomainClaim withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("authorityName", authorityName).append("registrationId", registrationId).append("authorisationDomainName", authorisationDomainName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(registrationId).append(authorisationDomainName).append(authorityName).append(additionalProperties).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrgDomainClaim) == false) {
            return false;
        }
        OrgDomainClaim rhs = ((OrgDomainClaim) other);
        return new EqualsBuilder().append(registrationId, rhs.registrationId).append(authorisationDomainName, rhs.authorisationDomainName).append(authorityName, rhs.authorityName).append(additionalProperties, rhs.additionalProperties).append(status, rhs.status).isEquals();
    }

}

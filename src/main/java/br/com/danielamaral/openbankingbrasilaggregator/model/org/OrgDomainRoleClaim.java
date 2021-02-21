
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
    "Status",
    "AuthorisationDomain",
    "Role",
    "RegistrationId",
    "Authorisations"
})
public class OrgDomainRoleClaim implements Serializable
{

    @JsonProperty("Status")
    private String status;
    @JsonProperty("AuthorisationDomain")
    private String authorisationDomain;
    @JsonProperty("Role")
    private String role;
    @JsonProperty("RegistrationId")
    private String registrationId;
    @JsonProperty("Authorisations")
    private List<Object> authorisations = new ArrayList<Object>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -1937819130614061396L;

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    public OrgDomainRoleClaim withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("AuthorisationDomain")
    public String getAuthorisationDomain() {
        return authorisationDomain;
    }

    @JsonProperty("AuthorisationDomain")
    public void setAuthorisationDomain(String authorisationDomain) {
        this.authorisationDomain = authorisationDomain;
    }

    public OrgDomainRoleClaim withAuthorisationDomain(String authorisationDomain) {
        this.authorisationDomain = authorisationDomain;
        return this;
    }

    @JsonProperty("Role")
    public String getRole() {
        return role;
    }

    @JsonProperty("Role")
    public void setRole(String role) {
        this.role = role;
    }

    public OrgDomainRoleClaim withRole(String role) {
        this.role = role;
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

    public OrgDomainRoleClaim withRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    @JsonProperty("Authorisations")
    public List<Object> getAuthorisations() {
        return authorisations;
    }

    @JsonProperty("Authorisations")
    public void setAuthorisations(List<Object> authorisations) {
        this.authorisations = authorisations;
    }

    public OrgDomainRoleClaim withAuthorisations(List<Object> authorisations) {
        this.authorisations = authorisations;
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

    public OrgDomainRoleClaim withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("authorisationDomain", authorisationDomain).append("role", role).append("registrationId", registrationId).append("authorisations", authorisations).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(role).append(authorisationDomain).append(authorisations).append(registrationId).append(additionalProperties).append(status).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrgDomainRoleClaim) == false) {
            return false;
        }
        OrgDomainRoleClaim rhs = ((OrgDomainRoleClaim) other);
        return new EqualsBuilder().append(role, rhs.role).append(authorisationDomain, rhs.authorisationDomain).append(authorisations, rhs.authorisations).append(registrationId, rhs.registrationId).append(additionalProperties, rhs.additionalProperties).append(status, rhs.status).isEquals();
    }

}

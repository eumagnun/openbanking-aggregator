
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
    "OrgDomainRoleClaims",
    "AuthorisationServers",
    "OrgDomainClaims",
    "RegistrationId",
    "OrganisationId",
    "City",
    "Postcode",
    "AddressLine2",
    "RegisteredName",
    "AddressLine1",
    "LegalEntityName",
    "OrganisationName",
    "Country",
    "RegistrationNumber",
    "CreatedOn",
    "ParentOrganisationReference",
    "CompanyRegister",
    "CountryOfRegistration"
})
public class Organization implements Serializable
{

    @JsonProperty("Status")
    private String status;
    @JsonProperty("OrgDomainRoleClaims")
    private List<OrgDomainRoleClaim> orgDomainRoleClaims = new ArrayList<OrgDomainRoleClaim>();
    @JsonProperty("AuthorisationServers")
    private List<AuthorisationServer> authorisationServers = new ArrayList<AuthorisationServer>();
    @JsonProperty("OrgDomainClaims")
    private List<OrgDomainClaim> orgDomainClaims = new ArrayList<OrgDomainClaim>();
    @JsonProperty("RegistrationId")
    private String registrationId;
    @JsonProperty("OrganisationId")
    private String organisationId;
    @JsonProperty("City")
    private String city;
    @JsonProperty("Postcode")
    private String postcode;
    @JsonProperty("AddressLine2")
    private String addressLine2;
    @JsonProperty("RegisteredName")
    private String registeredName;
    @JsonProperty("AddressLine1")
    private String addressLine1;
    @JsonProperty("LegalEntityName")
    private String legalEntityName;
    @JsonProperty("OrganisationName")
    private String organisationName;
    @JsonProperty("Country")
    private String country;
    @JsonProperty("RegistrationNumber")
    private String registrationNumber;
    @JsonProperty("CreatedOn")
    private String createdOn;
    @JsonProperty("ParentOrganisationReference")
    private String parentOrganisationReference;
    @JsonProperty("CompanyRegister")
    private String companyRegister;
    @JsonProperty("CountryOfRegistration")
    private String countryOfRegistration;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8533537245851208122L;

    @JsonProperty("Status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("Status")
    public void setStatus(String status) {
        this.status = status;
    }

    public Organization withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("OrgDomainRoleClaims")
    public List<OrgDomainRoleClaim> getOrgDomainRoleClaims() {
        return orgDomainRoleClaims;
    }

    @JsonProperty("OrgDomainRoleClaims")
    public void setOrgDomainRoleClaims(List<OrgDomainRoleClaim> orgDomainRoleClaims) {
        this.orgDomainRoleClaims = orgDomainRoleClaims;
    }

    public Organization withOrgDomainRoleClaims(List<OrgDomainRoleClaim> orgDomainRoleClaims) {
        this.orgDomainRoleClaims = orgDomainRoleClaims;
        return this;
    }

    @JsonProperty("AuthorisationServers")
    public List<AuthorisationServer> getAuthorisationServers() {
        return authorisationServers;
    }

    @JsonProperty("AuthorisationServers")
    public void setAuthorisationServers(List<AuthorisationServer> authorisationServers) {
        this.authorisationServers = authorisationServers;
    }

    public Organization withAuthorisationServers(List<AuthorisationServer> authorisationServers) {
        this.authorisationServers = authorisationServers;
        return this;
    }

    @JsonProperty("OrgDomainClaims")
    public List<OrgDomainClaim> getOrgDomainClaims() {
        return orgDomainClaims;
    }

    @JsonProperty("OrgDomainClaims")
    public void setOrgDomainClaims(List<OrgDomainClaim> orgDomainClaims) {
        this.orgDomainClaims = orgDomainClaims;
    }

    public Organization withOrgDomainClaims(List<OrgDomainClaim> orgDomainClaims) {
        this.orgDomainClaims = orgDomainClaims;
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

    public Organization withRegistrationId(String registrationId) {
        this.registrationId = registrationId;
        return this;
    }

    @JsonProperty("OrganisationId")
    public String getOrganisationId() {
        return organisationId;
    }

    @JsonProperty("OrganisationId")
    public void setOrganisationId(String organisationId) {
        this.organisationId = organisationId;
    }

    public Organization withOrganisationId(String organisationId) {
        this.organisationId = organisationId;
        return this;
    }

    @JsonProperty("City")
    public String getCity() {
        return city;
    }

    @JsonProperty("City")
    public void setCity(String city) {
        this.city = city;
    }

    public Organization withCity(String city) {
        this.city = city;
        return this;
    }

    @JsonProperty("Postcode")
    public String getPostcode() {
        return postcode;
    }

    @JsonProperty("Postcode")
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Organization withPostcode(String postcode) {
        this.postcode = postcode;
        return this;
    }

    @JsonProperty("AddressLine2")
    public String getAddressLine2() {
        return addressLine2;
    }

    @JsonProperty("AddressLine2")
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public Organization withAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
        return this;
    }

    @JsonProperty("RegisteredName")
    public String getRegisteredName() {
        return registeredName;
    }

    @JsonProperty("RegisteredName")
    public void setRegisteredName(String registeredName) {
        this.registeredName = registeredName;
    }

    public Organization withRegisteredName(String registeredName) {
        this.registeredName = registeredName;
        return this;
    }

    @JsonProperty("AddressLine1")
    public String getAddressLine1() {
        return addressLine1;
    }

    @JsonProperty("AddressLine1")
    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public Organization withAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
        return this;
    }

    @JsonProperty("LegalEntityName")
    public String getLegalEntityName() {
        return legalEntityName;
    }

    @JsonProperty("LegalEntityName")
    public void setLegalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
    }

    public Organization withLegalEntityName(String legalEntityName) {
        this.legalEntityName = legalEntityName;
        return this;
    }

    @JsonProperty("OrganisationName")
    public String getOrganisationName() {
        return organisationName;
    }

    @JsonProperty("OrganisationName")
    public void setOrganisationName(String organisationName) {
        this.organisationName = organisationName;
    }

    public Organization withOrganisationName(String organisationName) {
        this.organisationName = organisationName;
        return this;
    }

    @JsonProperty("Country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("Country")
    public void setCountry(String country) {
        this.country = country;
    }

    public Organization withCountry(String country) {
        this.country = country;
        return this;
    }

    @JsonProperty("RegistrationNumber")
    public String getRegistrationNumber() {
        return registrationNumber;
    }

    @JsonProperty("RegistrationNumber")
    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public Organization withRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
        return this;
    }

    @JsonProperty("CreatedOn")
    public String getCreatedOn() {
        return createdOn;
    }

    @JsonProperty("CreatedOn")
    public void setCreatedOn(String createdOn) {
        this.createdOn = createdOn;
    }

    public Organization withCreatedOn(String createdOn) {
        this.createdOn = createdOn;
        return this;
    }

    @JsonProperty("ParentOrganisationReference")
    public String getParentOrganisationReference() {
        return parentOrganisationReference;
    }

    @JsonProperty("ParentOrganisationReference")
    public void setParentOrganisationReference(String parentOrganisationReference) {
        this.parentOrganisationReference = parentOrganisationReference;
    }

    public Organization withParentOrganisationReference(String parentOrganisationReference) {
        this.parentOrganisationReference = parentOrganisationReference;
        return this;
    }

    @JsonProperty("CompanyRegister")
    public String getCompanyRegister() {
        return companyRegister;
    }

    @JsonProperty("CompanyRegister")
    public void setCompanyRegister(String companyRegister) {
        this.companyRegister = companyRegister;
    }

    public Organization withCompanyRegister(String companyRegister) {
        this.companyRegister = companyRegister;
        return this;
    }

    @JsonProperty("CountryOfRegistration")
    public String getCountryOfRegistration() {
        return countryOfRegistration;
    }

    @JsonProperty("CountryOfRegistration")
    public void setCountryOfRegistration(String countryOfRegistration) {
        this.countryOfRegistration = countryOfRegistration;
    }

    public Organization withCountryOfRegistration(String countryOfRegistration) {
        this.countryOfRegistration = countryOfRegistration;
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

    public Organization withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("orgDomainRoleClaims", orgDomainRoleClaims).append("authorisationServers", authorisationServers).append("orgDomainClaims", orgDomainClaims).append("registrationId", registrationId).append("organisationId", organisationId).append("city", city).append("postcode", postcode).append("addressLine2", addressLine2).append("registeredName", registeredName).append("addressLine1", addressLine1).append("legalEntityName", legalEntityName).append("organisationName", organisationName).append("country", country).append("registrationNumber", registrationNumber).append("createdOn", createdOn).append("parentOrganisationReference", parentOrganisationReference).append("companyRegister", companyRegister).append("countryOfRegistration", countryOfRegistration).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(country).append(organisationId).append(city).append(postcode).append(companyRegister).append(createdOn).append(organisationName).append(registeredName).append(registrationNumber).append(orgDomainRoleClaims).append(orgDomainClaims).append(registrationId).append(addressLine1).append(legalEntityName).append(addressLine2).append(parentOrganisationReference).append(additionalProperties).append(countryOfRegistration).append(status).append(authorisationServers).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Organization) == false) {
            return false;
        }
        Organization rhs = ((Organization) other);
        return new EqualsBuilder().append(country, rhs.country).append(organisationId, rhs.organisationId).append(city, rhs.city).append(postcode, rhs.postcode).append(companyRegister, rhs.companyRegister).append(createdOn, rhs.createdOn).append(organisationName, rhs.organisationName).append(registeredName, rhs.registeredName).append(registrationNumber, rhs.registrationNumber).append(orgDomainRoleClaims, rhs.orgDomainRoleClaims).append(orgDomainClaims, rhs.orgDomainClaims).append(registrationId, rhs.registrationId).append(addressLine1, rhs.addressLine1).append(legalEntityName, rhs.legalEntityName).append(addressLine2, rhs.addressLine2).append(parentOrganisationReference, rhs.parentOrganisationReference).append(additionalProperties, rhs.additionalProperties).append(countryOfRegistration, rhs.countryOfRegistration).append(status, rhs.status).append(authorisationServers, rhs.authorisationServers).isEquals();
    }

}

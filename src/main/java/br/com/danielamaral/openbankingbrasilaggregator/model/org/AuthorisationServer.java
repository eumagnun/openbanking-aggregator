
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
    "PayloadSigningCertLocationUri",
    "ParentAuthorisationServerId",
    "OpenIDDiscoveryDocument",
    "CustomerFriendlyName",
    "CustomerFriendlyDescription",
    "TermsOfServiceUri",
    "ApiResources",
    "AutoRegistrationSupported",
    "CustomerFriendlyLogoUri",
    "DeveloperPortalUri",
    "AuthorisationServerId"
})
public class AuthorisationServer implements Serializable
{

    @JsonProperty("PayloadSigningCertLocationUri")
    private String payloadSigningCertLocationUri;
    @JsonProperty("ParentAuthorisationServerId")
    private Object parentAuthorisationServerId;
    @JsonProperty("OpenIDDiscoveryDocument")
    private String openIDDiscoveryDocument;
    @JsonProperty("CustomerFriendlyName")
    private String customerFriendlyName;
    @JsonProperty("CustomerFriendlyDescription")
    private String customerFriendlyDescription;
    @JsonProperty("TermsOfServiceUri")
    private String termsOfServiceUri;
    @JsonProperty("ApiResources")
    private List<ApiResource> apiResources = new ArrayList<ApiResource>();
    @JsonProperty("AutoRegistrationSupported")
    private boolean autoRegistrationSupported;
    @JsonProperty("CustomerFriendlyLogoUri")
    private String customerFriendlyLogoUri;
    @JsonProperty("DeveloperPortalUri")
    private String developerPortalUri;
    @JsonProperty("AuthorisationServerId")
    private String authorisationServerId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 3511890722017504333L;

    @JsonProperty("PayloadSigningCertLocationUri")
    public String getPayloadSigningCertLocationUri() {
        return payloadSigningCertLocationUri;
    }

    @JsonProperty("PayloadSigningCertLocationUri")
    public void setPayloadSigningCertLocationUri(String payloadSigningCertLocationUri) {
        this.payloadSigningCertLocationUri = payloadSigningCertLocationUri;
    }

    public AuthorisationServer withPayloadSigningCertLocationUri(String payloadSigningCertLocationUri) {
        this.payloadSigningCertLocationUri = payloadSigningCertLocationUri;
        return this;
    }

    @JsonProperty("ParentAuthorisationServerId")
    public Object getParentAuthorisationServerId() {
        return parentAuthorisationServerId;
    }

    @JsonProperty("ParentAuthorisationServerId")
    public void setParentAuthorisationServerId(Object parentAuthorisationServerId) {
        this.parentAuthorisationServerId = parentAuthorisationServerId;
    }

    public AuthorisationServer withParentAuthorisationServerId(Object parentAuthorisationServerId) {
        this.parentAuthorisationServerId = parentAuthorisationServerId;
        return this;
    }

    @JsonProperty("OpenIDDiscoveryDocument")
    public String getOpenIDDiscoveryDocument() {
        return openIDDiscoveryDocument;
    }

    @JsonProperty("OpenIDDiscoveryDocument")
    public void setOpenIDDiscoveryDocument(String openIDDiscoveryDocument) {
        this.openIDDiscoveryDocument = openIDDiscoveryDocument;
    }

    public AuthorisationServer withOpenIDDiscoveryDocument(String openIDDiscoveryDocument) {
        this.openIDDiscoveryDocument = openIDDiscoveryDocument;
        return this;
    }

    @JsonProperty("CustomerFriendlyName")
    public String getCustomerFriendlyName() {
        return customerFriendlyName;
    }

    @JsonProperty("CustomerFriendlyName")
    public void setCustomerFriendlyName(String customerFriendlyName) {
        this.customerFriendlyName = customerFriendlyName;
    }

    public AuthorisationServer withCustomerFriendlyName(String customerFriendlyName) {
        this.customerFriendlyName = customerFriendlyName;
        return this;
    }

    @JsonProperty("CustomerFriendlyDescription")
    public String getCustomerFriendlyDescription() {
        return customerFriendlyDescription;
    }

    @JsonProperty("CustomerFriendlyDescription")
    public void setCustomerFriendlyDescription(String customerFriendlyDescription) {
        this.customerFriendlyDescription = customerFriendlyDescription;
    }

    public AuthorisationServer withCustomerFriendlyDescription(String customerFriendlyDescription) {
        this.customerFriendlyDescription = customerFriendlyDescription;
        return this;
    }

    @JsonProperty("TermsOfServiceUri")
    public String getTermsOfServiceUri() {
        return termsOfServiceUri;
    }

    @JsonProperty("TermsOfServiceUri")
    public void setTermsOfServiceUri(String termsOfServiceUri) {
        this.termsOfServiceUri = termsOfServiceUri;
    }

    public AuthorisationServer withTermsOfServiceUri(String termsOfServiceUri) {
        this.termsOfServiceUri = termsOfServiceUri;
        return this;
    }

    @JsonProperty("ApiResources")
    public List<ApiResource> getApiResources() {
        return apiResources;
    }

    @JsonProperty("ApiResources")
    public void setApiResources(List<ApiResource> apiResources) {
        this.apiResources = apiResources;
    }

    public AuthorisationServer withApiResources(List<ApiResource> apiResources) {
        this.apiResources = apiResources;
        return this;
    }

    @JsonProperty("AutoRegistrationSupported")
    public boolean isAutoRegistrationSupported() {
        return autoRegistrationSupported;
    }

    @JsonProperty("AutoRegistrationSupported")
    public void setAutoRegistrationSupported(boolean autoRegistrationSupported) {
        this.autoRegistrationSupported = autoRegistrationSupported;
    }

    public AuthorisationServer withAutoRegistrationSupported(boolean autoRegistrationSupported) {
        this.autoRegistrationSupported = autoRegistrationSupported;
        return this;
    }

    @JsonProperty("CustomerFriendlyLogoUri")
    public String getCustomerFriendlyLogoUri() {
        return customerFriendlyLogoUri;
    }

    @JsonProperty("CustomerFriendlyLogoUri")
    public void setCustomerFriendlyLogoUri(String customerFriendlyLogoUri) {
        this.customerFriendlyLogoUri = customerFriendlyLogoUri;
    }

    public AuthorisationServer withCustomerFriendlyLogoUri(String customerFriendlyLogoUri) {
        this.customerFriendlyLogoUri = customerFriendlyLogoUri;
        return this;
    }

    @JsonProperty("DeveloperPortalUri")
    public String getDeveloperPortalUri() {
        return developerPortalUri;
    }

    @JsonProperty("DeveloperPortalUri")
    public void setDeveloperPortalUri(String developerPortalUri) {
        this.developerPortalUri = developerPortalUri;
    }

    public AuthorisationServer withDeveloperPortalUri(String developerPortalUri) {
        this.developerPortalUri = developerPortalUri;
        return this;
    }

    @JsonProperty("AuthorisationServerId")
    public String getAuthorisationServerId() {
        return authorisationServerId;
    }

    @JsonProperty("AuthorisationServerId")
    public void setAuthorisationServerId(String authorisationServerId) {
        this.authorisationServerId = authorisationServerId;
    }

    public AuthorisationServer withAuthorisationServerId(String authorisationServerId) {
        this.authorisationServerId = authorisationServerId;
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

    public AuthorisationServer withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("payloadSigningCertLocationUri", payloadSigningCertLocationUri).append("parentAuthorisationServerId", parentAuthorisationServerId).append("openIDDiscoveryDocument", openIDDiscoveryDocument).append("customerFriendlyName", customerFriendlyName).append("customerFriendlyDescription", customerFriendlyDescription).append("termsOfServiceUri", termsOfServiceUri).append("apiResources", apiResources).append("autoRegistrationSupported", autoRegistrationSupported).append("customerFriendlyLogoUri", customerFriendlyLogoUri).append("developerPortalUri", developerPortalUri).append("authorisationServerId", authorisationServerId).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(authorisationServerId).append(payloadSigningCertLocationUri).append(developerPortalUri).append(parentAuthorisationServerId).append(customerFriendlyDescription).append(termsOfServiceUri).append(customerFriendlyLogoUri).append(openIDDiscoveryDocument).append(apiResources).append(autoRegistrationSupported).append(customerFriendlyName).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AuthorisationServer) == false) {
            return false;
        }
        AuthorisationServer rhs = ((AuthorisationServer) other);
        return new EqualsBuilder().append(authorisationServerId, rhs.authorisationServerId).append(payloadSigningCertLocationUri, rhs.payloadSigningCertLocationUri).append(developerPortalUri, rhs.developerPortalUri).append(parentAuthorisationServerId, rhs.parentAuthorisationServerId).append(customerFriendlyDescription, rhs.customerFriendlyDescription).append(termsOfServiceUri, rhs.termsOfServiceUri).append(customerFriendlyLogoUri, rhs.customerFriendlyLogoUri).append(openIDDiscoveryDocument, rhs.openIDDiscoveryDocument).append(apiResources, rhs.apiResources).append(autoRegistrationSupported, rhs.autoRegistrationSupported).append(customerFriendlyName, rhs.customerFriendlyName).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}

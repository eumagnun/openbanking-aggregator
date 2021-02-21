
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
    "name",
    "cnpjNumber",
    "urlComplementaryList",
    "personalCreditCards"
})
public class Company implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("cnpjNumber")
    private String cnpjNumber;
    @JsonProperty("urlComplementaryList")
    private String urlComplementaryList;
    @JsonProperty("personalCreditCards")
    private List<PersonalCreditCard> personalCreditCards = new ArrayList<PersonalCreditCard>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 4909944421643563954L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Company withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("cnpjNumber")
    public String getCnpjNumber() {
        return cnpjNumber;
    }

    @JsonProperty("cnpjNumber")
    public void setCnpjNumber(String cnpjNumber) {
        this.cnpjNumber = cnpjNumber;
    }

    public Company withCnpjNumber(String cnpjNumber) {
        this.cnpjNumber = cnpjNumber;
        return this;
    }

    @JsonProperty("urlComplementaryList")
    public String getUrlComplementaryList() {
        return urlComplementaryList;
    }

    @JsonProperty("urlComplementaryList")
    public void setUrlComplementaryList(String urlComplementaryList) {
        this.urlComplementaryList = urlComplementaryList;
    }

    public Company withUrlComplementaryList(String urlComplementaryList) {
        this.urlComplementaryList = urlComplementaryList;
        return this;
    }

    @JsonProperty("personalCreditCards")
    public List<PersonalCreditCard> getPersonalCreditCards() {
        return personalCreditCards;
    }

    @JsonProperty("personalCreditCards")
    public void setPersonalCreditCards(List<PersonalCreditCard> personalCreditCards) {
        this.personalCreditCards = personalCreditCards;
    }

    public Company withPersonalCreditCards(List<PersonalCreditCard> personalCreditCards) {
        this.personalCreditCards = personalCreditCards;
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

    public Company withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("cnpjNumber", cnpjNumber).append("urlComplementaryList", urlComplementaryList).append("personalCreditCards", personalCreditCards).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(name).append(cnpjNumber).append(urlComplementaryList).append(additionalProperties).append(personalCreditCards).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Company) == false) {
            return false;
        }
        Company rhs = ((Company) other);
        return new EqualsBuilder().append(name, rhs.name).append(cnpjNumber, rhs.cnpjNumber).append(urlComplementaryList, rhs.urlComplementaryList).append(additionalProperties, rhs.additionalProperties).append(personalCreditCards, rhs.personalCreditCards).isEquals();
    }

}

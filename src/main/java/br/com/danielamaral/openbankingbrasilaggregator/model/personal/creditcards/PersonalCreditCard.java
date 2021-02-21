
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
    "name",
    "identification",
    "rewardsProgram",
    "fees",
    "interest",
    "termsConditions"
})
public class PersonalCreditCard implements Serializable
{

    @JsonProperty("name")
    private String name;
    @JsonProperty("identification")
    private Identification identification;
    @JsonProperty("rewardsProgram")
    private RewardsProgram rewardsProgram;
    @JsonProperty("fees")
    private Fees fees;
    @JsonProperty("interest")
    private Interest interest;
    @JsonProperty("termsConditions")
    private TermsConditions termsConditions;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -5500398620108098884L;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public PersonalCreditCard withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("identification")
    public Identification getIdentification() {
        return identification;
    }

    @JsonProperty("identification")
    public void setIdentification(Identification identification) {
        this.identification = identification;
    }

    public PersonalCreditCard withIdentification(Identification identification) {
        this.identification = identification;
        return this;
    }

    @JsonProperty("rewardsProgram")
    public RewardsProgram getRewardsProgram() {
        return rewardsProgram;
    }

    @JsonProperty("rewardsProgram")
    public void setRewardsProgram(RewardsProgram rewardsProgram) {
        this.rewardsProgram = rewardsProgram;
    }

    public PersonalCreditCard withRewardsProgram(RewardsProgram rewardsProgram) {
        this.rewardsProgram = rewardsProgram;
        return this;
    }

    @JsonProperty("fees")
    public Fees getFees() {
        return fees;
    }

    @JsonProperty("fees")
    public void setFees(Fees fees) {
        this.fees = fees;
    }

    public PersonalCreditCard withFees(Fees fees) {
        this.fees = fees;
        return this;
    }

    @JsonProperty("interest")
    public Interest getInterest() {
        return interest;
    }

    @JsonProperty("interest")
    public void setInterest(Interest interest) {
        this.interest = interest;
    }

    public PersonalCreditCard withInterest(Interest interest) {
        this.interest = interest;
        return this;
    }

    @JsonProperty("termsConditions")
    public TermsConditions getTermsConditions() {
        return termsConditions;
    }

    @JsonProperty("termsConditions")
    public void setTermsConditions(TermsConditions termsConditions) {
        this.termsConditions = termsConditions;
    }

    public PersonalCreditCard withTermsConditions(TermsConditions termsConditions) {
        this.termsConditions = termsConditions;
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

    public PersonalCreditCard withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("identification", identification).append("rewardsProgram", rewardsProgram).append("fees", fees).append("interest", interest).append("termsConditions", termsConditions).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(fees).append(identification).append(termsConditions).append(interest).append(name).append(additionalProperties).append(rewardsProgram).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PersonalCreditCard) == false) {
            return false;
        }
        PersonalCreditCard rhs = ((PersonalCreditCard) other);
        return new EqualsBuilder().append(fees, rhs.fees).append(identification, rhs.identification).append(termsConditions, rhs.termsConditions).append(interest, rhs.interest).append(name, rhs.name).append(additionalProperties, rhs.additionalProperties).append(rewardsProgram, rhs.rewardsProgram).isEquals();
    }

}

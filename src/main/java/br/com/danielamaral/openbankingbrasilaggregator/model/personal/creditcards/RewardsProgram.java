
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
    "hasRewardProgram",
    "rewardProgramInfo"
})
public class RewardsProgram implements Serializable
{

    @JsonProperty("hasRewardProgram")
    private boolean hasRewardProgram;
    @JsonProperty("rewardProgramInfo")
    private String rewardProgramInfo;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 1294681251938936058L;

    @JsonProperty("hasRewardProgram")
    public boolean isHasRewardProgram() {
        return hasRewardProgram;
    }

    @JsonProperty("hasRewardProgram")
    public void setHasRewardProgram(boolean hasRewardProgram) {
        this.hasRewardProgram = hasRewardProgram;
    }

    public RewardsProgram withHasRewardProgram(boolean hasRewardProgram) {
        this.hasRewardProgram = hasRewardProgram;
        return this;
    }

    @JsonProperty("rewardProgramInfo")
    public String getRewardProgramInfo() {
        return rewardProgramInfo;
    }

    @JsonProperty("rewardProgramInfo")
    public void setRewardProgramInfo(String rewardProgramInfo) {
        this.rewardProgramInfo = rewardProgramInfo;
    }

    public RewardsProgram withRewardProgramInfo(String rewardProgramInfo) {
        this.rewardProgramInfo = rewardProgramInfo;
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

    public RewardsProgram withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("hasRewardProgram", hasRewardProgram).append("rewardProgramInfo", rewardProgramInfo).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(rewardProgramInfo).append(hasRewardProgram).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof RewardsProgram) == false) {
            return false;
        }
        RewardsProgram rhs = ((RewardsProgram) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(rewardProgramInfo, rhs.rewardProgramInfo).append(hasRewardProgram, rhs.hasRewardProgram).isEquals();
    }

}


package com.mtcl.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "used",
    "remaining",
    "limit",
    "reset_time",
    "reset_time_text"
})
public class Usage {

    @JsonProperty("used")
    private Integer used;
    @JsonProperty("remaining")
    private Integer remaining;
    @JsonProperty("limit")
    private Integer limit;
    @JsonProperty("reset_time")
    private Integer resetTime;
    @JsonProperty("reset_time_text")
    private String resetTimeText;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The used
     */
    @JsonProperty("used")
    public Integer getUsed() {
        return used;
    }

    /**
     * 
     * @param used
     *     The used
     */
    @JsonProperty("used")
    public void setUsed(Integer used) {
        this.used = used;
    }

    /**
     * 
     * @return
     *     The remaining
     */
    @JsonProperty("remaining")
    public Integer getRemaining() {
        return remaining;
    }

    /**
     * 
     * @param remaining
     *     The remaining
     */
    @JsonProperty("remaining")
    public void setRemaining(Integer remaining) {
        this.remaining = remaining;
    }

    /**
     * 
     * @return
     *     The limit
     */
    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    /**
     * 
     * @param limit
     *     The limit
     */
    @JsonProperty("limit")
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * 
     * @return
     *     The resetTime
     */
    @JsonProperty("reset_time")
    public Integer getResetTime() {
        return resetTime;
    }

    /**
     * 
     * @param resetTime
     *     The reset_time
     */
    @JsonProperty("reset_time")
    public void setResetTime(Integer resetTime) {
        this.resetTime = resetTime;
    }

    /**
     * 
     * @return
     *     The resetTimeText
     */
    @JsonProperty("reset_time_text")
    public String getResetTimeText() {
        return resetTimeText;
    }

    /**
     * 
     * @param resetTimeText
     *     The reset_time_text
     */
    @JsonProperty("reset_time_text")
    public void setResetTimeText(String resetTimeText) {
        this.resetTimeText = resetTimeText;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

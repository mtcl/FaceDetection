
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
    "face",
    "eyes"
})
public class Attributes {

    @JsonProperty("face")
    private Face face;
    @JsonProperty("eyes")
    private Eyes eyes;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The face
     */
    @JsonProperty("face")
    public Face getFace() {
        return face;
    }

    /**
     * 
     * @param face
     *     The face
     */
    @JsonProperty("face")
    public void setFace(Face face) {
        this.face = face;
    }

    /**
     * 
     * @return
     *     The eyes
     */
    @JsonProperty("eyes")
    public Eyes getEyes() {
        return eyes;
    }

    /**
     * 
     * @param eyes
     *     The eyes
     */
    @JsonProperty("eyes")
    public void setEyes(Eyes eyes) {
        this.eyes = eyes;
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

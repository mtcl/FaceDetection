
package com.mtcl.model;

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

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "uids",
    "label",
    "confirmed",
    "manual",
    "width",
    "height",
    "yaw",
    "roll",
    "pitch",
    "attributes",
    "points",
    "similarities",
    "tid",
    "recognizable",
    "center",
    "eye_left",
    "eye_right",
    "mouth_center",
    "nose"
})
public class Tag {

    @JsonProperty("uids")
    private List<Object> uids = new ArrayList<Object>();
    @JsonProperty("label")
    private Object label;
    @JsonProperty("confirmed")
    private Boolean confirmed;
    @JsonProperty("manual")
    private Boolean manual;
    @JsonProperty("width")
    private Double width;
    @JsonProperty("height")
    private Double height;
    @JsonProperty("yaw")
    private Integer yaw;
    @JsonProperty("roll")
    private Integer roll;
    @JsonProperty("pitch")
    private Integer pitch;
    @JsonProperty("attributes")
    private Attributes attributes;
    @JsonProperty("points")
    private Object points;
    @JsonProperty("similarities")
    private Object similarities;
    @JsonProperty("tid")
    private String tid;
    @JsonProperty("recognizable")
    private Boolean recognizable;
    @JsonProperty("center")
    private Center center;
    @JsonProperty("eye_left")
    private EyeLeft eyeLeft;
    @JsonProperty("eye_right")
    private EyeRight eyeRight;
    @JsonProperty("mouth_center")
    private MouthCenter mouthCenter;
    @JsonProperty("nose")
    private Nose nose;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uids
     */
    @JsonProperty("uids")
    public List<Object> getUids() {
        return uids;
    }

    /**
     * 
     * @param uids
     *     The uids
     */
    @JsonProperty("uids")
    public void setUids(List<Object> uids) {
        this.uids = uids;
    }

    /**
     * 
     * @return
     *     The label
     */
    @JsonProperty("label")
    public Object getLabel() {
        return label;
    }

    /**
     * 
     * @param label
     *     The label
     */
    @JsonProperty("label")
    public void setLabel(Object label) {
        this.label = label;
    }

    /**
     * 
     * @return
     *     The confirmed
     */
    @JsonProperty("confirmed")
    public Boolean getConfirmed() {
        return confirmed;
    }

    /**
     * 
     * @param confirmed
     *     The confirmed
     */
    @JsonProperty("confirmed")
    public void setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
    }

    /**
     * 
     * @return
     *     The manual
     */
    @JsonProperty("manual")
    public Boolean getManual() {
        return manual;
    }

    /**
     * 
     * @param manual
     *     The manual
     */
    @JsonProperty("manual")
    public void setManual(Boolean manual) {
        this.manual = manual;
    }

    /**
     * 
     * @return
     *     The width
     */
    @JsonProperty("width")
    public Double getWidth() {
        return width;
    }

    /**
     * 
     * @param width
     *     The width
     */
    @JsonProperty("width")
    public void setWidth(Double width) {
        this.width = width;
    }

    /**
     * 
     * @return
     *     The height
     */
    @JsonProperty("height")
    public Double getHeight() {
        return height;
    }

    /**
     * 
     * @param height
     *     The height
     */
    @JsonProperty("height")
    public void setHeight(Double height) {
        this.height = height;
    }

    /**
     * 
     * @return
     *     The yaw
     */
    @JsonProperty("yaw")
    public Integer getYaw() {
        return yaw;
    }

    /**
     * 
     * @param yaw
     *     The yaw
     */
    @JsonProperty("yaw")
    public void setYaw(Integer yaw) {
        this.yaw = yaw;
    }

    /**
     * 
     * @return
     *     The roll
     */
    @JsonProperty("roll")
    public Integer getRoll() {
        return roll;
    }

    /**
     * 
     * @param roll
     *     The roll
     */
    @JsonProperty("roll")
    public void setRoll(Integer roll) {
        this.roll = roll;
    }

    /**
     * 
     * @return
     *     The pitch
     */
    @JsonProperty("pitch")
    public Integer getPitch() {
        return pitch;
    }

    /**
     * 
     * @param pitch
     *     The pitch
     */
    @JsonProperty("pitch")
    public void setPitch(Integer pitch) {
        this.pitch = pitch;
    }

    /**
     * 
     * @return
     *     The attributes
     */
    @JsonProperty("attributes")
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * 
     * @param attributes
     *     The attributes
     */
    @JsonProperty("attributes")
    public void setAttributes(Attributes attributes) {
        this.attributes = attributes;
    }

    /**
     * 
     * @return
     *     The points
     */
    @JsonProperty("points")
    public Object getPoints() {
        return points;
    }

    /**
     * 
     * @param points
     *     The points
     */
    @JsonProperty("points")
    public void setPoints(Object points) {
        this.points = points;
    }

    /**
     * 
     * @return
     *     The similarities
     */
    @JsonProperty("similarities")
    public Object getSimilarities() {
        return similarities;
    }

    /**
     * 
     * @param similarities
     *     The similarities
     */
    @JsonProperty("similarities")
    public void setSimilarities(Object similarities) {
        this.similarities = similarities;
    }

    /**
     * 
     * @return
     *     The tid
     */
    @JsonProperty("tid")
    public String getTid() {
        return tid;
    }

    /**
     * 
     * @param tid
     *     The tid
     */
    @JsonProperty("tid")
    public void setTid(String tid) {
        this.tid = tid;
    }

    /**
     * 
     * @return
     *     The recognizable
     */
    @JsonProperty("recognizable")
    public Boolean getRecognizable() {
        return recognizable;
    }

    /**
     * 
     * @param recognizable
     *     The recognizable
     */
    @JsonProperty("recognizable")
    public void setRecognizable(Boolean recognizable) {
        this.recognizable = recognizable;
    }

    /**
     * 
     * @return
     *     The center
     */
    @JsonProperty("center")
    public Center getCenter() {
        return center;
    }

    /**
     * 
     * @param center
     *     The center
     */
    @JsonProperty("center")
    public void setCenter(Center center) {
        this.center = center;
    }

    /**
     * 
     * @return
     *     The eyeLeft
     */
    @JsonProperty("eye_left")
    public EyeLeft getEyeLeft() {
        return eyeLeft;
    }

    /**
     * 
     * @param eyeLeft
     *     The eye_left
     */
    @JsonProperty("eye_left")
    public void setEyeLeft(EyeLeft eyeLeft) {
        this.eyeLeft = eyeLeft;
    }

    /**
     * 
     * @return
     *     The eyeRight
     */
    @JsonProperty("eye_right")
    public EyeRight getEyeRight() {
        return eyeRight;
    }

    /**
     * 
     * @param eyeRight
     *     The eye_right
     */
    @JsonProperty("eye_right")
    public void setEyeRight(EyeRight eyeRight) {
        this.eyeRight = eyeRight;
    }

    /**
     * 
     * @return
     *     The mouthCenter
     */
    @JsonProperty("mouth_center")
    public MouthCenter getMouthCenter() {
        return mouthCenter;
    }

    /**
     * 
     * @param mouthCenter
     *     The mouth_center
     */
    @JsonProperty("mouth_center")
    public void setMouthCenter(MouthCenter mouthCenter) {
        this.mouthCenter = mouthCenter;
    }

    /**
     * 
     * @return
     *     The nose
     */
    @JsonProperty("nose")
    public Nose getNose() {
        return nose;
    }

    /**
     * 
     * @param nose
     *     The nose
     */
    @JsonProperty("nose")
    public void setNose(Nose nose) {
        this.nose = nose;
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

package rest.dto.client;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pk",
        "name",
        "description",
        "main_location",
        "is_editable",
        "connected_users",
        "ordering_accounts",
        "external_id"
})
@Generated("jsonschema2pojo")
public class Result {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("main_location")
    private Integer mainLocation;
    @JsonProperty("is_editable")
    private Boolean isEditable;
    @JsonProperty("connected_users")
    private List<String> connectedUsers = null;
    @JsonProperty("ordering_accounts")
    private List<Object> orderingAccounts = null;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

//    public Result(int pk, String name, String description, int main_location, boolean isEditable,  String externalId) {
//
//
//        this.pk = pk;
//        this.name = name;
//        this.description = description;
//        this.mainLocation = main_location;
//        this.isEditable = isEditable;
//        this.externalId = externalId;
//
//    }

    @JsonProperty("pk")
    public Integer getPk() {
        return pk;
    }

    @JsonProperty("pk")
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("main_location")
    public Integer getMainLocation() {
        return mainLocation;
    }

    @JsonProperty("main_location")
    public void setMainLocation(Integer mainLocation) {
        this.mainLocation = mainLocation;
    }

    @JsonProperty("is_editable")
    public Boolean getIsEditable() {
        return isEditable;
    }

    @JsonProperty("is_editable")
    public void setIsEditable(Boolean isEditable) {
        this.isEditable = isEditable;
    }

    @JsonProperty("connected_users")
    public List<String> getConnectedUsers() {
        return connectedUsers;
    }

    @JsonProperty("connected_users")
    public void setConnectedUsers(List<String> connectedUsers) {
        this.connectedUsers = connectedUsers;
    }

    @JsonProperty("ordering_accounts")
    public List<Object> getOrderingAccounts() {
        return orderingAccounts;
    }

    @JsonProperty("ordering_accounts")
    public void setOrderingAccounts(List<Object> orderingAccounts) {
        this.orderingAccounts = orderingAccounts;
    }

    @JsonProperty("external_id")
    public Object getExternalId() {
        return externalId;
    }

    @JsonProperty("external_id")
    public void setExternalId(Object externalId) {
        this.externalId = externalId;
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
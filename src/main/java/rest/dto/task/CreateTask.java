package rest.dto.task;

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
        "creator",
        "type",
        "main_report_form",
        "main_cancel_form",
        "location",
        "description",
        "planned_start_at",
        "planned_end_at",
        "assigned_user",
        "contacts",
        "assets",
        "epic",
        "is_overdue",
        "all_day",
        "email",
        "external_id"
})
@Generated("jsonschema2pojo")
public class CreateTask {

    @JsonProperty("pk")
    private Integer pk;
    @JsonProperty("creator")
    private String creator;
    @JsonProperty("type")
    private Integer type;
    @JsonProperty("main_report_form")
    private Integer mainReportForm;
    @JsonProperty("main_cancel_form")
    private Integer mainCancelForm;
    @JsonProperty("location")
    private Integer location;
    @JsonProperty("description")
    private String description;
    @JsonProperty("planned_start_at")
    private String plannedStartAt;
    @JsonProperty("planned_end_at")
    private String plannedEndAt;
    @JsonProperty("assigned_user")
    private String assignedUser;
    @JsonProperty("contacts")
    private List<Object> contacts = null;
    @JsonProperty("assets")
    private List<Object> assets = null;
    @JsonProperty("epic")
    private Object epic;
    @JsonProperty("is_overdue")
    private Object isOverdue;
    @JsonProperty("all_day")
    private Boolean allDay;
    @JsonProperty("email")
    private Object email;
    @JsonProperty("external_id")
    private Object externalId;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pk")
    public Integer getPk() {
        return pk;
    }

    @JsonProperty("pk")
    public void setPk(Integer pk) {
        this.pk = pk;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String creator) {
        this.creator = creator;
    }

    @JsonProperty("type")
    public Integer getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(Integer type) {
        this.type = type;
    }

    @JsonProperty("main_report_form")
    public Integer getMainReportForm() {
        return mainReportForm;
    }

    @JsonProperty("main_report_form")
    public void setMainReportForm(Integer mainReportForm) {
        this.mainReportForm = mainReportForm;
    }

    @JsonProperty("main_cancel_form")
    public Integer getMainCancelForm() {
        return mainCancelForm;
    }

    @JsonProperty("main_cancel_form")
    public void setMainCancelForm(Integer mainCancelForm) {
        this.mainCancelForm = mainCancelForm;
    }

    @JsonProperty("location")
    public Integer getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Integer location) {
        this.location = location;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("planned_start_at")
    public String getPlannedStartAt() {
        return plannedStartAt;
    }

    @JsonProperty("planned_start_at")
    public void setPlannedStartAt(String plannedStartAt) {
        this.plannedStartAt = plannedStartAt;
    }

    @JsonProperty("planned_end_at")
    public String getPlannedEndAt() {
        return plannedEndAt;
    }

    @JsonProperty("planned_end_at")
    public void setPlannedEndAt(String plannedEndAt) {
        this.plannedEndAt = plannedEndAt;
    }

    @JsonProperty("assigned_user")
    public String getAssignedUser() {
        return assignedUser;
    }

    @JsonProperty("assigned_user")
    public void setAssignedUser(String assignedUser) {
        this.assignedUser = assignedUser;
    }

    @JsonProperty("contacts")
    public List<Object> getContacts() {
        return contacts;
    }

    @JsonProperty("contacts")
    public void setContacts(List<Object> contacts) {
        this.contacts = contacts;
    }

    @JsonProperty("assets")
    public List<Object> getAssets() {
        return assets;
    }

    @JsonProperty("assets")
    public void setAssets(List<Object> assets) {
        this.assets = assets;
    }

    @JsonProperty("epic")
    public Object getEpic() {
        return epic;
    }

    @JsonProperty("epic")
    public void setEpic(Object epic) {
        this.epic = epic;
    }

    @JsonProperty("is_overdue")
    public Object getIsOverdue() {
        return isOverdue;
    }

    @JsonProperty("is_overdue")
    public void setIsOverdue(Object isOverdue) {
        this.isOverdue = isOverdue;
    }

    @JsonProperty("all_day")
    public Boolean getAllDay() {
        return allDay;
    }

    @JsonProperty("all_day")
    public void setAllDay(Boolean allDay) {
        this.allDay = allDay;
    }

    @JsonProperty("email")
    public Object getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(Object email) {
        this.email = email;
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

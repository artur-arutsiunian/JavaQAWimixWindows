package rest.dto;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.*;


@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "symbol",
        "leverage",
        "margin"
})
public class AssetLeverage {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("leverage")
    private Double leverage;
    @JsonProperty("margin")
    private Double margin;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("leverage")
    public Double getLeverage() {
        return leverage;
    }

    @JsonProperty("leverage")
    public void setLeverage(Double leverage) {
        this.leverage = leverage;
    }

    @JsonProperty("margin")
    public Double getMargin() {
        return margin;
    }

    @JsonProperty("margin")
    public void setMargin(Double margin) {
        this.margin = margin;
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
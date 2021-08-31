package rest.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "symbol",
        "login",
        "cmd",
        "volume",
        "openTime",
        "openPrice",
        "state",
        "commission",
        "swap",
        "order",
        "closeTime",
        "closePrice",
        "profit",
        "sl",
        "tp"
})

public class Order {

    @JsonProperty("symbol")
    private String symbol;
    @JsonProperty("login")
    private Integer login;
    @JsonProperty("cmd")
    private Integer cmd;
    @JsonProperty("volume")
    private Double volume;
    @JsonProperty("openTime")
    private Long openTime;
    @JsonProperty("openPrice")
    private Double openPrice;
    @JsonProperty("state")
    private Integer state;
    @JsonProperty("commission")
    private Double commission;
    @JsonProperty("swap")
    private Double swap;
    @JsonProperty("order")
    private Integer order;
    @JsonProperty("closeTime")
    private Long closeTime;
    @JsonProperty("closePrice")
    private Double closePrice;
    @JsonProperty("profit")
    private Double profit;
    @JsonProperty("sl")
    private Double sl;
    @JsonProperty("tp")
    private Double tp;

    @JsonProperty("symbol")
    public String getSymbol() {
        return symbol;
    }

    @JsonProperty("symbol")
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    @JsonProperty("login")
    public Integer getLogin() {
        return login;
    }

    @JsonProperty("login")
    public void setLogin(Integer login) {
        this.login = login;
    }

    @JsonProperty("cmd")
    public Integer getCmd() {
        return cmd;
    }

    @JsonProperty("cmd")
    public void setCmd(Integer cmd) {
        this.cmd = cmd;
    }

    @JsonProperty("volume")
    public Double getVolume() {
        return volume;
    }

    @JsonProperty("volume")
    public void setVolume(Double volume) {
        this.volume = volume;
    }

    @JsonProperty("openTime")
    public Long getOpenTime() {
        return openTime;
    }

    @JsonProperty("openTime")
    public void setOpenTime(Long openTime) {
        this.openTime = openTime;
    }

    @JsonProperty("openPrice")
    public Double getOpenPrice() {
        return openPrice;
    }

    @JsonProperty("openPrice")
    public void setOpenPrice(Double openPrice) {
        this.openPrice = openPrice;
    }

    @JsonProperty("state")
    public Integer getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(Integer state) {
        this.state = state;
    }

    @JsonProperty("commission")
    public Double getCommission() {
        return commission;
    }

    @JsonProperty("commission")
    public void setCommission(Double commission) {
        this.commission = commission;
    }

    @JsonProperty("swap")
    public Double getSwap() {
        return swap;
    }

    @JsonProperty("swap")
    public void setSwap(Double swap) {
        this.swap = swap;
    }

    @JsonProperty("order")
    public Integer getOrder() {
        return order;
    }

    @JsonProperty("order")
    public void setOrder(Integer order) {
        this.order = order;
    }

    @JsonProperty("closeTime")
    public Long getCloseTime() {
        return closeTime;
    }

    @JsonProperty("closeTime")
    public void setCloseTime(Long closeTime) {
        this.closeTime = closeTime;
    }

    @JsonProperty("closePrice")
    public Double getClosePrice() {
        return closePrice;
    }

    @JsonProperty("closePrice")
    public void setClosePrice(Double closePrice) {
        this.closePrice = closePrice;
    }

    @JsonProperty("profit")
    public Double getProfit() {
        return profit;
    }

    @JsonProperty("profit")
    public void setProfit(Double profit) {
        this.profit = profit;
    }

    @JsonProperty("sl")
    public Double getSl() {
        return sl;
    }

    @JsonProperty("sl")
    public void setSl(Double sl) {
        this.sl = sl;
    }

    @JsonProperty("tp")
    public Double getTp() {
        return tp;
    }

    @JsonProperty("tp")
    public void setTp(Double tp) {
        this.tp = tp;
    }
}
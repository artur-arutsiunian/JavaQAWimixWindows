package rest.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Assets {

    ADAUSD(5);

    private final int assetType;
}
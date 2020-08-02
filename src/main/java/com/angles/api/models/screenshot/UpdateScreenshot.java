package com.angles.api.models.screenshot;

import com.angles.api.models.Platform;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter @Setter @NoArgsConstructor
public class UpdateScreenshot implements Serializable {

    private Platform platform;

}

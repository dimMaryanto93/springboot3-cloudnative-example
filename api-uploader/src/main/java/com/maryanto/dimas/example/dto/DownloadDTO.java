package com.maryanto.dimas.example.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


public class DownloadDTO {

    @Data
    public static class DownloadObjectRequest {
        @NotEmpty
        @NotNull
        private String objectId;
    }
}

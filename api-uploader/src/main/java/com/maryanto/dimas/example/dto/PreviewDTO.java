package com.maryanto.dimas.example.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.concurrent.TimeUnit;

public class PreviewDTO {

    @Data
    public static class PresignedUrlRequest {
        @NotNull
        @NotEmpty
        private String objectId;
        @NotNull
        private Integer duration;
        @NotNull
        private TimeUnit unit;
    }

    @Data
    @Builder
    public static class PresignedUrlResponse {
        private String url;
        private String bucketName;
        private String objectId;
    }
}

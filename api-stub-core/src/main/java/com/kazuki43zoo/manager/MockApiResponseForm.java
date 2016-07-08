package com.kazuki43zoo.manager;


import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
class MockApiResponseForm implements Serializable {
    private static final long serialVersionUID = 1L;
    @NotEmpty
    @Size(max = 256)
    private String path;
    @Pattern(regexp = "GET|POST|PUT|DELETE|PATCH", flags = Pattern.Flag.CASE_INSENSITIVE)
    private String method;
    @Min(100)
    @Max(599)
    private Integer statusCode = 200;
    private String header = "Content-Type: application/json";
    private String body;
    private String bodyEditorMode;
    private MultipartFile file;
    private boolean deleteFile;
    private Long waitingMsec;
    private String description;

}

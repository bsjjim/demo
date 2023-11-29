package com.example.demo.test;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Schema(description = "템플릿 관련 VO")
public class TemplateVO {
    @Schema(description = "템플릿 아이디")
    private Integer templateId;

    @Schema(description = "템플릿 이름")
    private String templateName;

    @Schema(description = "템플릿 기타")
    private String templateEtc;
}
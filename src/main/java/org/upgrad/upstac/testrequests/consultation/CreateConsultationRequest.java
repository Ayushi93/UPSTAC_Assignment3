package org.upgrad.upstac.testrequests.consultation;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;

@Data
public class CreateConsultationRequest {
    @Getter
    @Setter

    @NotNull
    private DoctorSuggestion suggestion;

    private String comments;
}

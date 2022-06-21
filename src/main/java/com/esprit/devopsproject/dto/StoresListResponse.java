package com.esprit.devopsproject.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class StoresListResponse {

    private Long store_id;
    private String store_location;
    private String store_name;
    private Integer number_of_stuff;

}

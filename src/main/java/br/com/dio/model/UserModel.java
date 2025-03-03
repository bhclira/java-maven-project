package br.com.dio.model;

import lombok.*;

import java.time.LocalDate;
// a notação @Data é um resumo das seguintes
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@ToString
public class UserModel {

    private int code;
    private String userName;
    private LocalDate birthday;
}

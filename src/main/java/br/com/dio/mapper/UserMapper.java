package br.com.dio.mapper;

import br.com.dio.dto.UserDTO;
import br.com.dio.model.UserModel;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface UserMapper {

    @Mapping(target = "code", source = "id")
    @Mapping(target = "userName", source = "name")
    UserModel toModel(final UserDTO dto);
    
    @Mapping(target = "id", source = "code")
    @Mapping(target = "name", source = "userName")
    UserDTO toDTO(final UserModel model);


}

/* DOCUMENTAÇÃO EXPLICANDO O CODIGO
Método toModel
Esse método faz a tradução de um objeto UserDTO (formulário) para um objeto UserModel (formato para banco de dados).

Anotações @Mapping
Essas anotações dizem ao MapStruct como fazer a tradução dos campos. Vamos detalhar cada uma:

@Mapping(target = "code", source = "id")

target ("code"): Este é o campo no UserModel (destino) que queremos preencher.

source ("id"): Este é o campo no UserDTO (origem) de onde estamos pegando o valor.

Tradução: Pegamos o valor do campo id do UserDTO e colocamos no campo code do UserModel.

@Mapping(target = "userName", source = "name")

target ("userName"): Este é o campo no UserModel (destino) que queremos preencher.

source ("name"): Este é o campo no UserDTO (origem) de onde estamos pegando o valor.

Tradução: Pegamos o valor do campo name do UserDTO e colocamos no campo userName do UserModel.

Resumo
Quando você chama o método toModel, o MapStruct pega o objeto UserDTO, lê os valores dos campos id e name, e preenche os campos code e userName do novo objeto UserModel com esses valores.

Se precisar de mais alguma explicação ou tiver mais dúvidas, estou aqui para ajudar! 😊
 */
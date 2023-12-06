package br.com.codegroup.portfolio.dto;

import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

/**
 * @author João Robson 
 */
@Data
public class ProjectMemberDto {

    private Long idProjeto;
    @Column(nullable = false)
    private String nome;
    private Date dataNascimento;
    @Column(length = 14, unique = true, nullable = false)
    private Long cpf;
    private String cargo;
    private boolean funcionario;

}

package br.com.codegroup.portfolio.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * @author João Robson
 */
@NoArgsConstructor(force = true)
@RequiredArgsConstructor
@Data
@MappedSuperclass
public abstract class BaseModel implements Serializable {

    @NonNull
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

}

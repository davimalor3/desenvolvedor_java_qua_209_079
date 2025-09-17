// package com.crud.app.repository;

// import org.springframework.data.repository.CrudRepository;
// import com.crud.app.models.Pessoa;


// public interface AppRepository extends CrudRepository<Pessoa, String>{
//     Pessoa findByIdPessoa(long idPessoa);
// }



package com.crud.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.crud.app.models.Pessoa;


public interface AppRepository extends JpaRepository<Pessoa, Long> {
    Pessoa findByIdPessoa(long idPessoa);
    Pessoa deleteByIdPessoa(long idPessoa);
}

package io.github.vinicanuto.domain.repository;

import io.github.vinicanuto.domain.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Clientes extends JpaRepository<Cliente,Integer> {

    @Query(value = " select c from Cliente c where c.nome like :nome")
    List<Cliente> encontrarPorNome(@Param("nome") String nome);

    @Query(" select c from Cliente c left join fetch c.pedidos where c.id= :id ")
    Cliente findClienteFetchPedidos(@Param("id") Integer id);
}

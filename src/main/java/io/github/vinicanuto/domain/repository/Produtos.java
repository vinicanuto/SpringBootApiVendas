package io.github.vinicanuto.domain.repository;

import io.github.vinicanuto.domain.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Produtos  extends JpaRepository<Produto, Integer> {



}

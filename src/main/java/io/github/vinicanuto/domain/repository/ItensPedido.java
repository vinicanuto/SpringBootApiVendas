package io.github.vinicanuto.domain.repository;

import io.github.vinicanuto.domain.entity.ItemPedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItensPedido extends JpaRepository<ItemPedido, Integer> {
}

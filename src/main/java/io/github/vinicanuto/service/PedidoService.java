package io.github.vinicanuto.service;

import io.github.vinicanuto.domain.entity.Pedido;
import io.github.vinicanuto.domain.enums.StatusPedido;
import io.github.vinicanuto.rest.dto.PedidoDTO;

import java.util.Optional;

public interface PedidoService {
    Pedido salvar(PedidoDTO dto);

    Optional<Pedido> obterPedidoCompleto(Integer idPedido);

    void atualizaStatus(Integer id, StatusPedido statusPedido);
}

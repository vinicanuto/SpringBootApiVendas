package io.github.vinicanuto.rest.controller;

import io.github.vinicanuto.exception.PedidoNaoEncontradoException;
import io.github.vinicanuto.exception.RegraNegocioException;
import io.github.vinicanuto.rest.ApiErrors;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ApplicationControllerAdvice {

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(RegraNegocioException.class)
    public ApiErrors handleRegraNegocioException(RegraNegocioException exception){
        String mensagemErro = exception.getMessage();
        return new ApiErrors(mensagemErro);
    }
    @ExceptionHandler(PedidoNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ApiErrors handlePedidoNotFoundException(PedidoNaoEncontradoException exception){
        return new ApiErrors(exception.getMessage());
    }
}

package br.com.zup.brenohof.servicetransacao.controller;

import br.com.zup.brenohof.servicetransacao.dto.TransacaoResponse;
import br.com.zup.brenohof.servicetransacao.repository.CartaoRepository;
import br.com.zup.brenohof.servicetransacao.repository.TransacaoRepository;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/api/cartoes")
public class CartaoController {

    private TransacaoRepository transacaoRepository;
    private CartaoRepository cartaoRepository;

    public CartaoController(TransacaoRepository transacaoRepository, CartaoRepository cartaoRepository) {
        this.transacaoRepository = transacaoRepository;
        this.cartaoRepository = cartaoRepository;
    }

    @GetMapping("/{id}/transacoes")
    public ResponseEntity<?> listaTransacoesDeUmCartao(@PathVariable String id,
                                                       @PageableDefault(sort = "efetivadaEm",
                                                               direction = Sort.Direction.DESC,
                                                               page = 0, size = 10)
                                                               Pageable pageable) {
        return cartaoRepository.findById(id)
                .map(cartao -> transacaoRepository.findByCartao(cartao, pageable))
                .map(TransacaoResponse::from)
                .map(ResponseEntity::ok)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Cartão não encontrado."));
    }
}

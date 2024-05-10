package br.com.fiap.abstrata;

import java.time.LocalDate;

public abstract class Documento {

    private String numero;
    private String orgaoEmissor;
    private LocalDate emissao;
    private LocalDate expiracao;

    public boolean isValido() {
        if (expiracao == null)
            return true;
        LocalDate hoje = LocalDate.now();
        return expiracao.isAfter(hoje);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    public LocalDate getEmissao() {
        return emissao;
    }

    public void setEmissao(LocalDate emissao) {
        this.emissao = emissao;
    }

    public LocalDate getExpiracao() {
        return expiracao;
    }

    public void setExpiracao(LocalDate expiracao) {
        this.expiracao = expiracao;
    }
}

package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import com.ufape.locadora.Funcionario;
import com.ufape.locadora.DTO.FuncionarioDTO;

public interface FuncionarioCollection {
    List<Funcionario> findAll();
    Optional<Funcionario> findById(Long id);
    Funcionario save(Funcionario funcionario);
    static void deleteById(Long id) {		
	}
	static List<FuncionarioDTO> listar() {
		return null;
	}
	static FuncionarioDTO buscarPorId(Long id) {
		return null;
	}
	static FuncionarioDTO cadastrar(FuncionarioDTO funcionarioDTO) {
		return null;
	}
	static FuncionarioDTO atualizar(Long id, FuncionarioDTO funcionarioDTO) {
		return null;
	}
}

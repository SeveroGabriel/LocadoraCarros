package com.ufape.locadora.collection;

import java.util.List;
import java.util.Optional;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import com.ufape.locadora.Aluguel;
import com.ufape.locadora.Carro;
import com.ufape.locadora.Cliente;
import com.ufape.locadora.Funcionario;
import com.ufape.locadora.Relatorio;
import com.ufape.locadora.Reserva;

public class Fachada {

    private CarroCollection carros;
    private ClienteCollection clientes;
    private AluguelCollection alugueis;
    private ReservaCollection reservas;
    private FuncionarioCollection funcionarios;
    private RelatorioCollection relatorios;

    public Fachada() {
        this.carros = new CarroCollectionImpl();
        this.clientes = new ClienteCollectionImpl(null);
        this.alugueis = new AluguelCollectionImpl();
        this.reservas = new ReservaCollectionImpl();
        this.funcionarios = new FuncionarioCollectionImpl(null);
        this.relatorios = new RelatorioCollectionImpl(null);
    }

    public void cadastrarCliente(Cliente cliente) {
        clientes.save(cliente);
    }

    public void removerCliente(Long id) throws NotFoundException {
        clientes.deleteById(id);
    }

    public List<Cliente> listarClientes() {
        return clientes.findAll();
    }

    public Optional<Cliente> buscarCliente(Long id) throws NotFoundException {
        return clientes.findById(id);
    }

    public void cadastrarCarro(Carro carro) {
        carros.salvar(carro);
    }

    public void removerCarro(Long id) throws NotFoundException {
        carros.deletar(id);
    }

    public List<Carro> listarCarros() {
        return carros.listarTodos();
    }

    public Carro buscarCarro(Long id) throws NotFoundException {
        return carros.buscarPorId(id);
    }

    public void registrarAluguel(Aluguel aluguel) {
        alugueis.save(aluguel);
    }

    public void registrarReserva(Reserva reserva) {
        reservas.save(reserva);
    }

    public List<Aluguel> listarAlugueis() {
        return alugueis.findAll();
    }

    public List<Reserva> listarReservas() {
        return reservas.findAll();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionarios.save(funcionario);
    }

    public void removerFuncionario(Long id) throws NotFoundException {
        funcionarios.deleteById(id);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios.findAll();
    }

    public Optional<Funcionario> buscarFuncionario(Long id) throws NotFoundException {
        return funcionarios.findById(id);
    }

    public List<Relatorio> gerarRelatorio() {
        return relatorios.findAll();
    }

}

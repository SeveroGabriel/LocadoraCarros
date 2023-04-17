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

    private CarroCollection carros = new CarroCollectionImpl() {
        @Override
        public Carro criar(Carro carro) {
            return null;
        }

        @Override
        public Carro atualizar(Long id, Carro carro) {
            return null;
        }
    };
    private ClienteCollection cliente;
    private AluguelCollection aluguel = new AluguelCollectionImpl();
    private ReservaCollection reserva = new ReservaCollectionImpl();
    private FuncionarioCollection funcionario = new FuncionarioCollectionImpl(null);
    private final RelatorioCollection relatorio = new RelatorioCollectionImpl(null);

    public Fachada() {
        this.cliente = new ClienteCollectionImpl(null);
    }

    public void cadastrarCliente(Cliente cliente) {
        this.cliente.save(cliente);
    }

    public void removerCliente(Long id) throws NotFoundException {
        cliente.deleteById(id);
    }

    public List<Cliente> listarClientes() {
        return cliente.findAll();
    }

    public Optional<Cliente> buscarCliente(Long id) throws NotFoundException {
        return cliente.findById(id);
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
        aluguel.save(aluguel);
    }

    public void registrarReserva(Reserva reserva) {
        reserva.save(reserva);
    }

    public List<Aluguel> listarAlugueis() {
        return aluguel.findAll();
    }

    public List<Reserva> listarReservas() {
        return reserva.findAll();
    }

    public void cadastrarFuncionario(Funcionario funcionario) {
        funcionario.save(funcionario);
    }

    public void removerFuncionario(Long id) throws NotFoundException {
        funcionario.deleteById(id);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionario.findAll();
    }

    public Optional<Funcionario> buscarFuncionario(Long id) throws NotFoundException {
        return funcionario.findById(id);
    }

    public List<Relatorio> gerarRelatorio() {
        return relatorio.findAll();
    }

}

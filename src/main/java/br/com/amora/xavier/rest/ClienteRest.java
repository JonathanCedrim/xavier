package br.com.amora.xavier.rest;

import br.com.amora.xavier.model.Cliente;
import br.com.amora.xavier.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest/cliente")
public class ClienteRest {

    @Autowired
    private ClienteService clienteService;


    @GetMapping
    public List<Cliente> getAllClientes() {
        return clienteService.getAllClientes();
    }

    @DeleteMapping("/{id}")
    public void deleteCliente(@PathVariable Long id) {
        clienteService.deleteClienteById(id);
    }

    @PostMapping
    public void saveCliente(@RequestBody Cliente cliente) {
        clienteService.saveCliente(cliente);
    }

    @PutMapping
    public void updateCliente(@RequestBody Cliente cliente) {
        clienteService.updateCliente(cliente);
    }

    @GetMapping("/{id}")
    public Cliente getClienteById(@PathVariable Long id) {
        return clienteService.findClientById(id);
    }

    @GetMapping("/busca/nome/{nome}")
    public List<Cliente> getClientesByNome(@PathVariable String nome) {
        return clienteService.findClientesByNome(nome);
    }

    @GetMapping("/busca/codigo/{codigo}")
    public Cliente getClienteByCodigo(@PathVariable Long codigo) {
        return clienteService.findClienteByCodigo(codigo);
    }

    @GetMapping("/busca/rg/{rg}")
    public Cliente getClienteByRG(@PathVariable String rg) {
        return clienteService.findClienteByRG(rg);
    }

    @GetMapping("/busca/cpf/{cpf}")
    public Cliente getClienteByCPF(@PathVariable String cpf) {
        return clienteService.findClienteByCPF(cpf);
    }

    @GetMapping("/busca/telefone/{telefone}")
    public List<Cliente> getClienteByTelefone(@PathVariable String telefone) {
        return clienteService.findClientesByTelefone(telefone);
    }

    @GetMapping("/busca/celular/{celular}")
    public Cliente getClienteByCelular(@PathVariable String celular) {
        return clienteService.findClienteByCelular(celular);
    }

    @GetMapping("/busca/celularII/{celularII}")
    public Cliente getClienteByCelularII(@PathVariable String celularII) {
        return clienteService.findClienteByCelularII(celularII);
    }

    @GetMapping("/busca/email/{email}")
    public List<Cliente> getClientesByEmail(@PathVariable String email) {
        return clienteService.findClientesByEmail(email);
    }
}
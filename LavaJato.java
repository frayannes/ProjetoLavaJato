import javax.swing.JOptionPane;

public class AppLavaJato {
    public static void main(String[] args) throws Exception {

     
        LavaJato lavaJato = new LavaJato();
        
        Object[] opcoes = { "Incluir", "Ver Lista", "Excluir", "Alterar", "Sair" };
       
        int escolha = 0;
       
        int id = 0;
       
        do {
            // mostra a janela com as opções e grava na varival escolha o indice do botão
            // selecionado
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Sistema", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);
            // switch + case
            // uma estrtura de condição
            // no switch é colocado a variável analisada
            switch (escolha) {
            // no case são colocado as opções que podem ser escolhidas
            // executado um determinado código
            case 0:
                // opção Incluir
                // Necessário criar um novo objeto do tipo Contato toda vez que um novo contato
                // é incluido.
                Carro carro = new Carro();
                carro.setMarca(JOptionPane.showInputDialog(null, "Digite a Marca do carro:"));
                carro.setModelo(JOptionPane.showInputDialog(null, "Digite o Modelo do carro:"));
                carro.setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro:"));
                carro.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do carro:"));
                // o objeto agenda esta acessando o método incluir e passando como parametro o
                // objeto contato recem criado a alimentado com os JOPane.
                lavaJato.incluir(carro);
                break;
            case 1:
                // opção ver lista
                // internamente no método showMessageDialog esta sendo usado o objeto agenda
                // para acessar o método verLista que retorna uma String de todos os contatos
                // gravados até o momento.
                JOptionPane.showMessageDialog(null, lavaJato.verLista());
                break;
            case 2:
                // opção excluir
                // O id digitado é gravado na variável id
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        lavaJato.verLista() + "Digite o id de quem você deseja excluir."));
                // o objeto agenda acessar o método excluir passando como parâmetro o id
                lavaJato.excluir(id);
                break;
            case 3:
                // opção alterar
                // O id digitado é gravado na variável id
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        lavaJato.verLista() + "Digite o id de quem você deseja alterar."));
                // necessário criar novo objeto para substituir o objeto anterior
                Carro carroAlterar = new Carro();
                carroAlterar.setMarca(JOptionPane.showInputDialog(null, "Digite a Marca do carro:"));
                carroAlterar.setModelo(JOptionPane.showInputDialog(null,  "Digite o Modelo do carro:"));
                carroAlterar.setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro:"));
                carroAlterar.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do carro:"));
                // o objeto agenda acessar o método atualizar passando os parâmetro id e
                // contatoAlterar.
                lavaJato.atualizar(id, carroAlterar);
                break;
            default:
                break;
            }
          
        } while (escolha != 4);

    }
}
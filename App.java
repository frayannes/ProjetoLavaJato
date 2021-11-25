import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

       
        LavaJato lavaJato = new LavaJato();
       
        Object[] opcoes = { "Incluir", "Ver Lista", "Excluir", "Alterar", "Sair" };
       
        int escolha = 0;
        
        int id = 0;
       
        do {
          
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Sistema", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[1]);
     
            switch (escolha) {
          
            case 0:
           
                Carro carro = new Carro();
                carro.setMarca(JOptionPane.showInputDialog(null, "Digite a Marca do carro:"));
                carro.setModelo(JOptionPane.showInputDialog(null, "Digite o Modelo do carro:"));
                carro.setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro:"));
                carro.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do carro:"));
            
                lavaJato.incluir(carro);
                break;
            case 1:
              
                JOptionPane.showMessageDialog(null, lavaJato.verLista());
                break;
            case 2:
                // opção excluir
                // O id digitado é gravado na variável
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        lavaJato.verLista() + "Digite o id de quem você deseja apagar."));
                // o objeto agenda acessa o método excluir passando como o id como parametro
                lavaJato.excluir(id);
                break;
            case 3:
            
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        lavaJato.verLista() + "Digite o id de quem você deseja alterar."));
              
                Carro carroAlterar = new Carro();
                carroAlterar.setMarca(JOptionPane.showInputDialog(null, "Digite a Marca do carro:"));
                carroAlterar.setModelo(JOptionPane.showInputDialog(null,  "Digite o Modelo do carro:"));
                carroAlterar.setCor(JOptionPane.showInputDialog(null, "Digite a cor do carro:"));
                carroAlterar.setPlaca(JOptionPane.showInputDialog(null, "Digite a placa do carro:"));
              
                lavaJato.atualizar(id, carroAlterar);
                break;
            default:
                break;
            }
            // só vai sair do laço de repetição se for feita a escolha da opção Sair = 4
        } while (escolha != 4);

    }
} 
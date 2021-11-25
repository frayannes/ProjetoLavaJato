import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        Carros carros = new Carros();
        Object[] options = {"Incluir", "Listar", "Excluir","Alterar","Sair"};
        int indice = 0;
        int n = 0;
        do{ 
            n = JOptionPane.showOptionDialog(null, "Escolha uma opção", 
            "Cadastro de veiculos",
            JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);

            switch (n){
            case 0:
                Cadcarros car = new Cadcarros();
                car.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
                car.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
                car.setCor(JOptionPane.showInputDialog("Digite a cor: "));
                car.setPlaca(JOptionPane.showInputDialog("Digite a placa: "));
                carros.incluircarro(car);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, carros.listarcarro());
                break;
            case 2:
                indice = Integer.parseInt(JOptionPane.showInputDialog(null,carros.listarcarro()+"Digite o indice do carro cadastrado para ser excluido."));
                carros.excluircarro(indice);
                break;
            case 3: 
                indice = Integer.parseInt(JOptionPane.showInputDialog(null,carros.listarcarro()+"Digite o indice do carro cadastrado para ser alterado."));
                Cadcarros alterar = new Cadcarros();
                alterar.setMarca(JOptionPane.showInputDialog("Digite a marca: "));
                alterar.setModelo(JOptionPane.showInputDialog("Digite o modelo: "));
                alterar.setCor(JOptionPane.showInputDialog("Digite a cor: "));
                alterar.setPlaca(JOptionPane.showInputDialog("Digite a placa: "));
                carros.alterarcarro(indice, alterar);
                break;
            default:
                break;
            }
        }
        while (n!=4);

    

    }


}
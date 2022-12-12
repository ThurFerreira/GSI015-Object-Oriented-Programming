import javax.swing.*;

public class FaceFriend{
    public static void main(String[] args) {
        String option, nome, apelido, aniversario, email, diferencial;
        boolean isRunning = true;
        int numeroContato = 0;

        Contato[] contatos = new Contato[100];
        //Scanner in = new Scanner(System.in);

        while(isRunning){

            option = JOptionPane.showInputDialog("Bem vindo ao FaceFriend!! Escolha uma das opções abaixo: \n" +
                    "\n" +
                    "[1] Inserir um contato;\n" +
                    "[2] Imprimir todos os contatos;\n" +
                    "[3] Imprimir o contato de 'FAMILIARES;\n" +
                    "[4] Imprimir o contato de 'AMIGOS';\n" +
                    "[5] Imprimir o contato de 'COLEGAS DE TRABALHO';\n" +
                    "[6] Imprimir o contato de 'MEHLHORES AMIGOS/IRMÃOS E COLEGAS DO TRABALHO';\n" +
                    "[7] Imprimir um contato específico (idicado pelo índice);\n" +
                    "[0] Sair do FaceFriend.");

            if(option.equals("1")){
                diferencial = JOptionPane.showInputDialog("Subtipo do contato: ");
                nome = JOptionPane.showInputDialog("Nome do contato: ");
                apelido = JOptionPane.showInputDialog("Apelido do contato: ");
                email = JOptionPane.showInputDialog("Email do contato: ");
                aniversario = JOptionPane.showInputDialog("Aniversario do contato: ");

                diferencial = diferencial.toUpperCase();

                if(diferencial.equals("AMIGO")){
                    diferencial = JOptionPane.showInputDialog("Grau de amizade: ");
                    contatos[numeroContato] = new Amigos(apelido, nome, email, aniversario, Integer.parseInt(diferencial));
                    numeroContato++;

                }else if(diferencial.equals("TRABALHO")){
                    diferencial = JOptionPane.showInputDialog("Proximidade: ");
                    diferencial = diferencial.toUpperCase();
                    contatos[numeroContato] = new Trabalho(apelido, nome, email, aniversario, diferencial);
                    numeroContato++;

                }else if (diferencial.equals("FAMILIAR") || diferencial.equals("FAMILIA")) {
                    diferencial = JOptionPane.showInputDialog("Parentesco: ");
                    diferencial = diferencial.toUpperCase();
                    contatos[numeroContato] = new Familia(apelido, nome, email, aniversario, diferencial);
                    numeroContato++;

                }

                JOptionPane.showMessageDialog(null, "Contato registrado com Sucesso!");

            }else if(option.equals("2")){
                int i = 0;

                if(contatos[i] == null){
                    JOptionPane.showMessageDialog(null, "Agenda vazia!");
                }else{
                    while(contatos[i] != null && i != 100) {
                        System.out.println(contatos[i].imprimirContato());
                        i++;
                    }
                }

            }else if(option.equals("3")){
                int i = 0;

                if(contatos[i] == null){
                    JOptionPane.showMessageDialog(null, "Agenda vazia!");

                }else{
                    while(contatos[i] != null && i != 100) {

                        if(contatos[i] instanceof Familia){
                            System.out.println(contatos[i].imprimirContato());

                        }
                        i++;
                    }
                }

            }else if(option.equals("4")){
                int i = 0;

                if(contatos[i] == null){
                    JOptionPane.showMessageDialog(null, "Agenda vazia!");

                }else{
                    while(contatos[i] != null && i != 100) {

                        if(contatos[i] instanceof Amigos){
                            System.out.println(contatos[i].imprimirContato());

                        }
                        i++;
                    }
                }

            }else if(option.equals("5")){
                int i = 0;

                if(contatos[i] == null){
                    JOptionPane.showMessageDialog(null, "Agenda vazia!");

                }else{
                    while(contatos[i] != null && i != 100) {

                        if(contatos[i] instanceof Trabalho){
                            System.out.println(contatos[i].imprimirContato());

                        }
                        i++;
                    }
                }

            }else if (option.equals("6")){
                int i = 0;

                if(contatos[i] == null){
                    JOptionPane.showMessageDialog(null, "Agenda vazia!");

                }else{
                    while(contatos[i] != null && i != 100) {

                        if((contatos[i] instanceof Amigos && (((Amigos) contatos[i]).getGrau()) == 1) ||
                                ((contatos[i] instanceof Familia) && (((Familia) contatos[i]).getParentesco().equals("IRMAO"))) ||
                                ((contatos[i] instanceof Trabalho) && ((Trabalho) contatos[i]).getTipo().equals("COLEGA"))){
                            System.out.println(contatos[i].imprimirContato());

                        }
                        i++;
                    }
                }

            }else if (option.equals("7")){
                String aux;
                int indiceContato = 0;
                aux = JOptionPane.showInputDialog("Digite o indice do contato que seseja mostrar: ");
                indiceContato = Integer.parseInt(aux);
                JOptionPane.showMessageDialog(null, contatos[indiceContato].imprimirContato());

            }else if (option.equals("0")){
                System.exit(0);

            }else{
                JOptionPane.showMessageDialog(null, "Opção Inválida!");
            }
        }
    }
}

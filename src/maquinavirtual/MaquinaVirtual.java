/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinavirtual;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sergio
 */
public class MaquinaVirtual extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    JFileChooser chooser;
    public DefaultTableModel modelPrincipal = new DefaultTableModel();
    public DefaultTableModel stack = new DefaultTableModel();
    public DefaultTableModel input = new DefaultTableModel();
    public DefaultTableModel output = new DefaultTableModel();
    public int linha = 0;
    public int s = 0;
    public int [] M = new int[20000];
    
    public MaquinaVirtual() {
        initComponents();
        this.setLocationRelativeTo(null);
        ButtonGroup bgroup = new ButtonGroup();
        bgroup.add(jRadioButton1);
        bgroup.add(jRadioButton2);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Linha", "Instrução", "Atributo 1", "Atributo 2"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jButton1.setText("Run");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Endereço", "Valor", "Title 3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Code");

        jLabel2.setText("Stack");

        jRadioButton1.setText("Normal");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setText("Debug Mode");

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                ""
            }
        ));
        jScrollPane4.setViewportView(jTable4);

        jLabel4.setText("Input");

        jLabel5.setText("Output");

        jLabel6.setText("Execução");

        jMenu1.setText("File");

        jMenuItem1.setText("Abrir");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING, false)
                    .add(layout.createSequentialGroup()
                        .add(6, 6, 6)
                        .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 454, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(org.jdesktop.layout.GroupLayout.LEADING, layout.createSequentialGroup()
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 221, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel4))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(layout.createSequentialGroup()
                                        .add(jLabel5)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .add(org.jdesktop.layout.GroupLayout.LEADING, jLabel1))))
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jLabel2)
                            .add(layout.createSequentialGroup()
                                .add(6, 6, 6)
                                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(layout.createSequentialGroup()
                        .add(150, 150, 150)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jRadioButton1)
                            .add(jLabel6)
                            .add(jRadioButton2)
                            .add(jButton1))))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(16, 16, 16)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(jLabel1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jScrollPane2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(jLabel2))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel4)
                    .add(jLabel5))
                .add(8, 8, 8)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jScrollPane3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(jScrollPane4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 159, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(jLabel6)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRadioButton1)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jRadioButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jButton1)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

        modelPrincipal = (DefaultTableModel) jTable2.getModel();
        stack = (DefaultTableModel) jTable1.getModel();
        input = (DefaultTableModel) jTable3.getModel();
        output = (DefaultTableModel) jTable4.getModel();
        int linha = 0;
        
        String str = "";
        chooser = new JFileChooser();
        HashMap rotulos = new HashMap();
        String regex = "[ ]*([a-zA-Z0-9]*)[ ]*([a-zA-Z0-9]*)[ ]*([a-zA-Z0-9]*)[ ]*([a-zA-Z0-9]*).*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher;
        
        int retorno = chooser.showOpenDialog(null);
        String caminhoArquivo = null;
        
        if(retorno == JFileChooser.APPROVE_OPTION) caminhoArquivo = chooser.getSelectedFile().getPath();
        
        File arq = new File(caminhoArquivo);
        
        if(arq!=null){
            try{
                FileReader read = new FileReader(arq);
                BufferedReader reader = new BufferedReader(read);
                try{
                    while(reader.ready()){
                        str = reader.readLine();
                        matcher = pattern.matcher(str);
                        if (matcher.find()) {   
                            /* Achar o indice do comando */
                            for (int indice = 1; indice < matcher.groupCount(); indice++) {
                                if (isCommand(matcher.group(indice))) {
                                    /* Comando segundo valor; Rotulo primeiro */
                                    if(indice == 2){
                                        /* Insere chave = rotulo e valor = linha */
                                        rotulos.put(matcher.group(1), linha);
                                        System.out.print(rotulos);
                                    }
                                    break;
                                }
                            }
                        }
                        linha++;
                    }
                } catch(IOException e){
                    e.printStackTrace();
                }
            } catch(FileNotFoundException e){
                e.printStackTrace();
            }
        }
        
        try {
        FileReader read = new FileReader(arq);
        BufferedReader reader = new BufferedReader(read);
        linha = 0;
        while (reader.ready()) {
            str = reader.readLine();    // Leitura de uma linha de cada vez
            matcher = pattern.matcher(str);
            if (matcher.find()) {   
                /* Percorre os casamentos para achar o indice do comando */
                for (int indice = 1; indice < matcher.groupCount(); indice++) {
                    /* Verifica se o valor é um comando */
                    if (isCommand(matcher.group(indice))) {
                        switch (indice) {
                            case 1: /* Caso em que o comando é o primero valor*/
                                if(isCommandLabel(matcher.group(1)) && rotulos.containsKey(matcher.group(2))){
                                    /* Adiciona na tabela a linha e seus respectivos valores */
                                    modelPrincipal.addRow(new Object[]{linha++, matcher.group(1), rotulos.get(matcher.group(2)), matcher.group(3)});
                                    
                                }
                                else{
                                    /* Adiciona na tabela a linha e seus respectivos valores */
                                    modelPrincipal.addRow(new Object[]{linha++, matcher.group(1), matcher.group(2), matcher.group(3)});
                                }
                                break;
                            case 2: /* Caso em que o commando é o segundo valor casado, consequentemente o primeiro valor é o rotulo */
                                if(isCommandLabel(matcher.group(1)) && rotulos.containsKey(matcher.group(3))){
                                    /* Adiciona na tabela a linha e seus respectivos valores */
                                    modelPrincipal.addRow(new Object[]{linha++, matcher.group(2), rotulos.get(matcher.group(3)), matcher.group(4)});
                                
                                }
                                else{
                                    /* Adiciona na tabela a linha e seus respectivos valores */
                                    modelPrincipal.addRow(new Object[]{linha++, matcher.group(2), matcher.group(3), matcher.group(4)});
                                }
                                break;
                                
                        }
                        break;
                    }
                }
            }
        }
        reader.close();
    } catch (IOException e) {
        System.out.println("Erro ao ler o arquivo...");
    }
    
    jTable2.setRowSelectionInterval(0, 0);
        
        
        
// TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        try{
            if(!(jRadioButton1.isSelected() || jRadioButton2.isSelected())){
            JOptionPane.showMessageDialog(null, "Escolha um Modo de Execução", "Input Error", JOptionPane.ERROR_MESSAGE);
            return;
            }
    
            while (linha < jTable2.getRowCount())
            {
                String instrucao = (String) modelPrincipal.getValueAt(linha, 1);

                if(instrucao.equals("START"))
                {
                    s = -1;
                    linha++;
                }

                else if(instrucao.equals("ALLOC"))/*Alocar memoria*/
                {
                    int m = Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString());
                    int n = Integer.parseInt(modelPrincipal.getValueAt(linha, 3).toString());

                    for(int k=0; k <= (n-1); k++)
                    {
                        s=s+1;
                        M[s]=M[m+k];
                    }

                    linha++;           
                }


                else if(instrucao.equals("DALLOC"))
                {
                    int m = Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString());
                    int n = 0;
                    if(!modelPrincipal.getValueAt(linha, 3).toString().equals(""))
                        n = Integer.parseInt(modelPrincipal.getValueAt(linha, 3).toString());

                    for(int k = (n-1); k >= 0 ; k--)
                    {   
                        M[m+k]=M[s];
                        s=s-1;
                    }

                    linha++;
                }

                /*Carregar constante*/
                else if(instrucao.equals("LDC"))
                {
                    int k = Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString());
                    s=s+1;
                    M[s]= k;
                    linha++;
                }

                /*Carregar valor*/
                else if(instrucao.equals("LDV"))
                {
                    int n = Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString());
                    s=s+1;
                    M[s] = M [n];
                    linha++;
                }


                else if(instrucao.equals("ADD"))
                {
                    M[s-1]= M[s-1] + M[s];
                    s=s-1;
                    linha++;
                }


                else if(instrucao.equals("SUB"))
                {
                    M[s-1]= M[s-1] - M[s];
                    s=s-1;
                    linha++;
                }


                else if(instrucao.equals("MULT"))
                {
                    M[s-1]= M[s-1] * M[s];
                    s=s-1;
                    linha++;
                }


                else if(instrucao.equals("DIVI"))
                {
                    M[s-1]= M[s-1] / M[s];
                    s=s-1;
                    linha++;
                }

                /*inverter sinal*/
                else if(instrucao.equals("INV"))
                {
                    M[s]=-M[s];
                    linha++;
                }

                /*Conjuncao*/
                else if(instrucao.equals("AND"))
                {
                    if (M[s-1]==1 && M[s]==1)
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                }

                /*Disjuncao*/
                else if(instrucao.equals("OR"))
                {
                    if (M[s-1]==1 || M[s]==1)
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                }


                else if(instrucao.equals("NEG"))
                {
                    M[s]= 1-M[s];
                    linha++;
                }

                /*Comparar menor*/
                else if(instrucao.equals("CME"))
                {
                    if(M[s-1] < M[s])
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                }

                /*Comparar maior*/
                else if(instrucao.equals("CMA"))
                {
                    if(M[s-1] > M[s])
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                }

                /*Comparar igual*/
                else if(instrucao.equals("CEQ"))
                {
                    if(M[s-1] == M[s])
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                }

                /*Comparar desigual*/
                else if(instrucao.equals("CDIF"))
                {
                    if(M[s-1] != M[s])
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                }

                /*Comparar menor ou igual*/
                else if(instrucao.equals("CMEQ"))
                {
                    if(M[s-1] <= M[s])
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                }

                /*Comparar maior ou igual*/
                else if(instrucao.equals("CMAQ"))
                {
                    if(M[s-1] >= M[s])
                        M[s-1]=1;
                    else
                        M[s-1]=0;

                    s=s-1;
                    linha++;
                } 

                /*Parar a execucao da MVD*/
                else if(instrucao.equals("HLT"))
                {
                        System.out.println("Fim");
                        break;
                } 

                /*Armazenar valor*/
                else if(instrucao.equals("STR"))
                {
                    M[Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString())]=M[s];
                    s=s-1;
                    linha++;
                } 

                /*Desviar sempre*/
                else if(instrucao.equals("JMP"))
                {
                    linha = Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString());
                }

                /*Desviar se falso*/
                else if(instrucao.equals("JMPF"))
                {
                    if(M[s]==0)
                        linha=Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString());
                    else 
                        linha=linha+1;

                    s=s-1;
                } 

                /*Nada*/
                else if(instrucao.equals("NULL"))
                {
                    linha++;
                } 

                /*Leitura*/
                else if(instrucao.equals("RD"))
                {
                    s=s+1;
                    // pede para o usuário inserir seu nome
                    String name =JOptionPane.showInputDialog( "Entrada de Dados" );
                    input.addRow(new Object[]{name});
                    M[s]= Integer.parseInt(name);//Recebe a input
                    linha++;
                }

                /*Impressao*/
                else if(instrucao.equals("PRN"))
                {
                    System.out.println(M[s]);
                    output.addRow(new Object[]{M[s]});
                    s=s-1;
                    linha++;
                }

                /*Chamar procedimento ou funcao*/
                else if(instrucao.equals("CALL"))
                {
                    int t = Integer.parseInt(modelPrincipal.getValueAt(linha, 2).toString());
                    s=s+1;
                    M[s]=linha+1;
                    linha=t;
                }

                /*Retornar de procedimento*/
                else if(instrucao.equals("RETURN"))
                {
                    linha=M[s];
                    s=s-1;
                }

                while(stack.getRowCount()!=0){
                    stack.removeRow(0);
                }

                for(int i=0;i<=s;i++)
                    stack.addRow(new Object[]{i,M[i]});

                if(linha<jTable2.getRowCount())
                    jTable2.setRowSelectionInterval(linha, linha);

                if(jRadioButton2.isSelected())
                    break;
            }
               }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Dado inválido na pilha!");
            }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaquinaVirtual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MaquinaVirtual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTable jTable4;
    // End of variables declaration//GEN-END:variables

    private boolean isCommand(String group) {
        String commands[] = {"LDC", "LDV", "ADD", "SUB", "MULT", "DIVI",
                             "INV", "AND", "OR", "NEG", "CME", "CMA", "CEQ", "CDIF", "CMEQ", "CMAQ",
                             "START", "HLT", "STR", "JMP", "JMPF", "NULL", "RD", "PRN", "ALLOC", "DALLOC",
                             "CALL", "RETURN"};
        
        boolean flag = false;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals(group)) {
                flag = true;
            }
        }

        if (flag) {
            return true;
        } else {
            return false;
        }

    }
    
    private boolean isCommandLabel(String group) {
        String commands[] = {"JMP", "JMPF", "CALL", "RETURN"};
        boolean flag = false;

        for (int i = 0; i < commands.length; i++) {
            if (commands[i].equals(group)) {
                flag = true;
            }
        }

        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}

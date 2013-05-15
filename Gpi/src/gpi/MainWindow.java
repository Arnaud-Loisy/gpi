/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gpi;

/**
 *
 * @author jeremy
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabLvl1 = new javax.swing.JTabbedPane();
        jPaneRecapitulatif = new javax.swing.JPanel();
        jPanelSupervision = new javax.swing.JPanel();
        jScrollPaneTableauSupervision = new javax.swing.JScrollPane();
        jTableauSupervision = new javax.swing.JTable();
        jPanelFiltresSupervision = new javax.swing.JPanel();
        jComboBoxBatSupervision = new javax.swing.JComboBox();
        jLabelBatiments = new javax.swing.JLabel();
        jButtonFiltrerSupervision = new javax.swing.JButton();
        jLabelSallesSupervision = new javax.swing.JLabel();
        jComboBoxSallesSupervision = new javax.swing.JComboBox();
        jButtonDetails = new javax.swing.JButton();
        jPanelMaintenance = new javax.swing.JPanel();
        jPanelFiltresMaintenance = new javax.swing.JPanel();
        jButtonFiltrerMaintenance = new javax.swing.JButton();
        jLabelBatimentMaintenance = new javax.swing.JLabel();
        jLabelSallesMaintenance = new javax.swing.JLabel();
        jComboBoxSallesMaintenance = new javax.swing.JComboBox();
        jComboBoxBatimentMaintenance = new javax.swing.JComboBox();
        jPanelOrdinateurMaintenance = new javax.swing.JPanel();
        jComboBoxSallesMaintance = new javax.swing.JComboBox();
        jComboBoxOrdianteurMaintenance = new javax.swing.JComboBox();
        jButtonTransfererMaintenance = new javax.swing.JButton();
        jButtonMaJMaintenance = new javax.swing.JButton();
        jLabelSalleOrdiMaintenance = new javax.swing.JLabel();
        jLabelOSOrdinateur = new javax.swing.JLabel();
        jComboBoxOSMaintenance = new javax.swing.JComboBox();
        jButtonChangerOS = new javax.swing.JButton();
        jProgressBarInstall = new javax.swing.JProgressBar();
        jLabelEtatMaintenance = new javax.swing.JLabel();
        jComboBoxStockMaintenance = new javax.swing.JComboBox();
        jPanelAjoutMachineMaintenance = new javax.swing.JPanel();
        jTextFieldHostname = new javax.swing.JTextField();
        jLabelHostname = new javax.swing.JLabel();
        jLabelEtatAjoutMachine = new javax.swing.JLabel();
        jLabelSalleAjoutMachine = new javax.swing.JLabel();
        jLabelOSAjoutMachine = new javax.swing.JLabel();
        jComboBoxEtatAjoutMachine = new javax.swing.JComboBox();
        jComboBoxSalleAjoutMachine = new javax.swing.JComboBox();
        jScrollPaneAjoutMachine = new javax.swing.JScrollPane();
        jListOS = new javax.swing.JList();
        jButtonValiderAjoutMAchine = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPaneRecapitulatifLayout = new javax.swing.GroupLayout(jPaneRecapitulatif);
        jPaneRecapitulatif.setLayout(jPaneRecapitulatifLayout);
        jPaneRecapitulatifLayout.setHorizontalGroup(
            jPaneRecapitulatifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 766, Short.MAX_VALUE)
        );
        jPaneRecapitulatifLayout.setVerticalGroup(
            jPaneRecapitulatifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        jTabLvl1.addTab("Récapitulatif", jPaneRecapitulatif);

        jTableauSupervision.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Bâtiment", "Salle", "Ordinateurs", "OS"
            }
        ));
        jScrollPaneTableauSupervision.setViewportView(jTableauSupervision);

        jPanelFiltresSupervision.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtres"));
        jPanelFiltresSupervision.setToolTipText("");

        jComboBoxBatSupervision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tous", "TP3", "U4", "U3", "U2", "K5-Burk" }));

        jLabelBatiments.setText("Bâtiments");

        jButtonFiltrerSupervision.setText("Filtrer");
        jButtonFiltrerSupervision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrerSupervisionActionPerformed(evt);
            }
        });

        jLabelSallesSupervision.setText("Salles");

        jComboBoxSallesSupervision.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tous", "212", "210", "110" }));

        javax.swing.GroupLayout jPanelFiltresSupervisionLayout = new javax.swing.GroupLayout(jPanelFiltresSupervision);
        jPanelFiltresSupervision.setLayout(jPanelFiltresSupervisionLayout);
        jPanelFiltresSupervisionLayout.setHorizontalGroup(
            jPanelFiltresSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltresSupervisionLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(jPanelFiltresSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBatiments, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSallesSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltresSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBoxSallesSupervision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxBatSupervision, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 150, Short.MAX_VALUE)
                .addComponent(jButtonFiltrerSupervision)
                .addContainerGap())
        );
        jPanelFiltresSupervisionLayout.setVerticalGroup(
            jPanelFiltresSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltresSupervisionLayout.createSequentialGroup()
                .addGroup(jPanelFiltresSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxBatSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelBatiments))
                .addGroup(jPanelFiltresSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltresSupervisionLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButtonFiltrerSupervision))
                    .addGroup(jPanelFiltresSupervisionLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltresSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSallesSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSallesSupervision))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jButtonDetails.setText("Détails");

        javax.swing.GroupLayout jPanelSupervisionLayout = new javax.swing.GroupLayout(jPanelSupervision);
        jPanelSupervision.setLayout(jPanelSupervisionLayout);
        jPanelSupervisionLayout.setHorizontalGroup(
            jPanelSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSupervisionLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneTableauSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanelFiltresSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonDetails))
                .addContainerGap(304, Short.MAX_VALUE))
        );
        jPanelSupervisionLayout.setVerticalGroup(
            jPanelSupervisionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSupervisionLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFiltresSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(jScrollPaneTableauSupervision, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonDetails)
                .addGap(33, 33, 33))
        );

        jTabLvl1.addTab("Supervision", jPanelSupervision);

        jPanelFiltresMaintenance.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtres"));
        jPanelFiltresMaintenance.setToolTipText("");

        jButtonFiltrerMaintenance.setText("Filtrer");
        jButtonFiltrerMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFiltrerMaintenanceActionPerformed(evt);
            }
        });

        jLabelBatimentMaintenance.setText("Bâtiments");

        jLabelSallesMaintenance.setText("Salles");

        jComboBoxSallesMaintenance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tous", "212", "210", "110" }));

        jComboBoxBatimentMaintenance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tous", "TP3", "U4", "U3", "U2", "K5-Burk" }));

        javax.swing.GroupLayout jPanelFiltresMaintenanceLayout = new javax.swing.GroupLayout(jPanelFiltresMaintenance);
        jPanelFiltresMaintenance.setLayout(jPanelFiltresMaintenanceLayout);
        jPanelFiltresMaintenanceLayout.setHorizontalGroup(
            jPanelFiltresMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltresMaintenanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFiltresMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelBatimentMaintenance, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelSallesMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelFiltresMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jComboBoxSallesMaintenance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxBatimentMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonFiltrerMaintenance)
                .addContainerGap())
        );
        jPanelFiltresMaintenanceLayout.setVerticalGroup(
            jPanelFiltresMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFiltresMaintenanceLayout.createSequentialGroup()
                .addGroup(jPanelFiltresMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelFiltresMaintenanceLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButtonFiltrerMaintenance))
                    .addGroup(jPanelFiltresMaintenanceLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanelFiltresMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxBatimentMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelBatimentMaintenance))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelFiltresMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSallesMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelSallesMaintenance))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanelOrdinateurMaintenance.setBorder(javax.swing.BorderFactory.createTitledBorder("Ordinateur"));

        jComboBoxSallesMaintance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "U2-211", "U2-212", "U2-213", "U3-209" }));

        jComboBoxOrdianteurMaintenance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dagobah", "Tatoïne", "Corruscant", "Hoth" }));

        jButtonTransfererMaintenance.setText("Transférer");

        jButtonMaJMaintenance.setText("Mettre à Jour");
        jButtonMaJMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMaJMaintenanceActionPerformed(evt);
            }
        });

        jLabelSalleOrdiMaintenance.setText("Salle");

        jLabelOSOrdinateur.setText("OS");

        jComboBoxOSMaintenance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Windows XP", "Windows Vista", "Windows 7", "Windows 8", "Mac Os X", "Linux Debian" }));
        jComboBoxOSMaintenance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOSMaintenanceActionPerformed(evt);
            }
        });

        jButtonChangerOS.setText("Changer l'OS");

        jProgressBarInstall.setValue(20);

        jLabelEtatMaintenance.setText("Etat");

        jComboBoxStockMaintenance.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stock", "En Panne", "Installé" }));

        javax.swing.GroupLayout jPanelOrdinateurMaintenanceLayout = new javax.swing.GroupLayout(jPanelOrdinateurMaintenance);
        jPanelOrdinateurMaintenance.setLayout(jPanelOrdinateurMaintenanceLayout);
        jPanelOrdinateurMaintenanceLayout.setHorizontalGroup(
            jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrdinateurMaintenanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOSOrdinateur)
                    .addComponent(jLabelSalleOrdiMaintenance)
                    .addComponent(jLabelEtatMaintenance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBarInstall, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelOrdinateurMaintenanceLayout.createSequentialGroup()
                        .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jComboBoxStockMaintenance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxOSMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxSallesMaintance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxOrdianteurMaintenance, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelOrdinateurMaintenanceLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jButtonChangerOS, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrdinateurMaintenanceLayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButtonTransfererMaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonMaJMaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        jPanelOrdinateurMaintenanceLayout.setVerticalGroup(
            jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrdinateurMaintenanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOrdianteurMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMaJMaintenance))
                .addGap(18, 18, 18)
                .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxSallesMaintance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonTransfererMaintenance)
                    .addComponent(jLabelSalleOrdiMaintenance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxStockMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEtatMaintenance))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(jPanelOrdinateurMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxOSMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChangerOS)
                    .addComponent(jLabelOSOrdinateur))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jProgressBarInstall, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        jPanelAjoutMachineMaintenance.setBorder(javax.swing.BorderFactory.createTitledBorder("Ajout Machine"));

        jLabelHostname.setText("Nom d'hote");

        jLabelEtatAjoutMachine.setText("Etat");

        jLabelSalleAjoutMachine.setText("Salle");

        jLabelOSAjoutMachine.setText("OS");

        jComboBoxEtatAjoutMachine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Stock", "En Panne", "Installé" }));

        jComboBoxSalleAjoutMachine.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "U2-211", "U2-212", "U2-213", "U3-209" }));

        jListOS.setModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Windows XP", "Windows Vista", "Windows 7", "Windows 8", "Mac Os X", "Linux Debian" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        jScrollPaneAjoutMachine.setViewportView(jListOS);

        jButtonValiderAjoutMAchine.setText("Valider");

        javax.swing.GroupLayout jPanelAjoutMachineMaintenanceLayout = new javax.swing.GroupLayout(jPanelAjoutMachineMaintenance);
        jPanelAjoutMachineMaintenance.setLayout(jPanelAjoutMachineMaintenanceLayout);
        jPanelAjoutMachineMaintenanceLayout.setHorizontalGroup(
            jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAjoutMachineMaintenanceLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabelHostname)
                    .addComponent(jLabelEtatAjoutMachine)
                    .addComponent(jLabelSalleAjoutMachine)
                    .addComponent(jLabelOSAjoutMachine))
                .addGap(18, 18, 18)
                .addGroup(jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextFieldHostname)
                    .addComponent(jComboBoxEtatAjoutMachine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxSalleAjoutMachine, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneAjoutMachine)
                    .addComponent(jButtonValiderAjoutMAchine, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        jPanelAjoutMachineMaintenanceLayout.setVerticalGroup(
            jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAjoutMachineMaintenanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldHostname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelHostname))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelEtatAjoutMachine)
                    .addComponent(jComboBoxEtatAjoutMachine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSalleAjoutMachine)
                    .addComponent(jComboBoxSalleAjoutMachine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelAjoutMachineMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelOSAjoutMachine)
                    .addComponent(jScrollPaneAjoutMachine, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonValiderAjoutMAchine)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanelMaintenanceLayout = new javax.swing.GroupLayout(jPanelMaintenance);
        jPanelMaintenance.setLayout(jPanelMaintenanceLayout);
        jPanelMaintenanceLayout.setHorizontalGroup(
            jPanelMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMaintenanceLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelOrdinateurMaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelFiltresMaintenance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanelAjoutMachineMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanelMaintenanceLayout.setVerticalGroup(
            jPanelMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMaintenanceLayout.createSequentialGroup()
                .addContainerGap(95, Short.MAX_VALUE)
                .addGroup(jPanelMaintenanceLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAjoutMachineMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelMaintenanceLayout.createSequentialGroup()
                        .addComponent(jPanelFiltresMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jPanelOrdinateurMaintenance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(133, 133, 133))
        );

        jTabLvl1.addTab("Maintenance", jPanelMaintenance);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabLvl1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabLvl1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonMaJMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMaJMaintenanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonMaJMaintenanceActionPerformed

    private void jButtonFiltrerMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrerMaintenanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFiltrerMaintenanceActionPerformed

    private void jButtonFiltrerSupervisionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFiltrerSupervisionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFiltrerSupervisionActionPerformed

    private void jComboBoxOSMaintenanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOSMaintenanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxOSMaintenanceActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonChangerOS;
    private javax.swing.JButton jButtonDetails;
    private javax.swing.JButton jButtonFiltrerMaintenance;
    private javax.swing.JButton jButtonFiltrerSupervision;
    private javax.swing.JButton jButtonMaJMaintenance;
    private javax.swing.JButton jButtonTransfererMaintenance;
    private javax.swing.JButton jButtonValiderAjoutMAchine;
    private javax.swing.JComboBox jComboBoxBatSupervision;
    private javax.swing.JComboBox jComboBoxBatimentMaintenance;
    private javax.swing.JComboBox jComboBoxEtatAjoutMachine;
    private javax.swing.JComboBox jComboBoxOSMaintenance;
    private javax.swing.JComboBox jComboBoxOrdianteurMaintenance;
    private javax.swing.JComboBox jComboBoxSalleAjoutMachine;
    private javax.swing.JComboBox jComboBoxSallesMaintance;
    private javax.swing.JComboBox jComboBoxSallesMaintenance;
    private javax.swing.JComboBox jComboBoxSallesSupervision;
    private javax.swing.JComboBox jComboBoxStockMaintenance;
    private javax.swing.JLabel jLabelBatimentMaintenance;
    private javax.swing.JLabel jLabelBatiments;
    private javax.swing.JLabel jLabelEtatAjoutMachine;
    private javax.swing.JLabel jLabelEtatMaintenance;
    private javax.swing.JLabel jLabelHostname;
    private javax.swing.JLabel jLabelOSAjoutMachine;
    private javax.swing.JLabel jLabelOSOrdinateur;
    private javax.swing.JLabel jLabelSalleAjoutMachine;
    private javax.swing.JLabel jLabelSalleOrdiMaintenance;
    private javax.swing.JLabel jLabelSallesMaintenance;
    private javax.swing.JLabel jLabelSallesSupervision;
    private javax.swing.JList jListOS;
    private javax.swing.JPanel jPaneRecapitulatif;
    private javax.swing.JPanel jPanelAjoutMachineMaintenance;
    private javax.swing.JPanel jPanelFiltresMaintenance;
    private javax.swing.JPanel jPanelFiltresSupervision;
    private javax.swing.JPanel jPanelMaintenance;
    private javax.swing.JPanel jPanelOrdinateurMaintenance;
    private javax.swing.JPanel jPanelSupervision;
    private javax.swing.JProgressBar jProgressBarInstall;
    private javax.swing.JScrollPane jScrollPaneAjoutMachine;
    private javax.swing.JScrollPane jScrollPaneTableauSupervision;
    private javax.swing.JTabbedPane jTabLvl1;
    private javax.swing.JTable jTableauSupervision;
    private javax.swing.JTextField jTextFieldHostname;
    // End of variables declaration//GEN-END:variables
}

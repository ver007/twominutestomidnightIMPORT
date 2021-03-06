/*
 * SearchForm.java
 *
 * Created on 07 August 2010, 22:42
 */

package docketSystem;

import javax.swing.JComponent;

/**
 * 
 * @author divo
 */
public class SearchForm extends javax.swing.JFrame {

	private Interface interfaceRef;

	/** Creates new form SearchForm */
	public SearchForm(Interface interfaceRef) {
		this.interfaceRef = interfaceRef;
		initComponents();
		dateCheckActionPerformed();
		java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit()
				.getScreenSize();
		// this.setLocation(screenSize.width / 2, (screenSize.height) / 2);
		
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jButton1 = new javax.swing.JButton();
		standardPanel = new javax.swing.JPanel();
		equipLabel = new javax.swing.JLabel();
		equip = new javax.swing.JTextField();
		docketLabel = new javax.swing.JLabel();
		docket = new javax.swing.JTextField();
		customerLabel = new javax.swing.JLabel();
		customer = new javax.swing.JTextField();
		sealLabel = new javax.swing.JLabel();
		seal = new javax.swing.JTextField();
		decriptionLabel = new javax.swing.JLabel();
		deliverLabel = new javax.swing.JLabel();
		jScrollPane1 = new javax.swing.JScrollPane();
		deliver = new javax.swing.JTextArea();
		collectLabel = new javax.swing.JLabel();
		description = new javax.swing.JTextField();
		jScrollPane2 = new javax.swing.JScrollPane();
		collect = new javax.swing.JTextArea();
		dateCheck = new javax.swing.JCheckBox();
		datePanel = new javax.swing.JPanel();
		day = new javax.swing.JComboBox();
		jLabel1 = new javax.swing.JLabel();
		month = new javax.swing.JComboBox();
		jLabel2 = new javax.swing.JLabel();
		year = new javax.swing.JComboBox();
		findButton = new javax.swing.JButton();
		resetButton = new javax.swing.JButton();

		jButton1.setText("jButton1");

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
		setResizable(false);

		standardPanel.setBorder(javax.swing.BorderFactory
				.createTitledBorder(""));

		equipLabel.setText("Equipment No.");

		docketLabel.setText("Docket No");

		customerLabel.setText("Customer Ref");

		sealLabel.setText("Seal No.");

		decriptionLabel.setText("Description");

		deliverLabel.setText("Deliver To");

		deliver.setColumns(13);
		deliver.setRows(5);
		jScrollPane1.setViewportView(deliver);

		collectLabel.setText("Collect From");

		collect.setColumns(13);
		collect.setRows(5);
		jScrollPane2.setViewportView(collect);

		dateCheck.setText("Date");
		dateCheck.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				dateCheckActionPerformed();
			}
		});

		datePanel.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

		day.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1",
				"2", "3", "4", "5", "6", "7", "8", "9", "10" }));

		jLabel1.setText("/");

		month.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1",
				"31" }));

		jLabel2.setText("/");

		year.setModel(new javax.swing.DefaultComboBoxModel(new String[] {
				"2010", "2020" }));

		
		javax.swing.GroupLayout datePanelLayout = new javax.swing.GroupLayout(datePanel);
        datePanel.setLayout(datePanelLayout);
        datePanelLayout.setHorizontalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        datePanelLayout.setVerticalGroup(
            datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(datePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(datePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(day, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout standardPanelLayout = new javax.swing.GroupLayout(standardPanel);
        standardPanel.setLayout(standardPanelLayout);
        standardPanelLayout.setHorizontalGroup(
            standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(standardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(decriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(customerLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(equipLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE)
                    .addComponent(deliverLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(standardPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(standardPanelLayout.createSequentialGroup()
                                .addComponent(dateCheck)
                                .addGap(202, 202, 202))
                            .addGroup(standardPanelLayout.createSequentialGroup()
                                .addComponent(datePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, standardPanelLayout.createSequentialGroup()
                        .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(description, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                            .addGroup(standardPanelLayout.createSequentialGroup()
                                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(customer, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(equip, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(docketLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sealLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(seal, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                    .addComponent(docket, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))))
                        .addContainerGap())))
        );
        standardPanelLayout.setVerticalGroup(
            standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(standardPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(equipLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(equip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(docketLabel)
                    .addComponent(docket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customerLabel)
                    .addComponent(customer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sealLabel)
                    .addComponent(seal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(description, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decriptionLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(standardPanelLayout.createSequentialGroup()
                        .addGroup(standardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                            .addComponent(deliverLabel))
                        .addGap(19, 19, 19))
                    .addGroup(standardPanelLayout.createSequentialGroup()
                        .addComponent(dateCheck)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

		findButton.setText("Find");
		findButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				interfaceRef.setQuery(constructQuery());
				
				dispose();
			}
		});
		findButton.setPreferredSize(new java.awt.Dimension(77, 77));

		resetButton.setText("Reset");
		resetButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				interfaceRef.setDefaultQuery();
				dispose();
				;
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(419, Short.MAX_VALUE)
                .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(findButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addComponent(standardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(5, 5, 5)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(findButton, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(resetButton, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(standardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(13, Short.MAX_VALUE)))
        );

        pack();
	}// </editor-fold>

	private void dateCheckActionPerformed() {
		JComponent hax[] = { day, month, year };
		/*if (dateCheck.isSelected()) {
			for (JComponent n : hax) {
				n.setEnabled(true);
			}
		} else {*/
			for (JComponent n : hax) {
				n.setEnabled(false);
			}
		//}
	}

	private String constructQuery() {
		// Probably could be a bit smarter and not check the state of the box,
		// but just to be safe
		String result = new String(" WHERE");
		boolean valid = false; // Used to tell if the user entered anything
		String temp;
		try {
			if ((temp = docket.getText()).compareTo("") != 0) {
				result = new String(result + " Docket_Number='"
						+ Integer.parseInt(temp) + "' AND");
				valid = true;
			}
			if ((temp = equip.getText()).compareTo("") != 0) {
				result = new String(result + " Equipment LIKE \"" + temp
						+ "%\" AND");
				valid = true;
			}
			if ((temp = seal.getText()).compareTo("") != 0) {
				result = new String(result + " Seal LIKE \"" + temp + "%\" AND ");
				valid = true;
			}
			if ((temp = customer.getText()).compareTo("") != 0) {
				result = new String(result + " Customer LIKE \"" + temp
						+ "%\" AND");
				valid = true;
			}
			if ((temp = description.getText()).compareTo("") != 0) {
				result = new String(result + " Description LIKE \"" + temp
						+ "%\" AND");
				valid = true;
			}
			if ((temp = deliver.getText()).compareTo("") != 0) {
				result = new String(result + " addresses.Address LIKE \"" + temp
						+ "%\" AND");
				valid = true;
			}
		

		} catch (NumberFormatException e) {
			e.printStackTrace();
			// Tell user they're an idiot
		}

		if (valid) {
			result = result.split(" AND")[0];
			return result;
		} else {
			return new String("");
		}
	}

	/**
	 * @param args
	 *            the command line arguments
	 */

	// Variables declaration - do not modify
	private javax.swing.JTextField docket;
	private javax.swing.JLabel docketLabel;
	private javax.swing.JLabel collectLabel;
	private javax.swing.JTextField customer;
	private javax.swing.JLabel customerLabel;
	private javax.swing.JCheckBox dateCheck;
	private javax.swing.JPanel datePanel;
	private javax.swing.JComboBox day;
	private javax.swing.JLabel decriptionLabel;
	private javax.swing.JTextArea deliver;
	private javax.swing.JTextArea collect;
	private javax.swing.JLabel deliverLabel;
	private javax.swing.JTextField description;
	private javax.swing.JTextField equip;
	private javax.swing.JLabel equipLabel;
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JComboBox month;
	private javax.swing.JButton findButton;
	private javax.swing.JButton resetButton;
	private javax.swing.JTextField seal;
	private javax.swing.JLabel sealLabel;
	private javax.swing.JPanel standardPanel;
	private javax.swing.JComboBox year;
	// End of variables declaration

}
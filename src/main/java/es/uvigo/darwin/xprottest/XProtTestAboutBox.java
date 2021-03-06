/*
Copyright (C) 2009  Diego Darriba

This program is free software; you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation; either version 2 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program; if not, write to the Free Software
Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */
package es.uvigo.darwin.xprottest;

import javax.swing.ActionMap;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import javax.swing.WindowConstants;

import org.jdesktop.application.Action;

public class XProtTestAboutBox extends JDialog {

	public XProtTestAboutBox(java.awt.Frame parent) {
		super(parent);
		initComponents();
		getRootPane().setDefaultButton(closeButton);
	}

	@Action
	public void closeAboutBox() {
		setVisible(false);
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	// <editor-fold defaultstate="collapsed"
	// desc="Generated Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		closeButton = new JButton();
		JLabel appTitleLabel = new JLabel();
		JLabel versionLabel = new JLabel();
		JLabel appVersionLabel = new JLabel();
		JLabel homepageLabel = new JLabel();
		JLabel appHomepageLabel = new JLabel();
		JLabel citationLabel = new JLabel();
		JLabel appCitation1Label = new JLabel();
		JLabel appCitation2Label = new JLabel();
		JLabel appDescLabel = new JLabel();
		JLabel imageLabel = new JLabel();

		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.Application
				.getInstance(es.uvigo.darwin.xprottest.XProtTestApp.class)
				.getContext().getResourceMap(XProtTestAboutBox.class);
		setTitle(resourceMap.getString("title")); // NOI18N
		setModal(true);
		setName("aboutBox"); // NOI18N
		setResizable(false);

		ActionMap actionMap = org.jdesktop.application.Application
				.getInstance(es.uvigo.darwin.xprottest.XProtTestApp.class)
				.getContext().getActionMap(XProtTestAboutBox.class, this);
		closeButton.setAction(actionMap.get("closeAboutBox")); // NOI18N
		closeButton.setName("closeButton"); // NOI18N

		appTitleLabel.setFont(appTitleLabel.getFont().deriveFont(
				appTitleLabel.getFont().getStyle() | java.awt.Font.BOLD,
				appTitleLabel.getFont().getSize() + 4));
		appTitleLabel.setText(resourceMap.getString("Application.title")); // NOI18N
		appTitleLabel.setName("appTitleLabel"); // NOI18N

		versionLabel.setFont(versionLabel.getFont().deriveFont(
				versionLabel.getFont().getStyle() | java.awt.Font.BOLD));
		versionLabel.setText(resourceMap.getString("versionLabel.text")); // NOI18N
		versionLabel.setName("versionLabel"); // NOI18N

		appVersionLabel.setText(resourceMap.getString("Application.version")); // NOI18N
		appVersionLabel.setName("appVersionLabel"); // NOI18N

		homepageLabel.setFont(homepageLabel.getFont().deriveFont(
				homepageLabel.getFont().getStyle() | java.awt.Font.BOLD));
		homepageLabel.setText(resourceMap.getString("homepageLabel.text")); // NOI18N
		homepageLabel.setName("homepageLabel"); // NOI18N

		appHomepageLabel.setText(resourceMap.getString("Application.homepage")); // NOI18N
		appHomepageLabel.setName("appHomepageLabel"); // NOI18N

		citationLabel.setFont(citationLabel.getFont().deriveFont(
				citationLabel.getFont().getStyle() | java.awt.Font.BOLD));
		citationLabel.setText(resourceMap.getString("citationLabel.text")); // NOI18N
		citationLabel.setName("citationLabel"); // NOI18N

		appCitation1Label.setText(resourceMap.getString("Application.citation1")); // NOI18N
		appCitation1Label.setName("appCitationLabel"); // NOI18N
		appCitation2Label.setText(resourceMap.getString("Application.citation2")); // NOI18N
		appCitation2Label.setName("appCitationLabel"); // NOI18N

		appDescLabel.setText(resourceMap.getString("appDescLabel.text")); // NOI18N
		appDescLabel.setName("appDescLabel"); // NOI18N

		imageLabel.setIcon(resourceMap.getIcon("imageLabel.icon")); // NOI18N
		imageLabel.setName("imageLabel"); // NOI18N

		GroupLayout layout = new GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addGroup(
						layout.createSequentialGroup()
								.addComponent(imageLabel)
								.addGap(18, 18, 18)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.LEADING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		versionLabel)
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		appVersionLabel)
																.addGap(238,
																		238,
																		238))
												.addComponent(appTitleLabel)
												.addComponent(
														appDescLabel,
														GroupLayout.DEFAULT_SIZE,
														367, Short.MAX_VALUE)
												.addComponent(
														closeButton,
														GroupLayout.Alignment.TRAILING)
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		homepageLabel)
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		appHomepageLabel,
																		GroupLayout.DEFAULT_SIZE,
																		289,
																		Short.MAX_VALUE))
												.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		citationLabel)
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		appCitation1Label,
																		GroupLayout.DEFAULT_SIZE,
																		289,
																		Short.MAX_VALUE))
																		.addGroup(
														layout.createSequentialGroup()
																.addComponent(
																		citationLabel)
																.addPreferredGap(
																		LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(
																		appCitation2Label,
																		GroupLayout.DEFAULT_SIZE,
																		289,
																		Short.MAX_VALUE)))
								.addContainerGap()));
		layout.setVerticalGroup(layout
				.createParallelGroup(GroupLayout.Alignment.LEADING)
				.addComponent(imageLabel, GroupLayout.PREFERRED_SIZE, 190,
						Short.MAX_VALUE)
				.addGroup(
						layout.createSequentialGroup()
								.addContainerGap()
								.addComponent(appTitleLabel)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(appDescLabel)
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(versionLabel)
												.addComponent(appVersionLabel))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(homepageLabel)
												.addComponent(appHomepageLabel))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED)
								.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(citationLabel)
												.addComponent(appCitation1Label))
												.addGroup(
										layout.createParallelGroup(
												GroupLayout.Alignment.BASELINE)
												.addComponent(appCitation2Label))
								.addPreferredGap(
										LayoutStyle.ComponentPlacement.RELATED,
										63, Short.MAX_VALUE)
								.addComponent(closeButton).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private JButton closeButton;
	// End of variables declaration//GEN-END:variables

}

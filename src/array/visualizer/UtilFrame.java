/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package array.visualizer;

import static array.visualizer.ArrayVisualizer.COLOR;
import static array.visualizer.ArrayVisualizer.FANCYFINISH;
import static array.visualizer.ArrayVisualizer.LINEDRAW;
import static array.visualizer.ArrayVisualizer.MUTABLE;
import static array.visualizer.ArrayVisualizer.REALTIMER;
import static array.visualizer.ArrayVisualizer.SHUFFLEANIM;
import static array.visualizer.ArrayVisualizer.SKIPPED;
import static array.visualizer.ArrayVisualizer.SLEEPRATIO;
import static array.visualizer.ArrayVisualizer.SOUND;
import static array.visualizer.ArrayVisualizer.SOUNDMUL;
import static array.visualizer.ArrayVisualizer.TEXTDRAW;
import static array.visualizer.ArrayVisualizer.comps;
import static array.visualizer.ArrayVisualizer.realTimer;
import static array.visualizer.ArrayVisualizer.swaps;
import static array.visualizer.ArrayVisualizer.tempStores;
import static array.visualizer.ArrayVisualizer.writes;

import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author S630690
 */
public class UtilFrame extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JFrame f;
    AAFrame v;
  
    /**
     * Creates new form UtilFrame
     */
    public UtilFrame(JFrame f) {
        this.f = f;
        setUndecorated(true);
        initComponents();
        setLocation(f.getX() + f.getWidth(), f.getY() + 29);
        setAlwaysOnTop(false);
        setVisible(true);
    }
    
    public void reposition(){
        toFront();
        setLocation(Math.min((int) Toolkit.getDefaultToolkit().getScreenSize().getWidth() - getWidth(), f.getX() + f.getWidth()), 
        		f.getY() + 29);
        if(v != null && v.isVisible())
            v.reposition();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

    	jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jButton4 = new javax.swing.JButton();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jCheckBox5 = new javax.swing.JCheckBox();
        jButton7 = new javax.swing.JButton();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        
        jLabel1.setText("Settings");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jButton1.setText("Choose Sort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Visual Style");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Change Speed");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        jButton4.setText("Skip Sort");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jCheckBox1.setSelected(true);
        jCheckBox1.setText("Show Shuffle");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        jCheckBox2.setSelected(false);
        jCheckBox2.setText("Linked Dots");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        
        jCheckBox3.setSelected(true);
        jCheckBox3.setText("End Sweep Anim");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        
        jCheckBox4.setSelected(true);
        jCheckBox4.setText("Calc Real Time");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });
        
        jButton5.setText("Array Size");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        
        jButton6.setText("Clear Stats");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        
        jCheckBox5.setSelected(false);
        jCheckBox5.setText("Softer Sounds");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });
        
        jButton7.setText("Choose Shuffle");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        
        jCheckBox6.setSelected(true);
        jCheckBox6.setText("Display Stats");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });
        
        jCheckBox7.setSelected(true);
        jCheckBox7.setText("Enable Sounds");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });
        
        jCheckBox8.setSelected(false);
        jCheckBox8.setText("Enable Color");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, true)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER, true)
                    	.addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
                        .addComponent(jCheckBox1)
                    	.addComponent(jCheckBox2)
                        .addComponent(jCheckBox3)
                        .addComponent(jCheckBox4)
                        .addComponent(jCheckBox6)
                        .addComponent(jCheckBox7)
                        .addComponent(jCheckBox8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, true)
                    	.addComponent(jCheckBox5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(jButton7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       	.addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       	.addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                       	.addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, true)
            .addGroup(layout.createSequentialGroup()
            	.addGap(5, 5, 5)
            	.addComponent(jLabel1)
            	.addGap(7, 7, 7)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2)
                .addGap(5, 5, 5)
                .addComponent(jCheckBox2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox8)
                .addGap(7, 7, 7)
                .addComponent(jButton3)
                .addGap(12, 12, 12)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton7)
                .addGap(7, 7, 7)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCheckBox3)
                .addGap(8, 8, 8)
                .addComponent(jButton6)
                .addGap(5, 5, 5)
                .addComponent(jCheckBox6)
                .addComponent(jCheckBox4)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //CHANGE SORT
        if(v != null && v.isVisible()){
                boolean tmp = v instanceof SortPrompt;
                v.dispose();
                if(tmp)
                    return;
        }
        v = new SortPrompt(f);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //CHANGE VIEW
        if(v != null && v.isVisible()){
                boolean tmp = v instanceof ViewPrompt;
                v.dispose();
                if(tmp)
                    return;
        }
        v = new ViewPrompt(f);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
        	SLEEPRATIO = Double.parseDouble(JOptionPane.showInputDialog(null, "Modify the visual's speed below (Ex. 10 = Ten times faster)", SLEEPRATIO));
        }
        catch(Exception e) {}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        SHUFFLEANIM = jCheckBox1.isSelected();
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        LINEDRAW = jCheckBox2.isSelected();
    }//GEN-LAST:event_jCheckBox2ActionPerformed
    
    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        FANCYFINISH = jCheckBox3.isSelected();
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	SLEEPRATIO = Integer.MAX_VALUE;
    	SKIPPED = true;
    }//GEN-LAST:event_jButton4ActionPerformed
    
    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	REALTIMER = jCheckBox4.isSelected();
    }//GEN-LAST:event_jCheckBox4ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    	// TODO add your handling code here:
    	//CHANGE SIZE
    	if(MUTABLE) {
    		if(v != null && v.isVisible()){
    			boolean tmp = v instanceof SizePrompt;
    			v.dispose();
    			if(tmp)
    				return;
    		}
    		v = new SizePrompt(f);
    	}
    }//GEN-LAST:event_jButton5ActionPerformed
    
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	comps = 0;
    	writes = 0;
    	swaps = 0;
    	tempStores = 0;
    	realTimer = 0;
    }//GEN-LAST:event_jButton6ActionPerformed
    
    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	if(jCheckBox5.isSelected()) {
    		SOUNDMUL = 0.01;
    	}
    	else {
    		SOUNDMUL = 1;
    	}
    }//GEN-LAST:event_jCheckBox5ActionPerformed
    
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //CHANGE SIZE
        if(v != null && v.isVisible()){
                boolean tmp = v instanceof ShufflePrompt;
                v.dispose();
                if(tmp)
                    return;
        }
        v = new ShufflePrompt(f);
    }//GEN-LAST:event_jButton7ActionPerformed
    
    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	TEXTDRAW = jCheckBox6.isSelected();
    }//GEN-LAST:event_jCheckBox6ActionPerformed
    
    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	SOUND = jCheckBox7.isSelected();
    }//GEN-LAST:event_jCheckBox7ActionPerformed
    
    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    	COLOR = jCheckBox8.isSelected();
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    // End of variables declaration//GEN-END:variables
}
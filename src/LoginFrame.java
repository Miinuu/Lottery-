
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author 82104
 */
public class LoginFrame extends javax.swing.JFrame {
    DB_MAN DBM = new DB_MAN();
    String strSQL = "Select id From Users ";
    int loginFailCnt = 0;
    boolean isRight = false;
    
    public String Random(){
        String[] randomNumber = new String[6];
        ArrayList<String> num = new ArrayList<String>();
        char[] eng = new char[26];
        
        String[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".split("");
        // ArrayList<String> eng = new ArrayList<String>();
        for(int i = 1 ; i <= 9 ; i++) {
            num.add(Integer.toString(i));
        }
        for(int i = 0; i< 26; i++){
            eng[i] = ((char)(i + 97));
        }
        List<String> alphabetList = Arrays.asList(alphabet);
        Collections.shuffle(num);
        Collections.shuffle(alphabetList);
        for(int i = 0 ; i < 3 ; i++) {
            randomNumber[i] = num.get(i);
            randomNumber[i+3] = alphabetList.get(i);
        }
        List<String> listRandomNumber = Arrays.asList(randomNumber);
        Collections.shuffle(listRandomNumber);
        
        
        String strRandomNumber = listRandomNumber.toString().replaceAll("[^0-9^A-Z ]","");
        return strRandomNumber;
    }
    
    /**
     * Creates new form joinFrame
     */
    public LoginFrame() {
        initComponents();
        String strRandomNumber = Random();
        lblRandom.setText(strRandomNumber);
        
        this.setLocation(300, 300);
        lblRandom.setVisible(false);
        txtInput.setVisible(false);
        btnRefresh.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnlogin = new javax.swing.JButton();
        btnMem = new javax.swing.JButton();
        txtID = new javax.swing.JTextField();
        lblID = new javax.swing.JLabel();
        lblPasswd = new javax.swing.JLabel();
        txtPasswd = new javax.swing.JPasswordField();
        lblRandom = new javax.swing.JLabel();
        txtInput = new javax.swing.JTextField();
        btnRefresh = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("로그인");

        lblTitle.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        lblTitle.setText("로그인");

        btnlogin.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnlogin.setText("로그인");
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });

        btnMem.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnMem.setText("회원가입");
        btnMem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMemActionPerformed(evt);
            }
        });

        lblID.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblID.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblID.setText("ID  : ");

        lblPasswd.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N
        lblPasswd.setText("PASSWD : ");

        lblRandom.setFont(new java.awt.Font("맑은 고딕", 1, 24)); // NOI18N
        lblRandom.setText("랜덤 문자열");

        btnRefresh.setFont(new java.awt.Font("맑은 고딕", 1, 12)); // NOI18N
        btnRefresh.setText("새로고침");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lblTitle))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRandom, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblPasswd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblID, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtID)
                                    .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRefresh)))))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnlogin)
                .addGap(33, 33, 33)
                .addComponent(btnMem)
                .addGap(91, 91, 91))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitle)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblID))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswd)
                    .addComponent(txtPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblRandom, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMem)
                    .addComponent(btnlogin))
                .addGap(32, 32, 32))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        // TODO add your handling code here:
        if (txtID.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "아이디를 입력하세요.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        if (txtPasswd.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "비밀번호를 입력하세요.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        strSQL = "Select * From Users Where Users.ID = '" + txtID.getText() + "'";

        try{
            
            DBM.dbOpen();
            DBM.DB_rs = DBM.DB_stmt.executeQuery(strSQL);
            String id = "";
            String pass = "";
            String salt = "";
            
            while(DBM.DB_rs.next()){
                id = DBM.DB_rs.getString("ID");
                pass = DBM.DB_rs.getString("Password");
                salt = DBM.DB_rs.getString("Salt");
            }
            
            if (loginFailCnt > 0){
                lblRandom.setVisible(true);
                txtInput.setVisible(true);
                btnRefresh.setVisible(true);
                if (loginFailCnt > 1){
                    String random = lblRandom.getText();
                    String input = txtInput.getText().toUpperCase();
                    String random2 = random.replace(" ","");
                    if (!(input.equals(random) || input.equals(random2)) ){
                        JOptionPane.showMessageDialog(null, "아래 보이는 문자를 정확하게 입력해주세요!", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                        txtInput.setText("");
                        return;
                    }
                }
            }
            
            
            
            if(id.equals("")){
                JOptionPane.showMessageDialog(null, "존재하지 않은 아이디입니다.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                loginFailCnt++;
                DBM.DB_rs.close();
                DBM.dbClose();
                String strRandomNumber = Random();
                lblRandom.setText(strRandomNumber);
                txtInput.setText("");
                return;
            }
            
            String pwdgetEncrypt = Utils.getEncrypt(txtPasswd.getText().trim(), salt);
            
            if(!(pass.equals(pwdgetEncrypt))){
                JOptionPane.showMessageDialog(null, "비밀번호를 잘못 입력 하였습니다.", "ERROR_MESSAGE", JOptionPane.ERROR_MESSAGE);
                loginFailCnt++;
                DBM.DB_rs.close();
                DBM.dbClose();
                String strRandomNumber = Random();
                lblRandom.setText(strRandomNumber);
                txtInput.setText("");
                return;
            }
            
            loginFailCnt = 0;
            UserIDC.user_id = txtID.getText();
            ChoiceFrame sf = new ChoiceFrame();
            sf.setVisible(true);
            sf.setLocation(300, 300);
            this.dispose();
        
            DBM.DB_rs.close();
            DBM.dbClose();
        }catch(Exception e){
            System.out.println("SQLException : " + e.getMessage());
        }
    }//GEN-LAST:event_btnloginActionPerformed

    private void btnMemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMemActionPerformed
        // TODO add your handling code here:
        JoinMemberFrame mf = new JoinMemberFrame();
        mf.setVisible(true);
        mf.setLocation(300, 300);
        this.dispose();
    }//GEN-LAST:event_btnMemActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        String strRandomNumber = Random();
        lblRandom.setText(strRandomNumber);
    }//GEN-LAST:event_btnRefreshActionPerformed

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
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMem;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JButton btnlogin;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblPasswd;
    private javax.swing.JLabel lblRandom;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtInput;
    private javax.swing.JPasswordField txtPasswd;
    // End of variables declaration//GEN-END:variables
}

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.UserInfo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import javax.swing.ImageIcon;


public class MainFrame extends javax.swing.JFrame implements ActionListener{

   
    JSch  ssh;
    Session session = null;
    Channel channel = null;
    private PipedInputStream fromServer;
    private PipedOutputStream toServer;

    public MainFrame() {
        setIconImage(new ImageIcon(getClass().getResource("icon_power_management.gif")).getImage());
        this.addWindowListener(new WindowAdapter() {
        
            @Override
            public void windowClosing(WindowEvent e) {
                try{
               disconnect();
                }
                catch(Exception ex){ex.printStackTrace();}
            }

        });
        initComponents();
        btngrp=new javax.swing.ButtonGroup();
        btngrp.add(this.jRadioButton1);
        btngrp.add(this.jRadioButton2);
        btngrp.add(this.jRadioButton3);
        btngrp.add(this.jRadioButton4);
        btngrp.add(this.jRadioButton5);
        btngrp.add(this.jRadioButton6);
        btngrp.add(this.jRadioButton7);
        btngrp.add(this.jRadioButton8);
        btngrp.add(this.jRadioButton9);
      
        jMenuItem2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
               new AbtUs().setVisible(true);
             
            }

            

        });
        jCheckBox1.setSelected(true);
        jRadioButton1.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
           Character b='a';
           try{
       send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jRadioButton2.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
            Character b='e';
            try{
        send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jRadioButton3.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
                        Character b='b';
            try{
          send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jRadioButton4.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
             
           Character b='f';
            try{
         send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jRadioButton5.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
             
           Character b='c';
            try{
       send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jRadioButton6.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
             
           Character b='g';
            try{
        send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jRadioButton7.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
             
            Character b='h';
            try{
          send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jRadioButton8.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {

           Character b='d';
            try{
           send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
         jRadioButton9.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
             
           Character b='p';
            try{
          send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
            }

        });
        jCheckBox1.addActionListener(this);
        jCheckBox2.addActionListener(this);
        jCheckBox3.addActionListener(this);
         jCheckBox4.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e) {
               if(jCheckBox4.isSelected()){
                   jCheckBox1.setEnabled(false);
                   jCheckBox2.setEnabled(false);
                   jCheckBox3.setEnabled(false);
                   
              
                   Character b='q';
                     try{
          send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
              //     System.out.println(b);
               }
               else{
                   jCheckBox1.setEnabled(true);
                   jCheckBox2.setEnabled(true);
                   jCheckBox3.setEnabled(true);
                   jCheckBox1.setSelected(false);
                   jCheckBox2.setSelected(false);
                   jCheckBox3.setSelected(false);
               }
            }

         });
        this.setVisible(true);
       
       try{
           connect();
       }
       catch(Exception ex){ex.printStackTrace();}
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton7 = new javax.swing.JRadioButton();
        jRadioButton9 = new javax.swing.JRadioButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setFocusTraversalPolicyProvider(true);
        setForeground(new java.awt.Color(140, 18, 18));
        setLocationByPlatform(true);
        setName("Power Management"); // NOI18N
        setResizable(false);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("Power Management"), this, org.jdesktop.beansbinding.BeanProperty.create("title"), "Power Control");
        bindingGroup.addBinding(binding);

        jPanel2.setBackground(new java.awt.Color(27, 61, 133));
        jPanel2.setName("jPanel2"); // NOI18N

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setName("jPanel1"); // NOI18N

        jRadioButton8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton8.setText("10 V");
        jRadioButton8.setToolTipText("select 10v o/p");
        jRadioButton8.setName("jRadioButton8"); // NOI18N

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton5.setText(" 8 V");
        jRadioButton5.setToolTipText("select 8v o/p");
        jRadioButton5.setName("jRadioButton5"); // NOI18N

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton3.setText(" 6 V");
        jRadioButton3.setToolTipText("select 6v o/p");
        jRadioButton3.setName("jRadioButton3"); // NOI18N

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton1.setText(" 5 V");
        jRadioButton1.setName("jRadioButton1"); // NOI18N

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jRadioButton1, org.jdesktop.beansbinding.ELProperty.create("select 5v o/p"), jRadioButton1, org.jdesktop.beansbinding.BeanProperty.create("toolTipText"));
        bindingGroup.addBinding(binding);

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton6.setText("18 V");
        jRadioButton6.setToolTipText("select 18v o/p");
        jRadioButton6.setName("jRadioButton6"); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Select The Voltage");
        jLabel1.setName("jLabel1"); // NOI18N

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton2.setText("12 V");
        jRadioButton2.setToolTipText("select 12v o/p");
        jRadioButton2.setName("jRadioButton2"); // NOI18N

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton4.setText("15 V");
        jRadioButton4.setToolTipText("select 15v o/p");
        jRadioButton4.setName("jRadioButton4"); // NOI18N

        jRadioButton7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton7.setText("24 V");
        jRadioButton7.setToolTipText("select 24v o/p");
        jRadioButton7.setName("jRadioButton7"); // NOI18N

        jRadioButton9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jRadioButton9.setText("Voltage Off");
        jRadioButton9.setName("jRadioButton9"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2))
                        .addGap(168, 168, 168)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton4))
                        .addGap(180, 180, 180)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jRadioButton5)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(237, 237, 237)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jRadioButton9)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton7)
                            .addComponent(jRadioButton8))
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton9)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton5)
                            .addComponent(jRadioButton8))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jRadioButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton7))))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel3.setName("jPanel3"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Select The Relay");
        jLabel2.setName("jLabel2"); // NOI18N

        jCheckBox2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox2.setText("Relay - 2");
        jCheckBox2.setToolTipText("on/off relay : 2");
        jCheckBox2.setName("jCheckBox2"); // NOI18N

        jCheckBox3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox3.setText("Relay - 3");
        jCheckBox3.setToolTipText("on/off relay : 3");
        jCheckBox3.setName("jCheckBox3"); // NOI18N

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox1.setText("Relay - 1");
        jCheckBox1.setToolTipText("on/off relay : 1");
        jCheckBox1.setName("jCheckBox1"); // NOI18N

        jCheckBox4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jCheckBox4.setText("Relay Off");
        jCheckBox4.setName("jCheckBox4"); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(jCheckBox2)
                .addGap(100, 100, 100)
                .addComponent(jCheckBox3)
                .addGap(235, 235, 235))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(268, 268, 268)
                .addComponent(jLabel2)
                .addGap(84, 84, 84)
                .addComponent(jCheckBox4)
                .addContainerGap(127, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jCheckBox4)))
                .addGap(58, 58, 58)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox3)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuBar1.setName("jMenuBar1"); // NOI18N

        jMenu1.setText("File");
        jMenu1.setName("jMenu1"); // NOI18N

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMenuItem1.setText("Refresh");
        jMenuItem1.setName("jMenuItem1"); // NOI18N
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");
        jMenu2.setName("jMenu2"); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        jMenuItem2.setText("About us..");
        jMenuItem2.setName("jMenuItem2"); // NOI18N
        jMenu2.add(jMenuItem2);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
    private javax.swing.ButtonGroup btngrp;

    public void actionPerformed(ActionEvent e) {



        if(!jCheckBox3.isSelected() && !jCheckBox2.isSelected() && jCheckBox1.isSelected()){
           jCheckBox4.setSelected(false);
           
           String b="i";
            try{
           send("echo "+b+b+" > /dev/tts/1 ");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
       }
       else if (!jCheckBox3.isSelected() && jCheckBox2.isSelected() && !jCheckBox1.isSelected()) {
           jCheckBox4.setSelected(false);
           
           Character b='j';
            try{
           send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
       }
       else if(!jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox1.isSelected()){
           jCheckBox4.setSelected(false);
                     Character b='l';
            try{
          send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
          // System.out.println(b);
       }
       else if (jCheckBox3.isSelected() && !jCheckBox2.isSelected() && !jCheckBox1.isSelected()) {
           jCheckBox4.setSelected(false);
           
          Character b='k';
            try{
           send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
       }
       else if(jCheckBox3.isSelected() && !jCheckBox2.isSelected() && jCheckBox1.isSelected()){
           jCheckBox4.setSelected(false);
           
            Character b='n';
            try{
           send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
       }
       else if (jCheckBox3.isSelected() && jCheckBox2.isSelected() && !jCheckBox1.isSelected()) {
           jCheckBox4.setSelected(false);
          
          Character b='m';
            try{
           send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
          // System.out.println(b);
       }
       else if(jCheckBox3.isSelected() && jCheckBox2.isSelected() && jCheckBox1.isSelected()){
           jCheckBox4.setSelected(false);
           
           Character b='o';
            try{
          send("echo " +b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
       }
        else if(!jCheckBox3.isSelected() && !jCheckBox2.isSelected() && !jCheckBox1.isSelected()){
           jCheckBox4.setSelected(true);
           
           Character b='q';
            try{
           send("echo "+b+b+ " > /dev/tts/1");
           }
           catch(Exception ex){
               ex.printStackTrace();
           }
           //System.out.println(b);
       }
    
      
    }
   
    public void connect()
			throws JSchException, IOException, Exception {
		ssh = new JSch();

                session = ssh.getSession("root","192.168.1.1",22);
		MyUserInfo ui = new MyUserInfo();
		
         
                ui.setPassword("raam");
		session.setUserInfo(ui);
		session.connect();
              
		channel =  session.openChannel("shell");
               
		
		PipedOutputStream po = new PipedOutputStream();
                fromServer = new PipedInputStream(po);
                channel.setOutputStream(po);

                toServer = new PipedOutputStream();
                PipedInputStream pi = new PipedInputStream(toServer);
                channel.setInputStream(pi);

		channel.connect();
		
	}
    public boolean isConnected() {
		
		return (channel != null && channel.isConnected());
	}

	public void disconnect() {
		if (isConnected()) {
			channel.disconnect();
                        session.disconnect();
		}

	}

	public void send(String command) throws IOException, JSchException, Exception {
		command += "; \n";
        
   
            
		toServer.write(command.getBytes());
                Thread.sleep(100);
                toServer.flush();
     
            }
     
}
 class MyUserInfo implements UserInfo {
		private String password;

		public void setPassword(String password) {
			this.password = "raam";

		}

		public String getPassphrase() {
	
			return null;
		}

		public String getPassword() {
			// TODO Auto-generated method stub
			return password;
		}

		public boolean promptPassword(String arg0) {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean promptPassphrase(String arg0) {
			// TODO Auto-generated method stub
			return true;
		}

		public boolean promptYesNo(String arg0) {
			// TODO Auto-generated method stub
			return true;
		}

		public void showMessage(String arg0) {
			// TODO Auto-generated method stub
			System.out.println(arg0);
		}

	}

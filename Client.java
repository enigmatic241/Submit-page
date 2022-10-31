package st.hello;

import java.rmi.RemoteException;
import java.util.Properties;
import javax.naming.*;
import javax.ejb.*;
import javax.rmi.PortableRemoteObject;

public class Client {
  private static final String JNDI_NAME = "st.hello";

  public static void main(String[] args) throws Exception 
  {
    String url       = "t3://localhost:7001";

    Properties h = new Properties();
    h.put(Context.INITIAL_CONTEXT_FACTORY,
        "weblogic.jndi.WLInitialContextFactory");
    h.put(Context.PROVIDER_URL, url);
    Context ctx = new InitialContext(h);

    // Lookup the beans home using JNDI
 
    Object home = ctx.lookup(JNDI_NAME);
    HelloHome hellohome = (HelloHome) PortableRemoteObject.narrow(home,HelloHome.class);

    Hello hello = hellohome.create();
 
    System.out.println(hello.sayHello("Srikanth"));
    
  }
  
  public Details() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(680, 250, 440, 347);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		setUndecorated(true);
		JButton btnHome = new JButton("Home");
		Image img = new ImageIcon(this.getClass().getResource("/home.png")).getImage();
		btnHome.setIcon(new ImageIcon(img));
		btnHome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				Home ob = new Home();
				ob.frame.setVisible(true);
			}
		});
		btnHome.setBounds(22, 22, 114, 25);
		contentPane.add(btnHome);
		
		JButton btnDonorDetails = new JButton("Donor Details");
		btnDonorDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				DisplayDonorDetails ob = new DisplayDonorDetails();
				ob.setVisible(true);
			}
		});
		btnDonorDetails.setBounds(145, 68, 153, 34);
		contentPane.add(btnDonorDetails);
		
		JButton btnReciepentDetails = new JButton("Recipient Details");
		btnReciepentDetails.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				DisplayReciepent ob = new DisplayReciepent();
				ob.setVisible(true);
			}
		});
		btnReciepentDetails.setBounds(145, 129, 153, 34);
		contentPane.add(btnReciepentDetails);
		
		JButton btnBloodStock = new JButton("Blood Stock");
		btnBloodStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				DisplayStock ob = new DisplayStock();
				ob.setVisible(true);
			}
		});
	  
	  	 char a = '5';
    		char b = 'c';

    // convert char variables to int
    // ASCII value of characters is assigned
    		int num1 = a;
    		int num2 = b;

    // print the values
   		System.out.println(num1);    // 53
    		System.out.println(num2);  
	  
		btnBloodStock.setBounds(145, 191, 153, 34);
		contentPane.add(btnBloodStock);
		
		JLabel lblNewLabel = new JLabel("");
		Image imges = new ImageIcon(this.getClass().getResource("/pulse.png")).getImage();
		lblNewLabel.setIcon(new ImageIcon(imges));
		lblNewLabel.setBounds(152, 251, 133, 81);
		contentPane.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(SystemColor.desktop, 3, true));
		panel.setBounds(12, 10, 416, 325);
		contentPane.add(panel);
	}

  
}

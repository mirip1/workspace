package ventanas;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.util.Objects;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {

  private static final long serialVersionUID = 1L;
  private JPanel contentPane;
  private JTextField textUsername;
  private JTextField textPassword;

  /**
   * Create the frame.
   */
  public Login() {
    setIconImage(Toolkit.getDefaultToolkit().getImage(Login.class.getResource("/resources/Spiderman.png")));
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(100, 100, 589, 445);
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

    setContentPane(contentPane);

    JLabel lblLogin = new JLabel("LOGIN");
    lblLogin.setHorizontalAlignment(SwingConstants.CENTER);
    lblLogin.setFont(new Font("Verdana", Font.BOLD, 22));
    contentPane.setLayout(new BorderLayout(0, 0));
    contentPane.add(lblLogin, BorderLayout.NORTH);

    JPanel panel = new JPanel();
    contentPane.add(panel, BorderLayout.CENTER);
    GridBagLayout gbl_panel = new GridBagLayout();
    gbl_panel.columnWidths = new int[] { 142, 43, 232, 134, 0 };
    gbl_panel.rowHeights = new int[] { 69, 0, 44, 15, 12, 44, 0, 0 };
    gbl_panel.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE };
    gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
    panel.setLayout(gbl_panel);
    Image imagenOriginal = new ImageIcon(Objects.requireNonNull(getClass().getResource("/resources/usuario_icon.png")))
        .getImage();

    ImageIcon imagenModificada = new ImageIcon(imagenOriginal.getScaledInstance(25, 25, Image.SCALE_SMOOTH));

    JLabel lblUsuario = new JLabel("  Nombre Usuario");
    lblUsuario.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
    lblUsuario.setHorizontalAlignment(SwingConstants.CENTER);
    GridBagConstraints gbc_lblUsuario = new GridBagConstraints();
    gbc_lblUsuario.anchor = GridBagConstraints.WEST;
    gbc_lblUsuario.fill = GridBagConstraints.VERTICAL;
    gbc_lblUsuario.insets = new Insets(0, 0, 5, 5);
    gbc_lblUsuario.gridx = 2;
    gbc_lblUsuario.gridy = 1;
    panel.add(lblUsuario, gbc_lblUsuario);

    JLabel lblIcon_Usuario = new JLabel("");
    lblIcon_Usuario.setIcon(new ImageIcon(Login.class.getResource("/resources/usuario_icon.png")));

    GridBagConstraints gbc_lblIcon_Usuario = new GridBagConstraints();
    gbc_lblIcon_Usuario.anchor = GridBagConstraints.WEST;
    gbc_lblIcon_Usuario.insets = new Insets(0, 0, 5, 5);
    gbc_lblIcon_Usuario.gridx = 1;
    gbc_lblIcon_Usuario.gridy = 2;
    panel.add(lblIcon_Usuario, gbc_lblIcon_Usuario);

    lblIcon_Usuario.setIcon(imagenModificada);

    textUsername = new JTextField();
    textUsername.setFont(new Font("Tahoma", Font.PLAIN, 15));
    GridBagConstraints gbc_textUsername = new GridBagConstraints();
    gbc_textUsername.insets = new Insets(0, 0, 5, 5);
    gbc_textUsername.fill = GridBagConstraints.BOTH;
    gbc_textUsername.gridx = 2;
    gbc_textUsername.gridy = 2;
    panel.add(textUsername, gbc_textUsername);
    textUsername.setColumns(10);

    JLabel lblContrasena = new JLabel("  Contraseña");
    lblContrasena.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 12));
    GridBagConstraints gbc_lblContrasena = new GridBagConstraints();
    gbc_lblContrasena.anchor = GridBagConstraints.WEST;
    gbc_lblContrasena.insets = new Insets(0, 0, 5, 5);
    gbc_lblContrasena.gridx = 2;
    gbc_lblContrasena.gridy = 4;
    panel.add(lblContrasena, gbc_lblContrasena);

    JLabel lblCandado_Icon = new JLabel("");
    lblCandado_Icon.setIcon(new ImageIcon(Login.class.getResource("/resources/candado_icon2.png")));
    GridBagConstraints gbc_lblCandado_Icon = new GridBagConstraints();
    gbc_lblCandado_Icon.anchor = GridBagConstraints.WEST;
    gbc_lblCandado_Icon.insets = new Insets(0, 0, 5, 5);
    gbc_lblCandado_Icon.gridx = 1;
    gbc_lblCandado_Icon.gridy = 5;
    panel.add(lblCandado_Icon, gbc_lblCandado_Icon);

    textPassword = new JTextField();
    textPassword.setFont(new Font("Tahoma", Font.PLAIN, 15));
    textPassword.setColumns(10);
    GridBagConstraints gbc_textPassword = new GridBagConstraints();
    gbc_textPassword.insets = new Insets(0, 0, 5, 5);
    gbc_textPassword.fill = GridBagConstraints.BOTH;
    gbc_textPassword.gridx = 2;
    gbc_textPassword.gridy = 5;
    panel.add(textPassword, gbc_textPassword);
  }
}

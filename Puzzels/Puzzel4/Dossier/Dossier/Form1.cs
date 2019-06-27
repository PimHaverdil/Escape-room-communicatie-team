using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Dossier
{
    public partial class Form1 : Form
    {

        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {
            WindowState = FormWindowState.Maximized;
            centerAll();
            btnDirect.Hide();
        }

        private void centerAll()
        {
            pictureBox1.Top = panel1.Top;
            pictureBox1.Left = panel1.Left + (panel1.Width / 2) - (pictureBox1.Width/2);
            panel3.Top = panel2.Top;
            panel3.Left = panel2.Left + (panel2.Width / 2) - (panel3.Width / 2);
            btnCode.Left = panel1.Right - (btnCode.Right/8);
        }

        private void btnCode_Click(object sender, EventArgs e)
        {
            if (textBox1.Text == "vsrabhocmp")
            {
                label1.BackColor = Color.Transparent;
                label2.BackColor = Color.Transparent;
                label3.BackColor = Color.Transparent;
                btnDirect.Show();
                label4.Text = "";
                textBox1.Text = "";
            }
            else
            {
                label4.Text = "Code geweigerd, probeer opnieuw!";
                label1.BackColor = Color.Black;
                label2.BackColor = Color.Black;
                label3.BackColor = Color.Black;
                btnDirect.Hide();
                textBox1.Text = "";
            }
            

        }

        private void btnDirect_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start(@"c:\");
            this.Close();
        }

    }
}

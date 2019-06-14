using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace @interface
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void btnSubmit_Click(object sender, EventArgs e)
        {
            if (txbWachtword.Text == "AgbTcEQvBUtmbODT")
            {
                this.Close();
            }
            if (txbWachtword.Text != "AgbTcEQvBUtmbODT")
            {
                MessageBox.Show("Wachtwoord onjuist. Probeer het nog een keer.");
                txbWachtword.Clear();
            }
        }

        private void lblFooter_Click(object sender, EventArgs e)
        {

        }
    }
}

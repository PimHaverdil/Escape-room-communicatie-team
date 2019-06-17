namespace @interface
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.pbOverheidLogo = new System.Windows.Forms.PictureBox();
            this.txbWachtword = new System.Windows.Forms.TextBox();
            this.btnSubmit = new System.Windows.Forms.Button();
            this.lblWachtwoord = new System.Windows.Forms.Label();
            this.pbFooter = new System.Windows.Forms.PictureBox();
            this.lblFooter = new System.Windows.Forms.Label();
            ((System.ComponentModel.ISupportInitialize)(this.pbOverheidLogo)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbFooter)).BeginInit();
            this.SuspendLayout();
            // 
            // pbOverheidLogo
            // 
            this.pbOverheidLogo.Anchor = System.Windows.Forms.AnchorStyles.Top;
            this.pbOverheidLogo.Image = ((System.Drawing.Image)(resources.GetObject("pbOverheidLogo.Image")));
            this.pbOverheidLogo.InitialImage = ((System.Drawing.Image)(resources.GetObject("pbOverheidLogo.InitialImage")));
            this.pbOverheidLogo.Location = new System.Drawing.Point(274, -7);
            this.pbOverheidLogo.Name = "pbOverheidLogo";
            this.pbOverheidLogo.Size = new System.Drawing.Size(332, 180);
            this.pbOverheidLogo.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pbOverheidLogo.TabIndex = 0;
            this.pbOverheidLogo.TabStop = false;
            // 
            // txbWachtword
            // 
            this.txbWachtword.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.txbWachtword.Font = new System.Drawing.Font("Calibri", 25.8F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.txbWachtword.Location = new System.Drawing.Point(240, 249);
            this.txbWachtword.Name = "txbWachtword";
            this.txbWachtword.PasswordChar = '*';
            this.txbWachtword.Size = new System.Drawing.Size(400, 60);
            this.txbWachtword.TabIndex = 1;
            // 
            // btnSubmit
            // 
            this.btnSubmit.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.btnSubmit.BackColor = System.Drawing.Color.White;
            this.btnSubmit.Location = new System.Drawing.Point(371, 315);
            this.btnSubmit.Name = "btnSubmit";
            this.btnSubmit.Size = new System.Drawing.Size(138, 45);
            this.btnSubmit.TabIndex = 2;
            this.btnSubmit.Text = "Submit";
            this.btnSubmit.UseVisualStyleBackColor = false;
            this.btnSubmit.Click += new System.EventHandler(this.btnSubmit_Click);
            // 
            // lblWachtwoord
            // 
            this.lblWachtwoord.Anchor = System.Windows.Forms.AnchorStyles.None;
            this.lblWachtwoord.AutoSize = true;
            this.lblWachtwoord.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblWachtwoord.Location = new System.Drawing.Point(317, 222);
            this.lblWachtwoord.Name = "lblWachtwoord";
            this.lblWachtwoord.Size = new System.Drawing.Size(246, 24);
            this.lblWachtwoord.TabIndex = 3;
            this.lblWachtwoord.Text = "Voer hier uw wachtwoord in";
            // 
            // pbFooter
            // 
            this.pbFooter.Anchor = System.Windows.Forms.AnchorStyles.Bottom;
            this.pbFooter.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(92)))), ((int)(((byte)(144)))));
            this.pbFooter.Location = new System.Drawing.Point(-1060, 499);
            this.pbFooter.Name = "pbFooter";
            this.pbFooter.Size = new System.Drawing.Size(3000, 87);
            this.pbFooter.TabIndex = 4;
            this.pbFooter.TabStop = false;
            // 
            // lblFooter
            // 
            this.lblFooter.Anchor = System.Windows.Forms.AnchorStyles.Bottom;
            this.lblFooter.AutoSize = true;
            this.lblFooter.BackColor = System.Drawing.Color.FromArgb(((int)(((byte)(0)))), ((int)(((byte)(92)))), ((int)(((byte)(144)))));
            this.lblFooter.Font = new System.Drawing.Font("Calibri", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.lblFooter.ForeColor = System.Drawing.SystemColors.Control;
            this.lblFooter.Location = new System.Drawing.Point(313, 534);
            this.lblFooter.Name = "lblFooter";
            this.lblFooter.Size = new System.Drawing.Size(255, 24);
            this.lblFooter.TabIndex = 5;
            this.lblFooter.Text = "Copyright © by Rijksoverheid";
            this.lblFooter.Click += new System.EventHandler(this.lblFooter_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(8F, 16F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.Color.White;
            this.ClientSize = new System.Drawing.Size(881, 582);
            this.Controls.Add(this.lblFooter);
            this.Controls.Add(this.pbFooter);
            this.Controls.Add(this.lblWachtwoord);
            this.Controls.Add(this.btnSubmit);
            this.Controls.Add(this.txbWachtword);
            this.Controls.Add(this.pbOverheidLogo);
            this.FormBorderStyle = System.Windows.Forms.FormBorderStyle.None;
            this.Name = "Form1";
            this.Text = "Form1";
            this.WindowState = System.Windows.Forms.FormWindowState.Maximized;
            this.Load += new System.EventHandler(this.Form1_Load);
            ((System.ComponentModel.ISupportInitialize)(this.pbOverheidLogo)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pbFooter)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.PictureBox pbOverheidLogo;
        private System.Windows.Forms.TextBox txbWachtword;
        private System.Windows.Forms.Button btnSubmit;
        private System.Windows.Forms.Label lblWachtwoord;
        private System.Windows.Forms.PictureBox pbFooter;
        private System.Windows.Forms.Label lblFooter;
    }
}


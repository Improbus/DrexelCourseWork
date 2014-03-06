namespace NGForms.FormGenerator.WinForms.Widgets
{
    partial class CheckboxWidget : FieldUserControlBase
    {
        private System.Windows.Forms.CheckedListBox checkedListBox1;
        private System.Windows.Forms.Label label1;

        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.checkedListBox1 = new System.Windows.Forms.CheckedListBox();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Font = new System.Drawing.Font("Lucida Sans Unicode", 12F, System.Drawing.FontStyle.Regular, System.Drawing.GraphicsUnit.Point, ((byte)(0)));
            this.label1.Location = new System.Drawing.Point(3, 2);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(105, 20);
            this.label1.TabIndex = 1;
            this.label1.Text = "Checkboxes";
            // 
            // checkedListBox1
            // 
            this.checkedListBox1.FormattingEnabled = true;
            this.checkedListBox1.Items.AddRange(new object[] {
            "Item 1",
            "Item 2"});
            this.checkedListBox1.Location = new System.Drawing.Point(7, 25);
            this.checkedListBox1.Name = "checkedListBox1";
            this.checkedListBox1.Size = new System.Drawing.Size(211, 34);
            this.checkedListBox1.TabIndex = 2;
            // 
            // CheckboxWidget
            // 
            this.Controls.Add(this.checkedListBox1);
            this.Controls.Add(this.label1);
            this.Name = "CheckboxWidget";
            this.Size = new System.Drawing.Size(550, 67);
            this.ResumeLayout(false);
            this.PerformLayout();
        }
    }
}

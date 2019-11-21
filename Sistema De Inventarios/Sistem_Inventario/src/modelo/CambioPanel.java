package modelo;

import javax.swing.JPanel;

public class CambioPanel 
{
	private JPanel container;
	private JPanel content;
	
	public CambioPanel(JPanel container, JPanel content)
	{
		this.container = container;
		this.content = content;
		this.container.removeAll();
        this.container.revalidate();
		
		this.container.add(this.content);
		this.container.revalidate();
	}
}

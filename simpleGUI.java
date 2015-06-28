import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextArea;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class simpleGUI extends JFrame {
	
	 JFrame doubleFrame;
	 TextArea list, sort, sort2;
	 Container JPane;
	
	public simpleGUI() {
		initialize();
	}
	
	
	private void initialize() {
		list = new TextArea();
		sort = new TextArea();
		sort2 = new TextArea();
		doubleFrame = new JFrame();
		doubleFrame.setSize(700,300);
		doubleFrame.setLocation(700,400);
		doubleFrame.setTitle("Hemel Kabir Project3");
		doubleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		doubleFrame.setLayout(new GridLayout(1,3));
		doubleFrame.setVisible(true);
		JPane = doubleFrame.getContentPane();
		JPane.add(list); 
		JPane.add(sort);
		JPane.add(sort2);
	}
	
	
	public void printlist(Baseplayer[] a, int size){
		list.append("Original data:\n\n");
		for(int k=0;k<size;k++){
			if(a[k]!=null){
                list.append(a[k].toString());
    }
    }
	}
	
	
	
	public void printsort(Baseplayer[] b, int size){
		sort.append("Fielder info:\n\n");
		sort2.append("Pitcher info:\n\n");
		for(int k=0;k<size;k++){
			if(b[k]!=null){
			if(b[k].toString().charAt(0)=='F'){
			if(b[k]!=null){
				sort.append(b[k].toString());
			}
			}
			else 
				if(b[k]!=null){
					sort2.append(b[k].toString());
}
}
}
}
}

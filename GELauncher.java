package frames;
import javax.swing.JFrame;
import javax.swing.JMenuBar;

import MenuBar.MenuBar;//마찬가지로 import -> 같은 패키지가 아니므로

public class GELauncher { //메인을 품는 클래스 별의미는 없다.
		
	public static void main(String args[]){
		GEMainFrame frame = GEMainFrame.getInstance(); // 앞서 GEMainFrame에서 언급했는데 getInstance()메소드는 new와 같은 역활을한다. 아무래도 이런식이 뭔가 더 캡슐화 되어있다는 느낌을 받는다. 왠진 모르겠지만 
		frame.init();// 초기화함 너비와 높이 그리고 프레임의 제목까지
		
		
	}

}

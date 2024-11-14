package parkingSystem; 

import java.awt.EventQueue; 
import javax.swing.*; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.border.EmptyBorder; 
import javax.swing.JButton; 
import java.awt.event.MouseAdapter; 
import java.awt.event.MouseEvent; 
import java.sql.PreparedStatement; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import javax.swing.JTextField; 
import java.awt.Font; 

public class ParkingSystemGUI extends JFrame { 
 
	private ParkingDBController PDC; 
 
	private int max_length; 
	private int vehicle_type; 
	private CarInformation currentCarInformation; 
	private static final long serialVersionUID = 1L; 
	private JPanel contentPane; 
	private JTextField textField; 
	private JLabel labelSedanCount; 
	private JLabel labelSuvCount; 
	private JLabel labelSedanCount_1; 
	private JLabel labelSuvCount_1; 
    
	private JTextField txtAutoParkingSystem; 
	JFrame JFrame = new JFrame(); 
    
	/** 
	 * Launch the application. 
	 */ 
	public static void main(String[] args) { 
		EventQueue.invokeLater(new Runnable() { 
			public void run() { 
				try { 
					ParkingSystemGUI frame = new ParkingSystemGUI(); 
					frame.setVisible(true); 
				} catch (Exception e) { 
					e.printStackTrace(); 
				} 
			} 
		}); 
	} 
 
   /** 
    * Create the frame. 
    */ 
 
	public ParkingSystemGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 700, 500); 
		contentPane = new JPanel(); 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5)); 
		setContentPane(contentPane); 
		contentPane.setLayout(null); 
		
		PDC = new ParkingDBController(); 
		PDC.startConnection(); 
		currentCarInformation = new CarInformation("", ""); 
		
		JButton button_insert_1 = new JButton("1"); 
		button_insert_1.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_1.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) {
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "1"); 
			} 
		}); 
		button_insert_1.setBounds(305, 118, 97, 46); 
		contentPane.add(button_insert_1); 
		
		JButton button_insert_2 = new JButton("2"); 
		button_insert_2.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_2.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "2"); 
			} 
		}); 
		button_insert_2.setBounds(414, 118, 97, 46); 
		contentPane.add(button_insert_2); 
		
		JButton button_insert_3 = new JButton("3"); 
		button_insert_3.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_3.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "3"); 
			} 
		}); 
		button_insert_3.setBounds(523, 118, 97, 46); 
		contentPane.add(button_insert_3); 
		
		JButton button_insert_4 = new JButton("4"); 
		button_insert_4.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_4.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "4");
			} 
		}); 
		button_insert_4.setBounds(305, 174, 97, 46); 
		contentPane.add(button_insert_4); 
		
		JButton button_insert_5 = new JButton("5"); 
		button_insert_5.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_5.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "5"); 
			} 
		}); 
		button_insert_5.setBounds(414, 174, 97, 46); 
		contentPane.add(button_insert_5); 
		
		JButton button_insert_6 = new JButton("6"); 
		button_insert_6.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_6.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "6"); 
			} 
		}); 
		button_insert_6.setBounds(523, 174, 97, 46); 
		contentPane.add(button_insert_6); 
		
		JButton button_insert_7 = new JButton("7"); 
		button_insert_7.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_7.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "7"); 
			} 
		}); 
		button_insert_7.setBounds(305, 230, 97, 46); 
		contentPane.add(button_insert_7); 
		
		JButton button_insert_8 = new JButton("8"); 
		button_insert_8.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_8.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "8"); 
			} 
		}); 
		button_insert_8.setBounds(414, 230, 97, 46); 
		contentPane.add(button_insert_8); 
		
		JButton button_insert_9 = new JButton("9"); 
		button_insert_9.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_9.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "9"); 
			} 
		}); 
		button_insert_9.setBounds(523, 230, 97, 46); 
		contentPane.add(button_insert_9); 
		
		JButton button_insert_0 = new JButton("0"); 
		button_insert_0.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_insert_0.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				length_check(textField.getText()); 
				if (max_length == 0) 
					textField.setText(textField.getText() + "0"); 
			} 
		}); 
		button_insert_0.setBounds(414, 286, 97, 46); 
		contentPane.add(button_insert_0); 
		
		JButton button_enter = new JButton("입고"); 
		button_enter.setFont(new Font("맑은 고딕", Font.BOLD, 20)); 
		button_enter.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				if (textField.getText().length() == 4) { 
					// 차량 정보를 설정 
					setCarNumber(textField.getText()); 
					setCarType(vehicle_type_check()); 
					
					// 	데이터베이스에 정보 전송 
					vehicle_info_send(); 
				} 
			} 
		}); 
		button_enter.setBounds(196, 286, 97, 102); 
		contentPane.add(button_enter); 
		
		JButton button_enter_1 = new JButton("출고"); 
		button_enter_1.setFont(new Font("맑은 고딕", Font.BOLD, 20)); 
		button_enter_1.addMouseListener(new MouseAdapter() { 
			@Override 
			public void mouseClicked(MouseEvent e) { 
				String carNumber = textField.getText(); 
				if (carNumber.length() == 4) { 
					// 	출고 처리 
					releaseCar(carNumber); 
				} 
				else { 
					JOptionPane.showMessageDialog(JFrame, "차량번호를 정확히 입력하세요."); 
				} 
			} 
		}); 
		button_enter_1.setBounds(60, 286, 97, 102); 
		contentPane.add(button_enter_1); 
		
		JButton button_clear = new JButton("지우기"); 
		button_clear.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		button_clear.addMouseListener(new MouseAdapter() {	   
			@Override 
			public void mouseClicked(MouseEvent e) { 
				textField.setText(null); 
				length_check(textField.getText()); 
			} 
		}); 
		button_clear.setBounds(523, 286, 97, 46); 
		contentPane.add(button_clear); 
		
		JRadioButton vehicle_type_1_radio = new JRadioButton("SEDAN"); 
		vehicle_type_1_radio.setFont(new Font("맑은 고딕", Font.BOLD, 16)); 
		vehicle_type_1_radio.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				vehicle_type = 0; 
			} 
		}); 
		vehicle_type_1_radio.setSelected(true); 
		vehicle_type_1_radio.setHorizontalAlignment(SwingConstants.LEFT); 
		vehicle_type_1_radio.setBounds(60, 197, 91, 46); 
		contentPane.add(vehicle_type_1_radio); 
		
		JRadioButton vehicle_type_2_radio = new JRadioButton("SUV"); 
		vehicle_type_2_radio.setFont(new Font("맑은 고딕", Font.BOLD, 16)); 
		vehicle_type_2_radio.addActionListener(new ActionListener() { 
			public void actionPerformed(ActionEvent e) { 
				vehicle_type = 1; 
			} 
		}); 
		
		JButton buttonShowStatus = new JButton("주차 상황 조회"); 
		buttonShowStatus.setFont(new Font("맑은 고딕", Font.BOLD, 14)); 
		buttonShowStatus.setBounds(305, 342, 315, 46); 
		contentPane.add(buttonShowStatus); 
		
		labelSedanCount = new JLabel("SEDAN 주차 자리: 0"); 
		labelSedanCount.setFont(new Font("맑은 고딕", Font.BOLD, 12)); 
		labelSedanCount.setBounds(60, 86, 160, 30); 
		contentPane.add(labelSedanCount); 
		
		labelSuvCount = new JLabel("SUV 주차 자리: 0"); 
		labelSuvCount.setFont(new Font("맑은 고딕", Font.BOLD, 12)); 
		labelSuvCount.setBounds(60, 146, 160, 30); 
		contentPane.add(labelSuvCount); 
		
		labelSedanCount_1 = new JLabel("SEDAN 주차 순번:"); 
		labelSedanCount_1.setFont(new Font("맑은 고딕", Font.BOLD, 12)); 
		labelSedanCount_1.setBounds(12, 391, 660, 30); 
		contentPane.add(labelSedanCount_1); 
		labelSuvCount_1 = new JLabel("SEDAN 주차 순번:"); 
		labelSuvCount_1.setFont(new Font("맑은 고딕", Font.BOLD, 12)); 
		labelSuvCount_1.setBounds(12, 421, 660, 30); 
		contentPane.add(labelSuvCount_1); 
		
		// 주차 상황 조회 버튼의 액션 리스너 등록 
		buttonShowStatus.addActionListener(new ActionListener() { 
			@Override 
			public void actionPerformed(ActionEvent e) { 
				showParkingStatus(); 
			} 
		}); 
		
		vehicle_type_2_radio.setSelected(true); 
		vehicle_type_2_radio.setHorizontalAlignment(SwingConstants.LEFT); 
		vehicle_type_2_radio.setBounds(196, 197, 91, 46); 
		contentPane.add(vehicle_type_2_radio); 
		
		ButtonGroup group = new ButtonGroup(); 
		group.add(vehicle_type_1_radio); 
		group.add(vehicle_type_2_radio); 
		
		textField = new JTextField(); 
		textField.setHorizontalAlignment(SwingConstants.CENTER); 
		textField.setText("차량번호 입력"); 
		textField.setFont(new Font("맑은 고딕", Font.BOLD, 20)); 
		textField.setEditable(false); 
		textField.setBounds(305, 62, 315, 46); 
		contentPane.add(textField); 
		textField.setColumns(10); 
		
		txtAutoParkingSystem = new JTextField(); 
		txtAutoParkingSystem.setEditable(false); 
		txtAutoParkingSystem.setHorizontalAlignment(SwingConstants.CENTER); 
		txtAutoParkingSystem.setText("AUTO PARKING SYSTEM"); 
		txtAutoParkingSystem.setFont(new Font("맑은 고딕", Font.BOLD, 24)); 
		txtAutoParkingSystem.setBounds(60, 10, 560, 42); 
		contentPane.add(txtAutoParkingSystem); 
		txtAutoParkingSystem.setColumns(10); 
	 }
	
     public void setCarNumber(String carNumber) { 
         currentCarInformation.setCarNumber(carNumber); 
     } 
   
     public void setCarType(String carType) { 
         currentCarInformation.setCarType(carType); 
     } 
   
     public String getCarNumber() { 
         return currentCarInformation.getCarNumber(); 
     } 
   
     public String getCarType() { 
         return currentCarInformation.getCarType(); 
     }
     
     private void showParkingStatus() { 
    	 int sedanCount = getParkedCarCount("SEDAN"); 
    	 int suvCount = getParkedCarCount("SUV"); 
   
    	 String sedanInfoText = "없음"; 
    	 String suvInfoText = "없음";
    	 if (sedanCount > 0) { 
             sedanInfoText = getParkedCarInfo("SEDAN"); 
         } 
     
         if (suvCount > 0) { 
             suvInfoText = getParkedCarInfo("SUV"); 
         } 
     
         labelSedanCount_1.setText("SEDAN 주차 순번: " + sedanInfoText); 
         labelSuvCount_1.setText("SUV 주차 순번: " + suvInfoText); 
     
         labelSedanCount.setText("SEDAN 주차 자리: " + sedanCount + "/" + "15"); 
         labelSuvCount.setText("SUV 주차 자리: " + suvCount + "/" + "5"); 
     } 
   
     public void length_check(String car_num) { 
    	 if (car_num.length() == 4) { 
    		 max_length = 1; 
    	 } 
    	 else { 
    		 max_length = 0; 
    	 } 
   
    	 if (textField.getText().equals("차량번호 입력")) { 
    		 textField.setText(null); 
    	 } 
    	 else if (textField.getText().isEmpty()) { 
    		 textField.setText("차량번호 입력"); 
    	 } 
     } 
   
     public String vehicle_type_check() {    	 
    	 String segment = null; 
    	 switch (vehicle_type) { 
    	 case 0: { 
    		 segment = "SEDAN"; 
    		 break; 
    	 } 
    	 case 1: { 
    		 segment = "SUV"; 
    		 break; 
    	 } 
    	 } 
    	 return segment; 
     } 
      
     public void vehicle_info_send() { 
    	 String carNumber = getCarNumber(); 
    	 String carType = getCarType(); 
    	 
    	 if (isCarParked(carNumber)) { 
    		 JOptionPane.showMessageDialog(JFrame, carNumber + "번 차량은 이미 주차되어 있습니다."); 
    		 return; // 주차 처리를 중단 
    	 } 
   
    	 // 주차 가능 여부 확인 
    	 if (canParkCar(carType)) { 
    		 // 주차 가능하면 데이터베이스에 정보 전송 
    		 String sql = "INSERT INTO CarInformation VALUES('" + carNumber + "', '" + carType + "')"; 
    		 PDC.ExeQry(sql);    
    	 } 
   
    	 // 주차 가능 여부 확인 
    	 if (canParkCar(carType)) { 
    		 // 주차 가능하면 데이터베이스에 정보 전송 
    		 String sql = "INSERT INTO CarInformation VALUES('" + carNumber + "', '" + carType + "')"; 
    		 PDC.ExeQry(sql); 
            
    		 updateParkingStatus(carType, true); 
   
    		 JOptionPane.showMessageDialog(JFrame, carNumber + "번 " + carType + "이(가) 주차되었습니다."); 
            
    		 if ("SEDAN".equals(carType) && getParkedCarCount("SEDAN") == 15) { 
    			 updateParkingStatus("SUV", true); 
    		 } 
    	 } 
    	 else { 
    		 JOptionPane.showMessageDialog(JFrame, carType + " 주차 공간이 부족하여 주차할 수 없습니다."); 
    	 } 
     } 
      
     private int getParkedCarCount(String carType) { 
    	 try { 
    		 String sql = "SELECT COUNT(*) AS totalCount FROM CarInformation WHERE carType = ?"; 
            
    		 PreparedStatement pstmt = PDC.con.prepareStatement(sql); 
    		 pstmt.setString(1, carType); 
            
    		 ResultSet rs = pstmt.executeQuery(); 
            
    		 if (rs.next()) { 
    			 return rs.getInt("totalCount"); 
    		 } 
    	 } catch (SQLException e) { 
    		 e.printStackTrace(); 
    	 } 
    	 
    	 return -1; 
     } 
      	
     private boolean isCarParked(String carNumber) { 
    	 try { 
    		 String sql = "SELECT * FROM CarInformation WHERE carNumber = ?"; 
            
    		 PreparedStatement pstmt = PDC.con.prepareStatement(sql); 
    		 pstmt.setString(1, carNumber); 
    		 
    		 ResultSet rs = pstmt.executeQuery(); 
    		 
    		 return rs.next(); // 결과가 있으면 차량이 주차되어 있음을 의미 
    	 } catch (SQLException e) { 
      
    		 e.printStackTrace(); 
    		 return false; 
    	 } 
     } 
      
     private void releaseCar(String carNumber) { 
    	 try { 
    		 // 해당 차량이 존재하는지 확인 
    		 if (isCarParked(carNumber)) { 
    			 String sql = "DELETE FROM CarInformation WHERE carNumber = ?"; 
    			 
    			 PreparedStatement pstmt = PDC.con.prepareStatement(sql); 
    			 pstmt.setString(1, carNumber); 
                
    			 pstmt.executeUpdate(); 
                
    			 JOptionPane.showMessageDialog(JFrame, carNumber + "번 차량이 출고되었습니다."); 
    		 } 
    		 else { 
    			 JOptionPane.showMessageDialog(JFrame, carNumber + "번 차량은 주차되어 있지 않습니다."); 
    		 } 
            
    	 } catch (SQLException e) { 
    		 e.printStackTrace(); 
    	 } 
     } 
   
     private boolean canParkCar(String carType) { 
    	 int maxSedanParking = 15; 
    	 int maxSuvParking = 5; 
   
    	 int parkedSedanCount = getParkedCarCount("SEDAN"); 
    	 int parkedSuvCount = getParkedCarCount("SUV"); 
   
    	 if ("SEDAN".equals(carType) && parkedSedanCount < maxSedanParking) { 
    		 return true; 
    	 } 
    	 else if ("SUV".equals(carType) && parkedSuvCount < maxSuvParking) { 
    		 return true; 
    	 } 
    	 else if ("SEDAN".equals(carType) && parkedSedanCount == maxSedanParking && 
    			 parkedSuvCount < maxSuvParking) { 
    		 return true; 
    	 } 
   
    	 return false; 
     } 
      
     private void updateParkingStatus(String carType, boolean parked) { 
    	 try { 
    		 String countQuery = "SELECT COUNT(*) AS totalCount FROM CarInformation WHERE carType = ?"; 
    		 PreparedStatement countStmt = PDC.con.prepareStatement(countQuery); 

    		 countStmt.setString(1, carType); 
    		 ResultSet countResult = countStmt.executeQuery(); 
   
    		 int totalCount = countResult.getInt("totalCount"); 
   
    		 String updateQuery = "UPDATE ParkingStatus SET parkedCount = ? WHERE carType = ?"; 
    		 PreparedStatement updateStmt = PDC.con.prepareStatement(updateQuery); 
    		 updateStmt.setInt(1, parked ? totalCount : totalCount - 1); // 주차 또는 출고에 따라 업데이트 
    		 updateStmt.setString(2, carType); 
    		 updateStmt.executeUpdate(); 
    	 } catch (SQLException e) { 
    		 e.printStackTrace(); 
    	 } 
     } 
      
     private String getParkedCarInfo(String carType) { 
    	 try { 
    		 String query = "SELECT carNumber FROM CarInformation WHERE carType = ?"; 
    		 PreparedStatement stmt = PDC.con.prepareStatement(query); 
    		 stmt.setString(1, carType); 
    		 ResultSet result = stmt.executeQuery(); 
   
    		 StringBuilder carInfo = new StringBuilder(); 
    		 while (result.next()) { 
    			 carInfo.append(result.getString("carNumber")).append(", "); 
    		 } 
   
    		 if (carInfo.length() > 0) { 
    			 carInfo.delete(carInfo.length() - 2, carInfo.length()); 
    		 } 
   
    		 return carInfo.toString(); 
    	 } catch (SQLException e) { 
    		 e.printStackTrace(); 
    		 return ""; 
    	 } 
     } 
} 

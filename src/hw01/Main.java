package hw01;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int  select,select1;
		ArrayList <Student> Stu =new ArrayList<Student>();
		Stu.add(new Student("學生a","01","a1@gmail.com"));
		Stu.add(new Student("學生b","02","ab12@gmail.com"));
		Stu.add(new Student("學生c","03","abc123@gmail.com"));
		ArrayList <Staff> Stf =new ArrayList<Staff>();
		Stf.add(new Staff("01","職員A","男","經理"));
		Stf.add(new Staff("02","職員B","男","員工"));
		Stf.add(new Staff("03","職員C","女","員工"));
		ArrayList <Teacher> Tch =new ArrayList<Teacher>();
		Tch.add(new Teacher("01","教師X","教授","abc@gmail.com"));
		Tch.add(new Teacher("02","教師Y","副教授","abc@gmail.com"));
		Tch.add(new Teacher("03","教師Z","圖書委員","abc@gmail.com"));
		while(true){
			System.out.println("1.職員管理系統");
			System.out.println("2.教職員管理系統");
			System.out.println("3.學生管理系統");
			System.out.println("4.離開");
			try{
				select=scn.nextInt();
			}catch(Exception e){
				System.out.println("請輸入數字1~4");
				continue;
			}
			//Staff
			if(select==1){
				System.out.println("歡迎使用職員管理系統");
				while(true){
					System.out.println("1.新增");
					System.out.println("2.修改");
					System.out.println("3.刪除");
					System.out.println("4.檢視");
					System.out.println("5.離開");
					select1=scn.nextInt();
					if(select1==1){
						System.out.println("請輸入職員:編號|姓名|性別|職位");
						try{
							Stf.add(new Staff(scn.next(),scn.next(),scn.next(),scn.next()));
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==2){
						System.out.println("請輸入修改職員編號:");
						try{
							String id=scn.next();
							for(int i=0;i<Stf.size();i++){
								if(id.equals(Stf.get(i).getId())){
									System.out.println("請輸入姓名|性別|職位:");
									Stf.get(i).setName(scn.next());
									Stf.get(i).setSex(scn.next());
									Stf.get(i).setPosition(scn.next());
									break;
								}
							}
							System.out.println("修改成功");
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==3){
						System.out.println("請輸入刪除職員編號:");
						try{
							String id=scn.next();
							for(int i=0;i<Stf.size();i++){
								if(id.equals(Stf.get(i).getId())){
									Stu.remove(i);
									break;
								}
							}
							System.out.println("刪除成功");
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==4){
						System.out.println("職員編號\t職員姓名\t職員性別\t職員職位");
						for(int i=0;i<Stf.size();i++){
							Stf.get(i).showInfo();
						}
					}else if(select==5){
						break;
					}
				}
				
			//Student
			}else if(select==2){
				System.out.println("歡迎使用學生管理系統");
				while(true){
					System.out.println("1.新增");
					System.out.println("2.修改");
					System.out.println("3.刪除");
					System.out.println("4.檢視");
					System.out.println("5.離開");
					select1=scn.nextInt();
					//Staff
					if(select1==1){
						System.out.println("請輸入學生:姓名|學號|E-MAIL");
						try{
							Stu.add(new Student(scn.next(),scn.next(),scn.next()));
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==2){
						System.out.println("請輸入修改職員編號:");
						try{
							String id=scn.next();
							for(int i=0;i<Stu.size();i++){
								if(id.equals(Stu.get(i).getid())){
									System.out.println("請輸入姓名|學號|E-MAIL:");
									Stu.get(i).setname(scn.next());
									Stu.get(i).setid(scn.next());
									Stu.get(i).setemail(scn.next());
									break;
								}
							}
							System.out.println("修改成功");
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==3){
						System.out.println("請輸入刪除學生編號:");
						try{
							String id=scn.next();
							for(int i=0;i<Stu.size();i++){
								if(id.equals(Stu.get(i).getid())){
									Stu.remove(i);
									break;
								}
							}
							System.out.println("刪除成功");
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==4){
						for(int i=0;i<Stu.size();i++){
							Stu.get(i).showAll();
						}
					}else if(select==5){
						break;
					}
				}
				
				
				
			//Teacher	
			}else if(select==3){
				System.out.println("歡迎使用教師管理系統");
				while(true){
					System.out.println("1.新增");
					System.out.println("2.修改");
					System.out.println("3.刪除");
					System.out.println("4.檢視");
					System.out.println("5.離開");
					select1=scn.nextInt();
					//Staff
					if(select1==1){
						System.out.println("請輸入教師:教師編號|姓名|職位|E-MAIL");
						try{
							Tch.add(new Teacher(scn.next(),scn.next(),scn.next(),scn.next()));
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==2){
						System.out.println("請輸入修改教師編號:");
						try{
							String id=scn.next();
							for(int i=0;i<Tch.size();i++){
								if(id.equals(Tch.get(i).getId())){
									System.out.println("請輸入教師:教師編號|姓名|職位|E-MAIL:");
									Tch.get(i).setName(scn.next());
									Tch.get(i).setId(scn.next());
									Tch.get(i).setEmail(scn.next());
									break;
								}
							}
							System.out.println("修改成功");
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==3){
						System.out.println("請輸入刪除學生編號:");
						try{
							String id=scn.next();
							for(int i=0;i<Tch.size();i++){
								if(id.equals(Tch.get(i).getId())){
									Tch.remove(i);
									break;
								}
							}
							System.out.println("刪除成功");
						}catch(Exception e){
							System.out.println("輸入資料錯誤");
						}
					}else if(select1==4){
						System.out.println("教師編號\t姓名\t職位\t電子郵件");
						for(int i=0;i<Tch.size();i++){
							Tch.get(i).show();
						}
					}else if(select==5){
						break;
					}
				}
				

			}else if(select==4){
				System.out.println("謝謝使用");
				break;
			}else{
				System.out.println("請輸入數字1~4");
				continue;
			}
		}
	}
}

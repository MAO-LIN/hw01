package hw01;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int  select,select1;
		ArrayList <Student> Stu =new ArrayList<Student>();
		Stu.add(new Student("�ǥ�a","01","a1@gmail.com"));
		Stu.add(new Student("�ǥ�b","02","ab12@gmail.com"));
		Stu.add(new Student("�ǥ�c","03","abc123@gmail.com"));
		ArrayList <Staff> Stf =new ArrayList<Staff>();
		Stf.add(new Staff("01","¾��A","�k","�g�z"));
		Stf.add(new Staff("02","¾��B","�k","���u"));
		Stf.add(new Staff("03","¾��C","�k","���u"));
		ArrayList <Teacher> Tch =new ArrayList<Teacher>();
		Tch.add(new Teacher("01","�ЮvX","�б�","abc@gmail.com"));
		Tch.add(new Teacher("02","�ЮvY","�Ʊб�","abc@gmail.com"));
		Tch.add(new Teacher("03","�ЮvZ","�Ϯѩe��","abc@gmail.com"));
		while(true){
			System.out.println("1.¾���޲z�t��");
			System.out.println("2.��¾���޲z�t��");
			System.out.println("3.�ǥͺ޲z�t��");
			System.out.println("4.���}");
			try{
				select=scn.nextInt();
			}catch(Exception e){
				System.out.println("�п�J�Ʀr1~4");
				continue;
			}
			//Staff
			if(select==1){
				System.out.println("�w��ϥ�¾���޲z�t��");
				while(true){
					System.out.println("1.�s�W");
					System.out.println("2.�ק�");
					System.out.println("3.�R��");
					System.out.println("4.�˵�");
					System.out.println("5.���}");
					select1=scn.nextInt();
					if(select1==1){
						System.out.println("�п�J¾��:�s��|�m�W|�ʧO|¾��");
						try{
							Stf.add(new Staff(scn.next(),scn.next(),scn.next(),scn.next()));
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==2){
						System.out.println("�п�J�ק�¾���s��:");
						try{
							String id=scn.next();
							for(int i=0;i<Stf.size();i++){
								if(id.equals(Stf.get(i).getId())){
									System.out.println("�п�J�m�W|�ʧO|¾��:");
									Stf.get(i).setName(scn.next());
									Stf.get(i).setSex(scn.next());
									Stf.get(i).setPosition(scn.next());
									break;
								}
							}
							System.out.println("�ק令�\");
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==3){
						System.out.println("�п�J�R��¾���s��:");
						try{
							String id=scn.next();
							for(int i=0;i<Stf.size();i++){
								if(id.equals(Stf.get(i).getId())){
									Stu.remove(i);
									break;
								}
							}
							System.out.println("�R�����\");
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==4){
						System.out.println("¾���s��\t¾���m�W\t¾���ʧO\t¾��¾��");
						for(int i=0;i<Stf.size();i++){
							Stf.get(i).showInfo();
						}
					}else if(select==5){
						break;
					}
				}
				
			//Student
			}else if(select==2){
				System.out.println("�w��ϥξǥͺ޲z�t��");
				while(true){
					System.out.println("1.�s�W");
					System.out.println("2.�ק�");
					System.out.println("3.�R��");
					System.out.println("4.�˵�");
					System.out.println("5.���}");
					select1=scn.nextInt();
					//Staff
					if(select1==1){
						System.out.println("�п�J�ǥ�:�m�W|�Ǹ�|E-MAIL");
						try{
							Stu.add(new Student(scn.next(),scn.next(),scn.next()));
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==2){
						System.out.println("�п�J�ק�¾���s��:");
						try{
							String id=scn.next();
							for(int i=0;i<Stu.size();i++){
								if(id.equals(Stu.get(i).getid())){
									System.out.println("�п�J�m�W|�Ǹ�|E-MAIL:");
									Stu.get(i).setname(scn.next());
									Stu.get(i).setid(scn.next());
									Stu.get(i).setemail(scn.next());
									break;
								}
							}
							System.out.println("�ק令�\");
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==3){
						System.out.println("�п�J�R���ǥͽs��:");
						try{
							String id=scn.next();
							for(int i=0;i<Stu.size();i++){
								if(id.equals(Stu.get(i).getid())){
									Stu.remove(i);
									break;
								}
							}
							System.out.println("�R�����\");
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
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
				System.out.println("�w��ϥαЮv�޲z�t��");
				while(true){
					System.out.println("1.�s�W");
					System.out.println("2.�ק�");
					System.out.println("3.�R��");
					System.out.println("4.�˵�");
					System.out.println("5.���}");
					select1=scn.nextInt();
					//Staff
					if(select1==1){
						System.out.println("�п�J�Юv:�Юv�s��|�m�W|¾��|E-MAIL");
						try{
							Tch.add(new Teacher(scn.next(),scn.next(),scn.next(),scn.next()));
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==2){
						System.out.println("�п�J�ק�Юv�s��:");
						try{
							String id=scn.next();
							for(int i=0;i<Tch.size();i++){
								if(id.equals(Tch.get(i).getId())){
									System.out.println("�п�J�Юv:�Юv�s��|�m�W|¾��|E-MAIL:");
									Tch.get(i).setName(scn.next());
									Tch.get(i).setId(scn.next());
									Tch.get(i).setEmail(scn.next());
									break;
								}
							}
							System.out.println("�ק令�\");
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==3){
						System.out.println("�п�J�R���ǥͽs��:");
						try{
							String id=scn.next();
							for(int i=0;i<Tch.size();i++){
								if(id.equals(Tch.get(i).getId())){
									Tch.remove(i);
									break;
								}
							}
							System.out.println("�R�����\");
						}catch(Exception e){
							System.out.println("��J��ƿ��~");
						}
					}else if(select1==4){
						System.out.println("�Юv�s��\t�m�W\t¾��\t�q�l�l��");
						for(int i=0;i<Tch.size();i++){
							Tch.get(i).show();
						}
					}else if(select==5){
						break;
					}
				}
				

			}else if(select==4){
				System.out.println("���¨ϥ�");
				break;
			}else{
				System.out.println("�п�J�Ʀr1~4");
				continue;
			}
		}
	}
}

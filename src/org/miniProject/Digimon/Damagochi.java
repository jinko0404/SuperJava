package org.miniProject.Digimon;

import java.util.Scanner;

public class Damagochi {

	public static void main(String[] args) {
		MyDigimon mon = new MyDigimon();
		int choice = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("========================디지몬 다마고치========================");
		System.out.print("1.알 분양받기   ");
		System.out.println("2.게임 종료");
		System.out.print(">>");
			choice = sc.nextInt();
			while(true) {
				if(choice == 1) {
					System.out.println("디지몬 알 종류를 선택해주세요");
					System.out.println("1. 공룡 데이터 알");
					System.out.println("2. 숲 데이터 알");
					System.out.println("3. 천사형 데이터 알");
					System.out.print(">>");
					choice = sc.nextInt();
					if(choice == 1) {//선택지에 따른 디지몬 생성
						mon.name = "깜몬";
						mon.Generation = "유아기";
						mon.eatgauge = 100;
						mon.training = 0;
						mon.win = 0;
						mon.lose = 0;
						mon.speed = 3;
						mon.HP = 30;
						mon.power = 5;
						mon.defense = 5;
						System.out.println("알에서 " + mon.name + "이 탄생했습니다 축하합니다!");
						break;
					}
					else if(choice == 2) {//선택지에 따른 디지몬 생성
						mon.name = "새싹몬";
						mon.Generation = "유아기";
						mon.eatgauge = 100;
						mon.training = 0;
						mon.win = 0;
						mon.lose = 0;
						mon.speed = 3;
						mon.HP = 30;
						mon.power = 5;
						mon.defense = 5;
						System.out.println("알에서 " + mon.name + "이 탄생했습니다 축하합니다!");
						break;
					}
					else if(choice == 3) {//선택지에 따른 디지몬 생성
						mon.name = "하얀몬";
						mon.Generation = "유아기";
						mon.eatgauge = 100;
						mon.training = 0;
						mon.win = 0;
						mon.lose = 0;
						mon.speed = 3;
						mon.HP = 30;
						mon.power = 5;
						mon.defense = 5;
						System.out.println("알에서 " + mon.name + "이 탄생했습니다 축하합니다!");
						break;
					}
					else {//선택지외 번호 선택시 오류 처리
						System.out.println("잘못된 번호입니다 다시 선택해주세요.");
					}
				}
				else {
					System.out.println("게임을 종료합니다.");
					System.exit(0);
				}
			}
			while(true) {
				mon.checkEvolutionConditions();
				if(mon.checkDeath()) {
					break;
				}
				System.out.println("========================디지몬 다마고치========================");
				System.out.println("1.먹이 먹기");
				System.out.println("2.디지몬 정보보기");
				System.out.println("3.전투");
				System.out.println("4.훈련");
				System.out.println("5.게임 종료");
				System.out.print(">>");
				choice = sc.nextInt();
				if(choice == 1) {//먹이 먹이기
					mon.eat();
				}
				else if(choice == 2) {//디지몬 정보 조회
					while(true) {
						System.out.println("디지몬 개체 명 : " + mon.name);
						System.out.println("세대 : " + mon.Generation);
						System.out.println("포만도 : " + mon.eatgauge);
						System.out.println("체력 : " + mon.HP);
						System.out.println("훈련지수 : " + mon.training);
						System.out.println("승리 전적 : " + mon.win + "승");
						System.out.println("패배 전적 : " + mon.lose + "패");
						System.out.println("민첩 : " + mon.speed);
						System.out.println("공격력 : " + mon.power);
						System.out.println("방어력 : " + mon.defense);
						System.out.print(">>숫자 1 입력시 메인화면으로 돌아옵니다.");
						choice = sc.nextInt();
						if(choice == 1) {
							break;
						}
						else System.out.println("잘못된 값입니다 다시 입력해주세요");
					}
				}
				else if(choice == 3) {
					Enemy virus = new Enemy();
					System.out.print(">>몇단계에 도전하시겠습니까?(1 ~ 6 단계)");
					choice = sc.nextInt();//전투 단계 선택
					if(choice == 1) {
						virus.name = "퍼그몬";
					}
					else if(choice == 2) {
						virus.name = "피코데블몬";
					}
					else if(choice == 3) {
						virus.name = "임프몬";
					}
					else if(choice == 4) {
						virus.name = "데블몬";
					}
					else if(choice == 5) {
						virus.name = "네오데블몬";
					}
					else if(choice == 6) {
						virus.name = "마왕몬";
					}
					else {
						System.out.println("잘못된 값입니다 메인으로 돌아갑니다.");
					}
					virus.Creat(virus.name);//단계에 알맞은 적 디지몬 생성
					System.out.println("적 디지몬 " + virus.name + "이 생성되었습니다.");
					System.out.println("============전투 시작!============");
					while (mon.HP > 0 && virus.HP > 0) {
			            // 사용자 디지몬의 공격
						mon.attack(virus);

			            // 적 디지몬의 공격
			            if (virus.HP > 0) {
			            	virus.attack(mon);
			            }
			        }

			        // 전투 결과 출력
			        if (mon.HP <= 0) {
			            System.out.println("패배! " + mon.name + "이(가) 쓰러졌습니다.");
			            mon.eatgauge -= 20;
			            mon.lose +=1;
			        }
			        else {
			            System.out.println("승리! " + virus.name + "이(가) 쓰러졌습니다.");
			            mon.eatgauge -= 10;
			            mon.win += 1;
			            
			        }
				}
				else if(choice == 4) {//훈련
					System.out.println("훈련을 완료했습니다. 훈련 지수가 1 올라갑니다");
					mon.training += 1;
					mon.eatgauge -= 10;
				}
				else if(choice == 5) {//게임종료
					System.out.println("게임을 종료합니다.");
					break;
				}
				else {//선택지 외 숫자 입력시 오류 처리
					System.out.println("잘못된 값입니다 다시 입력해주세요.");
				}
			}
			
	}
}

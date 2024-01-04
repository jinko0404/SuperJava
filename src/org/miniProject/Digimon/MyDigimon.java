package org.miniProject.Digimon;

public class MyDigimon {
	String name;
	String Generation;
	int	eatgauge;
	int	training;
	int win;
	int	lose;
	int	speed;
	int HP;
	int	power;
	int defense;
	
	private boolean myTurn = true;

    public void attack(Enemy enemy) {
        // 스피드 비교로 선공 여부를 결정
        boolean isMyTurn = this.speed >= enemy.speed;

        if (isMyTurn) {
            System.out.println(name + "이(가) 선공합니다!");
        } else {
            System.out.println(name + "이(가) 후공합니다.");
        }

        performAttack(enemy);

        // 턴을 교체
        myTurn = !myTurn;
    }
	@SuppressWarnings("unused")
	private boolean decideTurn(Enemy enemy) {
        return this.speed >= enemy.speed;
    }
	
	private int calculateDamage(Enemy enemy) {
        // 피해량 계산 로직
        int damage = this.power - enemy.defense;
        // 계산된 피해량이 음수인 경우 0으로 보정
        return Math.max(damage, 0);
    }
	
    private void performAttack(Enemy enemy) {
        int damage = calculateDamage(enemy);
        enemy.receiveDamage(damage);
        System.out.println(name + "이(가) " + enemy.name + "에게 " + damage + "의 피해를 입혔습니다.");
    }
    public void receiveDamage(int damage) {
        // 피해를 받는 로직
        // 예를 들어, HP를 감소시키는 등의 동작 수행
        this.HP -= damage;

        if (this.HP < 0) {
            this.HP = 0; // 음수로 떨어지지 않도록 보정
        }

        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다. 현재 HP: " + this.HP);
    }
	
	public int eat() {
		eatgauge += 5;
		HP += 100; 
		System.out.println(name + "이 맛있게 고기를 먹습니다.");
		System.out.println("포만도가 5 올라갑니다.");
		System.out.println("체력이 100 올라갑니다.");
		return eatgauge;
	}
	
	public void checkEvolutionConditions() {
		if(win == 10 && training == 10) {
			System.out.println("디지몬이 진화합니다!");
		}
		if(win == 10 && training == 10 && Generation == "유아기") {
			if(name == "깜몬") {
				name = "코로몬";
				Generation = "유년기";
				eatgauge = 50;
				training = 0;
				win = 0;
				lose = 0;
				speed = 5;
				HP = 65;
				power = 8;
				defense = 8;
			}
			else if(name == "새싹몬") {
				name = "어니몬";
				Generation = "유년기";
				eatgauge = 50;
				training = 0;
				win = 0;
				lose = 0;
				speed = 5;
				HP = 80;
				power = 6;
				defense = 10;
			}
			else if(name == "하얀몬") {
				name = "토코몬";
				Generation = "유년기";
				eatgauge = 50;
				training = 0;
				win = 0;
				lose = 0;
				speed = 5;
				HP = 70;
				power = 4;
				defense = 20;
			}
			System.out.println("축하합니다 ! 디지몬이 " + name + "으로 진화했습니다.");
		}
			else if(win == 10 && training == 10 && Generation == "유년기") {
				if(name == "코로몬") {
					name = "아구몬";
					Generation = "성장기";
					eatgauge = 50;
					training = 0;
					win = 0;
					lose = 0;
					speed = 10;
					HP = 120;
					power = 20;
					defense = 20;
				}
				else if(name == "어니몬") {
					name = "팔몬";
					Generation = "성장기";
					eatgauge = 50;
					training = 0;
					win = 0;
					lose = 0;
					speed = 10;
					HP = 130;
					power = 15;
					defense = 20;
				}
				else if(name == "토코몬") {
					name = "파닥몬";
					Generation = "성장기";
					eatgauge = 50;
					training = 0;
					win = 0;
					lose = 0;
					speed = 10;
					HP = 150;
					power = 10;
					defense = 30;
				}
				System.out.println("축하합니다 ! 디지몬이 " + name + "으로 진화했습니다.");
			}
				else if(win == 10 && training == 10 && Generation == "성장기") {
					if(name == "아구몬") {
						name = "그레이몬";
						Generation = "성숙기";
						eatgauge = 50;
						training = 0;
						win = 0;
						lose = 0;
						speed = 50;
						HP = 500;
						power = 120;
						defense = 100;
					}
					else if(name == "팔몬") {
						name = "니드몬";
						Generation = "성숙기";
						eatgauge = 50;
						training = 0;
						win = 0;
						lose = 0;
						speed = 50;
						HP = 550;
						power = 100;
						defense = 110;
					}
					else if(name == "파닥몬") {
						name = "엔젤몬";
						Generation = "성숙기";
						eatgauge = 50;
						training = 0;
						win = 0;
						lose = 0;
						speed = 50;
						HP = 500;
						power = 150;
						defense = 80;
					}
					System.out.println("축하합니다 ! 디지몬이 " + name + "으로 진화했습니다.");
				}
					else if(win == 10 && training == 10 && Generation == "성숙기") {
						if(name == "그레이몬") {
							name = "메탈그레이몬";
							Generation = "완전체";
							eatgauge = 50;
							training = 0;
							win = 0;
							lose = 0;
							speed = 500;
							HP = 3000;
							power = 500;
							defense = 500;
						}
						else if(name == "니드몬") {
							name = "릴리몬";
							Generation = "완전체";
							eatgauge = 50;
							training = 0;
							win = 0;
							lose = 0;
							speed = 500;
							HP = 2500;
							power = 650;
							defense = 400;
						}
						else if(name == "엔젤몬") {
							name = "홀리엔젤몬";
							Generation = "완전체";
							eatgauge = 50;
							training = 0;
							win = 0;
							lose = 0;
							speed = 500;
							HP = 3500;
							power = 600;
							defense = 400;
						}
						System.out.println("축하합니다 ! 디지몬이 " + name + "으로 진화했습니다.");
					}
						else if(win == 10 && training == 10 && Generation == "완전체") {
							if(name == "메탈그레이몬") {
								name = "워그레이몬";
								Generation = "궁극체";
								eatgauge = 50;
								training = 0;
								win = 0;
								lose = 0;
								speed = 1000;
								HP = 10000;
								power = 1000;
								defense = 1000;
							}
							else if(name == "릴리몬") {
								name = "로제몬";
								Generation = "궁극체";
								eatgauge = 50;
								training = 0;
								win = 0;
								lose = 0;
								speed = 1000;
								HP = 8000;
								power = 1500;
								defense = 900;
							}
							else if(name == "홀리엔젤몬") {
								name = "세라피몬";
								Generation = "궁극체";
								eatgauge = 50;
								training = 0;
								win = 0;
								lose = 0;
								speed = 1000;
								HP = 13000;
								power = 800;
								defense = 2000;
							}
							System.out.println("축하합니다 ! 디지몬이 " + name + "으로 진화했습니다.");
						}
		}
	public boolean checkDeath() {
		if(eatgauge <= 0 || lose >= 20) {
			System.out.println("정성이 부족하여 디지몬이 죽었습니다!");
			System.out.println("=============GAME OVER=============");
			return true;
		}
		else {
			return false;
		}
	}
	
}

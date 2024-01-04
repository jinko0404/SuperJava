package org.miniProject.Digimon;

public class Enemy {
	String name;
	int HP;
	int power;
	int defense;
	int speed;
	private boolean enemyTurn = false;
	
	public void Creat(String name) {
		if(name == "퍼그몬") {
			HP = 20;
			power = 3;
			defense = 3;
			speed = 0;
		}
		else if(name == "피코데블몬") {
			HP = 50;
			power = 6;
			defense = 4;
			speed = 4;
		}
		else if(name == "임프몬") {
			HP = 100;
			power = 10;
			defense = 10;
			speed = 10;
		}
		else if(name == "데블몬") {
			HP = 300;
			power = 60;
			defense = 60;
			speed = 30;
		}
		else if(name == "네오데블몬") {
			HP = 2000;
			power = 300;
			defense = 300;
			speed = 300;
		}
		else if(name == "마왕몬") {
			HP = 5000;
			power = 500;
			defense = 500;
			speed = 500;
		}
	}
	public void receiveDamage(int damage) {
        // 피해를 받는 로직
        this.HP -= damage;
        if (this.HP < 0) {
            this.HP = 0;
        }
        System.out.println(name + "이(가) " + damage + "의 피해를 입었습니다. 현재 HP: " + this.HP);
    }

	

    public void attack(MyDigimon playerDigimon) {
        // 스피드 비교로 선공 여부를 결정
        boolean isEnemyTurn = this.speed >= playerDigimon.speed;

        if (isEnemyTurn) {
            System.out.println(name + "이(가) 선공합니다!");
        } else {
            System.out.println(name + "이(가) 후공합니다.");
        }

        performAttack(playerDigimon);

        // 턴을 교체
        enemyTurn = !enemyTurn;
    }

    @SuppressWarnings("unused")
	private boolean decideTurn(MyDigimon playerDigimon) {
        return this.speed >= playerDigimon.speed;
    }

    private void performAttack(MyDigimon playerDigimon) {
        int damage = calculateDamage(playerDigimon);
        playerDigimon.receiveDamage(damage);
        System.out.println(name + "이(가) " + playerDigimon.name + "에게 " + damage + "의 피해를 입혔습니다.");
    }

    private int calculateDamage(MyDigimon playerDigimon) {
        // 피해량 계산 로직 변경: 공격력 - 방어력
        int damage = this.power - playerDigimon.defense;

        // 계산된 피해량이 음수인 경우 0으로 보정
        return Math.max(damage, 0);
    }
}

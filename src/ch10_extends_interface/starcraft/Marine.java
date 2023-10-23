package ch10_extends_interface.starcraft;

import javax.imageio.ImageReader;

public class Marine extends StarUnit {
    
    public Marine() {
        super("마린", 6, 50, 0, 4, 1, 1, 50);
    }
    

    // 공격
    public void attack(StarUnit starUnit) {
        // 질럿의 체력이 마린의 공격력만큼 감소
        // 부모 필드에 private인 변수나 메소드는 자식 객체에서 사용불가
        starUnit.setHp(starUnit.getHp() - this.getDamage());
    }

    public void attack(HighTemplar highTemplar) {
        highTemplar.setHp(highTemplar.getHp() - super.getDamage());
    }


    // 스팀팩
    public void stimpack() {
        System.out.println("으아아아!!");
        // 스팀팩 쓰면 체력 10 감소, 공격속도 2배
//        this.sethp -= 10;
        this.setHp(this.getHp() - 10);
//        this.attackSpeed *= 2;
        this.setAttackSpeed(this.getAttackSpeed() * 2);
        
    }

    @Override
    public String toString() {
        return "Marine{" +
                "name='" + this.getName() + '\'' +
                ", damage=" + this.getDamage() +
                ", hp=" + super.getHp() +
                ", armor=" + this.getArmor() +
                ", attackRange=" + this.getAttackRange() +
                ", attackSpeed=" + this.getAttackSpeed() +
                ", moveSpeed=" + this.getMoveSpeed() +
                ", mineral=" + this.getMineral() +
                '}';
    }
    
}

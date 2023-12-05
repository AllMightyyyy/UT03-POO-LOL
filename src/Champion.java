enum Role {TANK, ASSASSIN, HEALER};
public class Champion {
    private String name;
    private int health, attackPower;
    private Role championRole;
    public Champion() {
        this.health = 100;
        this.attackPower = 30;
    }

    public Champion(String name, int lifePoints, int attackPower, Role championRole) {
        this.name = name;
        this.health = lifePoints;
        this.attackPower = attackPower;
        this.championRole = championRole;
    }
    public Champion(Champion otherChampion) {
        this.name = otherChampion.name;
        this.health = otherChampion.health;
        this.attackPower = otherChampion.attackPower;
        this.championRole = otherChampion.championRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public Role getChampionRole() {
        return championRole;
    }

    public void setChampionRole(Role championRole) {
        this.championRole = championRole;
    }
    public void increaseHealth(int quantity) {
        this.setHealth(this.getHealth() + quantity);
    }
    public void attack(Champion target) {
        target.setHealth(target.getHealth() - this.getHealth());
        if(target.getHealth() <= 0) {
            System.out.println(target.getName() + " is dead");
        }
    }

    @Override
    public String toString() {
        return "Champion{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", attackPower=" + attackPower +
                ", championRole=" + championRole +
                '}';
    }
}

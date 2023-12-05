public class Player {
    private String name;
    private Champion champion;
    private int experience, level;
    public Player() {
        this.level = 1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Champion getChampion() {
        return champion;
    }

    public void setChampion(Champion champion) {
        this.champion = champion;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Player(String name, Champion champion, int experience, int level) {
        this.name = name;
        this.champion = champion;
        this.experience = experience;
        this.level = level;
    }
    public Player(Player otherPlayer) {
        this.name = otherPlayer.name;
        this.champion = otherPlayer.champion;
        this.experience = otherPlayer.experience;
        this.level = otherPlayer.level;
    }
    public void selectChampion(Champion champion) {
        this.setChampion(champion);
    }
    public void increaseExperience() {
        this.setExperience(this.getExperience() + 1);
    }
    public void increaseLevel() {
        if(this.getExperience() > (this.getLevel() * 10)) {
            this.setLevel(this.getLevel() + 1);
        }
    }
    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", champion=" + champion +
                ", experience=" + experience +
                ", level=" + level +
                '}';
    }
}

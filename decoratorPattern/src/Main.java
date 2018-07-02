import bantouming.Approver;
import bantouming.Deleter;
import bantouming.Document;
import bantouming.Purchase;
import touming.Hero;
import touming.Skill;
import touming.SkillQ;
import touming.SkillW;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Document document = new Purchase();
        Approver approverDeco = new Approver(document);
        approverDeco.approver();
        Document deleDeco = new Deleter(document);
        deleDeco.display();

        System.out.println("---------------------");
        Skill hero = new Hero();
        Skill q = new SkillQ(hero);
        Skill w = new SkillW(q);
        w.display();

    }
}

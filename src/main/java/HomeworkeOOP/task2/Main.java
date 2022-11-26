package HomeworkeOOP.task2;

public class Main {
    public static void main(String[] args) {
        People alena = new People("Алена", "Петрова",'f');
        People evgenii = new People("Евгений", "Петров",'m');
        People kostia = new People("Костя", "Голубев",'m');
        People masha = new People("Мария", "Петрова", 'f');
        People shasha = new People("Александр", "Сидоров",'m');
        People rita = new People("Рита", "Абрамова", 'f');

        GeoTree gt = new GeoTree();
        gt.append(alena, masha);
        gt.append(evgenii, masha);
        gt.append(rita, kostia);
        gt.append(rita, alena);
        gt.append(rita, shasha);

        rita.closeDoor();
//        gt.printRelatives();
//        System.out.println(gt.getData("children"));
//        System.out.println(new ResearchParent(gt).mother(alena));
//        System.out.println(new ResearchParent(gt).spend(rita, Relationship.PARENT));
//        System.out.println(new ResearchParent(gt).fatser(masha));




    }
}






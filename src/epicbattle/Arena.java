package epicbattle;

import java.util.Scanner;

public class Arena {
    private Warrior w1;
    private Warrior w2;

    public Arena(Warrior w1, Warrior w2) {
        this.w1 = w1;
        this.w2 = w2;
        
    }

    Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Karakter seçimine hoş geldiniz!");
        System.out.println("Lütfen aşağıdaki karakterlerden birini seçin:");
        System.out.println("1. Archer İpucu: Güçlü Saldırılar!");
        System.out.println("2. Knight İpucu: Üstün direnç!");
        System.out.println("3. Wizard İpucu: Beklenmedik Büyüler");
        System.out.println("4. Witch İpucu: Zehir saldırıları!");
        
    

        int selectedCharacter = scanner.nextInt();
        scanner.nextLine();

        Warrior chosenWarrior = null;

        switch (selectedCharacter) {
            case 1:
                chosenWarrior = new Archer(1, "Archer", 1000, 50);
                break;
            case 2:
                chosenWarrior = new Knight(2, "Knight", 100, 45);
                break;
            case 3:
                chosenWarrior = new Wizard(3, "Wizard", 100, 30);
                break;
            case 4:
                chosenWarrior = new Witch(4, "Witch", 100, 55);
                break;
            default:
                System.out.println("Geçersiz karakter seçimi!");
                break;
        }

        if (chosenWarrior != null) {
            w1 = chosenWarrior;
        }

        System.out.println("--------------------");
        System.out.println("İkinci karakteri seçin.");
        System.out.println("Lütfen aşağıdaki karakterlerden birini seçin:");
        System.out.println("1. Archer İpucu: Güçlü Saldırılar!");
        System.out.println("2. Knight İpucu: Üstün Direnç!");
        System.out.println("3. Wizard İpucu: Beklenmedik Büyüler");
        System.out.println("4. Witch İpucu: Zehir saldırıları!");

        int selectedCharacter2 = scanner.nextInt();
        scanner.nextLine(); // Boş satırı temizle

        Warrior chosenWarrior2 = null;

        switch (selectedCharacter2) {
            case 1:
                chosenWarrior2 = new Archer(1, "Archer", 100, 50);
                break;
            case 2:
                chosenWarrior2 = new Knight(2, "Knight", 100, 45);
                break;
            case 3:
                chosenWarrior2 = new Wizard(3, "Wizard", 100, 30);
                break;
            case 4:
                chosenWarrior2 = new Witch(4, "Witch", 100, 55);
                break;
            default:
                System.out.println("Geçersiz karakter seçimi!");
                break;
        }

        if (chosenWarrior2 != null) {
            w2 = chosenWarrior2;
            StartOfWar();
        }
    }

    public void StartOfWar() {
        int round = 1;
        System.out.println("Savaş başlıyor!");

        while (w1.getHealth() > 0 && w2.getHealth() > 0) {
            System.out.println(round + ". Raund" + "---------");
            w1.setHealth(w2.attack(w1));        
            w2.setHealth(w1.attack(w2));  
            Spiker();
            round++;
        }
        if (w1.getHealth() <= 0) {
            System.out.println("Kazanan: " + w2.getName());
        } else if (w2.getHealth() <= 0) {
            System.out.println("Kazanan: " + w1.getName());
        }else if(w1.getHealth()==w2.getHealth()){
        	System.out.println("Kazanan çıkmadı.Yeni oyuna geçebilirsiniz.");
        }
        
    }

    
    public void Spiker() {
        System.out.println("----------------");
        System.out.println(w1.getName() + "'in kalan canı: " + w1.getHealth());
        System.out.println(w2.getName() + "'in kalan canı: " + w2.getHealth());
    }
}

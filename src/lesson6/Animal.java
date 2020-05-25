package lesson6;

public abstract class Animal {
    String type;
    String name;

    private final int maxJumpDistance;
    private final int maxRunDistance;
    private final int maxSwimDistance;

    public Animal(String type, String name, int maxJumpDistance, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.type = type;
        this.maxJumpDistance = maxJumpDistance;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
    }

    public void run(int dist){
        if (dist <= maxRunDistance){
            System.out.println(type + " " + name + " удалось пробежать дистанцию.");
        }else
            System.out.println(type + " " + name + " не удалось пробежать дистанцию.");
    }

    public void jump(int height){
        if (height <= maxJumpDistance){
            System.out.println(type + " " + name + " удалось перепрыгнуть.");
        }else
            System.out.println(type + " " + name + " не удалось перепрыгнуть.");

    }

    public void swim(int dist){
        if (maxSwimDistance == 0){
            System.out.println(type + " " + name + " не умеет плавать.");
        }else if (dist <= maxSwimDistance){
            System.out.println(type + " " + name + " удалось проплыть дистанцию.");
            }else
                System.out.println(type + " " + name + " не удалось проплыть дистанцию.");
    }
}

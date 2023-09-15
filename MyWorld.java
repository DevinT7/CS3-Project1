import mayflower.*;


public class MyWorld extends World {

    private Cat cat;
    private Dog dog;
    private Jack jack;
    private Ninja ninja;
    private Block block;
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        Mayflower.showBounds(true);
        cat = new Cat();
        addObject(cat, 400, 0);
        //dog = new Dog();
        //addObject(dog, 200, 100);
        //jack = new Jack();
        //addObject(jack, 300, 100);
        //ninja = new Ninja();
        //addObject(ninja, 100, 400);
        
        block = new Block();
        addObject(block, 400,100);
        Block block1 = new Block();
        addObject(block1, 528, 372);
        
        
    }
    
    public void act()
    {
    }
    
}
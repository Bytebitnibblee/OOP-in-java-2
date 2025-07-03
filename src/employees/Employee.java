employees Employee {
    public static int base = 10000;
    int salary() { return base; }
}

// Inherited class
class Manager extends Employee {
    // This method overrides salary() of Parent
    int salary() { return base + 20000; }
}

// Inherited class
class Clerk extends Employee {
    // This method overrides salary() of Parent
    int salary() { return base + 10000; }
}
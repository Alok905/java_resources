interface Computer {
    void code();
}

class Laptop implements Computer {
    public void code() {
        System.out.println("Coding started: little slow");
    }
}

class Desktop implements Computer {
    public void code() {
        System.out.println("Coding started: faster");
    }
}

class Developer {
    public void codeApplication(Computer comp) {
        comp.code();
    }
}

class Company {
    public static void main(String[] args) {
        Developer alok = new Developer();
        Developer kanha = new Developer();
        // we are giving alok a laptop
        // and kanha a desktop to code
        Computer laptop = new Laptop();
        Computer desktop = new Desktop();

        alok.codeApplication(laptop);
        kanha.codeApplication(desktop);
    }
}

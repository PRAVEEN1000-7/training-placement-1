"""
Q : Implement the Singleton design pattern by creating a class that allows only one instance to be created.
Provide a method to return this single instance and a public string variable to store a message.
"""

  class Singleton {

    public String str;
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

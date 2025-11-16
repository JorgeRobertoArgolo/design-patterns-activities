package activity_singleton;

public class ConexaoBD {

    //Keep the unique instance
    public static ConexaoBD connectionDB;

    private boolean statusConnection;

    //Prevent others classes from instantiating ConexaoBD directly
    private ConexaoBD () {
        this.statusConnection = true;
        System.out.println("Instância de ConexãoBD criada");
    }

    //Return the unique instance
    public static synchronized ConexaoBD getInstance () {
        if (connectionDB == null) {
            connectionDB = new ConexaoBD();
        }
        return connectionDB;
    }

    public boolean isStatusConnection() {
        return statusConnection;
    }

    //Simulates the execution of a command in the database.
    public void executeCommand(String command) {
        System.out.println("   [Executando] -> Comando '" + command + "' usando a Conexão: " + this.hashCode());
    }

    //auxiliary method to prove that the connection is the same
    public String getStatus() {
        return this.statusConnection + " @hash: " + this.hashCode();
    }
}
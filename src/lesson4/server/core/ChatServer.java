package lesson4.server.core;

import lesson4.network.ServerSocketThread;

public class ChatServer {

    ServerSocketThread server;

    public void start(int port) {
    	if (server == null || !server.isAlive()) {
        	System.out.println("Server started at port: " + port);
        	server = new ServerSocketThread("Server", port);
        } else {
            System.out.println("Server already started!");
        }
    }

    public void stop() {
    	if (server != null && server.isAlive()) {
        	System.out.println("Server stopped");
        	server.interrupt();
   		} else {
            System.out.println("Server is not running");
        }
    }

}
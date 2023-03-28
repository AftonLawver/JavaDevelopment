//--------------------------------------------------------------------------------------
//--  Paul West                                                                                                              
//--  CS-412-001 - Programming Distributed Apps                                                                              
//--  Lab #6 - ChatServer.java modification using Thread Pool...                                                                                                          
//--  3/28/2023                                                                                                              
//--------------------------------------------------------------------------------------


/******************************************************************************
 *  Compilation:  javac ChatClient.java
 *  Execution:    java ChatClient name host
 *  Dependencies: In.java Out.java
 *
 *  Connects to host server on port 4444, enables an interactive
 *  chat client.
 *  
 *  % java ChatClient alice localhost
 *
 *  % java ChatClient bob localhost
 *  
 ******************************************************************************/
import java.awt.*;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
/******************************************************************************
 *  Compilation:  javac ChatServer.java 
 *  Execution:    java ChatServer
 *  Dependencies: In.java Out.java Connection.java ConnectionListener.java
 *
 *  Creates a server to listen for incoming connection requests on 
 *  port 4444.
 *
 *  % java ChatServer
 *
 *  Remark
 *  -------
 *    - Use Vector instead of ArrayList since it's synchronized.
 *  
 ******************************************************************************/

import java.net.Socket;
import java.net.ServerSocket;
import java.util.concurrent.*;
import java.util.*;

public class ChatServer{

	static class SocketThread implements Runnable
	{
		Socket clientSocket;
		String message;
		Connection connection;
		
		private static Set <SocketThread>  ClientList = new HashSet <SocketThread> ();
		
		SocketThread(Socket clientSocket)
		{
			this.clientSocket = clientSocket;
			ClientList.add(this);
		}

		public void run()
		{
			connection = new Connection(clientSocket);
			connection.start();
			
			while (connection.isAlive()) 
			{
				// Placed idea of the ConnectionListener into SocketThread
				
				message = connection.getMessage();
				
                if (message != null)
				{
				   System.out.println (message);

				   for (SocketThread Client : SocketThread.ClientList) 
				   {
						if (!Client.equals (this)) 
						{
							Client.connection.println(message);
						}
					}
				}
				
				// don't monopolize processor
				try                 
				{ 
					Thread.sleep(100);  
				}
				catch (Exception e) 
				{ 
					e.printStackTrace(); 
				}
            }
		}
	}

    public static void main(String[] args) throws Exception 
	{

//      Fixed Thread Pool...
//		int MaxConnections = 100;
//		ExecutorService connections = Executors.newFixedThreadPool(MaxConnections);

		// Cached Thread Pool...
		ExecutorService connections = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(4444);

        System.err.println("ChatServer started");
		
        while (true) 
		{

			try
			{
				// wait for next client connection request
				Socket clientSocket = serverSocket.accept();
				System.err.println("Created socket with client");

				connections.execute( new SocketThread(clientSocket));
			}
			catch (Exception e)
			{
				e.printStackTrace(); 
				connections.shutdown();
			}
			
        }
		
		
    }

}
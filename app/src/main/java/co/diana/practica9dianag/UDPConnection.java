package co.diana.practica9dianag;

import android.util.Log;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPConnection extends Thread{
	
	private DatagramSocket socket;
	private MainActivity mainActivity;
	
	@Override
	public void run() {

		
		try {
			//Escuchar
			socket= new DatagramSocket(6000);
			
			//Escuchar mensajes(Datagrama)
			while(true) {
				Log.e("TAG", "onCreate: ");
				//2 parametros
				byte[] buffer = new byte[100];
				
				DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

				Log.e("TAG", "run:Esperando datagrama ");
				
				socket.receive(packet);
				
				String mensaje = new String(packet.getData()).trim();

				Log.e("Holi","Datagrama recibido:" + mensaje);
				
			}
			
			
			
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void sendMessage(String mensaje) {
		// 4 parametros
		
		new Thread(
			
				()->{
					try {
						
						InetAddress ip = InetAddress.getByName("127.0.0.1");
						DatagramPacket packet = new DatagramPacket(mensaje.getBytes(),mensaje.getBytes().length,ip,5000);
						socket.send(packet);
						
					} catch (UnknownHostException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				).start();
		
		
	
		
		
	}

	public void PeerB(MainActivity PeerB){
		this.mainActivity=PeerB;
	}

}

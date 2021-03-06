package org.sinrel.engine.actions;

import javax.swing.JFrame;

import org.sinrel.engine.Engine;

/**
 * Данный класс содержит методы, которые позволяют подавать команды движку. <br>
 * Рекомендуется использовать только данный класс в целях поддержания совместимости с новыми версиями движка. 
 */
public class Intent {

	private Engine engine;

	public Intent(Engine engine) {
		this.engine = engine;
	}

	/**
	 * Загрузка клиента с сервера
	 * 
	 * @param clientName Имя клиента
	 * @return Возвращает результат загрузки типа {@link DownloadResult}
	 */
	public DownloadResult downloadClient( String clientName ) {
		return engine.getDownloader().downloadClient( engine, clientName );
	}
	
	/**
	 * Авторизация пользователя
	 * 
	 * @param login Логин
	 * @param pass Пароль
	 * @return обьект {@link AuthData } с содержимым сессии, логина и результате авторизации
	 */
	public AuthData auth( String login, String pass ) {
		return engine.getAuth().auth( engine, login, pass );
	}
	
	/**
	 * Проверка клиента
	 * 
	 * @param clientName Имя клиента
	 * @return Статус клиента типа {@link ClientStatus}
	 */
	public ClientStatus checkClient( String clientName ) {
		return engine.getChecker().checkClient( engine, clientName );
	}
	
	/** Запуск клиента Minecraft
	 * @param clientName Имя клиента
	 * @param authData Идентификационные данные
	 * @param frame Окно в котором запускать
	 */
	public void startMinecraft( String clientName, AuthData authData, JFrame frame) {
		engine.getStarter().startMinecraft( engine.getSettings().getDirectory(), clientName, authData, null, null, frame );
	}
	
	/**
	 * Запуск клиента Minecraft
	 * @param clientName Имя клиента
	 * @param authData Идентификационные данные
	 * @param server Адрес сервера
	 * @param port Порт сервера
	 * @param frame Окно в котором запускать
	 */
	public void startMinecraft( String clientName, AuthData authData, String server, String port, JFrame frame ) {
		engine.getStarter().startMinecraft( engine.getSettings().getDirectory() , clientName, authData, server, port, frame );
	}
	
}
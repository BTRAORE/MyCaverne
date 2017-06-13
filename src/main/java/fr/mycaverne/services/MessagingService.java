/**
 * 
 */
package fr.mycaverne.services;

/**
 * @author C17Engineering
 *
 */
public interface MessagingService {
	public boolean sendSms(String recipient, String msg);
	public boolean sendMail(String recipients, String object, String msg );
}

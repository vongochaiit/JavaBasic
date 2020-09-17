package beans;

	
public class UserAccount {
	private String userId;
	private String userName;
	private String password;
	private String firstName;
	private String lastName;
	private String dateOfBirth;
	private String phoneNumber;
	private String profilePic;
	private Integer point;
	
	/**
	 * @param userId
	 * @param userName
	 * @param password
	 * @param firstName
	 * @param lastName
	 * @param dateOfBirth
	 * @param phoneNumber
	 * @param profilePic
	 * @param point
	 * @param isDeleted
	 * @param createdAt
	 * @param createdBy
	 * @param updatedAt
	 * @param updatedBy
	 * 
	 */
	public UserAccount(){
		
	}
	
	public UserAccount(String userId, String userName, String password, String firstName, String lastName,
			String dateOfBirth, String phoneNumber, String profilePic, Integer point, Boolean isDeleted,
			String createdAt, String createdBy, String updatedAt, String updatedBy) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.profilePic = profilePic;
		this.point = point;
		
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getProfilePic() {
		return profilePic;
	}
	public void setProfilePic(String profilePic) {
		this.profilePic = profilePic;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	
}

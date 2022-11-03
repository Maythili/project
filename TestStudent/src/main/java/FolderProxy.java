
public class FolderProxy implements IFolder {
	
	Folder folder;
	User user;
	public FolderProxy(User user) {
		this.user=user;
	}
		@Override
		public void performoperations() {
			if(user.getuserName().equalsIgnoreCase("dev")//DEV or dev
			 && user.getpassword().equalsIgnoreCase("dev")) {
				folder = new Folder();
				folder.performoperations();
				
			}else {
				
			System.out.println("You don't have access to thius folder");
		

	}

}
}

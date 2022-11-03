package ProxyDesignPattern;

public class ProxyPatternTest {

	public static void main(String[] args) {
		User user = new User("dev", "dev");
		FolderProxy folderproxy = new FolderProxy(user);
		
		

	}

}

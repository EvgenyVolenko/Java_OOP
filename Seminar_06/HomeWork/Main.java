public class Main{
	public static void main(String[] args){
		User user = new User("Bob");
		Persister persister = new Persister(user);
		Reposytory repository = new RepositoryFile();
		repository.report(user.getName());
		repository.save(persister);
	}
}
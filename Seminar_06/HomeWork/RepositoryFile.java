public class RepositoryFile implements Reposytory {

	@Override
	public void report(String name) {
		System.out.println("Report for user: " + name);

	}

	@Override
	public void save(Persister persister) {
		System.out.println("Save user: " + persister.getUser().getName());

	}
}

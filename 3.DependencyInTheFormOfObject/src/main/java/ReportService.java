public class ReportService implements Service{

	private ReportGenerator generator;
	public ReportGenerator getGenerator() {
		return generator;
	}
	public void setGenerator(ReportGenerator generator) {
		this.generator = generator;
	}

	public void showReport() {
		generator.generateReport();
	}
}

public interface HService {

	public void loadH();
	public void printHList();

	public HDto getH(String hId);

	public List<HDto> getHList();

}
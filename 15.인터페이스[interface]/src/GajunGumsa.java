
public class GajunGumsa {
	/*
	 * private GajunTV[] gajuns1;
	 * private GajunAudio[] gajuns1;
	 * private GajunSmartPhone[] gajuns1;
	 */
	private GajunOnOff[] gajuns;
	public GajunGumsa() {
	}
	public GajunGumsa(GajunOnOff[]gajuns) {
		this.gajuns=gajuns;
	}
	public GajunOnOff[] getGajuns() {
		return gajuns;
	}
	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	public void gumsa() {
		for(GajunOnOff tempGajun:gajuns) {
			tempGajun.on();
			GajunVolume tempGajun2 = (GajunVolume)tempGajun;
			tempGajun2.volumeUp();
			tempGajun2.volumeDown();
			tempGajun.off();
			
			System.out.println("---검사끝 출고---");
		}
	}
	
	
	
}

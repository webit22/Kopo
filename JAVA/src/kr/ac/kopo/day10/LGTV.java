package kr.ac.kopo.day10;

import kr.ac.kopo.day10.inter.TV;

public class LGTV implements TV {

	private boolean power;
	private int volumeSize;
	private int channelNo;

	/* LGTV를 상속받은 LG 산하의 제품들만 해당 상수에 접근 가능 */
	protected static final int MAX_CHANNEL_SIZE = 100; // 0 ~ 99

	public LGTV() {
		System.out.println("LGTV를 구매했습니다");
		power = false;
		volumeSize = 10;
		channelNo = 3;
	}

	@Override
	public void powerOn() {
		power = true;
		System.out.println("전원을 켭니다");
		info();
	}

	@Override
	public void powerOff() {
		power = false;
		System.out.println("전원을 끕니다");
		info();
	}

	@Override
	public void channelUp() {
		channelNo = ++channelNo % LGTV.MAX_CHANNEL_SIZE;
		info();
	}

	@Override
	public void channelDown() {
		if (channelNo == 0)
			channelNo = LGTV.MAX_CHANNEL_SIZE;
		channelNo--;
		System.out.println("채널을 내립니다");
		info();
	}

	@Override
	public void volumeUp() {
		if (volumeSize < TV.MAX_VOLUME_SIZE)
			volumeSize++;
		System.out.println("음량을 높입니다");
		info();
	}

	@Override
	public void volumeDown() {
		if (volumeSize > TV.MIN_VOLUME_SIZE)
			volumeSize--;
		System.out.println("음량을 낮춥니다");
		info();
	}

	@Override
	public void mute() {
		volumeSize = TV.MIN_VOLUME_SIZE;
		System.out.println("음소거중입니다");
		info();
	}

	public void info() {
		System.out.println("채널번호 : " + channelNo + ", 음량크기 : " + volumeSize);
	}
}

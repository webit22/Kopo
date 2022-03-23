package kr.ac.kopo.day10.inter;

// 인터페이스의 모든 메소드는 abstract
// 인터페이스의 모든 필드는 상수값 (final)
// 인터페이스의 모든 요소는 public
public interface TV {

	/* public static final */
	int MIN_VOLUME_SIZE = 0;
	int MAX_VOLUME_SIZE = 50;

	/* public abstract */
	// 전원을 켜는 기능
	void powerOn();

	void powerOff();

	void channelUp();

	void channelDown();

	void volumeUp();

	void volumeDown();

	void mute();
}

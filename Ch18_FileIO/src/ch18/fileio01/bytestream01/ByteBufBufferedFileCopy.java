package ch18.fileio01.bytestream01;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* 1byte씩 파일에서 읽어서 저장하는 방식은 너무 느림
 * ex) putty.exe 파일 기준으로 약 7.5초 
 * 이것을 개선하려면 3가지
 * 1) 한번에 많이 읽기(11/1000초)
 * 2) jdk 입력 버퍼 클래스를 사용해서 미리 읽어들인 것을 1byte씩 가져오고
 * 	  다시 출력 버퍼 클래스에 1byte씩 저장하면 알아서 파일에 한꺼번에 저장(41/1000초)
 * 3) 1)과 2)를 합치기(3/1000초)
 * */
/* 물류 시스템과 동일
 * 하드디스크(물류센터)
 * App프로세스(아파트)
 * 버퍼클래스(택배 차량)
 * */
public class ByteBufBufferedFileCopy {
	public static void main(String[] args) throws IOException {
		// 입력 스트림
		InputStream in = new FileInputStream("Healing.mp4");
		// 입력 스트림과 연겨로딘 저장소(버퍼) 필터 클래스
		BufferedInputStream bin = new BufferedInputStream(in);

		// 출력 스트림
		OutputStream out = new FileOutputStream("힐링.mp4");
		// 출력 스트림과 연결된 저장소(버퍼)필터 클래스
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		/* 1024byte씩 입출력을 하고 버퍼필터 클래스를 동시에 사용한다. */
		long copyByte = 0;
		int readLen = 0;
		byte[] buf = new byte[1024*10];
		long stime = System.currentTimeMillis();
		while(true) {
			readLen = bin.read(buf);
			if(readLen==-1)
				break;
			bout.write(buf);
			copyByte++;
		}
		long etime = System.currentTimeMillis();
		
		bin.close();
		bout.close();
		System.out.println("복사에 걸린 시간 : " + (etime-stime));
		System.out.println("복사된 바이트 크기 : " + copyByte);
	}
}

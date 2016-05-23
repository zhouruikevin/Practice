package com.practice.utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class CloneUtil {
	public static final <T> void clone(String path, T t) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			File f = new File(path);
			fos = new FileOutputStream(f);
			oos = new ObjectOutputStream(fos);
			oos.writeObject(t);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			CloseUtils.close(fos);
			CloseUtils.close(oos);
		}
	}
}

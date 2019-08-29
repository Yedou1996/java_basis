package java_demo;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * 读写锁
 */

class myCach {
    private volatile Map<String, Object> map = new HashMap<>();
    private ReentrantReadWriteLock rwLock = new ReentrantReadWriteLock();
    public void put(String key, Object value) throws InterruptedException {
       rwLock.writeLock().lock();
       try {
           System.out.println(Thread.currentThread().getName() + "\t正在写" + key);
           TimeUnit.MICROSECONDS.sleep(300);
           map.put(key, value);
           System.out.println(Thread.currentThread().getName() + "写完成");
       } catch (Exception e) {
          e.printStackTrace();
       } finally {
           rwLock.writeLock().unlock();
       }

    }

    public void get(String key) {
        rwLock.readLock().lock();
        try {
            System.out.println(Thread.currentThread().getName() + "\t正在读");
            Object result = map.get(key);
            System.out.println(Thread.currentThread().getName() + "\t读完成" + result);
        } catch (Exception e) {
           e.printStackTrace();
        } finally {
            rwLock.readLock().unlock();
        }

    }
}

public class ReadWriteLock {
    public static void main(String[] args) {
        myCach myCach = new myCach();
        for (int i = 0; i < 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                try {
                    myCach.put(tempInt + "", tempInt + "");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }, String.valueOf(i)).start();

        }
        for (int i = 0; i < 5; i++) {
            final int tempInt = i;
            new Thread(() -> {
                myCach.get(tempInt + "");
            }, String.valueOf(i)).start();

        }
    }
}





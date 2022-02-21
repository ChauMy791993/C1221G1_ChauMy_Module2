package ss4_lop_va_doi_tuong_java.bai_tap;

import java.util.Date;

public class StopWatch {
    long date;
    long startTime;
    long endTime;

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }

    public StopWatch() {
        this.date = new Date().getTime();
    }

    public void startTime() {
        this.startTime = new Date().getTime();
    }

    public void endTime() {
        this.endTime = new Date().getTime();
    }

    public long getElapsedTime() {
        return (endTime - startTime)*1000;
    }

    public static void main(String[] args) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.startTime();
        System.out.println(stopWatch.getStartTime());
        for (int i = 0; i <100000 ; i++) {
            System.out.print("");
        }
        stopWatch.endTime();
        System.out.println("\n"+stopWatch.getEndTime());
        System.out.println(stopWatch.getElapsedTime());
    }


}



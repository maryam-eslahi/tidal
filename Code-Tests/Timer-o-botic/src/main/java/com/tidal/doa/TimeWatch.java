package com.tidal.doa;

import java.util.concurrent.TimeUnit;





    public class TimeWatch {
        long starts;

        public static TimeWatch start() {
            return new TimeWatch();
        }

        private TimeWatch() {
            reset();
        }

        public TimeWatch reset() {
        //    starts = System.currentTimeMillis();
            starts = System.nanoTime();
            return this;
        }

        public long time() {
         //   long ends = System.currentTimeMillis();
            long ends = System.nanoTime();
            return ends - starts;
        }

     /*   public long time(TimeUnit unit) {
            return unit.convert(time(), TimeUnit.MILLISECONDS);
        }*/

        /*public long time(TimeUnit unit) {
            return unit.convert(time(), TimeUnit.NANOSECONDS);
        }*/


}
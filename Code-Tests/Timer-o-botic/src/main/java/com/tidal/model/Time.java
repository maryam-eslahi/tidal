package com.tidal.model;
import java.util.Date;
import java.util.concurrent.TimeUnit;
/**
 * Created by adak on 10/9/2020.
 */
public class Time {
 String currentTime;
 long wallClockTime;
 long cpuTime;
 long applicationUptime;

 public Time(/*Date currentTime, TimeUnit wallClockTime, TimeUnit cpuTime*/) {
  /*this.currentTime = currentTime;
  this.wallClockTime = wallClockTime;
  this.cpuTime = cpuTime;*/
 }

 public String  getCurrentTime() {
  return currentTime;
 }

 public void setCurrentTime(String currentTime) {
  this.currentTime = currentTime;
 }

 public long getWallClockTime() {
  return wallClockTime;
 }

 public void setWallClockTime(long wallClockTime) {
  this.wallClockTime = wallClockTime;
 }

 public long getCpuTime() {
  return cpuTime;
 }

 public void setCpuTime(long cpuTime) {
  this.cpuTime = cpuTime;
 }

 public long getApplicationUptime() {
  return applicationUptime;
 }

 public void setApplicationUptime(long applicationUptime) {
  this.applicationUptime = applicationUptime;
 }
}

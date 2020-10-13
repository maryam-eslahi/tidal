package com.tidal.service;
import com.tidal.doa.TimeWatch;
import com.tidal.model.*;
import com.tidal.doa.TimeWatch;
import com.tidal.exceptions.DataNotFoundException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

@Path("/tidal")
public class siteResource {
 //   siteService ss =  siteService.getInstance();



    @GET
    @Path("/uptime")
    @Produces(MediaType.APPLICATION_JSON)
    public Time getTime() {

        TimeWatch watchTime =  TimeWatch.start();
        Time response=new Time();
        long sum = 0;
        TimeWatch cpuTime = TimeWatch.start();
        for(int i =0; i<=1000000;i++){
            sum ++;
        }
        //Calculate the CPU Time
        response.setCpuTime( cpuTime.time());

        //Calculate the Function Wallclock Time
        response.setWallClockTime(watchTime.time());

        //Calculate the Application Wallclock Uptime
        RuntimeMXBean rb = ManagementFactory.getRuntimeMXBean();
        long applicationUptime = rb.getUptime();
        response.setApplicationUptime(applicationUptime);

        //Calculate the Current Time
        response.setCurrentTime(new Date().toString());
        return response;

    }




}


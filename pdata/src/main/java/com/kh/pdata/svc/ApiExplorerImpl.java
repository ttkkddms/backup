package com.kh.pdata.svc;


import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

@Service
public class ApiExplorerImpl implements ApiExplorer {
    private static final String serviceKey = "ag6A%2BlNnnoK0hAG0eONGrJKdKrP82Q5RHMOr3w3JPJzfIbN4jTft%2FX4CgELOxdlRRXw2DKUA58Zr%2FsxI92vA2A%3D%3D";

    @Override
    public Response apiCall() {
        String xmlStr = "";
        Response res = null;
        try {
            StringBuilder urlBuilder = new StringBuilder("http://www.kspo.or.kr/openapi/service/sportsNewFacilInfoService/getNewFacilInfoList"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + serviceKey); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode("1", "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode("10", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("faciNm", "UTF-8") + "=" + URLEncoder.encode("요가", "UTF-8")); /*체육시설명*/
//            urlBuilder.append("&" + URLEncoder.encode("fcobNm", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*업종명*/
//            urlBuilder.append("&" + URLEncoder.encode("ftypeNm", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*시설유형명*/
//            urlBuilder.append("&" + URLEncoder.encode("faciRoadAddr1", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*시설유형명*/
//            urlBuilder.append("&" + URLEncoder.encode("faciAddr1", "UTF-8") + "=" + URLEncoder.encode("", "UTF-8")); /*지번주소*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
            xmlStr = sb.toString();

            //xml to java Object
            XmlMapper xmlMapper = new XmlMapper();
            res = xmlMapper.readValue(xmlStr,Response.class);
            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
        }


    @Override
    public Response apiCall(FaciReq faciReq) {
        String xmlStr = "";
        Response res = null;
        try {
            StringBuilder urlBuilder = new StringBuilder("http://www.kspo.or.kr/openapi/service/sportsNewFacilInfoService/getNewFacilInfoList"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey", "UTF-8") + "=" + serviceKey); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo", "UTF-8") + "=" + URLEncoder.encode(faciReq.getPageNo(), "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows", "UTF-8") + "=" + URLEncoder.encode(faciReq.getNumOfRows(), "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("faciNm", "UTF-8") + "=" + URLEncoder.encode(faciReq.getFaciNm(), "UTF-8")); /*체육시설명*/
//            urlBuilder.append("&" + URLEncoder.encode("fcobNm", "UTF-8") + "=" + URLEncoder.encode(faciReq.getFcobNm(), "UTF-8")); /*업종명*/
//            urlBuilder.append("&" + URLEncoder.encode("ftypeNm", "UTF-8") + "=" + URLEncoder.encode(faciReq.getFtypeNm(), "UTF-8")); /*시설유형명*/
//            urlBuilder.append("&" + URLEncoder.encode("faciRoadAddr1", "UTF-8") + "=" + URLEncoder.encode(faciReq.getFaciRoadAddr1(), "UTF-8")); /*도로명주소*/
        //    urlBuilder.append("&" + URLEncoder.encode("faciAddr1", "UTF-8") + "=" + URLEncoder.encode(faciReq.getFaciRoadAddr1, "UTF-8")); /*지번주소*/
            URL url = new URL(urlBuilder.toString());
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/xml");
            System.out.println("Response code: " + conn.getResponseCode());
            BufferedReader rd;
            if (conn.getResponseCode() >= 200 && conn.getResponseCode() <= 300) {
                rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            } else {
                rd = new BufferedReader(new InputStreamReader(conn.getErrorStream()));
            }
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = rd.readLine()) != null) {
                sb.append(line);
            }
            rd.close();
            conn.disconnect();
            System.out.println(sb.toString());
            xmlStr = sb.toString();

            //xml to java Object
            XmlMapper xmlMapper = new XmlMapper();
            res = xmlMapper.readValue(xmlStr,Response.class);
            System.out.println(res);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return res;
    }

}

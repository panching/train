package com.panching.train.obj;

import java.util.ArrayList;

/**
 * Created by panching on 16/4/5.
 */
public class TrainInfoObj implements java.io.Serializable
{
    private long id;
    private Integer iTrain;
    private Integer iCarClass;
    private String sRoute;
    private Integer iLine;
    private Integer iLineDir;
    private String sOverNightStn;
    private String sCripple;
    private String sPackage;
    private String sDinning;
    private Integer iType;
    private String sBreastFeed;
    private String sBike;
    private String sNote;
    private String sNoteEng;
    private int iOrderID;
    private String sStationName;
    private String sCarClassName;
    private String sStartStation;
    private String sEndSatation;
    private String stationList;

    public TrainInfoObj() {
        super();
    }

    public TrainInfoObj(long id, Integer iTrain, Integer iCarClass, String sRoute, Integer iLine, Integer iLineDir, String sOverNightStn, String sCripple, String sPackage, String sDinning, Integer iType, String sBreastFeed, String sBike, String sNote, String sNoteEng, int iOrderID, String sStationName, String sCarClassName,String sStartStation,String sEndSatation,String stationList) {
        this.id = id;
        this.iTrain = iTrain;
        this.iCarClass = iCarClass;
        this.sRoute = sRoute;
        this.iLine = iLine;
        this.iLineDir = iLineDir;
        this.sOverNightStn = sOverNightStn;
        this.sCripple = sCripple;
        this.sPackage = sPackage;
        this.sDinning = sDinning;
        this.iType = iType;
        this.sBreastFeed = sBreastFeed;
        this.sBike = sBike;
        this.sNote = sNote;
        this.sNoteEng = sNoteEng;
        this.iOrderID = iOrderID;
        this.sStationName = sStationName;
        this.sCarClassName = sCarClassName;
        this.sStartStation = sStartStation;
        this.sEndSatation = sEndSatation;
        this.stationList = stationList;
    }

    public long getId() {
        return id;
    }

    public String getStationList() {
        return stationList;
    }

    public void setStationList(String stationList) {
        this.stationList = stationList;
    }

    public String getsStartStation() {
        return sStartStation;
    }

    public void setsStartStation(String sStartStation) {
        this.sStartStation = sStartStation;
    }

    public String getsEndSatation() {
        return sEndSatation;
    }

    public void setsEndSatation(String sEndSatation) {
        this.sEndSatation = sEndSatation;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getiTrain() {
        return iTrain;
    }

    public void setiTrain(Integer iTrain) {
        this.iTrain = iTrain;
    }

    public Integer getiCarClass() {
        return iCarClass;
    }

    public void setiCarClass(Integer iCarClass) {
        this.iCarClass = iCarClass;
    }

    public String getsRoute() {
        return sRoute;
    }

    public void setsRoute(String sRoute) {
        this.sRoute = sRoute;
    }

    public Integer getiLine() {
        return iLine;
    }

    public void setiLine(Integer iLine) {
        this.iLine = iLine;
    }

    public Integer getiLineDir() {
        return iLineDir;
    }

    public void setiLineDir(Integer iLineDir) {
        this.iLineDir = iLineDir;
    }

    public String getsOverNightStn() {
        return sOverNightStn;
    }

    public void setsOverNightStn(String sOverNightStn) {
        this.sOverNightStn = sOverNightStn;
    }

    public String getsCripple() {
        return sCripple;
    }

    public void setsCripple(String sCripple) {
        this.sCripple = sCripple;
    }

    public String getsPackage() {
        return sPackage;
    }

    public void setsPackage(String sPackage) {
        this.sPackage = sPackage;
    }

    public String getsDinning() {
        return sDinning;
    }

    public void setsDinning(String sDinning) {
        this.sDinning = sDinning;
    }

    public Integer getiType() {
        return iType;
    }

    public void setiType(Integer iType) {
        this.iType = iType;
    }

    public String getsBreastFeed() {
        return sBreastFeed;
    }

    public void setsBreastFeed(String sBreastFeed) {
        this.sBreastFeed = sBreastFeed;
    }

    public String getsBike() {
        return sBike;
    }

    public void setsBike(String sBike) {
        this.sBike = sBike;
    }

    public String getsNote() {
        return sNote;
    }

    public void setsNote(String sNote) {
        this.sNote = sNote;
    }

    public String getsNoteEng() {
        return sNoteEng;
    }

    public void setsNoteEng(String sNoteEng) {
        this.sNoteEng = sNoteEng;
    }

    public int getiOrderID() {
        return iOrderID;
    }

    public void setiOrderID(int iOrderID) {
        this.iOrderID = iOrderID;
    }

    public String getsStationName() {
        return sStationName;
    }

    public void setsStationName(String sStationName) {
        this.sStationName = sStationName;
    }

    public String getsCarClassName() {
        return sCarClassName;
    }

    public void setsCarClassName(String sCarClassName) {
        this.sCarClassName = sCarClassName;
    }
}

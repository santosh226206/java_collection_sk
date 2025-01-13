package com.santos.map;


import com.fasterxml.jackson.annotation.JsonProperty;

public class Student {
    @JsonProperty("ID")
    public String iD;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Gender")
    public String gender;
    @JsonProperty("Class")
    public String classaName;
    @JsonProperty("Seat")
    public String seat;
    @JsonProperty("Club")
    public String club;
    @JsonProperty("Persona")
    public String persona;
    @JsonProperty("Crush")
    public String crush;
    @JsonProperty("BreastSize")
    public String breastSize;
    @JsonProperty("Strength")
    public String strength;
    @JsonProperty("Hairstyle")
    public String hairstyle;
    @JsonProperty("Color")
    public String color;
    @JsonProperty("Eyes")
    public String eyes;
    @JsonProperty("EyeType")
    public String eyeType;
    @JsonProperty("Stockings")
    public String stockings;
    @JsonProperty("Accessory")
    public String accessory;
    @JsonProperty("ScheduleTime")
    public String scheduleTime;
    @JsonProperty("ScheduleDestination")
    public String scheduleDestination;
    @JsonProperty("ScheduleAction")
    public String scheduleAction;
    @JsonProperty("Info")
    public String info;

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getClassaName() {
        return classaName;
    }

    public void setClassaName(String classaName) {
        this.classaName = classaName;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getPersona() {
        return persona;
    }

    public void setPersona(String persona) {
        this.persona = persona;
    }

    public String getCrush() {
        return crush;
    }

    public void setCrush(String crush) {
        this.crush = crush;
    }

    public String getBreastSize() {
        return breastSize;
    }

    public void setBreastSize(String breastSize) {
        this.breastSize = breastSize;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getHairstyle() {
        return hairstyle;
    }

    public void setHairstyle(String hairstyle) {
        this.hairstyle = hairstyle;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getEyeType() {
        return eyeType;
    }

    public void setEyeType(String eyeType) {
        this.eyeType = eyeType;
    }

    public String getStockings() {
        return stockings;
    }

    public void setStockings(String stockings) {
        this.stockings = stockings;
    }

    public String getAccessory() {
        return accessory;
    }

    public void setAccessory(String accessory) {
        this.accessory = accessory;
    }

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }

    public String getScheduleDestination() {
        return scheduleDestination;
    }

    public void setScheduleDestination(String scheduleDestination) {
        this.scheduleDestination = scheduleDestination;
    }

    public String getScheduleAction() {
        return scheduleAction;
    }

    public void setScheduleAction(String scheduleAction) {
        this.scheduleAction = scheduleAction;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iD='" + iD + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", classaName='" + classaName + '\'' +
                ", seat='" + seat + '\'' +
                ", club='" + club + '\'' +
                ", persona='" + persona + '\'' +
                ", crush='" + crush + '\'' +
                ", breastSize='" + breastSize + '\'' +
                ", strength='" + strength + '\'' +
                ", hairstyle='" + hairstyle + '\'' +
                ", color='" + color + '\'' +
                ", eyes='" + eyes + '\'' +
                ", eyeType='" + eyeType + '\'' +
                ", stockings='" + stockings + '\'' +
                ", accessory='" + accessory + '\'' +
                ", scheduleTime='" + scheduleTime + '\'' +
                ", scheduleDestination='" + scheduleDestination + '\'' +
                ", scheduleAction='" + scheduleAction + '\'' +
                ", info='" + info + '\'' +
                '}';
    }
}


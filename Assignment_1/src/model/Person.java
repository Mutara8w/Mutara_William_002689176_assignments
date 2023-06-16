/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author mydel
 */
public class Person {

    private String name;
    private String address;
    private String dateOfBirth;
    private long telephoneNumber;
    private long faxNumber;
    private String EmailAddress;
    private String socialSecurityNumber;
    private int medicalRecordNumber;
    private int healthPlanBeneficiaryNumber;
    private long bankAccountNumber;
    private String certificateOrlicenseNumber;
    private int vehicleId;
    private String vehicleSerialNumber;
    private String vechicleLicensePlates;
    private int deviceId;
    private String deviceSerialNumber;
    private String linkedInId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(long telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public int getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(int medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public int getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(int healthPlanBeneficiaryNumber) {
        this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    }

    public long getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getCertificateOrlicenseNumber() {
        return certificateOrlicenseNumber;
    }

    public void setCertificateOrlicenseNumber(String certificateOrlicenseNumber) {
        this.certificateOrlicenseNumber = certificateOrlicenseNumber;
    }

    public int getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getVehicleSerialNumber() {
        return vehicleSerialNumber;
    }

    public void setVehicleSerialNumber(String vehicleSerialNumber) {
        this.vehicleSerialNumber = vehicleSerialNumber;
    }

    public String getVechicleLicensePlates() {
        return vechicleLicensePlates;
    }

    public void setVechicleLicensePlates(String vechicleLicensePlates) {
        this.vechicleLicensePlates = vechicleLicensePlates;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    public String getDeviceSerialNumber() {
        return deviceSerialNumber;
    }

    public void setDeviceSerialNumber(String deviceSerialNumber) {
        this.deviceSerialNumber = deviceSerialNumber;
    }

    public String getLinkedInId() {
        return linkedInId;
    }

    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
    }

    @Override
    public String toString() {
        return name;
    }
}

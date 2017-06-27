package com.airport.model.domain;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="110_UserMaster"
    ,catalog="pmpml_live"
)
public class UserMaster  implements java.io.Serializable {


     private Long userId;
     private String salutation;
     private String fname;
     private String mname;
     private String lname;
     private String fullnameOnCard;
     private String fathername;
     private Long aadharcardNo;
     private String gender;
     private Date dob;
     private Integer age;
     private String bloodGroup;
     private long mobilenumber;
     private String email;
     private String address;
     private String password;
     private byte[] image;
     private String imgExtension;
     private String travelFrom;
     private String travelTo;
     private String education;
     private String occupation;
     private String officeaddress;
     private Long officephone;
     private Integer schoolName;
     private Long registrationNo;
     private Integer schoolStatus;
     private Integer timing;
     private String routes;
     private String educationPeriod;
     private String academicYear;
     private String organizationName;
     private String department;
     private String empNo;
     private Date dateOfJoining;
     private Date dateOfRetirement;
     private String residentYears;
     private String bplNo;
     private String manapaWard;
     private String familyCode;
     private String disabiltyType;
     private String disability;
     private String freedomid;
     private Integer passCenterId;
     private String schoolAddress;
     private Long schoolPhone;
     private Long emergencyContact;
     private String mailCheck;
     private String mailStatus;
     private Date mailCheckDate;
     private Long studentRegNo;
     private String standard;
     private String division;
     private Date registrationDate;
     private Integer retrycount;
     private String resetHash;
     private Date hashUpdateDate;
     private String newsPaper;

    public UserMaster() {
    }

	
    public UserMaster(String fname, long mobilenumber) {
        this.fname = fname;
        this.mobilenumber = mobilenumber;
    }
    public UserMaster(String salutation, String fname, String mname, String lname, String fullnameOnCard, String fathername, Long aadharcardNo, String gender, Date dob, Integer age, String bloodGroup, long mobilenumber, String email, String address, String password, byte[] image, String imgExtension, String travelFrom, String travelTo, String education, String occupation, String officeaddress, Long officephone, Integer schoolName, Long registrationNo, Integer schoolStatus, Integer timing, String routes, String educationPeriod, String academicYear, String organizationName, String department, String empNo, Date dateOfJoining, Date dateOfRetirement, String residentYears, String bplNo, String manapaWard, String familyCode, String disabiltyType, String disability, String freedomid, Integer passCenterId, String schoolAddress, Long schoolPhone, Long emergencyContact, String mailCheck, String mailStatus, Date mailCheckDate, Long studentRegNo, String standard, String division, Date registrationDate, Integer retrycount, String resetHash, Date hashUpdateDate, String newsPaper) {
       this.salutation = salutation;
       this.fname = fname;
       this.mname = mname;
       this.lname = lname;
       this.fullnameOnCard = fullnameOnCard;
       this.fathername = fathername;
       this.aadharcardNo = aadharcardNo;
       this.gender = gender;
       this.dob = dob;
       this.age = age;
       this.bloodGroup = bloodGroup;
       this.mobilenumber = mobilenumber;
       this.email = email;
       this.address = address;
       this.password = password;
       this.image = image;
       this.imgExtension = imgExtension;
       this.travelFrom = travelFrom;
       this.travelTo = travelTo;
       this.education = education;
       this.occupation = occupation;
       this.officeaddress = officeaddress;
       this.officephone = officephone;
       this.schoolName = schoolName;
       this.registrationNo = registrationNo;
       this.schoolStatus = schoolStatus;
       this.timing = timing;
       this.routes = routes;
       this.educationPeriod = educationPeriod;
       this.academicYear = academicYear;
       this.organizationName = organizationName;
       this.department = department;
       this.empNo = empNo;
       this.dateOfJoining = dateOfJoining;
       this.dateOfRetirement = dateOfRetirement;
       this.residentYears = residentYears;
       this.bplNo = bplNo;
       this.manapaWard = manapaWard;
       this.familyCode = familyCode;
       this.disabiltyType = disabiltyType;
       this.disability = disability;
       this.freedomid = freedomid;
       this.passCenterId = passCenterId;
       this.schoolAddress = schoolAddress;
       this.schoolPhone = schoolPhone;
       this.emergencyContact = emergencyContact;
       this.mailCheck = mailCheck;
       this.mailStatus = mailStatus;
       this.mailCheckDate = mailCheckDate;
       this.studentRegNo = studentRegNo;
       this.standard = standard;
       this.division = division;
       this.registrationDate = registrationDate;
       this.retrycount = retrycount;
       this.resetHash = resetHash;
       this.hashUpdateDate = hashUpdateDate;
       this.newsPaper = newsPaper;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="user_id", unique=true, nullable=false)
    public Long getUserId() {
        return this.userId;
    }
    
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    
    @Column(name="salutation", length=5)
    public String getSalutation() {
        return this.salutation;
    }
    
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    
    @Column(name="fname", nullable=false, length=20)
    public String getFname() {
        return this.fname;
    }
    
    public void setFname(String fname) {
        this.fname = fname;
    }

    
    @Column(name="mname", length=20)
    public String getMname() {
        return this.mname;
    }
    
    public void setMname(String mname) {
        this.mname = mname;
    }

    
    @Column(name="lname", length=25)
    public String getLname() {
        return this.lname;
    }
    
    public void setLname(String lname) {
        this.lname = lname;
    }

    
    @Column(name="fullname_on_card", length=70)
    public String getFullnameOnCard() {
        return this.fullnameOnCard;
    }
    
    public void setFullnameOnCard(String fullnameOnCard) {
        this.fullnameOnCard = fullnameOnCard;
    }

    
    @Column(name="fathername", length=50)
    public String getFathername() {
        return this.fathername;
    }
    
    public void setFathername(String fathername) {
        this.fathername = fathername;
    }

    
    @Column(name="aadharcard_no")
    public Long getAadharcardNo() {
        return this.aadharcardNo;
    }
    
    public void setAadharcardNo(Long aadharcardNo) {
        this.aadharcardNo = aadharcardNo;
    }

    
    @Column(name="gender", length=7)
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="DOB", length=10)
    public Date getDob() {
        return this.dob;
    }
    
    public void setDob(Date dob) {
        this.dob = dob;
    }

    
    @Column(name="age")
    public Integer getAge() {
        return this.age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }

    
    @Column(name="blood_group", length=3)
    public String getBloodGroup() {
        return this.bloodGroup;
    }
    
    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    
    @Column(name="mobilenumber", nullable=false)
    public long getMobilenumber() {
        return this.mobilenumber;
    }
    
    public void setMobilenumber(long mobilenumber) {
        this.mobilenumber = mobilenumber;
    }

    
    @Column(name="email", length=45)
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    
    @Column(name="address", length=180)
    public String getAddress() {
        return this.address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }

    
    @Column(name="password", length=45)
    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    
    @Column(name="image")
    public byte[] getImage() {
        return this.image;
    }
    
    public void setImage(byte[] image) {
        this.image = image;
    }

    
    @Column(name="img_Extension", length=5)
    public String getImgExtension() {
        return this.imgExtension;
    }
    
    public void setImgExtension(String imgExtension) {
        this.imgExtension = imgExtension;
    }

    
    @Column(name="travel_from", length=30)
    public String getTravelFrom() {
        return this.travelFrom;
    }
    
    public void setTravelFrom(String travelFrom) {
        this.travelFrom = travelFrom;
    }

    
    @Column(name="travel_to", length=30)
    public String getTravelTo() {
        return this.travelTo;
    }
    
    public void setTravelTo(String travelTo) {
        this.travelTo = travelTo;
    }

    
    @Column(name="education", length=45)
    public String getEducation() {
        return this.education;
    }
    
    public void setEducation(String education) {
        this.education = education;
    }

    
    @Column(name="occupation", length=45)
    public String getOccupation() {
        return this.occupation;
    }
    
    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    
    @Column(name="officeaddress", length=180)
    public String getOfficeaddress() {
        return this.officeaddress;
    }
    
    public void setOfficeaddress(String officeaddress) {
        this.officeaddress = officeaddress;
    }

    
    @Column(name="officephone")
    public Long getOfficephone() {
        return this.officephone;
    }
    
    public void setOfficephone(Long officephone) {
        this.officephone = officephone;
    }

    
    @Column(name="school_name")
    public Integer getSchoolName() {
        return this.schoolName;
    }
    
    public void setSchoolName(Integer schoolName) {
        this.schoolName = schoolName;
    }

    
    @Column(name="registration_no")
    public Long getRegistrationNo() {
        return this.registrationNo;
    }
    
    public void setRegistrationNo(Long registrationNo) {
        this.registrationNo = registrationNo;
    }

    
    @Column(name="school_status")
    public Integer getSchoolStatus() {
        return this.schoolStatus;
    }
    
    public void setSchoolStatus(Integer schoolStatus) {
        this.schoolStatus = schoolStatus;
    }

    
    @Column(name="timing")
    public Integer getTiming() {
        return this.timing;
    }
    
    public void setTiming(Integer timing) {
        this.timing = timing;
    }

    
    @Column(name="routes", length=45)
    public String getRoutes() {
        return this.routes;
    }
    
    public void setRoutes(String routes) {
        this.routes = routes;
    }

    
    @Column(name="education_period", length=15)
    public String getEducationPeriod() {
        return this.educationPeriod;
    }
    
    public void setEducationPeriod(String educationPeriod) {
        this.educationPeriod = educationPeriod;
    }

    
    @Column(name="academic_year", length=15)
    public String getAcademicYear() {
        return this.academicYear;
    }
    
    public void setAcademicYear(String academicYear) {
        this.academicYear = academicYear;
    }

    
    @Column(name="organization_name", length=45)
    public String getOrganizationName() {
        return this.organizationName;
    }
    
    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    
    @Column(name="department", length=45)
    public String getDepartment() {
        return this.department;
    }
    
    public void setDepartment(String department) {
        this.department = department;
    }

    
    @Column(name="emp_no", length=45)
    public String getEmpNo() {
        return this.empNo;
    }
    
    public void setEmpNo(String empNo) {
        this.empNo = empNo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_of_joining", length=10)
    public Date getDateOfJoining() {
        return this.dateOfJoining;
    }
    
    public void setDateOfJoining(Date dateOfJoining) {
        this.dateOfJoining = dateOfJoining;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_of_retirement", length=10)
    public Date getDateOfRetirement() {
        return this.dateOfRetirement;
    }
    
    public void setDateOfRetirement(Date dateOfRetirement) {
        this.dateOfRetirement = dateOfRetirement;
    }

    
    @Column(name="resident_years", length=45)
    public String getResidentYears() {
        return this.residentYears;
    }
    
    public void setResidentYears(String residentYears) {
        this.residentYears = residentYears;
    }

    
    @Column(name="bpl_no", length=45)
    public String getBplNo() {
        return this.bplNo;
    }
    
    public void setBplNo(String bplNo) {
        this.bplNo = bplNo;
    }

    
    @Column(name="manapa_ward", length=45)
    public String getManapaWard() {
        return this.manapaWard;
    }
    
    public void setManapaWard(String manapaWard) {
        this.manapaWard = manapaWard;
    }

    
    @Column(name="family_code", length=45)
    public String getFamilyCode() {
        return this.familyCode;
    }
    
    public void setFamilyCode(String familyCode) {
        this.familyCode = familyCode;
    }

    
    @Column(name="disabilty_type", length=60)
    public String getDisabiltyType() {
        return this.disabiltyType;
    }
    
    public void setDisabiltyType(String disabiltyType) {
        this.disabiltyType = disabiltyType;
    }

    
    @Column(name="disability", length=45)
    public String getDisability() {
        return this.disability;
    }
    
    public void setDisability(String disability) {
        this.disability = disability;
    }

    
    @Column(name="freedomid", length=16)
    public String getFreedomid() {
        return this.freedomid;
    }
    
    public void setFreedomid(String freedomid) {
        this.freedomid = freedomid;
    }

    
    @Column(name="pass_center_id")
    public Integer getPassCenterId() {
        return this.passCenterId;
    }
    
    public void setPassCenterId(Integer passCenterId) {
        this.passCenterId = passCenterId;
    }

    
    @Column(name="school_address", length=45)
    public String getSchoolAddress() {
        return this.schoolAddress;
    }
    
    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    
    @Column(name="school_phone")
    public Long getSchoolPhone() {
        return this.schoolPhone;
    }
    
    public void setSchoolPhone(Long schoolPhone) {
        this.schoolPhone = schoolPhone;
    }

    
    @Column(name="emergency_contact")
    public Long getEmergencyContact() {
        return this.emergencyContact;
    }
    
    public void setEmergencyContact(Long emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    
    @Column(name="mail_check", length=45)
    public String getMailCheck() {
        return this.mailCheck;
    }
    
    public void setMailCheck(String mailCheck) {
        this.mailCheck = mailCheck;
    }

    
    @Column(name="mail_status", length=11)
    public String getMailStatus() {
        return this.mailStatus;
    }
    
    public void setMailStatus(String mailStatus) {
        this.mailStatus = mailStatus;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="mail_check_date", length=19)
    public Date getMailCheckDate() {
        return this.mailCheckDate;
    }
    
    public void setMailCheckDate(Date mailCheckDate) {
        this.mailCheckDate = mailCheckDate;
    }

    
    @Column(name="Student_reg_no")
    public Long getStudentRegNo() {
        return this.studentRegNo;
    }
    
    public void setStudentRegNo(Long studentRegNo) {
        this.studentRegNo = studentRegNo;
    }

    
    @Column(name="Standard", length=5)
    public String getStandard() {
        return this.standard;
    }
    
    public void setStandard(String standard) {
        this.standard = standard;
    }

    
    @Column(name="Division", length=5)
    public String getDivision() {
        return this.division;
    }
    
    public void setDivision(String division) {
        this.division = division;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="registration_date", length=19)
    public Date getRegistrationDate() {
        return this.registrationDate;
    }
    
    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    
    @Column(name="retrycount")
    public Integer getRetrycount() {
        return this.retrycount;
    }
    
    public void setRetrycount(Integer retrycount) {
        this.retrycount = retrycount;
    }

    
    @Column(name="reset_hash", length=8)
    public String getResetHash() {
        return this.resetHash;
    }
    
    public void setResetHash(String resetHash) {
        this.resetHash = resetHash;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="hash_update_date", length=19)
    public Date getHashUpdateDate() {
        return this.hashUpdateDate;
    }
    
    public void setHashUpdateDate(Date hashUpdateDate) {
        this.hashUpdateDate = hashUpdateDate;
    }

    
    @Column(name="news_paper", length=25)
    public String getNewsPaper() {
        return this.newsPaper;
    }
    
    public void setNewsPaper(String newsPaper) {
        this.newsPaper = newsPaper;
    }




}



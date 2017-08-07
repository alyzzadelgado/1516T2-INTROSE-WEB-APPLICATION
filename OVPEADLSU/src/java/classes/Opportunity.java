/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author alydoubleza
 */
public class Opportunity {
    
    public static final Opportunity newOpp = new Opportunity();
    
    private int id;
    private String name;
    private String type;
    public String typeName;
    private String country;
    private String startDate;
    private String endDate;
    private String description;
    private String contactPerson;
    private String phoneNum;
    private String landline;
    private String email;
    private String status;
    private String age;
    private String degree;
    private int workExp;
    private String fieldExp;
    private String otherSkills;
    private String otherLang;
    private String otherProf;
    private String otherReq;
    private String[] colleges;
    private String college;
    private String[] skills;
    private String skill;
    private String[] languages;
    private String language;
    private String[] proficiencies;
    private String proficiency;
    private String[] requirements;
    private String requirement;

    /**
     * @return the requirements
     */
    public String[] getRequirements() {
        return requirements;
    }

    /**
     * @param requirements the requirements to set
     */
    public void setRequirements(String[] requirements) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : requirements){
           stringBuilder.append(s);
           stringBuilder.append(" ");
       }
       String reqList = stringBuilder.toString();
        this.setRequirement(reqList);
    }

    /**
     * @return the languages
     */
    public String[] getLanguages() {
        return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(String[] languages) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : languages){
           stringBuilder.append(s);
           stringBuilder.append(" ");
       }
       String langList = stringBuilder.toString();
        this.setLanguage(langList);
    }

    /**
     * @return the proficiencies
     */
    public String[] getProficiencies() {
        return proficiencies;
    }

    /**
     * @param proficiencies the proficiencies to set
     */
    public void setProficiencies(String[] proficiencies) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : proficiencies){
           stringBuilder.append(s);
           stringBuilder.append(" ");
       }
       String profList = stringBuilder.toString();
        this.setProficiency(profList);
    }

    /**
     * @return the skills
     */
    public String[] getSkills() {
        return skills;
    }

    /**
     * @param skills the skills to set
     */
    public void setSkills(String[] skills) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : skills){
           stringBuilder.append(s);
           stringBuilder.append(" ");
       }
       String skilList = stringBuilder.toString();
        this.setSkill(skilList);
    }

    /**
     * @return the colleges
     */
    public String[] getColleges() {
        return colleges;
    }

    /**
     * @param colleges the colleges to set
     */
    public void setColleges(String[] colleges) {
        StringBuilder stringBuilder = new StringBuilder();
        for(String s : colleges){
           stringBuilder.append(s);
           stringBuilder.append(" ");
       }
       String colList = stringBuilder.toString();
        this.setCollege(colList);
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate the startDate to set
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return the endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate the endDate to set
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the contactPerson
     */
    public String getContactPerson() {
        return contactPerson;
    }

    /**
     * @param contactPerson the contactPerson to set
     */
    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    /**
     * @return the phoneNum
     */
    public String getPhoneNum() {
        return phoneNum;
    }

    /**
     * @param phoneNum the phoneNum to set
     */
    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    /**
     * @return the landline
     */
    public String getLandline() {
        return landline;
    }

    /**
     * @param landline the landline to set
     */
    public void setLandline(String landline) {
        this.landline = landline;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the age
     */
    public String getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(String age) {
        this.age = age;
    }

    /**
     * @return the degree
     */
    public String getDegree() {
        return degree;
    }

    /**
     * @param degree the degree to set
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * @return the workExp
     */
    public int getWorkExp() {
        return workExp;
    }

    /**
     * @param workExp the workExp to set
     */
    public void setWorkExp(int workExp) {
        this.workExp = workExp;
    }

    /**
     * @return the fieldExp
     */
    public String getFieldExp() {
        return fieldExp;
    }

    /**
     * @param fieldExp the fieldExp to set
     */
    public void setFieldExp(String fieldExp) {
        this.fieldExp = fieldExp;
    }

    /**
     * @return the otherSkills
     */
    public String getOtherSkills() {
        return otherSkills;
    }

    /**
     * @param otherSkills the otherSkills to set
     */
    public void setOtherSkills(String otherSkills) {
        this.otherSkills = otherSkills;
    }

    /**
     * @return the otherLang
     */
    public String getOtherLang() {
        return otherLang;
    }

    /**
     * @param otherLang the otherLang to set
     */
    public void setOtherLang(String otherLang) {
        this.otherLang = otherLang;
    }

    /**
     * @return the otherProf
     */
    public String getOtherProf() {
        return otherProf;
    }

    /**
     * @param otherProf the otherProf to set
     */
    public void setOtherProf(String otherProf) {
        this.otherProf = otherProf;
    }

    /**
     * @return the otherReq
     */
    public String getOtherReq() {
        return otherReq;
    }

    /**
     * @param otherReq the otherReq to set
     */
    public void setOtherReq(String otherReq) {
        this.otherReq = otherReq;
    }

    /**
     * @return the college
     */
    public String getCollege() {
        return college;
    }

    /**
     * @param college the college to set
     */
    public void setCollege(String college) {
        this.college = college;
    }

    /**
     * @return the skill
     */
    public String getSkill() {
        return skill;
    }

    /**
     * @param skill the skill to set
     */
    public void setSkill(String skill) {
        this.skill = skill;
    }

    /**
     * @return the proficiency
     */
    public String getProficiency() {
        return proficiency;
    }

    /**
     * @param poficiency the proficiency to set
     */
    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    /**
     * @return the language
     */
    public String getLanguage() {
        return language;
    }

    /**
     * @param language the language to set
     */
    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * @return the requirement
     */
    public String getRequirement() {
        return requirement;
    }

    /**
     * @param requirement the requirement to set
     */
    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    /**
     * @return the typeName
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * @param typeName the typeName to set
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }
}

//package Domain;
//
//import DAL.SiteDTO;
//
//import java.util.Objects;
//
//public class Site
//{
//    private int id;
//    private String address;
//    private String phoneNumber;
//    private String contactName;
//    private String zone;
//
//
//    public Site(String address,String zone ,String contactName, String phoneNumber,int idSite)
//    {
//        setAddress(address);
//        setContactName(contactName);
//        setPhoneNumber(phoneNumber);
//        setSiteZone(zone);
//        setId(idSite);
//
//    }
//    public Site(SiteDTO siteDTO)
//    {
//        setAddress(siteDTO.address);
//        setContactName(siteDTO.contactName);
//        setPhoneNumber(siteDTO.phoneNumber);
//        setSiteZone(siteDTO.zone);
//        id = siteDTO.id;
//    }
//    public boolean setAddress(String address)
//    {
//        if (address.isBlank())
//        {
//            return false;
//        }
//        this.address = address;
//        return true;
//    }
//    public boolean setPhoneNumber(String phoneNumber)
//    {
//        if (phoneNumber.isBlank() || !phoneNumber.chars().allMatch(Character::isDigit))
//        {
//            return false;
//        }
//        this.phoneNumber = phoneNumber;
//        return true;
//    }
//
//    public boolean setContactName(String contactName)
//    {
//        if (contactName.isBlank())// || !contactName.trim().chars().allMatch(Character::isLetter))
//        {
//           return false;
//        }
//        this.contactName = contactName;
//        return true;
//    }
//
//    public void setSiteZone(String zone) {
//        this.zone = zone;
//    }
//
//
//    public String getAddress() {return address;}
//
//    public String getSiteZone() {return zone;}
//
//    public int getId() {return id;}
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//
//    public String getPhoneNumber() {return phoneNumber;}
//
//    public String getContactName() {return contactName;}
//
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null || getClass() != obj.getClass()) {
//            return false;
//        }
//        Site siteOther = (Site) obj;
//        return Objects.equals(address, siteOther.address);
//    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(address);
//    }
//
//    public String toString()
//    {
//        return "Address: " + address + ", Contact Name: " + contactName + ", Phone number: " + phoneNumber + " Zone: " + zone;
//    }
//
//}
